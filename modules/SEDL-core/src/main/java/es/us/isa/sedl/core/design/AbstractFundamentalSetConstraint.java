/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.design;

/**
 *
 * @author José Antonio Parejo
 */
public abstract class AbstractFundamentalSetConstraint extends Constraint{
    
    public abstract FundamentalSet getFundamentalSet();
    
    @Override
    public boolean isMetBy(Object object)
    {
        Object value=object;
        if(object instanceof Level)
            value=((Level)object).getValue();
        boolean result=false;
        switch(getFundamentalSet()){
            case R:
                result=isInR(value);
                break;
            case N:
                result=isInN(value);
                break;
            case Z:
                result=isInZ(value);
                break;
            case B:
                result=isInB(value);
                break;
        }
        return result;
    }
    
    public static boolean isInR(Object object){
        String value=object.toString();
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isInN(Object object) {
        String value=object.toString();
        try {
            long lvalue=Long.parseLong(value);
            return  lvalue>0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isInZ(Object object) {
        String value=object.toString();
        try {
            Long.parseLong(value);         
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isInB(Object object) {
        String value=object.toString();
        return value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false");
    }
}
