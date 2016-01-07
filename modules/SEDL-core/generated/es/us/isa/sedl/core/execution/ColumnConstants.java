//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.01.07 a las 06:11:32 PM CET 
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
 *     &lt;enumeration value="ExperimentalSubjectId"/&gt;
 *     &lt;enumeration value="Ignore"/&gt;
 *     &lt;enumeration value="ExperimentalGroupId"/&gt;
 *     &lt;enumeration value="Timestamp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ColumnConstants")
@XmlEnum
public enum ColumnConstants {

    @XmlEnumValue("ExperimentalSubjectId")
    EXPERIMENTAL_SUBJECT_ID("ExperimentalSubjectId"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("ExperimentalGroupId")
    EXPERIMENTAL_GROUP_ID("ExperimentalGroupId"),
    @XmlEnumValue("Timestamp")
    TIMESTAMP("Timestamp");
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
