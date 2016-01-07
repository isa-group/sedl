/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.jlibsedl.validator;

/**
 *
 * @author japarejo
 */
public enum ValidationPurpose {VALIDITY, REPRODUCTABILITY, CONSISTENCY;

    public boolean subsumes(ValidationLevel validationLevel) {
        return true;
    }
}
