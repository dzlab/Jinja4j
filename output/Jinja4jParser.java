// $ANTLR 3.4 C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g 2012-07-06 20:56:19

	package org.jinja4j.antlr;
	import org.jinja4j.Interpreter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Jinja4jParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WORD", "WS", "'%}'", "'.'", "'endfor'", "'endif'", "'for'", "'if'", "'in'", "'{%'", "'{{'", "'}}'"
    };

    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int WORD=4;
    public static final int WS=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Jinja4jParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Jinja4jParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Jinja4jParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g"; }


        	Interpreter interp;
       	public Jinja4jParser(TokenStream input, Interpreter interp) {
            	this(input);
            	this.interp = interp;
        	}



    // $ANTLR start "page"
    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:20:1: page returns [String value] : html EOF ;
    public final String page() throws RecognitionException {
        String value = null;


        String html1 =null;


        try {
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:21:2: ( html EOF )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:21:4: html EOF
            {
            pushFollow(FOLLOW_html_in_page35);
            html1=html();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_page37); 

            value = html1;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "page"



    // $ANTLR start "html"
    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:25:1: html returns [String value] : ( WORD ( block )* | block );
    public final String html() throws RecognitionException {
        String value = null;


        Token WORD2=null;
        String block3 =null;


        try {
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:26:2: ( WORD ( block )* | block )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WORD) ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= 13 && LA2_0 <= 14)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:27:3: WORD ( block )*
                    {
                    WORD2=(Token)match(input,WORD,FOLLOW_WORD_in_html61); 

                    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:27:9: ( block )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            int LA1_2 = input.LA(2);

                            if ( ((LA1_2 >= 10 && LA1_2 <= 11)) ) {
                                alt1=1;
                            }


                        }
                        else if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:27:9: block
                    	    {
                    	    pushFollow(FOLLOW_block_in_html64);
                    	    block();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    value = (WORD2!=null?WORD2.getText():null);

                    }
                    break;
                case 2 :
                    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:28:5: block
                    {
                    pushFollow(FOLLOW_block_in_html73);
                    block3=block();

                    state._fsp--;


                    value = block3;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "html"



    // $ANTLR start "block"
    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:32:1: block returns [String value] : ( variable | control );
    public final String block() throws RecognitionException {
        String value = null;


        String variable4 =null;

        String control5 =null;


        try {
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:33:2: ( variable | control )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:33:4: variable
                    {
                    pushFollow(FOLLOW_variable_in_block94);
                    variable4=variable();

                    state._fsp--;


                    value = variable4;

                    }
                    break;
                case 2 :
                    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:34:5: control
                    {
                    pushFollow(FOLLOW_control_in_block103);
                    control5=control();

                    state._fsp--;


                    value = control5;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "block"



    // $ANTLR start "variable"
    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:37:1: variable returns [String value] : '{{' id= WORD ( '.' WORD )* '}}' ;
    public final String variable() throws RecognitionException {
        String value = null;


        Token id=null;

        try {
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:38:2: ( '{{' id= WORD ( '.' WORD )* '}}' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:38:4: '{{' id= WORD ( '.' WORD )* '}}'
            {
            match(input,14,FOLLOW_14_in_variable123); 

            id=(Token)match(input,WORD,FOLLOW_WORD_in_variable127); 

            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:38:17: ( '.' WORD )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==7) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:38:18: '.' WORD
            	    {
            	    match(input,7,FOLLOW_7_in_variable130); 

            	    match(input,WORD,FOLLOW_WORD_in_variable132); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,15,FOLLOW_15_in_variable136); 

            value = interp.getString((id!=null?id.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "variable"



    // $ANTLR start "control"
    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:42:1: control returns [String value] : '{%' ( ctrl_if | ctrl_for ) '%}' ;
    public final String control() throws RecognitionException {
        String value = null;


        String ctrl_if6 =null;


        try {
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:43:2: ( '{%' ( ctrl_if | ctrl_for ) '%}' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:43:4: '{%' ( ctrl_if | ctrl_for ) '%}'
            {
            match(input,13,FOLLOW_13_in_control156); 

            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:43:9: ( ctrl_if | ctrl_for )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==10) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:44:3: ctrl_if
                    {
                    pushFollow(FOLLOW_ctrl_if_in_control162);
                    ctrl_if6=ctrl_if();

                    state._fsp--;


                    value = ctrl_if6;

                    }
                    break;
                case 2 :
                    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:46:3: ctrl_for
                    {
                    pushFollow(FOLLOW_ctrl_for_in_control174);
                    ctrl_for();

                    state._fsp--;


                    value = ctrl_if6;

                    }
                    break;

            }


            match(input,6,FOLLOW_6_in_control182); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "control"



    // $ANTLR start "ctrl_if"
    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:50:1: ctrl_if returns [String value] : 'if' WORD '%}' html '{%' 'endif' ;
    public final String ctrl_if() throws RecognitionException {
        String value = null;


        Token WORD7=null;
        String html8 =null;


        try {
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:51:2: ( 'if' WORD '%}' html '{%' 'endif' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:51:4: 'if' WORD '%}' html '{%' 'endif'
            {
            match(input,11,FOLLOW_11_in_ctrl_if199); 

            WORD7=(Token)match(input,WORD,FOLLOW_WORD_in_ctrl_if201); 

            match(input,6,FOLLOW_6_in_ctrl_if203); 

            pushFollow(FOLLOW_html_in_ctrl_if205);
            html8=html();

            state._fsp--;


            match(input,13,FOLLOW_13_in_ctrl_if207); 

            match(input,9,FOLLOW_9_in_ctrl_if209); 


            		value = "";
            		if(interp.getBoolean((WORD7!=null?WORD7.getText():null)))
            			value = html8;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "ctrl_if"



    // $ANTLR start "ctrl_for"
    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:57:1: ctrl_for returns [String value] : 'for' key= WORD 'in' list= WORD '%}' html '{%' 'endfor' ;
    public final String ctrl_for() throws RecognitionException {
        String value = null;


        Token key=null;
        Token list=null;
        String html9 =null;


        try {
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:58:2: ( 'for' key= WORD 'in' list= WORD '%}' html '{%' 'endfor' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:58:4: 'for' key= WORD 'in' list= WORD '%}' html '{%' 'endfor'
            {
            match(input,10,FOLLOW_10_in_ctrl_for225); 

            key=(Token)match(input,WORD,FOLLOW_WORD_in_ctrl_for229); 

            match(input,12,FOLLOW_12_in_ctrl_for231); 

            list=(Token)match(input,WORD,FOLLOW_WORD_in_ctrl_for235); 

            match(input,6,FOLLOW_6_in_ctrl_for237); 

            pushFollow(FOLLOW_html_in_ctrl_for239);
            html9=html();

            state._fsp--;


            match(input,13,FOLLOW_13_in_ctrl_for241); 

            match(input,8,FOLLOW_8_in_ctrl_for243); 


            			for(Object val: interp.getList((list!=null?list.getText():null))) {
            				interp.put((key!=null?key.getText():null), val);
            				value += html9;
            			}
            		//TODO finish for (use 'var' as a parameter for html text) -> Rule arguments in rule section page 94/96
            		//check template in page 93 of ANTLR ref
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "ctrl_for"

    // Delegated rules


 

    public static final BitSet FOLLOW_html_in_page35 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_page37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_html61 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_block_in_html64 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_block_in_html73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_block94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_block103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_variable123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_WORD_in_variable127 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_7_in_variable130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_WORD_in_variable132 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_15_in_variable136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_control156 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_ctrl_if_in_control162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ctrl_for_in_control174 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_control182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ctrl_if199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_WORD_in_ctrl_if201 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_ctrl_if203 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_html_in_ctrl_if205 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ctrl_if207 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_ctrl_if209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ctrl_for225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_WORD_in_ctrl_for229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ctrl_for231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_WORD_in_ctrl_for235 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_ctrl_for237 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_html_in_ctrl_for239 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ctrl_for241 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_ctrl_for243 = new BitSet(new long[]{0x0000000000000002L});

}