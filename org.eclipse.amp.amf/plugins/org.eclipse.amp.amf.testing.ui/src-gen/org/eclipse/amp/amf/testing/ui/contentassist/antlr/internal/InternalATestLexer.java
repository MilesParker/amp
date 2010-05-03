package org.eclipse.amp.amf.testing.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalATestLexer extends Lexer {
    public static final int RULE_ID=6;
    public static final int RULE_ANY_OTHER=13;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=30;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=11;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=8;
    public static final int T14=14;
    public static final int RULE_WS=12;
    public static final int T15=15;
    public static final int RULE_DESC_STRING=5;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public static final int RULE_INTEGER=7;
    public InternalATestLexer() {;} 
    public InternalATestLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g"; }

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:10:5: ( 'Count' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:10:7: 'Count'
            {
            match("Count"); 


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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:11:5: ( 'Average' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:11:7: 'Average'
            {
            match("Average"); 


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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:12:5: ( 'Sum' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:12:7: 'Sum'
            {
            match("Sum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:13:5: ( 'Minimum' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:13:7: 'Minimum'
            {
            match("Minimum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:14:5: ( 'Maximum' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:14:7: 'Maximum'
            {
            match("Maximum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:15:5: ( 'true' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:15:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:16:5: ( 'false' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:16:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:17:5: ( 'tests' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:17:7: 'tests'
            {
            match("tests"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:18:5: ( 'contains' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:18:7: 'contains'
            {
            match("contains"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:19:5: ( '(' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:19:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:20:5: ( '.' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:20:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:21:5: ( ')' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:21:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:22:5: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:22:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:23:5: ( '[' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:23:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:24:5: ( ',' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:24:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:25:5: ( ']' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:25:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start RULE_INTEGER
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1266:14: ( ( '-' )? ( '0' .. '9' )+ )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1266:16: ( '-' )? ( '0' .. '9' )+
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1266:16: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1266:16: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1266:21: ( '0' .. '9' )+
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
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1266:22: '0' .. '9'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INTEGER

    // $ANTLR start RULE_REAL
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1268:11: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )* )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1268:13: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )*
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1268:13: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1268:13: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1268:18: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1268:19: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('.'); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1268:34: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1268:35: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_REAL

    // $ANTLR start RULE_DESC_STRING
    public final void mRULE_DESC_STRING() throws RecognitionException {
        try {
            int _type = RULE_DESC_STRING;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1270:18: ( '\\u00AB' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\u00AB' | '\\u00BB' | '\\\\' ) | ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00BB' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1270:20: '\\u00AB' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\u00AB' | '\\u00BB' | '\\\\' ) | ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00BB'
            {
            match('\u00AB'); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1270:29: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\u00AB' | '\\u00BB' | '\\\\' ) | ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\u00AA')||(LA6_0>='\u00AC' && LA6_0<='\u00BA')||(LA6_0>='\u00BC' && LA6_0<='\uFFFE')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1270:30: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\u00AB' | '\\u00BB' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='\u00AB'||input.LA(1)=='\u00BB' ) {
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
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1270:80: ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFE') ) {
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

            match('\u00BB'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DESC_STRING

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1272:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1272:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1272:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1272:11: '^'
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

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1272:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:
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
            	    break loop8;
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1274:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1274:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1274:12: ( '0' .. '9' )+
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
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1274:13: '0' .. '9'
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("1276:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFE')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFE')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1276:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1278:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1278:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1278:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFE')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1278:52: .
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1280:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1280:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1280:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1280:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1280:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1280:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1280:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1280:41: '\\r'
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1282:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1282:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1282:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1284:16: ( . )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1284:18: .
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
        // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:8: ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | RULE_INTEGER | RULE_REAL | RULE_DESC_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=26;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:10: T14
                {
                mT14(); 

                }
                break;
            case 2 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:14: T15
                {
                mT15(); 

                }
                break;
            case 3 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:18: T16
                {
                mT16(); 

                }
                break;
            case 4 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:22: T17
                {
                mT17(); 

                }
                break;
            case 5 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:26: T18
                {
                mT18(); 

                }
                break;
            case 6 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:30: T19
                {
                mT19(); 

                }
                break;
            case 7 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:34: T20
                {
                mT20(); 

                }
                break;
            case 8 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:38: T21
                {
                mT21(); 

                }
                break;
            case 9 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:42: T22
                {
                mT22(); 

                }
                break;
            case 10 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:46: T23
                {
                mT23(); 

                }
                break;
            case 11 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:50: T24
                {
                mT24(); 

                }
                break;
            case 12 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:54: T25
                {
                mT25(); 

                }
                break;
            case 13 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:58: T26
                {
                mT26(); 

                }
                break;
            case 14 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:62: T27
                {
                mT27(); 

                }
                break;
            case 15 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:66: T28
                {
                mT28(); 

                }
                break;
            case 16 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:70: T29
                {
                mT29(); 

                }
                break;
            case 17 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:74: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 18 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:87: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 19 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:97: RULE_DESC_STRING
                {
                mRULE_DESC_STRING(); 

                }
                break;
            case 20 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:114: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:122: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:131: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:143: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:159: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:175: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1:183: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\7\32\1\uffff\1\44\5\uffff\1\30\1\54\2\30\1\uffff\3\30\2"+
        "\uffff\1\32\1\uffff\10\32\10\uffff\1\54\1\uffff\1\54\5\uffff\2\32"+
        "\1\76\10\32\1\uffff\2\32\1\111\3\32\1\115\3\32\1\uffff\1\121\1\122"+
        "\1\32\1\uffff\3\32\2\uffff\1\32\1\130\1\131\1\132\1\32\3\uffff\1"+
        "\134\1\uffff";
    static final String DFA18_eofS =
        "\135\uffff";
    static final String DFA18_minS =
        "\1\0\1\157\1\166\1\165\1\141\1\145\1\141\1\157\1\uffff\1\60\5\uffff"+
        "\2\56\1\0\1\101\1\uffff\2\0\1\52\2\uffff\1\165\1\uffff\1\145\1\155"+
        "\1\170\1\156\1\165\1\163\1\154\1\156\10\uffff\1\56\1\uffff\1\56"+
        "\5\uffff\1\156\1\162\1\60\2\151\1\145\1\164\1\163\2\164\1\141\1"+
        "\uffff\2\155\1\60\1\163\1\145\1\141\1\60\1\147\2\165\1\uffff\2\60"+
        "\1\151\1\uffff\1\145\2\155\2\uffff\1\156\3\60\1\163\3\uffff\1\60"+
        "\1\uffff";
    static final String DFA18_maxS =
        "\1\ufffe\1\157\1\166\1\165\1\151\1\162\1\141\1\157\1\uffff\1\71"+
        "\5\uffff\2\71\1\ufffe\1\172\1\uffff\2\ufffe\1\57\2\uffff\1\165\1"+
        "\uffff\1\145\1\155\1\170\1\156\1\165\1\163\1\154\1\156\10\uffff"+
        "\1\71\1\uffff\1\71\5\uffff\1\156\1\162\1\172\2\151\1\145\1\164\1"+
        "\163\2\164\1\141\1\uffff\2\155\1\172\1\163\1\145\1\141\1\172\1\147"+
        "\2\165\1\uffff\2\172\1\151\1\uffff\1\145\2\155\2\uffff\1\156\3\172"+
        "\1\163\3\uffff\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\10\uffff\1\12\1\uffff\1\14\1\15\1\16\1\17\1\20\4\uffff\1\24\3\uffff"+
        "\1\31\1\32\1\uffff\1\24\10\uffff\1\12\1\13\1\22\1\14\1\15\1\16\1"+
        "\17\1\20\1\uffff\1\21\1\uffff\1\23\1\26\1\27\1\30\1\31\13\uffff"+
        "\1\3\12\uffff\1\6\3\uffff\1\1\3\uffff\1\10\1\7\5\uffff\1\2\1\5\1"+
        "\4\1\uffff\1\11";
    static final String DFA18_specialS =
        "\135\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\4\30\1\25\1\10\1"+
            "\12\2\30\1\15\1\17\1\11\1\26\12\20\3\30\1\13\3\30\1\2\1\23\1"+
            "\1\11\23\1\4\5\23\1\3\7\23\1\14\1\30\1\16\1\22\1\23\1\30\2\23"+
            "\1\7\2\23\1\6\15\23\1\5\6\23\60\30\1\21\uff53\30",
            "\1\31",
            "\1\33",
            "\1\34",
            "\1\35\7\uffff\1\36",
            "\1\40\14\uffff\1\37",
            "\1\41",
            "\1\42",
            "",
            "\12\45",
            "",
            "",
            "",
            "",
            "",
            "\1\45\1\uffff\12\53",
            "\1\45\1\uffff\12\55",
            "\u00ab\56\1\uffff\uff53\56",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\uffff\57",
            "\uffff\57",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\1\uffff\12\53",
            "",
            "\1\45\1\uffff\12\55",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\133",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
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
            return "1:1: Tokens : ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | RULE_INTEGER | RULE_REAL | RULE_DESC_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}