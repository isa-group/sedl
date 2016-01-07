/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.core.design;

import java.util.Iterator;

/**
 *
 * @author japarejo
 */
public interface IteratorFactory {
    Iterator<Level> create(IntervalConstraint constraint);
}
