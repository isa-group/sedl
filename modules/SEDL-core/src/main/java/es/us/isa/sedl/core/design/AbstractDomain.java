/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.design;

import java.util.List;

/**
 *
 * @author José Antonio Parejo
 */
public abstract class AbstractDomain {
    public abstract List<Level> getLevels();    
    public abstract boolean contains(Level l);
    public abstract boolean isFinite();
}
