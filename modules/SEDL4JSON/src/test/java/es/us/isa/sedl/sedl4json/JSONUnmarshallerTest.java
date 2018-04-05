/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.sedl4json;

import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.util.Error;
import java.io.InputStream;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author japarejo
 */
public class JSONUnmarshallerTest extends TestCase {
    
    public JSONUnmarshallerTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of read method, of class JSONUnmarshaller.
    
    public void testRead() {
        System.out.println("read");
        InputStream stream = null;
        JSONUnmarshaller instance = new JSONUnmarshaller();
        Experiment expResult = null;
        Experiment result = instance.read(stream);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of getErrors method, of class JSONUnmarshaller.
    
    public void testGetErrors() {
        System.out.println("getErrors");
        JSONUnmarshaller instance = new JSONUnmarshaller();
        List<Error> expResult = null;
        List<Error> result = instance.getErrors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 */
    /**
     * Test of fromString method, of class JSONUnmarshaller.
     */
    public void testFromString() {
        System.out.println("fromString");
        String experimentDescription = "{\n" +
"  \"@type\" : \"BasicExperiment\",\n" +
"  \"notes\" : [ ],\n" +
"  \"annotations\" : [ ],\n" +
"  \"id\" : \"Mind-1\",\n" +
"  \"metaid\" : null,\n" +
"  \"name\" : \"Mind-1\",\n" +
"  \"version\" : \"1.0\",\n" +
"  \"classifications\" : [ ],\n" +
"  \"context\" : {\n" +
"    \"notes\" : [ ],\n" +
"    \"annotations\" : [ ],\n" +
"    \"id\" : null,\n" +
"    \"projects\" : [ ],\n" +
"    \"organization\" : [ ],\n" +
"    \"people\" : null\n" +
"  },\n" +
"  \"hypotheses\" : [ {\n" +
"    \"@type\" : \"DifferentialHypothesis\",\n" +
"    \"notes\" : [ ],\n" +
"    \"annotations\" : [ ],\n" +
"    \"id\" : null,\n" +
"    \"dependentVariable\" : \"Effectiveness\",\n" +
"    \"independentVariables\" : [ \"treatment\" ]\n" +
"  }, {\n" +
"    \"@type\" : \"DifferentialHypothesis\",\n" +
"    \"notes\" : [ ],\n" +
"    \"annotations\" : [ ],\n" +
"    \"id\" : null,\n" +
"    \"dependentVariable\" : \"Efficiency\",\n" +
"    \"independentVariables\" : [ \"treatment\" ]\n" +
"  } ],\n" +
"  \"design\" : {\n" +
"    \"variables\" : {\n" +
"      \"variable\" : [ {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"MF\"\n" +
"          }, {\n" +
"            \"value\" : \"PS\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"treatment\",\n" +
"        \"units\" : null\n" +
"      }, {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"Erasmus\"\n" +
"          }, {\n" +
"            \"value\" : \"EoDP\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"exercise\",\n" +
"        \"units\" : null\n" +
"      }, {\n" +
"        \"@type\" : \"Outcome\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"IntensionDomain\",\n" +
"          \"constraint\" : [ {\n" +
"            \"@type\" : \"FundamentalSetConstraint\",\n" +
"            \"fundamentalSet\" : \"R\"\n" +
"          }, {\n" +
"            \"@type\" : \"IntervalConstraint\",\n" +
"            \"min\" : null,\n" +
"            \"max\" : null\n" +
"          } ],\n" +
"          \"finite\" : false\n" +
"        },\n" +
"        \"kind\" : \"SCALAR\",\n" +
"        \"name\" : \"Effectiveness\",\n" +
"        \"units\" : null\n" +
"      }, {\n" +
"        \"@type\" : \"Outcome\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"IntensionDomain\",\n" +
"          \"constraint\" : [ {\n" +
"            \"@type\" : \"FundamentalSetConstraint\",\n" +
"            \"fundamentalSet\" : \"R\"\n" +
"          }, {\n" +
"            \"@type\" : \"IntervalConstraint\",\n" +
"            \"min\" : null,\n" +
"            \"max\" : null\n" +
"          } ],\n" +
"          \"finite\" : false\n" +
"        },\n" +
"        \"kind\" : \"SCALAR\",\n" +
"        \"name\" : \"Efficiency\",\n" +
"        \"units\" : null\n" +
"      } ],\n" +
"      \"nonControllableFactors\" : [ ],\n" +
"      \"controllableFactors\" : [ {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"MF\"\n" +
"          }, {\n" +
"            \"value\" : \"PS\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"treatment\",\n" +
"        \"units\" : null\n" +
"      }, {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"Erasmus\"\n" +
"          }, {\n" +
"            \"value\" : \"EoDP\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"exercise\",\n" +
"        \"units\" : null\n" +
"      } ],\n" +
"      \"outcomes\" : [ {\n" +
"        \"@type\" : \"Outcome\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"IntensionDomain\",\n" +
"          \"constraint\" : [ {\n" +
"            \"@type\" : \"FundamentalSetConstraint\",\n" +
"            \"fundamentalSet\" : \"R\"\n" +
"          }, {\n" +
"            \"@type\" : \"IntervalConstraint\",\n" +
"            \"min\" : null,\n" +
"            \"max\" : null\n" +
"          } ],\n" +
"          \"finite\" : false\n" +
"        },\n" +
"        \"kind\" : \"SCALAR\",\n" +
"        \"name\" : \"Effectiveness\",\n" +
"        \"units\" : null\n" +
"      }, {\n" +
"        \"@type\" : \"Outcome\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"IntensionDomain\",\n" +
"          \"constraint\" : [ {\n" +
"            \"@type\" : \"FundamentalSetConstraint\",\n" +
"            \"fundamentalSet\" : \"R\"\n" +
"          }, {\n" +
"            \"@type\" : \"IntervalConstraint\",\n" +
"            \"min\" : null,\n" +
"            \"max\" : null\n" +
"          } ],\n" +
"          \"finite\" : false\n" +
"        },\n" +
"        \"kind\" : \"SCALAR\",\n" +
"        \"name\" : \"Efficiency\",\n" +
"        \"units\" : null\n" +
"      } ]\n" +
"    },\n" +
"    \"population\" : {\n" +
"      \"samplingMethod\" : null,\n" +
"      \"objectivePopulation\" : null,\n" +
"      \"individualDescription\" : null,\n" +
"      \"accesiblePopulation\" : null\n" +
"    },\n" +
"    \"samplingMethod\" : {\n" +
"      \"description\" : \"Random\",\n" +
"      \"random\" : true\n" +
"    },\n" +
"    \"designParameters\" : [ {\n" +
"      \"name\" : \"NSessions\",\n" +
"      \"value\" : \"16\"\n" +
"    }, {\n" +
"      \"name\" : \"sessionsDuration\",\n" +
"      \"value\" : \"10\"\n" +
"    } ],\n" +
"    \"experimentalDesign\" : {\n" +
"      \"@type\" : \"FullySpecifiedExperimentalDesign\",\n" +
"      \"intendedAnalyses\" : [ {\n" +
"        \"@type\" : \"StatisticalAnalysisSpec\",\n" +
"        \"id\" : \"DescriptiveStatitics\",\n" +
"        \"statistic\" : [ {\n" +
"          \"@type\" : \"Mean\",\n" +
"          \"datasetSpecification\" : {\n" +
"            \"projections\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"exercise\" ]\n" +
"            } ],\n" +
"            \"filters\" : [ ],\n" +
"            \"nonGroupingProjections\" : [ ],\n" +
"            \"valuationFilters\" : [ ],\n" +
"            \"groupings\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"exercise\" ]\n" +
"            } ]\n" +
"          }\n" +
"        }, {\n" +
"          \"@type\" : \"Mean\",\n" +
"          \"datasetSpecification\" : {\n" +
"            \"projections\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\" ]\n" +
"            } ],\n" +
"            \"filters\" : [ ],\n" +
"            \"nonGroupingProjections\" : [ ],\n" +
"            \"valuationFilters\" : [ ],\n" +
"            \"groupings\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\" ]\n" +
"            } ]\n" +
"          }\n" +
"        }, {\n" +
"          \"@type\" : \"Mean\",\n" +
"          \"datasetSpecification\" : {\n" +
"            \"projections\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\", \"exercise\" ]\n" +
"            } ],\n" +
"            \"filters\" : [ ],\n" +
"            \"nonGroupingProjections\" : [ ],\n" +
"            \"valuationFilters\" : [ ],\n" +
"            \"groupings\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\", \"exercise\" ]\n" +
"            } ]\n" +
"          }\n" +
"        }, {\n" +
"          \"@type\" : \"Median\",\n" +
"          \"datasetSpecification\" : {\n" +
"            \"projections\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\", \"exercise\" ]\n" +
"            } ],\n" +
"            \"filters\" : [ ],\n" +
"            \"nonGroupingProjections\" : [ ],\n" +
"            \"valuationFilters\" : [ ],\n" +
"            \"groupings\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\", \"exercise\" ]\n" +
"            } ]\n" +
"          }\n" +
"        }, {\n" +
"          \"@type\" : \"StandardDeviation\",\n" +
"          \"datasetSpecification\" : {\n" +
"            \"projections\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\", \"exercise\" ]\n" +
"            } ],\n" +
"            \"filters\" : [ ],\n" +
"            \"nonGroupingProjections\" : [ ],\n" +
"            \"valuationFilters\" : [ ],\n" +
"            \"groupings\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\", \"exercise\" ]\n" +
"            } ]\n" +
"          }\n" +
"        } ]\n" +
"      }, {\n" +
"        \"@type\" : \"StatisticalAnalysisSpec\",\n" +
"        \"id\" : \"Charts\",\n" +
"        \"statistic\" : [ ]\n" +
"      }, {\n" +
"        \"@type\" : \"StatisticalAnalysisSpec\",\n" +
"        \"id\" : \"NHST\",\n" +
"        \"statistic\" : [ {\n" +
"          \"@type\" : \"NHST\",\n" +
"          \"datasetSpecification\" : {\n" +
"            \"projections\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"exercise\", \"treatment\" ]\n" +
"            } ],\n" +
"            \"filters\" : [ ],\n" +
"            \"nonGroupingProjections\" : [ ],\n" +
"            \"valuationFilters\" : [ ],\n" +
"            \"groupings\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"exercise\", \"treatment\" ]\n" +
"            } ]\n" +
"          },\n" +
"          \"assumptions\" : [ ],\n" +
"          \"name\" : \"Kolmogorov-Smirnov\",\n" +
"          \"statisticalDistribution\" : null,\n" +
"          \"alpha\" : 0.05\n" +
"        }, {\n" +
"          \"@type\" : \"NHST\",\n" +
"          \"datasetSpecification\" : {\n" +
"            \"projections\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"exercise\", \"treatment\" ]\n" +
"            } ],\n" +
"            \"filters\" : [ ],\n" +
"            \"nonGroupingProjections\" : [ ],\n" +
"            \"valuationFilters\" : [ ],\n" +
"            \"groupings\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"exercise\", \"treatment\" ]\n" +
"            } ]\n" +
"          },\n" +
"          \"assumptions\" : [ ],\n" +
"          \"name\" : \"Levene\",\n" +
"          \"statisticalDistribution\" : null,\n" +
"          \"alpha\" : 0.05\n" +
"        }, {\n" +
"          \"@type\" : \"NHST\",\n" +
"          \"datasetSpecification\" : {\n" +
"            \"projections\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\" ]\n" +
"            } ],\n" +
"            \"filters\" : [ {\n" +
"              \"@type\" : \"ValuationFilter\",\n" +
"              \"variableValuations\" : [ {\n" +
"                \"level\" : {\n" +
"                  \"value\" : \"\\\"EoDP\\\"\"\n" +
"                },\n" +
"                \"variable\" : {\n" +
"                  \"@type\" : \"ControllableFactor\",\n" +
"                  \"domain\" : {\n" +
"                    \"@type\" : \"ExtensionDomain\",\n" +
"                    \"levels\" : [ {\n" +
"                      \"value\" : \"Erasmus\"\n" +
"                    }, {\n" +
"                      \"value\" : \"EoDP\"\n" +
"                    } ],\n" +
"                    \"finite\" : true\n" +
"                  },\n" +
"                  \"kind\" : \"NOMINAL\",\n" +
"                  \"name\" : \"exercise\",\n" +
"                  \"units\" : null\n" +
"                }\n" +
"              } ]\n" +
"            } ],\n" +
"            \"nonGroupingProjections\" : [ ],\n" +
"            \"valuationFilters\" : [ {\n" +
"              \"@type\" : \"ValuationFilter\",\n" +
"              \"variableValuations\" : [ {\n" +
"                \"level\" : {\n" +
"                  \"value\" : \"\\\"EoDP\\\"\"\n" +
"                },\n" +
"                \"variable\" : {\n" +
"                  \"@type\" : \"ControllableFactor\",\n" +
"                  \"domain\" : {\n" +
"                    \"@type\" : \"ExtensionDomain\",\n" +
"                    \"levels\" : [ {\n" +
"                      \"value\" : \"Erasmus\"\n" +
"                    }, {\n" +
"                      \"value\" : \"EoDP\"\n" +
"                    } ],\n" +
"                    \"finite\" : true\n" +
"                  },\n" +
"                  \"kind\" : \"NOMINAL\",\n" +
"                  \"name\" : \"exercise\",\n" +
"                  \"units\" : null\n" +
"                }\n" +
"              } ]\n" +
"            } ],\n" +
"            \"groupings\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\" ]\n" +
"            } ]\n" +
"          },\n" +
"          \"assumptions\" : [ ],\n" +
"          \"name\" : \"TTest\",\n" +
"          \"statisticalDistribution\" : null,\n" +
"          \"alpha\" : 0.05\n" +
"        }, {\n" +
"          \"@type\" : \"NHST\",\n" +
"          \"datasetSpecification\" : {\n" +
"            \"projections\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\" ]\n" +
"            } ],\n" +
"            \"filters\" : [ {\n" +
"              \"@type\" : \"ValuationFilter\",\n" +
"              \"variableValuations\" : [ {\n" +
"                \"level\" : {\n" +
"                  \"value\" : \"\\\"EoDP\\\"\"\n" +
"                },\n" +
"                \"variable\" : {\n" +
"                  \"@type\" : \"ControllableFactor\",\n" +
"                  \"domain\" : {\n" +
"                    \"@type\" : \"ExtensionDomain\",\n" +
"                    \"levels\" : [ {\n" +
"                      \"value\" : \"Erasmus\"\n" +
"                    }, {\n" +
"                      \"value\" : \"EoDP\"\n" +
"                    } ],\n" +
"                    \"finite\" : true\n" +
"                  },\n" +
"                  \"kind\" : \"NOMINAL\",\n" +
"                  \"name\" : \"exercise\",\n" +
"                  \"units\" : null\n" +
"                }\n" +
"              } ]\n" +
"            } ],\n" +
"            \"nonGroupingProjections\" : [ ],\n" +
"            \"valuationFilters\" : [ {\n" +
"              \"@type\" : \"ValuationFilter\",\n" +
"              \"variableValuations\" : [ {\n" +
"                \"level\" : {\n" +
"                  \"value\" : \"\\\"EoDP\\\"\"\n" +
"                },\n" +
"                \"variable\" : {\n" +
"                  \"@type\" : \"ControllableFactor\",\n" +
"                  \"domain\" : {\n" +
"                    \"@type\" : \"ExtensionDomain\",\n" +
"                    \"levels\" : [ {\n" +
"                      \"value\" : \"Erasmus\"\n" +
"                    }, {\n" +
"                      \"value\" : \"EoDP\"\n" +
"                    } ],\n" +
"                    \"finite\" : true\n" +
"                  },\n" +
"                  \"kind\" : \"NOMINAL\",\n" +
"                  \"name\" : \"exercise\",\n" +
"                  \"units\" : null\n" +
"                }\n" +
"              } ]\n" +
"            } ],\n" +
"            \"groupings\" : [ {\n" +
"              \"@type\" : \"GroupingProjection\",\n" +
"              \"projectedVariables\" : [ \"treatment\" ]\n" +
"            } ]\n" +
"          },\n" +
"          \"assumptions\" : [ ],\n" +
"          \"name\" : \"Wilcoxon\",\n" +
"          \"statisticalDistribution\" : null,\n" +
"          \"alpha\" : 0.05\n" +
"        } ]\n" +
"      } ],\n" +
"      \"assignmentMethod\" : {\n" +
"        \"description\" : \"Custom\",\n" +
"        \"random\" : false\n" +
"      },\n" +
"      \"groups\" : [ ],\n" +
"      \"experimentalProtocol\" : {\n" +
"        \"steps\" : [ ],\n" +
"        \"scheme\" : null,\n" +
"        \"constraints\" : [ ]\n" +
"      },\n" +
"      \"blockingVariables\" : [ ]\n" +
"    },\n" +
"    \"possibleTreatments\" : [ [ {\n" +
"      \"level\" : {\n" +
"        \"value\" : \"EoDP\"\n" +
"      },\n" +
"      \"variable\" : {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"Erasmus\"\n" +
"          }, {\n" +
"            \"value\" : \"EoDP\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"exercise\",\n" +
"        \"units\" : null\n" +
"      }\n" +
"    }, {\n" +
"      \"level\" : {\n" +
"        \"value\" : \"PS\"\n" +
"      },\n" +
"      \"variable\" : {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"MF\"\n" +
"          }, {\n" +
"            \"value\" : \"PS\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"treatment\",\n" +
"        \"units\" : null\n" +
"      }\n" +
"    }, {\n" +
"      \"level\" : {\n" +
"        \"value\" : \"MF\"\n" +
"      },\n" +
"      \"variable\" : {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"MF\"\n" +
"          }, {\n" +
"            \"value\" : \"PS\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"treatment\",\n" +
"        \"units\" : null\n" +
"      }\n" +
"    }, {\n" +
"      \"level\" : {\n" +
"        \"value\" : \"Erasmus\"\n" +
"      },\n" +
"      \"variable\" : {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"Erasmus\"\n" +
"          }, {\n" +
"            \"value\" : \"EoDP\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"exercise\",\n" +
"        \"units\" : null\n" +
"      }\n" +
"    } ], [ {\n" +
"      \"level\" : {\n" +
"        \"value\" : \"EoDP\"\n" +
"      },\n" +
"      \"variable\" : {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"Erasmus\"\n" +
"          }, {\n" +
"            \"value\" : \"EoDP\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"exercise\",\n" +
"        \"units\" : null\n" +
"      }\n" +
"    }, {\n" +
"      \"level\" : {\n" +
"        \"value\" : \"MF\"\n" +
"      },\n" +
"      \"variable\" : {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"MF\"\n" +
"          }, {\n" +
"            \"value\" : \"PS\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"treatment\",\n" +
"        \"units\" : null\n" +
"      }\n" +
"    }, {\n" +
"      \"level\" : {\n" +
"        \"value\" : \"Erasmus\"\n" +
"      },\n" +
"      \"variable\" : {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"Erasmus\"\n" +
"          }, {\n" +
"            \"value\" : \"EoDP\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"exercise\",\n" +
"        \"units\" : null\n" +
"      }\n" +
"    } ], [ {\n" +
"      \"level\" : {\n" +
"        \"value\" : \"MF\"\n" +
"      },\n" +
"      \"variable\" : {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"MF\"\n" +
"          }, {\n" +
"            \"value\" : \"PS\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"treatment\",\n" +
"        \"units\" : null\n" +
"      }\n" +
"    }, {\n" +
"      \"level\" : {\n" +
"        \"value\" : \"Erasmus\"\n" +
"      },\n" +
"      \"variable\" : {\n" +
"        \"@type\" : \"ControllableFactor\",\n" +
"        \"domain\" : {\n" +
"          \"@type\" : \"ExtensionDomain\",\n" +
"          \"levels\" : [ {\n" +
"            \"value\" : \"Erasmus\"\n" +
"          }, {\n" +
"            \"value\" : \"EoDP\"\n" +
"          } ],\n" +
"          \"finite\" : true\n" +
"        },\n" +
"        \"kind\" : \"NOMINAL\",\n" +
"        \"name\" : \"exercise\",\n" +
"        \"units\" : null\n" +
"      }\n" +
"    } ] ],\n" +
"    \"outcomes\" : [ {\n" +
"      \"@type\" : \"Outcome\",\n" +
"      \"domain\" : {\n" +
"        \"@type\" : \"IntensionDomain\",\n" +
"        \"constraint\" : [ {\n" +
"          \"@type\" : \"FundamentalSetConstraint\",\n" +
"          \"fundamentalSet\" : \"R\"\n" +
"        }, {\n" +
"          \"@type\" : \"IntervalConstraint\",\n" +
"          \"min\" : null,\n" +
"          \"max\" : null\n" +
"        } ],\n" +
"        \"finite\" : false\n" +
"      },\n" +
"      \"kind\" : \"SCALAR\",\n" +
"      \"name\" : \"Effectiveness\",\n" +
"      \"units\" : null\n" +
"    }, {\n" +
"      \"@type\" : \"Outcome\",\n" +
"      \"domain\" : {\n" +
"        \"@type\" : \"IntensionDomain\",\n" +
"        \"constraint\" : [ {\n" +
"          \"@type\" : \"FundamentalSetConstraint\",\n" +
"          \"fundamentalSet\" : \"R\"\n" +
"        }, {\n" +
"          \"@type\" : \"IntervalConstraint\",\n" +
"          \"min\" : null,\n" +
"          \"max\" : null\n" +
"        } ],\n" +
"        \"finite\" : false\n" +
"      },\n" +
"      \"kind\" : \"SCALAR\",\n" +
"      \"name\" : \"Efficiency\",\n" +
"      \"units\" : null\n" +
"    } ]\n" +
"  },\n" +
"  \"configurations\" : [ {\n" +
"    \"notes\" : [ ],\n" +
"    \"annotations\" : [ ],\n" +
"    \"id\" : \"C1\",\n" +
"    \"context\" : null,\n" +
"    \"experimentalProcedure\" : {\n" +
"      \"tasks\" : [ ]\n" +
"    },\n" +
"    \"experimentalSetting\" : null,\n" +
"    \"experimentalInputs\" : null,\n" +
"    \"experimentalOutputs\" : {\n" +
"      \"outputDataSources\" : [ {\n" +
"        \"fileSpecification\" : null,\n" +
"        \"file\" : null,\n" +
"        \"role\" : null\n" +
"      } ]\n" +
"    },\n" +
"    \"parameters\" : [ ],\n" +
"    \"executions\" : [ {\n" +
"      \"notes\" : [ ],\n" +
"      \"annotations\" : [ ],\n" +
"      \"id\" : \"Replica\",\n" +
"      \"log\" : null,\n" +
"      \"results\" : [ {\n" +
"        \"variableMapping\" : null,\n" +
"        \"fileFormat\" : null,\n" +
"        \"file\" : {\n" +
"          \"fileformatspecification\" : null,\n" +
"          \"name\" : \"'data/Datos2014AnalysisR.csv'\",\n" +
"          \"path\" : null\n" +
"        }\n" +
"      } ],\n" +
"      \"analysisResults\" : [ ],\n" +
"      \"experimentalSetting\" : null,\n" +
"      \"start\" : null,\n" +
"      \"finish\" : null\n" +
"    } ]\n" +
"  } ]\n" +
"}";
        JSONUnmarshaller instance = new JSONUnmarshaller();        
        Experiment result = instance.fromString(experimentDescription);
        assertNotNull(result);        
    }
    
}
