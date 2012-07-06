package org.jinja4j;
/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.RecognitionException;

public class Jinja4jInterp {
    public static void main(String[] args) throws Exception {
    	String template = "{{ name }}";
        HashMap<String, Object> vars = new HashMap<String, Object>();
        vars.put("name", "foobar");
        Boolean success = test(template, vars, "foobar");
        System.out.println("Test 1: " + success);
        
        template = "{% if success %} true {% endif %}";
        vars.put("success", success);
        success = test(template, vars, "true");
        System.out.println("Test 2: " + success);
        
        template = "{% for user in users %} username: {{user}} {% endfor %}";
        List<String> users = new ArrayList<String>();
        users.add("user1"); users.add("user2"); users.add("user3");
        vars.put("users", users);
        success = test(template, vars, "");
        System.out.println("Test 3: " + success);
    }
    
    public static boolean test(String template, HashMap<String, Object> vars, String output) {
    	boolean success = false;
    	try {
    		InputStream input = new ByteArrayInputStream(template.getBytes());        	
            Interpreter interp = new Interpreter();
			String result = interp.interp(input, vars);
			if(result != null && result.equals(output))
				success = true;
			else
				System.out.println("Generated HTML: " + result);
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return success;
    }
}
