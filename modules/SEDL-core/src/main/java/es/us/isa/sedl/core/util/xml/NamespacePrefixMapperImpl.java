/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core.util.xml;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import java.util.*;
import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;

/**
 *
 * @author japarejo
 */
public class NamespacePrefixMapperImpl extends NamespacePrefixMapper implements NamespaceContext {

    private static final String[] EMPTY_STRING = new String[0];
    private Map<String, String> prefixToUri = null;
    private Map<String, String> uriToPrefix = null;

    private void init() {
        //TODO
        Map<String,String> mapping=new HashMap<String,String>();
        mapping.put("", "http://isa.us.es/sedl/core");
        mapping.put("moedl", "http://moses.us.es/schemas/moedl/v1/");
        mapping.put("ctx",  "http://isa.us.es/sedl/core/context");
        mapping.put("dsg",  "http://isa.us.es/sedl/core/design");
        mapping.put("cfg",  "http://isa.us.es/sedl/core/configuration");
        mapping.put("exec","http://isa.us.es/sedl/core/execution");               
        mapping.put("hyp","http://isa.us.es/sedl/core/hypothesis"); 
        mapping.put("ana","http://isa.us.es/sedl/core/analysis/"); 
        mapping.put("data","http://isa.us.es/sedl/core/analysis/datasetspecification"); 
        mapping.put("sta","http://isa.us.es/sedl/core/analysis/statistic"); 
        mapping.put("", "http://moses.us.es/schemas/sedl/v1/");             
        mapping.put("ds", "http://www.w3.org/2000/09/xmldsig#");
        mapping.put("xsi", "http://www.w3.org/2001/XMLSchema-instance");
        init(mapping);
    }
    
    private void init(Map<String,String> mapping)
    {
        if(prefixToUri!=null)
            prefixToUri.clear();
        else
            prefixToUri = new HashMap<String, String>();
        prefixToUri.putAll(mapping);
        prefixToUri.put(XMLConstants.XML_NS_PREFIX, XMLConstants.XML_NS_URI);
        prefixToUri.put(XMLConstants.XMLNS_ATTRIBUTE, XMLConstants.XMLNS_ATTRIBUTE_NS_URI);

        uriToPrefix = new HashMap();
        for (String prefix : prefixToUri.keySet()) {
            uriToPrefix.put(prefixToUri.get(prefix), prefix);
        }
    }

    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        String result="";
        if (uriToPrefix == null) {
            init();
        }

        if (uriToPrefix.containsKey(namespaceUri)) {
            result=uriToPrefix.get(namespaceUri);
        }

        /*if(suggestion!=null)
            result=suggestion;*/
        
        return result;
    }
    

  
    @Override
    public String getNamespaceURI(String prefix) {
        String result="";
        if (prefixToUri == null) {
            init();
        }

        if (prefixToUri.containsKey(prefix)) {
            result=prefixToUri.get(prefix);
        } else {
            result=XMLConstants.NULL_NS_URI;
        }
        return result;
    }

    @Override
    public String getPrefix(String namespaceURI) {
        String result="";
        if (uriToPrefix == null) {
            init();
        }

        if (uriToPrefix.containsKey(namespaceURI)) {
            result=uriToPrefix.get(namespaceURI);
        }
        return result;
    }

    @Override
    public Iterator getPrefixes(String namespaceURI) {
        if (uriToPrefix == null) {
            init();
        }

        List prefixes = new LinkedList();

        if (uriToPrefix.containsKey(namespaceURI)) {
            prefixes.add(uriToPrefix.get(namespaceURI));
        }
        return prefixes.iterator();
    }
    
}
