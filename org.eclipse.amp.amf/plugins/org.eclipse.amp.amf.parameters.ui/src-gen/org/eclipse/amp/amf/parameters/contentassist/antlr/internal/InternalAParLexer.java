package org.eclipse.amp.amf.parameters.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalAParLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int T12=12;
    public static final int RULE_REAL=5;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=10;
    public static final int Tokens=17;
    public static final int T16=16;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public InternalAParLexer() {;} 
    public InternalAParLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:10:5: ( 'true' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:10:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:11:5: ( 'false' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:11:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:12:5: ( 'model' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:12:7: 'model'
            {
            match("model"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:13:5: ( 'incorporates' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:13:7: 'incorporates'
            {
            match("incorporates"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:14:5: ( '=' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:14:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start RULE_REAL
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:506:11: ( ( '-' )? RULE_INT '.' RULE_INT )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:506:13: ( '-' )? RULE_INT '.' RULE_INT
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:506:13: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:506:13: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_REAL

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:508:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:508:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:508:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:508:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:508:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:510:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:510:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:510:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:510:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("512:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:512:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:514:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:514:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:514:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:514:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:516:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:516:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:516:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:516:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:516:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:516:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:516:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:516:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:518:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:518:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:518:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:520:16: ( . )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:520:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:8: ( T12 | T13 | T14 | T15 | T16 | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=13;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:30: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 7 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:40: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:48: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:57: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:69: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:85: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:101: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:1:109: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\4\20\1\uffff\1\16\1\26\1\16\1\uffff\3\16\2\uffff\1\20\1"+
        "\uffff\3\20\3\uffff\1\26\4\uffff\4\20\1\44\3\20\1\uffff\1\50\1\51"+
        "\1\20\2\uffff\6\20\1\61\1\uffff";
    static final String DFA13_eofS =
        "\62\uffff";
    static final String DFA13_minS =
        "\1\0\1\162\1\141\1\157\1\156\1\uffff\1\60\1\56\1\101\1\uffff\2\0"+
        "\1\52\2\uffff\1\165\1\uffff\1\154\1\144\1\143\3\uffff\1\56\4\uffff"+
        "\1\145\1\163\1\145\1\157\1\60\1\145\1\154\1\162\1\uffff\2\60\1\160"+
        "\2\uffff\1\157\1\162\1\141\1\164\1\145\1\163\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\ufffe\1\162\1\141\1\157\1\156\1\uffff\2\71\1\172\1\uffff\2\ufffe"+
        "\1\57\2\uffff\1\165\1\uffff\1\154\1\144\1\143\3\uffff\1\71\4\uffff"+
        "\1\145\1\163\1\145\1\157\1\172\1\145\1\154\1\162\1\uffff\2\172\1"+
        "\160\2\uffff\1\157\1\162\1\141\1\164\1\145\1\163\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\5\3\uffff\1\7\3\uffff\1\14\1\15\1\uffff\1\7\3\uffff\1"+
        "\5\1\6\1\10\1\uffff\1\11\1\13\1\12\1\14\10\uffff\1\1\3\uffff\1\2"+
        "\1\3\7\uffff\1\4";
    static final String DFA13_specialS =
        "\62\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\12\4\16\1\13\5\16\1"+
            "\6\1\16\1\14\12\7\3\16\1\5\3\16\32\11\3\16\1\10\1\11\1\16\5"+
            "\11\1\2\2\11\1\4\3\11\1\3\6\11\1\1\6\11\uff84\16",
            "\1\17",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
            "\12\25",
            "\1\25\1\uffff\12\27",
            "\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\uffff\30",
            "\uffff\30",
            "\1\32\4\uffff\1\31",
            "",
            "",
            "\1\34",
            "",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "\1\25\1\uffff\12\27",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\52",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}