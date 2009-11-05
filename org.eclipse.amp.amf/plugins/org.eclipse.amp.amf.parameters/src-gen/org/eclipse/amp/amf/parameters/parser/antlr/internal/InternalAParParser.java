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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INTEGER", "RULE_REAL", "RULE_DESC_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'incorporates'", "'='", "'true'", "'false'"
    };
    public static final int RULE_ID=8;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=6;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_DESC_STRING=7;
    public static final int RULE_INTEGER=5;
    public static final int RULE_ML_COMMENT=10;

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



    // $ANTLR start entryRuleModel
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:73:47: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:74:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel73);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel83); 

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:81:1: ruleModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_model_1_0= ruleImport ) ) ( (lv_incorporates_2_0= ruleIncorporates ) )* ( (lv_parameters_3_0= ruleParameter ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_model_1_0 = null;

        EObject lv_incorporates_2_0 = null;

        EObject lv_parameters_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:86:6: ( ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_model_1_0= ruleImport ) ) ( (lv_incorporates_2_0= ruleIncorporates ) )* ( (lv_parameters_3_0= ruleParameter ) )* ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:87:1: ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_model_1_0= ruleImport ) ) ( (lv_incorporates_2_0= ruleIncorporates ) )* ( (lv_parameters_3_0= ruleParameter ) )* )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:87:1: ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_model_1_0= ruleImport ) ) ( (lv_incorporates_2_0= ruleIncorporates ) )* ( (lv_parameters_3_0= ruleParameter ) )* )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:87:2: ( (lv_name_0_0= RULE_STRING ) )? ( (lv_model_1_0= ruleImport ) ) ( (lv_incorporates_2_0= ruleIncorporates ) )* ( (lv_parameters_3_0= ruleParameter ) )*
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:87:2: ( (lv_name_0_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:88:1: (lv_name_0_0= RULE_STRING )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:88:1: (lv_name_0_0= RULE_STRING )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:89:3: lv_name_0_0= RULE_STRING
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel125); 

                    			createLeafNode(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_0_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:111:3: ( (lv_model_1_0= ruleImport ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:112:1: (lv_model_1_0= ruleImport )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:112:1: (lv_model_1_0= ruleImport )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:113:3: lv_model_1_0= ruleImport
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getModelImportParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleImport_in_ruleModel152);
            lv_model_1_0=ruleImport();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"model",
            	        		lv_model_1_0, 
            	        		"Import", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:135:2: ( (lv_incorporates_2_0= ruleIncorporates ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:136:1: (lv_incorporates_2_0= ruleIncorporates )
            	    {
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:136:1: (lv_incorporates_2_0= ruleIncorporates )
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:137:3: lv_incorporates_2_0= ruleIncorporates
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getIncorporatesIncorporatesParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleIncorporates_in_ruleModel173);
            	    lv_incorporates_2_0=ruleIncorporates();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"incorporates",
            	    	        		lv_incorporates_2_0, 
            	    	        		"Incorporates", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:159:3: ( (lv_parameters_3_0= ruleParameter ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:160:1: (lv_parameters_3_0= ruleParameter )
            	    {
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:160:1: (lv_parameters_3_0= ruleParameter )
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:161:3: lv_parameters_3_0= ruleParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getParametersParameterParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleModel195);
            	    lv_parameters_3_0=ruleParameter();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"parameters",
            	    	        		lv_parameters_3_0, 
            	    	        		"Parameter", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleImport
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:190:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:190:48: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:191:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport229);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport239); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:198:1: ruleImport returns [EObject current=null] : ( 'model' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:203:6: ( ( 'model' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:204:1: ( 'model' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:204:1: ( 'model' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:204:2: 'model' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,14,FOLLOW_14_in_ruleImport273); 

                    createLeafNode(grammarAccess.getImportAccess().getModelKeyword_0(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:208:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:209:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:209:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:210:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport290); 

            			createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

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


    // $ANTLR start entryRuleIncorporates
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:239:1: entryRuleIncorporates returns [EObject current=null] : iv_ruleIncorporates= ruleIncorporates EOF ;
    public final EObject entryRuleIncorporates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncorporates = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:239:54: (iv_ruleIncorporates= ruleIncorporates EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:240:2: iv_ruleIncorporates= ruleIncorporates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIncorporatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleIncorporates_in_entryRuleIncorporates328);
            iv_ruleIncorporates=ruleIncorporates();
            _fsp--;

             current =iv_ruleIncorporates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncorporates338); 

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
    // $ANTLR end entryRuleIncorporates


    // $ANTLR start ruleIncorporates
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:247:1: ruleIncorporates returns [EObject current=null] : ( 'incorporates' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleIncorporates() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:252:6: ( ( 'incorporates' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:253:1: ( 'incorporates' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:253:1: ( 'incorporates' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:253:2: 'incorporates' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,15,FOLLOW_15_in_ruleIncorporates372); 

                    createLeafNode(grammarAccess.getIncorporatesAccess().getIncorporatesKeyword_0(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:257:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:258:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:258:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:259:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncorporates389); 

            			createLeafNode(grammarAccess.getIncorporatesAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIncorporatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

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
    // $ANTLR end ruleIncorporates


    // $ANTLR start entryRuleParameter
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:288:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:288:51: (iv_ruleParameter= ruleParameter EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:289:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter427);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter437); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:296:1: ruleParameter returns [EObject current=null] : ( ( ( RULE_STRING ) ) '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:301:6: ( ( ( ( RULE_STRING ) ) '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:302:1: ( ( ( RULE_STRING ) ) '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:302:1: ( ( ( RULE_STRING ) ) '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:302:2: ( ( RULE_STRING ) ) '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:302:2: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:303:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:303:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:304:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter480); 

            		createLeafNode(grammarAccess.getParameterAccess().getAttributeSAttributeCrossReference_0_0(), "attribute"); 
            	

            }


            }

            match(input,16,FOLLOW_16_in_ruleParameter489); 

                    createLeafNode(grammarAccess.getParameterAccess().getEqualsSignKeyword_1(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:320:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:321:1: (lv_value_2_0= ruleValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:321:1: (lv_value_2_0= ruleValue )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:322:3: lv_value_2_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getValueValueParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleParameter510);
            lv_value_2_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
            	        		"Value", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleValue
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:351:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:351:47: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:352:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue543);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue553); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:359:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_RealValue_2 = null;

        EObject this_BooleanValue_3 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:364:6: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:365:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:365:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_REAL:
                {
                alt4=3;
                }
                break;
            case 17:
            case 18:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("365:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:366:5: this_IntValue_0= ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue600);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;

                     
                            current = this_IntValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:376:5: this_StringValue_1= ruleStringValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue627);
                    this_StringValue_1=ruleStringValue();
                    _fsp--;

                     
                            current = this_StringValue_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:386:5: this_RealValue_2= ruleRealValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRealValue_in_ruleValue654);
                    this_RealValue_2=ruleRealValue();
                    _fsp--;

                     
                            current = this_RealValue_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:396:5: this_BooleanValue_3= ruleBooleanValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue681);
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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:411:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:411:50: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:412:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue713);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue723); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:419:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INTEGER ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:424:6: ( ( (lv_value_0_0= RULE_INTEGER ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:425:1: ( (lv_value_0_0= RULE_INTEGER ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:425:1: ( (lv_value_0_0= RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:426:1: (lv_value_0_0= RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:426:1: (lv_value_0_0= RULE_INTEGER )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:427:3: lv_value_0_0= RULE_INTEGER
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleIntValue764); 

            			createLeafNode(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"INTEGER", 
            	        		lastConsumedNode);
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
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleRealValue
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:456:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:456:51: (iv_ruleRealValue= ruleRealValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:457:2: iv_ruleRealValue= ruleRealValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRealValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue801);
            iv_ruleRealValue=ruleRealValue();
            _fsp--;

             current =iv_ruleRealValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue811); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:464:1: ruleRealValue returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:469:6: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:470:1: ( (lv_value_0_0= RULE_REAL ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:470:1: ( (lv_value_0_0= RULE_REAL ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:471:1: (lv_value_0_0= RULE_REAL )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:471:1: (lv_value_0_0= RULE_REAL )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:472:3: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleRealValue852); 

            			createLeafNode(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRealValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"REAL", 
            	        		lastConsumedNode);
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
    // $ANTLR end ruleRealValue


    // $ANTLR start entryRuleStringValue
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:501:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:501:53: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:502:2: iv_ruleStringValue= ruleStringValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue889);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue899); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:509:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:514:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:515:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:515:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:516:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:516:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:517:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue940); 

            			createLeafNode(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
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
    // $ANTLR end ruleStringValue


    // $ANTLR start entryRuleBooleanValue
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:546:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:546:54: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:547:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue977);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue987); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:554:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:559:6: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:560:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:560:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:561:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:561:1: (lv_value_0_0= ruleBOOLEAN )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:562:3: lv_value_0_0= ruleBOOLEAN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanValue1032);
            lv_value_0_0=ruleBOOLEAN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBooleanValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"BOOLEAN", 
            	        		currentNode);
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
    // $ANTLR end ruleBooleanValue


    // $ANTLR start ruleBOOLEAN
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:591:1: ruleBOOLEAN returns [Enumerator current=null] : ( ( 'true' ) | ( 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:595:6: ( ( ( 'true' ) | ( 'false' ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:596:1: ( ( 'true' ) | ( 'false' ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:596:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("596:1: ( ( 'true' ) | ( 'false' ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:596:2: ( 'true' )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:596:2: ( 'true' )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:596:4: 'true'
                    {
                    match(input,17,FOLLOW_17_in_ruleBOOLEAN1078); 

                            current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:602:6: ( 'false' )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:602:6: ( 'false' )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:602:8: 'false'
                    {
                    match(input,18,FOLLOW_18_in_ruleBOOLEAN1093); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel125 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel152 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_ruleIncorporates_in_ruleModel173 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleModel195 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncorporates_in_entryRuleIncorporates328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncorporates338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleIncorporates372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncorporates389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter480 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleParameter489 = new BitSet(new long[]{0x0000000000060070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameter510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_ruleValue654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntValue764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleRealValue852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanValue1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBOOLEAN1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBOOLEAN1093 = new BitSet(new long[]{0x0000000000000002L});

}