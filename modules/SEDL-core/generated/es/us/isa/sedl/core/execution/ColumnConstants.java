//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:22:58 PM CET 
//


package es.us.isa.sedl.core.execution;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ColumnConstants.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ColumnConstants"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="experimentalSubjectId"/&gt;
 *     &lt;enumeration value="ignore"/&gt;
 *     &lt;enumeration value="experimentalGroupId"/&gt;
 *     &lt;enumeration value="timestamp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ColumnConstants")
@XmlEnum
public enum ColumnConstants {

    @XmlEnumValue("experimentalSubjectId")
    EXPERIMENTAL_SUBJECT_ID("experimentalSubjectId"),
    @XmlEnumValue("ignore")
    IGNORE("ignore"),
    @XmlEnumValue("experimentalGroupId")
    EXPERIMENTAL_GROUP_ID("experimentalGroupId"),
    @XmlEnumValue("timestamp")
    TIMESTAMP("timestamp");
    private final String value;

    ColumnConstants(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColumnConstants fromValue(String v) {
        for (ColumnConstants c: ColumnConstants.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
