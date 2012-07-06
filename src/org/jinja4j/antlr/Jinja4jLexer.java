// $ANTLR 3.4 C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g 2012-07-06 20:56:19

	package org.jinja4j.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Jinja4jLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Jinja4jLexer() {} 
    public Jinja4jLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Jinja4jLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:6:6: ( '%}' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:6:8: '%}'
            {
            match("%}"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:7:6: ( '.' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:7:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:8:6: ( 'endfor' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:8:8: 'endfor'
            {
            match("endfor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:9:6: ( 'endif' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:9:8: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:10:7: ( 'for' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:10:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:11:7: ( 'if' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:11:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:12:7: ( 'in' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:12:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:13:7: ( '{%' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:13:9: '{%'
            {
            match("{%"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:14:7: ( '{{' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:14:9: '{{'
            {
            match("{{"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:15:7: ( '}}' )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:15:9: '}}'
            {
            match("}}"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:69:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ':' )* )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:69:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ':' )*
            {
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:69:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ':' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= ':')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WORD"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:72:4: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:72:6: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | WORD | WS )
        int alt2=12;
        switch ( input.LA(1) ) {
        case '%':
            {
            alt2=1;
            }
            break;
        case '.':
            {
            alt2=2;
            }
            break;
        case 'e':
            {
            int LA2_3 = input.LA(2);

            if ( (LA2_3=='n') ) {
                int LA2_10 = input.LA(3);

                if ( (LA2_10=='d') ) {
                    switch ( input.LA(4) ) {
                    case 'f':
                        {
                        int LA2_20 = input.LA(5);

                        if ( (LA2_20=='o') ) {
                            int LA2_23 = input.LA(6);

                            if ( (LA2_23=='r') ) {
                                int LA2_25 = input.LA(7);

                                if ( ((LA2_25 >= '0' && LA2_25 <= ':')||(LA2_25 >= 'A' && LA2_25 <= 'Z')||LA2_25=='_'||(LA2_25 >= 'a' && LA2_25 <= 'z')) ) {
                                    alt2=11;
                                }
                                else {
                                    alt2=3;
                                }
                            }
                            else {
                                alt2=11;
                            }
                        }
                        else {
                            alt2=11;
                        }
                        }
                        break;
                    case 'i':
                        {
                        int LA2_21 = input.LA(5);

                        if ( (LA2_21=='f') ) {
                            int LA2_24 = input.LA(6);

                            if ( ((LA2_24 >= '0' && LA2_24 <= ':')||(LA2_24 >= 'A' && LA2_24 <= 'Z')||LA2_24=='_'||(LA2_24 >= 'a' && LA2_24 <= 'z')) ) {
                                alt2=11;
                            }
                            else {
                                alt2=4;
                            }
                        }
                        else {
                            alt2=11;
                        }
                        }
                        break;
                    default:
                        alt2=11;
                    }

                }
                else {
                    alt2=11;
                }
            }
            else {
                alt2=11;
            }
            }
            break;
        case 'f':
            {
            int LA2_4 = input.LA(2);

            if ( (LA2_4=='o') ) {
                int LA2_11 = input.LA(3);

                if ( (LA2_11=='r') ) {
                    int LA2_17 = input.LA(4);

                    if ( ((LA2_17 >= '0' && LA2_17 <= ':')||(LA2_17 >= 'A' && LA2_17 <= 'Z')||LA2_17=='_'||(LA2_17 >= 'a' && LA2_17 <= 'z')) ) {
                        alt2=11;
                    }
                    else {
                        alt2=5;
                    }
                }
                else {
                    alt2=11;
                }
            }
            else {
                alt2=11;
            }
            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'f':
                {
                int LA2_12 = input.LA(3);

                if ( ((LA2_12 >= '0' && LA2_12 <= ':')||(LA2_12 >= 'A' && LA2_12 <= 'Z')||LA2_12=='_'||(LA2_12 >= 'a' && LA2_12 <= 'z')) ) {
                    alt2=11;
                }
                else {
                    alt2=6;
                }
                }
                break;
            case 'n':
                {
                int LA2_13 = input.LA(3);

                if ( ((LA2_13 >= '0' && LA2_13 <= ':')||(LA2_13 >= 'A' && LA2_13 <= 'Z')||LA2_13=='_'||(LA2_13 >= 'a' && LA2_13 <= 'z')) ) {
                    alt2=11;
                }
                else {
                    alt2=7;
                }
                }
                break;
            default:
                alt2=11;
            }

            }
            break;
        case '{':
            {
            int LA2_6 = input.LA(2);

            if ( (LA2_6=='%') ) {
                alt2=8;
            }
            else if ( (LA2_6=='{') ) {
                alt2=9;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 6, input);

                throw nvae;

            }
            }
            break;
        case '}':
            {
            alt2=10;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=12;
            }
            break;
        default:
            alt2=11;
        }

        switch (alt2) {
            case 1 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:10: T__6
                {
                mT__6(); 


                }
                break;
            case 2 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:15: T__7
                {
                mT__7(); 


                }
                break;
            case 3 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:20: T__8
                {
                mT__8(); 


                }
                break;
            case 4 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:25: T__9
                {
                mT__9(); 


                }
                break;
            case 5 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:30: T__10
                {
                mT__10(); 


                }
                break;
            case 6 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:36: T__11
                {
                mT__11(); 


                }
                break;
            case 7 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:42: T__12
                {
                mT__12(); 


                }
                break;
            case 8 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:48: T__13
                {
                mT__13(); 


                }
                break;
            case 9 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:54: T__14
                {
                mT__14(); 


                }
                break;
            case 10 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:60: T__15
                {
                mT__15(); 


                }
                break;
            case 11 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:66: WORD
                {
                mWORD(); 


                }
                break;
            case 12 :
                // C:\\Program Files\\Git\\repo\\Jinja4j\\Jinja4j.g:1:71: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}