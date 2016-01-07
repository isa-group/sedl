/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.us.isa.sedl.runtime.analysis.validation;

/**
 *
 * @author japarejo
 * @param <T> Type of element to be fixed.
 */
public abstract class Fixing<T> {
    private final T subject;
    private String description;

    public Fixing(T subject) {
        this.subject = subject;
    }

    public T getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }
    
    
    public abstract void apply();
    
    
}

