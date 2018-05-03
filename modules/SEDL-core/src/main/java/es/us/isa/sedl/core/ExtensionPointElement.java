/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.core;

import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author José Antonio Parejo
 */
public class ExtensionPointElement {

    private String extensionPointIdentifier;
    private String elementIdentifier;
    private String content;
    private ParserRuleContext context;
    private List<String> extensionPointLocator;

    public ExtensionPointElement(String extensionPointIdentifier, String elementIdentifier, String content,ParserRuleContext ctx)
    {
        this(extensionPointIdentifier,elementIdentifier,content,ctx,Collections.EMPTY_LIST);
    }
    
    
    public ExtensionPointElement(String extensionPointIdentifier, String elementIdentifier, String content,ParserRuleContext ctx,List<String> extensionPointLocator) {
        this.extensionPointIdentifier = extensionPointIdentifier;
        this.elementIdentifier = elementIdentifier;
        this.content = content;
        this.context=ctx;
        this.extensionPointLocator=extensionPointLocator;
    }

    /**
     * @return the extensionPointIdentifier
     */
    public String getExtensionPointIdentifier() {
        return extensionPointIdentifier;
    }

    /**
     * @return the elementIdentifier
     */
    public String getElementIdentifier() {
        return elementIdentifier;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    public ParserRuleContext getContext() {
        return context;
    }

    public List<String> getExtensionPointLocator() {
        return extensionPointLocator;
    }            
    
}
