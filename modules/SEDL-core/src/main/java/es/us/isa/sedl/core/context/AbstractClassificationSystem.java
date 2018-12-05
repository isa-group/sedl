/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.context;

import java.util.Set;

/**
 *
 * @author japarejo
 */
public abstract class AbstractClassificationSystem {
    public abstract Set<ClassificationTerm> supportedClasses();
    public abstract boolean isValid(ClassificationTerm entry);
    public abstract Set<ClassificationTerm> matchingClasses(String desc);
    public abstract ClassificationTerm findByCode(String code);
}
