grammar Jinja4j;


@header {
	package org.jinja4j.antlr;
	import org.jinja4j.Interpreter;
}
@lexer::header{
	package org.jinja4j.antlr;
}

@members {
    	Interpreter interp;
   	public Jinja4jParser(TokenStream input, Interpreter interp) {
        	this(input);
        	this.interp = interp;
    	}
}

page	returns [String value]
	:	html EOF
		{$value = $html.value;}
	;
	
html 	returns [String value]
	:	
		WORD 	block* {$value = $WORD.text;}
	| 	block	{$value = $block.value;}
		
	;
	
block	returns [String value]
	:	variable 	{$value = $variable.value;}
	| 	control		{$value = $control.value;}
	;	
	
variable returns [String value]
	:	'{{' id=WORD ('.' WORD)* '}}'
		{$value = interp.getString($id.text);}
	;
	
control	returns [String value]
	:	'{%' (
		ctrl_if 	{$value = $ctrl_if.value;}
		| 
		ctrl_for	{$value = $ctrl_if.value;}
		) '%}'
	;
		
ctrl_if	returns [String value]
	:	'if' WORD '%}' html '{%' 'endif' {
		$value = "";
		if(interp.getBoolean($WORD.text))
			$value = $html.value;
		}
	;
ctrl_for returns [String value]
	:	'for' key=WORD 'in' list=WORD '%}' html '{%' 'endfor' {
			for(Object val: interp.getList($list.text)) {
				interp.put($key.text, val);
				$value += $html.value;
			}
		//TODO finish for (use 'var' as a parameter for html text) -> Rule arguments in rule section page 94/96
		//check template in page 93 of ANTLR ref
		}
	
	;	
	
WORD	:	('a'..'z'|'A'..'Z'|'0'..'9'|'_'|':')*
	;	
	
WS	:	(' ' | '\t' | '\n' | '\r') {$channel=HIDDEN;}
	;