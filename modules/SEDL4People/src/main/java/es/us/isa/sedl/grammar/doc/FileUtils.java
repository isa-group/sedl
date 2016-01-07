package es.us.isa.sedl.grammar.doc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {
	
	static String readFile(String path, Charset encoding) 
			  
		{
	    	String res = null;
	    	File f = new File(path);
	    	if(f.exists()) { /* do something */ 
	    		try {
					byte[] encoded;
					encoded = Files.readAllBytes(Paths.get(path));
					res = new String(encoded, encoding);
	    	
	    		} catch (IOException e) {
	    			e.printStackTrace();
	    		}
	    	}
		  return res;
		}
	 public static void writeFile(String name, String content){
	    	Writer writer = null;
	    	try {
	    	    writer = new BufferedWriter(new OutputStreamWriter(
	    	          new FileOutputStream(name), Charset.defaultCharset()));
	    	    writer.write(content);
	    	} catch (IOException ex) {
	    	  // report
	    	} finally {
	    	   try {writer.close();} catch (Exception ex) {/*ignore*/}
	    	}
	    }
}
