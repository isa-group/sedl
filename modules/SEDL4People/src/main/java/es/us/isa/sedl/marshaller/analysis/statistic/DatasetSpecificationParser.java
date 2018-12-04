/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.marshaller.analysis.statistic;

import es.us.isa.sedl.core.BasicExperiment;
import es.us.isa.sedl.core.analysis.datasetspecification.DatasetSpecification;
import es.us.isa.sedl.core.analysis.datasetspecification.GroupingProjection;
import es.us.isa.sedl.core.analysis.datasetspecification.Projection;
import es.us.isa.sedl.core.analysis.datasetspecification.ValuationFilter;
import es.us.isa.sedl.core.analysis.statistic.Statistic;
import es.us.isa.sedl.core.design.Factor;
import es.us.isa.sedl.core.design.IntensionDomain;
import es.us.isa.sedl.core.design.Level;
import es.us.isa.sedl.core.design.Outcome;
import es.us.isa.sedl.core.design.Variable;
import es.us.isa.sedl.core.design.VariableValuation;
import es.us.isa.sedl.grammar.SEDL4PeopleLexer;
import es.us.isa.sedl.grammar.SEDL4PeopleParser;
import es.us.isa.sedl.marshaller.Parser;
import es.us.isa.sedl.marshaller.SEDL4PeopleExtendedListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author José Antonio Parejo
 */
public class DatasetSpecificationParser implements Parser<DatasetSpecification, SEDL4PeopleParser.StatisticFunctionFilterContext> {
    
    @Override
    public DatasetSpecification parse(SEDL4PeopleParser.StatisticFunctionFilterContext ctx, SEDL4PeopleExtendedListener listener) {
        DatasetSpecification result = null;
        if (ctx.oldStatisticFunctionFilter() != null) {
            result = parseOld(ctx.oldStatisticFunctionFilter(), listener);
        } else if (ctx.newStatisticFunctionFilter() != null) {
            result = parseNew(ctx.newStatisticFunctionFilter(), listener);
        } else {
            result = new DatasetSpecification();
        }
        return result;
    }

    public DatasetSpecification parseOld(SEDL4PeopleParser.OldStatisticFunctionFilterContext ctx, SEDL4PeopleExtendedListener listener) {
        DatasetSpecification result = new DatasetSpecification();
        if (ctx.grouping() != null) {
            GroupingProjection group = new GroupingProjection();
            SEDL4PeopleParser.GroupingContext groupCtx = ctx.grouping();
            for (SEDL4PeopleParser.IdContext idCtx : groupCtx.id()) {
                group.getProjectedVariables().add(listener.findVariableById(idCtx, true).getName());
                result.getProjections().add(group);
            }
        }
        if (ctx.projection() != null) {

            SEDL4PeopleParser.ProjectionContext projCtx = ctx.projection();
            List<Outcome> outcomes = new ArrayList<Outcome>();
            List<Factor> factors = new ArrayList<Factor>();
            Variable var = null;
            for (SEDL4PeopleParser.IdContext id : projCtx.id()) {
                var = listener.findVariableById(id, true);
                if (var instanceof Outcome) {
                    outcomes.add((Outcome) var);
                } else {
                    factors.add((Factor) var);
                }
            }
            //			proj.getProjectedVariables().add(projCtx.getText());
            if (outcomes.isEmpty()) {
                ValuationFilter vf = new ValuationFilter();
                VariableValuation vv = new VariableValuation();
                vf.getVariableValuations().add(vv);
                vv.setVariable(var);
            } else {
                Projection proj = new Projection();
                for (Variable v : outcomes) {
                    proj.getProjectedVariables().add(v.getName());
                }
                for (Variable v : factors) {
                    proj.getProjectedVariables().add(v.getName());
                }
                result.getProjections().add(proj);
            }
        }
        if (ctx.filter() != null) {
            SEDL4PeopleParser.FilterContext filterCtx = ctx.filter();
            ValuationFilter filter = new ValuationFilter();
            SEDL4PeopleParser.IdContext idCtx = null;
            SEDL4PeopleParser.ValueContext valContext = null;
            for (SEDL4PeopleParser.AssignmentContext assignmentCtx : filterCtx.statisticFunctionParamVariable().assignment()) {
                idCtx = assignmentCtx.id();
                valContext = assignmentCtx.value();
                VariableValuation valuation = new VariableValuation();
                valuation.setVariable(listener.findVariableById(idCtx, true));
                if (valContext != null) {
                    Level level = createLevel(valContext.getText(), valuation.getVariable());
                    valuation.setLevel(level);
                }
                filter.getVariableValuations().add(valuation);
            }
            result.getFilters().add(filter);
        }
        return result;
    }

    public DatasetSpecification defaultDatsetSpecification(SEDL4PeopleExtendedListener listener, Class<? extends Statistic> statisticType, String statisticName) {
        DatasetSpecification defaultSpec = new DatasetSpecification();
        BasicExperiment experiment = (BasicExperiment) listener.getExperimentModel();
        List<Outcome> outcomes = experiment.getDesign().getVariables().getVariablesByType(Outcome.class);
        Projection projection = new Projection();
        for (Outcome outcome : outcomes) {
            projection.getProjectedVariables().add(outcome.getName());
        }

        defaultSpec.getProjections().add(projection);
        return defaultSpec;
    }

