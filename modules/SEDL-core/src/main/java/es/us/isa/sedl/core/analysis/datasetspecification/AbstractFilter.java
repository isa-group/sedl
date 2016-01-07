/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.analysis.datasetspecification;

import es.us.isa.jdataset.DataSet;

/**
 *
 * @author José Antonio Parejo
 */
public abstract class AbstractFilter {
    public abstract boolean accept(DataSet dataset, int rowIndex);
}
