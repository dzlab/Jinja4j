package org.jinja4j;

import org.antlr.runtime.*;
import org.jinja4j.antlr.Jinja4jLexer;
import org.jinja4j.antlr.Jinja4jParser;

import java.io.InputStream;
import java.io.IOException;
import java.util.*;

public class Interpreter {
	
	private Map<String, Object> variables;
	
    public InterpreterListener listener = // default response to messages
        new InterpreterListener() {
            public void info(String msg) { 
            	System.out.println(msg); 
            }
            public void error(String msg) { 
            	System.err.println(msg); 
            }
            public void error(String msg, Exception e) {
                error(msg); e.printStackTrace(System.err);
            }
            public void error(String msg, Token t) {
                error("line "+t.getLine()+": "+msg);
            }
        };


    public String interp(InputStream input, Map<String, Object> vars) throws RecognitionException, IOException {
    	variables = vars;
        Jinja4jLexer lex = new Jinja4jLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        Jinja4jParser parser = new Jinja4jParser(tokens, this);
        return parser.page();
    }

    public String getString(String key) {
    	String val = (String) variables.get(key); 
    	System.out.println(key + "=" + val);
    	return val;
    }

    public Boolean getBoolean(String key) {
    	Boolean val = (Boolean) variables.get(key); 
    	System.out.println(key + "=" + val);
    	return val;
    }
    
    public List getList(String key) {
    	List val = (List) variables.get(key); 
    	System.out.println(key + "=" + val);
    	return val;
    }
    
    public void put(String key, Object val) {
    	variables.put(key, val);
    	System.out.println(key + "=" + val);
    }
}
