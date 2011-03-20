package org.eclipse.amp.amf.abase.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.amp.amf.abase.services.ABaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalABaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER", "RULE_REAL", "RULE_STRING", "RULE_DESC_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'"
    };
    public static final int RULE_ID=8;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__14=14;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=5;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_DESC_STRING=7;
    public static final int EOF=-1;
    public static final int RULE_INTEGER=4;
    public static final int RULE_ML_COMMENT=10;

    // delegates
    // delegators


        public InternalABaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalABaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalABaseParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g"; }



     	private ABaseGrammarAccess grammarAccess;
     	
        public InternalABaseParser(TokenStream input, ABaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Value";	
       	}
       	
       	@Override
       	protected ABaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleValue"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:68:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:69:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:70:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue75);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:77:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_RealValue_2 = null;

        EObject this_BooleanValue_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:80:28: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:81:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:81:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                alt1=2;
                }
                break;
            case RULE_REAL:
                {
                alt1=3;
                }
                break;
            case 14:
            case 15:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:82:5: this_IntValue_0= ruleIntValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue132);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;

                     
                            current = this_IntValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:92:5: this_StringValue_1= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue159);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:102:5: this_RealValue_2= ruleRealValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRealValue_in_ruleValue186);
                    this_RealValue_2=ruleRealValue();

                    state._fsp--;

                     
                            current = this_RealValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:112:5: this_BooleanValue_3= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue213);
                    this_BooleanValue_3=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntValue"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:128:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:129:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:130:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue248);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:137:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INTEGER ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:140:28: ( ( (lv_value_0_0= RULE_INTEGER ) ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:141:1: ( (lv_value_0_0= RULE_INTEGER ) )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:141:1: ( (lv_value_0_0= RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:142:1: (lv_value_0_0= RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:142:1: (lv_value_0_0= RULE_INTEGER )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:143:3: lv_value_0_0= RULE_INTEGER
            {
            lv_value_0_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleIntValue299); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INTEGER");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleRealValue"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:167:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:168:2: (iv_ruleRealValue= ruleRealValue EOF )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:169:2: iv_ruleRealValue= ruleRealValue EOF
            {
             newCompositeNode(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue339);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;

             current =iv_ruleRealValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:176:1: ruleRealValue returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:179:28: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:180:1: ( (lv_value_0_0= RULE_REAL ) )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:180:1: ( (lv_value_0_0= RULE_REAL ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:181:1: (lv_value_0_0= RULE_REAL )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:181:1: (lv_value_0_0= RULE_REAL )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:182:3: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleRealValue390); 

            			newLeafNode(lv_value_0_0, grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRealValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"REAL");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleStringValue"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:206:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:207:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:208:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue430);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue440); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:215:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:218:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:219:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:219:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:220:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:220:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:221:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue481); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:245:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:246:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:247:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue521);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue531); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:254:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:257:28: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:258:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:258:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:259:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:259:1: (lv_value_0_0= ruleBOOLEAN )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:260:3: lv_value_0_0= ruleBOOLEAN
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanValue576);
            lv_value_0_0=ruleBOOLEAN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"BOOLEAN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "ruleBOOLEAN"
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:284:1: ruleBOOLEAN returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:286:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:287:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:287:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:287:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:287:2: (enumLiteral_0= 'true' )
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:287:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,14,FOLLOW_14_in_ruleBOOLEAN625); 

                            current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:293:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:293:6: (enumLiteral_1= 'false' )
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:293:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,15,FOLLOW_15_in_ruleBOOLEAN642); 

                            current = grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_ruleValue186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntValue299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleRealValue390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanValue576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBOOLEAN625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBOOLEAN642 = new BitSet(new long[]{0x0000000000000002L});

}