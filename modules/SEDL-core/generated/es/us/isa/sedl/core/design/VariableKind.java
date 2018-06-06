//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.06.06 a las 11:25:05 AM CEST 
//


package es.us.isa.sedl.core.design;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VariableKind.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="VariableKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Nominal"/&gt;
 *     &lt;enumeration value="Ordinal"/&gt;
 *     &lt;enumeration value="Scalar"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VariableKind")
@XmlEnum
public enum VariableKind {

    @XmlEnumValue("Nominal")
    NOMINAL("Nominal"),
    @XmlEnumValue("Ordinal")
    ORDINAL("Ordinal"),
    @XmlEnumValue("Scalar")
    SCALAR("Scalar");
    private final String value;

    VariableKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariableKind fromValue(String v) {
        for (VariableKind c: VariableKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
