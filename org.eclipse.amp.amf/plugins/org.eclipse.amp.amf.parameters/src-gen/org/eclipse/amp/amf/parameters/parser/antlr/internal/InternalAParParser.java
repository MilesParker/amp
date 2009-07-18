package org.eclipse.amp.amf.parameters.parser.antlr.internal; 

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
import org.eclipse.amp.amf.parameters.services.AParGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalAParParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'TRUE'", "'true'", "'FALSE'", "'false'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalAParParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g"; }


     
     	private AParGrammarAccess grammarAccess;
     	
        public InternalAParParser(TokenStream input, IAstFactory factory, AParGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	} 



    // $ANTLR start entryRuleImport
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:75:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:75:48: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:76:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport75);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport85); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:83:1: ruleImport returns [EObject current=null] : ( 'model' (lv_importURI_1= RULE_STRING ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:88:6: ( ( 'model' (lv_importURI_1= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:89:1: ( 'model' (lv_importURI_1= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:89:1: ( 'model' (lv_importURI_1= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:89:2: 'model' (lv_importURI_1= RULE_STRING )
            {
            match(input,12,FOLLOW_12_in_ruleImport119); 

                    createLeafNode(grammarAccess.getImportAccess().getModelKeyword_0(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:93:1: (lv_importURI_1= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:95:6: lv_importURI_1= RULE_STRING
            {
            lv_importURI_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport141); 

            		createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "importURI", lv_importURI_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleParameter
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:122:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:122:51: (iv_ruleParameter= ruleParameter EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:123:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter184);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter194); 

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
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:130:1: ruleParameter returns [EObject current=null] : ( ( RULE_STRING ) (lv_value_1= ruleValue ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:135:6: ( ( ( RULE_STRING ) (lv_value_1= ruleValue ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:136:1: ( ( RULE_STRING ) (lv_value_1= ruleValue ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:136:1: ( ( RULE_STRING ) (lv_value_1= ruleValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:136:2: ( RULE_STRING ) (lv_value_1= ruleValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:136:2: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:139:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter241); 

            		createLeafNode(grammarAccess.getParameterAccess().getAttributeSAttributeCrossReference_0_0(), "attribute"); 
            	

            }

            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:152:2: (lv_value_1= ruleValue )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:155:6: lv_value_1= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getValueValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleParameter278);
            lv_value_1=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_1, "Value", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleValue
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:180:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:180:47: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:181:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue315);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue325); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:188:1: ruleValue returns [EObject current=null] : (lv_value_0= ( ruleIntValue | ruleFloatValue | ruleStringValue | ruleBooleanValue ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:193:6: ( (lv_value_0= ( ruleIntValue | ruleFloatValue | ruleStringValue | ruleBooleanValue ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:194:1: (lv_value_0= ( ruleIntValue | ruleFloatValue | ruleStringValue | ruleBooleanValue ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:194:1: (lv_value_0= ( ruleIntValue | ruleFloatValue | ruleStringValue | ruleBooleanValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:196:6: lv_value_0= ( ruleIntValue | ruleFloatValue | ruleStringValue | ruleBooleanValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:196:17: ( ruleIntValue | ruleFloatValue | ruleStringValue | ruleBooleanValue )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("196:17: ( ruleIntValue | ruleFloatValue | ruleStringValue | ruleBooleanValue )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:196:19: ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getValueIntValueParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue375);
                    ruleIntValue();
                    _fsp--;

                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:203:7: ruleFloatValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getValueFloatValueParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValue389);
                    ruleFloatValue();
                    _fsp--;

                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:210:7: ruleStringValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getValueStringValueParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue403);
                    ruleStringValue();
                    _fsp--;

                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:217:7: ruleBooleanValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getValueBooleanValueParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue417);
                    ruleBooleanValue();
                    _fsp--;

                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, null, lastConsumedNode);
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
    // $ANTLR end ruleValue


    // $ANTLR start entryRuleIntValue
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:245:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:245:50: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:246:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue458);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue468); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:253:1: ruleIntValue returns [EObject current=null] : (lv_value_0= RULE_INT ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:258:6: ( (lv_value_0= RULE_INT ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:259:1: (lv_value_0= RULE_INT )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:259:1: (lv_value_0= RULE_INT )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:261:6: lv_value_0= RULE_INT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue514); 

            		createLeafNode(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "INT", lastConsumedNode);
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


    // $ANTLR start entryRuleFloatValue
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:286:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:286:52: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:287:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue554);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue564); 

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
    // $ANTLR end entryRuleFloatValue


    // $ANTLR start ruleFloatValue
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:294:1: ruleFloatValue returns [EObject current=null] : (lv_value_0= RULE_FLOAT ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:299:6: ( (lv_value_0= RULE_FLOAT ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:300:1: (lv_value_0= RULE_FLOAT )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:300:1: (lv_value_0= RULE_FLOAT )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:302:6: lv_value_0= RULE_FLOAT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue610); 

            		createLeafNode(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFloatValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "FLOAT", lastConsumedNode);
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
    // $ANTLR end ruleFloatValue


    // $ANTLR start entryRuleStringValue
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:327:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:327:53: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:328:2: iv_ruleStringValue= ruleStringValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue650);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue660); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:335:1: ruleStringValue returns [EObject current=null] : (lv_value_0= RULE_STRING ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:340:6: ( (lv_value_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:341:1: (lv_value_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:341:1: (lv_value_0= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:343:6: lv_value_0= RULE_STRING
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue706); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:368:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:368:54: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:369:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue746);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue756); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:376:1: ruleBooleanValue returns [EObject current=null] : (lv_value_0= ruleBOOLEAN ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:381:6: ( (lv_value_0= ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:382:1: (lv_value_0= ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:382:1: (lv_value_0= ruleBOOLEAN )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:385:6: lv_value_0= ruleBOOLEAN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanValue814);
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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:412:1: ruleBOOLEAN returns [Enumerator current=null] : ( ( 'TRUE' ) | ( 'true' ) | ( 'FALSE' ) | ( 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:416:6: ( ( ( 'TRUE' ) | ( 'true' ) | ( 'FALSE' ) | ( 'false' ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:417:1: ( ( 'TRUE' ) | ( 'true' ) | ( 'FALSE' ) | ( 'false' ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:417:1: ( ( 'TRUE' ) | ( 'true' ) | ( 'FALSE' ) | ( 'false' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("417:1: ( ( 'TRUE' ) | ( 'true' ) | ( 'FALSE' ) | ( 'false' ) )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:417:2: ( 'TRUE' )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:417:2: ( 'TRUE' )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:417:4: 'TRUE'
                    {
                    match(input,13,FOLLOW_13_in_ruleBOOLEAN866); 

                            current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:423:6: ( 'true' )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:423:6: ( 'true' )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:423:8: 'true'
                    {
                    match(input,14,FOLLOW_14_in_ruleBOOLEAN881); 

                            current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:429:6: ( 'FALSE' )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:429:6: ( 'FALSE' )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:429:8: 'FALSE'
                    {
                    match(input,15,FOLLOW_15_in_ruleBOOLEAN896); 

                            current = grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:435:6: ( 'false' )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:435:6: ( 'false' )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:435:8: 'false'
                    {
                    match(input,16,FOLLOW_16_in_ruleBOOLEAN911); 

                            current = grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_3(), null); 
                        

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


 

    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter241 = new BitSet(new long[]{0x000000000001E070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameter278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValue389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanValue814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBOOLEAN866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBOOLEAN881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBOOLEAN896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBOOLEAN911 = new BitSet(new long[]{0x0000000000000002L});

}