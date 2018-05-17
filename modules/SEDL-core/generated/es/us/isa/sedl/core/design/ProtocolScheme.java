//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.17 a las 12:43:04 AM CEST 
//


package es.us.isa.sedl.core.design;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProtocolScheme.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ProtocolScheme"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sequential"/&gt;
 *     &lt;enumeration value="Random"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProtocolScheme")
@XmlEnum
public enum ProtocolScheme {

    @XmlEnumValue("Sequential")
    SEQUENTIAL("Sequential"),
    @XmlEnumValue("Random")
    RANDOM("Random");
    private final String value;

    ProtocolScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtocolScheme fromValue(String v) {
        for (ProtocolScheme c: ProtocolScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
