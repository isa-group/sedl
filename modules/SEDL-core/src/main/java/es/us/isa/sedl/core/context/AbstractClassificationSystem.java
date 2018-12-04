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
    public abstract Set<ClassificationEntry> supportedClasses();
    public abstract boolean isValid(ClassificationEntry entry);
    public abstract Set<ClassificationEntry> matchingClasses(String desc);
    public abstract ClassificationEntry findByCode(String code);
}
