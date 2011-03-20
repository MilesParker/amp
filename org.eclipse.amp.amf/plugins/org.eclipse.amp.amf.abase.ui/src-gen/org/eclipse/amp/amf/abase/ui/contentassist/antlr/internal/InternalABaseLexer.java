package org.eclipse.amp.amf.abase.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalABaseLexer extends Lexer {
    public static final int RULE_ID=8;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__14=14;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=5;
    public static final int RULE_WS=12;
    public static final int RULE_DESC_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_INTEGER=4;
    public static final int RULE_ML_COMMENT=10;

    // delegates
    // delegators

    public InternalABaseLexer() {;} 
    public InternalABaseLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalABaseLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:11:7: ( 'true' )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:12:7: ( 'false' )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:12:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:342:14: ( ( '-' )? ( '0' .. '9' )+ )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:342:16: ( '-' )? ( '0' .. '9' )+
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:342:16: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:342:16: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:342:21: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:342:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:344:11: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )* )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:344:13: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )*
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:344:13: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:344:13: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:344:18: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:344:19: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('.'); 
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:344:34: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:344:35: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_DESC_STRING"
    public final void mRULE_DESC_STRING() throws RecognitionException {
        try {
            int _type = RULE_DESC_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:346:18: ( '\\u00AB' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\u00AB' | '\\u00BB' | '\\\\' ) | ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00BB' )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:346:20: '\\u00AB' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\u00AB' | '\\u00BB' | '\\\\' ) | ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00BB'
            {
            match('\u00AB'); 
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:346:29: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\u00AB' | '\\u00BB' | '\\\\' ) | ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\u00AA')||(LA6_0>='\u00AC' && LA6_0<='\u00BA')||(LA6_0>='\u00BC' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:346:30: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\u00AB' | '\\u00BB' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='\u00AB'||input.LA(1)=='\u00BB' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:346:80: ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\u00BB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DESC_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:348:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:348:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:348:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:348:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:348:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:350:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:350:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:350:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:350:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:352:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:354:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:354:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:354:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:354:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:356:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:356:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:356:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:356:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:356:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:356:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:356:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:356:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:358:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:358:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:358:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:360:16: ( . )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:360:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:8: ( T__14 | T__15 | RULE_INTEGER | RULE_REAL | RULE_DESC_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=12;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:22: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 4 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:35: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 5 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:45: RULE_DESC_STRING
                {
                mRULE_DESC_STRING(); 

                }
                break;
            case 6 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:62: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:70: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:79: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:91: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:107: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:123: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:1:131: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\2\17\1\15\1\23\1\uffff\2\15\1\uffff\3\15\2\uffff\1\17\1"+
        "\uffff\1\17\1\23\2\uffff\1\23\5\uffff\2\17\1\36\1\17\1\uffff\1\40"+
        "\1\uffff";
    static final String DFA18_eofS =
        "\41\uffff";
    static final String DFA18_minS =
        "\1\0\1\162\1\141\2\56\1\uffff\1\0\1\101\1\uffff\2\0\1\52\2\uffff"+
        "\1\165\1\uffff\1\154\1\56\2\uffff\1\56\5\uffff\1\145\1\163\1\60"+
        "\1\145\1\uffff\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\162\1\141\2\71\1\uffff\1\uffff\1\172\1\uffff\2\uffff"+
        "\1\57\2\uffff\1\165\1\uffff\1\154\1\71\2\uffff\1\71\5\uffff\1\145"+
        "\1\163\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\5\uffff\1\4\2\uffff\1\6\3\uffff\1\13\1\14\1\uffff\1\6\2\uffff\1"+
        "\4\1\3\1\uffff\1\5\1\10\1\11\1\12\1\13\4\uffff\1\1\1\uffff\1\2";
    static final String DFA18_specialS =
        "\1\1\5\uffff\1\2\2\uffff\1\3\1\0\26\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\15\2\14\2\15\1\14\22\15\1\14\1\15\1\11\4\15\1\12\5\15\1"+
            "\3\1\5\1\13\12\4\7\15\32\10\3\15\1\7\1\10\1\15\5\10\1\2\15\10"+
            "\1\1\6\10\60\15\1\6\uff54\15",
            "\1\16",
            "\1\20",
            "\1\22\1\uffff\12\21",
            "\1\22\1\uffff\12\24",
            "",
            "\u00ab\25\1\uffff\uff54\25",
            "\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\0\26",
            "\0\26",
            "\1\27\4\uffff\1\30",
            "",
            "",
            "\1\32",
            "",
            "\1\33",
            "\1\22\1\uffff\12\21",
            "",
            "",
            "\1\22\1\uffff\12\24",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\37",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | RULE_INTEGER | RULE_REAL | RULE_DESC_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_10 = input.LA(1);

                        s = -1;
                        if ( ((LA18_10>='\u0000' && LA18_10<='\uFFFF')) ) {s = 22;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='t') ) {s = 1;}

                        else if ( (LA18_0=='f') ) {s = 2;}

                        else if ( (LA18_0=='-') ) {s = 3;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 4;}

                        else if ( (LA18_0=='.') ) {s = 5;}

                        else if ( (LA18_0=='\u00AB') ) {s = 6;}

                        else if ( (LA18_0=='^') ) {s = 7;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='e')||(LA18_0>='g' && LA18_0<='s')||(LA18_0>='u' && LA18_0<='z')) ) {s = 8;}

                        else if ( (LA18_0=='\"') ) {s = 9;}

                        else if ( (LA18_0=='\'') ) {s = 10;}

                        else if ( (LA18_0=='/') ) {s = 11;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 12;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='(' && LA18_0<=',')||(LA18_0>=':' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\u00AA')||(LA18_0>='\u00AC' && LA18_0<='\uFFFF')) ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_6 = input.LA(1);

                        s = -1;
                        if ( ((LA18_6>='\u0000' && LA18_6<='\u00AA')||(LA18_6>='\u00AC' && LA18_6<='\uFFFF')) ) {s = 21;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_9 = input.LA(1);

                        s = -1;
                        if ( ((LA18_9>='\u0000' && LA18_9<='\uFFFF')) ) {s = 22;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}