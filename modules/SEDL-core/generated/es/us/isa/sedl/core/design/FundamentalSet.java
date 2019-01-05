//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.01.05 a las 01:49:52 PM CET 
//


package es.us.isa.sedl.core.design;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FundamentalSet.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FundamentalSet"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="n"/&gt;
 *     &lt;enumeration value="z"/&gt;
 *     &lt;enumeration value="r"/&gt;
 *     &lt;enumeration value="i"/&gt;
 *     &lt;enumeration value="b"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundamentalSet")
@XmlEnum
public enum FundamentalSet {

    @XmlEnumValue("n")
    N("n"),
    @XmlEnumValue("z")
    Z("z"),
    @XmlEnumValue("r")
    R("r"),
    @XmlEnumValue("i")
    I("i"),
    @XmlEnumValue("b")
    B("b");
    private final String value;

    FundamentalSet(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FundamentalSet fromValue(String v) {
        for (FundamentalSet c: FundamentalSet.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
