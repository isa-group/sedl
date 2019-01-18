/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.util.xml;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author José Antonio Parejo
 */
public class XsdDateTimeConverter {
    
    public static Date unmarshal(String dateTime) {
        return DatatypeConverter.parseDate(dateTime).getTime();
    }

    public static String marshalDate(Date date) {
        if(date==null)
            return "";
        final GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        return DatatypeConverter.printDate(calendar);
    }

    public static String marshalDateTime(Date dateTime) {
        if(dateTime==null)
            return "";
        final GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(dateTime);
        return DatatypeConverter.printDateTime(calendar);
    }
}