    public DatasetSpecification parse(SEDL4PeopleParser.StatisticFunctionParamContext paramCtx, SEDL4PeopleExtendedListener listener) {
        DatasetSpecification result = null;
        if (paramCtx.statisticFunctionFilter() != null) {
            result = parse(paramCtx.statisticFunctionFilter(), listener);
        } else if (paramCtx.statisticFunctionParamVariable() != null) {
            result = parse(paramCtx.statisticFunctionParamVariable(), listener);
        } else {
            throw new InvalidParameterException("Unable to build DatasetSpecification from '" + paramCtx.getText() + "'");
        }
        return result;
    }

    public DatasetSpecification parse(SEDL4PeopleParser.StatisticFunctionParamVariableContext varCtx, SEDL4PeopleExtendedListener listener) {
        DatasetSpecification result = new DatasetSpecification();
        ValuationFilter filter = new ValuationFilter();
        for (SEDL4PeopleParser.AssignmentContext assignmentCtx : varCtx.assignment()) {
            Variable var = listener.findVariableById(assignmentCtx.id().getText(), true, Variable.class);
            if (assignmentCtx.value() == null && var.getDomain() instanceof IntensionDomain) {
                Projection projection = new Projection();
                projection.getProjectedVariables().add(var.getName());
                result.getProjections().add(projection);
            } else {
                VariableValuation valuation = new VariableValuation();
                valuation.setVariable(listener.findVariableById(assignmentCtx.id().getText(), true, Variable.class));
                if (assignmentCtx.value() != null) {
                    Level level = createLevel(assignmentCtx.value().getText(),valuation.getVariable());                    
                    valuation.setLevel(level);
                }
                filter.getVariableValuations().add(valuation);
            }
        }
        if (!filter.getVariableValuations().isEmpty()) {
            result.getFilters().add(filter);
        }
        return result;
    }

    @Override
    public DatasetSpecification parse(String s, SEDL4PeopleExtendedListener listener) {
        DatasetSpecification result = null;
        try {
            ByteArrayInputStream stream = new ByteArrayInputStream(s.getBytes());
            SEDL4PeopleLexer lexer = new SEDL4PeopleLexer(new ANTLRInputStream(stream));
            //lexer.addErrorListener(errorListener);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SEDL4PeopleParser parser = new SEDL4PeopleParser(tokens);
            //parser.addErrorListener(errorListener);                       
            result = parse(parser.statisticFunctionFilter(), listener);
        } catch (IOException ex) {
            Logger.getLogger(DatasetSpecificationParser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return result;
    }

    private DatasetSpecification parseNew(SEDL4PeopleParser.NewStatisticFunctionFilterContext ctx, SEDL4PeopleExtendedListener listener) {
        DatasetSpecification result = new DatasetSpecification();
        if (ctx.byDSSpec() != null) {
            GroupingProjection group = new GroupingProjection();
            SEDL4PeopleParser.ByDSSpecContext groupCtx = ctx.byDSSpec();
            for (SEDL4PeopleParser.IdContext idCtx : groupCtx.id()) {
                Variable var = listener.findVariableById(idCtx, true);
                if (var != null) {
                    group.getProjectedVariables().add(var.getName());
                }
            }
            result.getProjections().add(group);
        }
        if (ctx.ofDSSpec() != null) {
            SEDL4PeopleParser.OfDSSpecContext projCtx = ctx.ofDSSpec();
            List<Outcome> outcomes = new ArrayList<Outcome>();
            List<Factor> factors = new ArrayList<Factor>();
            Variable var = null;
            for (SEDL4PeopleParser.IdContext id : projCtx.id()) {
                var = listener.findVariableById(id, true);
                if (var != null) {
                    if (var instanceof Outcome) {
                        outcomes.add((Outcome) var);
                    } else {
                        factors.add((Factor) var);
                    }
                }
            }
            if (outcomes.isEmpty() && factors.isEmpty()) {
                ValuationFilter vf = new ValuationFilter();
                VariableValuation vv = new VariableValuation();
                vf.getVariableValuations().add(vv);
                vv.setVariable(var);
            } else {
                Projection proj = new Projection();
                for (Variable v : outcomes) {
                    proj.getProjectedVariables().add(v.getName());
                }
                for (Variable v : factors) {
                    proj.getProjectedVariables().add(v.getName());
                }
                result.getProjections().add(proj);
            }
        }
        if (ctx.whereDSSpec() != null) {
            SEDL4PeopleParser.WhereDSSpecContext filterCtx = ctx.whereDSSpec();
            ValuationFilter filter = new ValuationFilter();
            SEDL4PeopleParser.IdContext idCtx = null;
            SEDL4PeopleParser.ValueContext valContext = null;
            for (SEDL4PeopleParser.AssignmentContext assignmentCtx : filterCtx.statisticFunctionParamVariable().assignment()) {
                idCtx = assignmentCtx.id();
                valContext = assignmentCtx.value();
                VariableValuation valuation = new VariableValuation();
                valuation.setVariable(listener.findVariableById(idCtx, true));
                if (valContext != null) {
                    Level level = createLevel(valContext.getText(),valuation.getVariable());                    
                    valuation.setLevel(level);
                }
                filter.getVariableValuations().add(valuation);
            }
            result.getFilters().add(filter);
        }
        return result;
    }

    private Level createLevel(String value, Variable var) {
        Level level = new Level();
        if (value.startsWith("\"") || value.startsWith("'")) {
            level.setValue(value.substring(1, value.length() - 1));
        } else {
            level.setValue(value);
        }
        return level;
    }
}
