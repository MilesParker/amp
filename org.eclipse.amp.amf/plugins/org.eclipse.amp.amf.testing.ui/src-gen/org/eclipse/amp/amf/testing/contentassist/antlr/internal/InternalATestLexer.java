package org.eclipse.amp.amf.testing.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalATestLexer extends Lexer {
    public static final int RULE_ID=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int T25=25;
    public static final int Tokens=26;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_PLAIN_STRING=5;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=7;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=11;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalATestLexer() {;} 
    public InternalATestLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:10:5: ( 'Count' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:10:7: 'Count'
            {
            match("Count"); 


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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:11:5: ( 'Average' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:11:7: 'Average'
            {
            match("Average"); 


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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:12:5: ( 'Sum' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:12:7: 'Sum'
            {
            match("Sum"); 


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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:13:5: ( 'Minimum' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:13:7: 'Minimum'
            {
            match("Minimum"); 


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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:14:5: ( 'Maximum' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:14:7: 'Maximum'
            {
            match("Maximum"); 


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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:15:5: ( 'TESTS' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:15:7: 'TESTS'
            {
            match("TESTS"); 


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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:16:5: ( '(' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:16:7: '('
            {
            match('('); 

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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:17:5: ( ':' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:17:7: ':'
            {
            match(':'); 

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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:18:5: ( ')' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:18:7: ')'
            {
            match(')'); 

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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:19:5: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:19:7: '='
            {
            match('='); 

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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:20:5: ( '[' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:20:7: '['
            {
            match('['); 

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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:21:5: ( ',' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:21:7: ','
            {
            match(','); 

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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:22:5: ( ']' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:22:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start RULE_REAL
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:963:11: ( ( '-' )? RULE_INT ( '.' RULE_INT )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:963:13: ( '-' )? RULE_INT ( '.' RULE_INT )?
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:963:13: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:963:13: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:963:27: ( '.' RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:963:28: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_REAL

    // $ANTLR start RULE_PLAIN_STRING
    public final void mRULE_PLAIN_STRING() throws RecognitionException {
        try {
            int _type = RULE_PLAIN_STRING;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:965:19: ( '\\u00AB' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00BB' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:965:21: '\\u00AB' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00BB'
            {
            match('\u00AB'); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:965:30: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\u00AA')||(LA3_0>='\u00AC' && LA3_0<='\u00BA')||(LA3_0>='\u00BC' && LA3_0<='\uFFFE')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:965:31: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:965:72: ~ ( ( '\\\\' | '\\u00AB' | '\\u00BB' ) )
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
            	    break loop3;
                }
            } while (true);

            match('\u00BB'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_PLAIN_STRING

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:967:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:967:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:967:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:967:11: '^'
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

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:967:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:
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
            	    break loop5;
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:969:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:969:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:969:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:969:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("971:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:971:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:973:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:973:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:973:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFE')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:973:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:975:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:975:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:975:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:975:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:975:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:975:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:975:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:975:41: '\\r'
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:977:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:977:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:977:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:979:16: ( . )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:979:18: .
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
        // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | RULE_REAL | RULE_PLAIN_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=22;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:62: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 15 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:72: RULE_PLAIN_STRING
                {
                mRULE_PLAIN_STRING(); 

                }
                break;
            case 16 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:90: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:98: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:107: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:119: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:135: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:151: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1:159: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\5\30\7\uffff\1\26\1\45\2\26\1\uffff\3\26\2\uffff\1\30\1"+
        "\uffff\5\30\10\uffff\1\45\5\uffff\2\30\1\64\5\30\1\uffff\3\30\1"+
        "\75\3\30\1\101\1\uffff\3\30\1\uffff\1\105\1\106\1\107\3\uffff";
    static final String DFA15_eofS =
        "\110\uffff";
    static final String DFA15_minS =
        "\1\0\1\157\1\166\1\165\1\141\1\105\7\uffff\2\60\1\0\1\101\1\uffff"+
        "\2\0\1\52\2\uffff\1\165\1\uffff\1\145\1\155\1\156\1\170\1\123\10"+
        "\uffff\1\60\5\uffff\1\156\1\162\1\60\2\151\1\124\1\164\1\141\1\uffff"+
        "\2\155\1\123\1\60\1\147\2\165\1\60\1\uffff\1\145\2\155\1\uffff\3"+
        "\60\3\uffff";
    static final String DFA15_maxS =
        "\1\ufffe\1\157\1\166\1\165\1\151\1\105\7\uffff\2\71\1\ufffe\1\172"+
        "\1\uffff\2\ufffe\1\57\2\uffff\1\165\1\uffff\1\145\1\155\1\156\1"+
        "\170\1\123\10\uffff\1\71\5\uffff\1\156\1\162\1\172\2\151\1\124\1"+
        "\164\1\141\1\uffff\2\155\1\123\1\172\1\147\2\165\1\172\1\uffff\1"+
        "\145\2\155\1\uffff\3\172\3\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\4\uffff\1\20\3\uffff"+
        "\1\25\1\26\1\uffff\1\20\5\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
        "\1\16\1\uffff\1\17\1\22\1\23\1\24\1\25\10\uffff\1\3\10\uffff\1\1"+
        "\3\uffff\1\6\3\uffff\1\2\1\4\1\5";
    static final String DFA15_specialS =
        "\110\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\4\26\1\23\1\6\1\10"+
            "\2\26\1\13\1\15\1\26\1\24\12\16\1\7\2\26\1\11\3\26\1\2\1\21"+
            "\1\1\11\21\1\4\5\21\1\3\1\5\6\21\1\12\1\26\1\14\1\20\1\21\1"+
            "\26\32\21\60\26\1\17\uff53\26",
            "\1\27",
            "\1\31",
            "\1\32",
            "\1\34\7\uffff\1\33",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\45",
            "\12\46",
            "\u00ab\47\1\uffff\uff53\47",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\uffff\50",
            "\uffff\50",
            "\1\51\4\uffff\1\52",
            "",
            "",
            "\1\54",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | RULE_REAL | RULE_PLAIN_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}