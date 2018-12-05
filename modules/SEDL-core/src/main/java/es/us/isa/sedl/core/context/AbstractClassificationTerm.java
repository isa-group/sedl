/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.context;

/**
 *
 * @author japarejo
 */
public class AbstractClassificationTerm {
    protected String system;

    public String getClassificationSystem() {
        return system;
    }
    
    public void setClassificationSystem(String value) {
        system=value;
    }
}
