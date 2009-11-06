package org.eclipse.amp.amf.abase.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.amp.amf.abase.services.ABaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalABaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER", "RULE_REAL", "RULE_STRING", "RULE_DESC_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'"
    };
    public static final int RULE_ID=8;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=5;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_DESC_STRING=7;
    public static final int RULE_INTEGER=4;
    public static final int RULE_ML_COMMENT=10;

        public InternalABaseParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g"; }


     
     	private ABaseGrammarAccess grammarAccess;
     	
        public InternalABaseParser(TokenStream input, IAstFactory factory, ABaseGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Value";	
       	} 



    // $ANTLR start entryRuleValue
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:73:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:73:47: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:74:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue73);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue83); 

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
    // $ANTLR end entryRuleValue


    // $ANTLR start ruleValue
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:81:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_RealValue_2 = null;

        EObject this_BooleanValue_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:86:6: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:87:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:87:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
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
                    new NoViableAltException("87:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:88:5: this_IntValue_0= ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue130);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;

                     
                            current = this_IntValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:98:5: this_StringValue_1= ruleStringValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue157);
                    this_StringValue_1=ruleStringValue();
                    _fsp--;

                     
                            current = this_StringValue_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:108:5: this_RealValue_2= ruleRealValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRealValue_in_ruleValue184);
                    this_RealValue_2=ruleRealValue();
                    _fsp--;

                     
                            current = this_RealValue_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:118:5: this_BooleanValue_3= ruleBooleanValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue211);
                    this_BooleanValue_3=ruleBooleanValue();
                    _fsp--;

                     
                            current = this_BooleanValue_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValue


    // $ANTLR start entryRuleIntValue
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:133:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:133:50: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:134:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue243);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue253); 

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
    // $ANTLR end entryRuleIntValue


    // $ANTLR start ruleIntValue
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:141:1: ruleIntValue returns [EObject current=null] : (lv_value_0= RULE_INTEGER ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:146:6: ( (lv_value_0= RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:147:1: (lv_value_0= RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:147:1: (lv_value_0= RULE_INTEGER )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:149:6: lv_value_0= RULE_INTEGER
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleIntValue299); 

            		createLeafNode(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "INTEGER", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleRealValue
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:174:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:174:51: (iv_ruleRealValue= ruleRealValue EOF )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:175:2: iv_ruleRealValue= ruleRealValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRealValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue339);
            iv_ruleRealValue=ruleRealValue();
            _fsp--;

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
    // $ANTLR end entryRuleRealValue


    // $ANTLR start ruleRealValue
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:182:1: ruleRealValue returns [EObject current=null] : (lv_value_0= RULE_REAL ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:187:6: ( (lv_value_0= RULE_REAL ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:188:1: (lv_value_0= RULE_REAL )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:188:1: (lv_value_0= RULE_REAL )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:190:6: lv_value_0= RULE_REAL
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleRealValue395); 

            		createLeafNode(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRealValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "REAL", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRealValue


    // $ANTLR start entryRuleStringValue
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:215:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:215:53: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:216:2: iv_ruleStringValue= ruleStringValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue435);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue445); 

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
    // $ANTLR end entryRuleStringValue


    // $ANTLR start ruleStringValue
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:223:1: ruleStringValue returns [EObject current=null] : (lv_value_0= RULE_STRING ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:228:6: ( (lv_value_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:229:1: (lv_value_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:229:1: (lv_value_0= RULE_STRING )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:231:6: lv_value_0= RULE_STRING
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue491); 

            		createLeafNode(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringValue


    // $ANTLR start entryRuleBooleanValue
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:256:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:256:54: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:257:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue531);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue541); 

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
    // $ANTLR end entryRuleBooleanValue


    // $ANTLR start ruleBooleanValue
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:264:1: ruleBooleanValue returns [EObject current=null] : (lv_value_0= ruleBOOLEAN ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:269:6: ( (lv_value_0= ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:270:1: (lv_value_0= ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:270:1: (lv_value_0= ruleBOOLEAN )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:273:6: lv_value_0= ruleBOOLEAN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanValue599);
            lv_value_0=ruleBOOLEAN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBooleanValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "BOOLEAN", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanValue


    // $ANTLR start ruleBOOLEAN
    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:298:1: ruleBOOLEAN returns [Enumerator current=null] : ( ( 'true' ) | ( 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:302:6: ( ( ( 'true' ) | ( 'false' ) ) )
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:303:1: ( ( 'true' ) | ( 'false' ) )
            {
            // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:303:1: ( ( 'true' ) | ( 'false' ) )
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
                    new NoViableAltException("303:1: ( ( 'true' ) | ( 'false' ) )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:303:2: ( 'true' )
                    {
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:303:2: ( 'true' )
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:303:4: 'true'
                    {
                    match(input,14,FOLLOW_14_in_ruleBOOLEAN649); 

                            current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:309:6: ( 'false' )
                    {
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:309:6: ( 'false' )
                    // ../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g:309:8: 'false'
                    {
                    match(input,15,FOLLOW_15_in_ruleBOOLEAN664); 

                            current = grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBOOLEAN


 

    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_ruleValue184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntValue299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleRealValue395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanValue599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBOOLEAN649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBOOLEAN664 = new BitSet(new long[]{0x0000000000000002L});

}