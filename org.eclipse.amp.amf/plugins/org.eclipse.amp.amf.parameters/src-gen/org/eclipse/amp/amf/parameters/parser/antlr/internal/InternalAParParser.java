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

@SuppressWarnings("all")
public class InternalAParParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INTEGER", "RULE_REAL", "RULE_DESC_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'incorporates'", "'='", "'['", "','", "']'", "'true'", "'false'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=7;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_DESC_STRING=8;
    public static final int EOF=-1;
    public static final int RULE_INTEGER=6;
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
       	
       	@Override
       	protected AParGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:80:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:87:1: ruleModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) )? 'model' ( (lv_model_2_0= ruleImport ) ) ( 'incorporates' ( (lv_incorporates_4_0= ruleIncorporates ) ) )* ( (lv_parameters_5_0= ruleParameter ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_model_2_0 = null;

        EObject lv_incorporates_4_0 = null;

        EObject lv_parameters_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:92:6: ( ( ( (lv_name_0_0= RULE_STRING ) )? 'model' ( (lv_model_2_0= ruleImport ) ) ( 'incorporates' ( (lv_incorporates_4_0= ruleIncorporates ) ) )* ( (lv_parameters_5_0= ruleParameter ) )* ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:93:1: ( ( (lv_name_0_0= RULE_STRING ) )? 'model' ( (lv_model_2_0= ruleImport ) ) ( 'incorporates' ( (lv_incorporates_4_0= ruleIncorporates ) ) )* ( (lv_parameters_5_0= ruleParameter ) )* )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:93:1: ( ( (lv_name_0_0= RULE_STRING ) )? 'model' ( (lv_model_2_0= ruleImport ) ) ( 'incorporates' ( (lv_incorporates_4_0= ruleIncorporates ) ) )* ( (lv_parameters_5_0= ruleParameter ) )* )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:93:2: ( (lv_name_0_0= RULE_STRING ) )? 'model' ( (lv_model_2_0= ruleImport ) ) ( 'incorporates' ( (lv_incorporates_4_0= ruleIncorporates ) ) )* ( (lv_parameters_5_0= ruleParameter ) )*
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:93:2: ( (lv_name_0_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:94:1: (lv_name_0_0= RULE_STRING )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:94:1: (lv_name_0_0= RULE_STRING )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:95:3: lv_name_0_0= RULE_STRING
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel127); 

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

            match(input,14,FOLLOW_14_in_ruleModel143); 

                    createLeafNode(grammarAccess.getModelAccess().getModelKeyword_1(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:121:1: ( (lv_model_2_0= ruleImport ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:122:1: (lv_model_2_0= ruleImport )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:122:1: (lv_model_2_0= ruleImport )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:123:3: lv_model_2_0= ruleImport
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getModelImportParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleImport_in_ruleModel164);
            lv_model_2_0=ruleImport();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"model",
            	        		lv_model_2_0, 
            	        		"Import", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:145:2: ( 'incorporates' ( (lv_incorporates_4_0= ruleIncorporates ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:145:4: 'incorporates' ( (lv_incorporates_4_0= ruleIncorporates ) )
            	    {
            	    match(input,15,FOLLOW_15_in_ruleModel175); 

            	            createLeafNode(grammarAccess.getModelAccess().getIncorporatesKeyword_3_0(), null); 
            	        
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:149:1: ( (lv_incorporates_4_0= ruleIncorporates ) )
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:150:1: (lv_incorporates_4_0= ruleIncorporates )
            	    {
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:150:1: (lv_incorporates_4_0= ruleIncorporates )
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:151:3: lv_incorporates_4_0= ruleIncorporates
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getIncorporatesIncorporatesParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleIncorporates_in_ruleModel196);
            	    lv_incorporates_4_0=ruleIncorporates();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"incorporates",
            	    	        		lv_incorporates_4_0, 
            	    	        		"Incorporates", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:173:4: ( (lv_parameters_5_0= ruleParameter ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:174:1: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:174:1: (lv_parameters_5_0= ruleParameter )
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:175:3: lv_parameters_5_0= ruleParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getParametersParameterParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleModel219);
            	    lv_parameters_5_0=ruleParameter();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"parameters",
            	    	        		lv_parameters_5_0, 
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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:205:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:206:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:207:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport256);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport266); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:214:1: ruleImport returns [EObject current=null] : ( (lv_importURI_0_0= RULE_STRING ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:219:6: ( ( (lv_importURI_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:220:1: ( (lv_importURI_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:220:1: ( (lv_importURI_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:221:1: (lv_importURI_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:221:1: (lv_importURI_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:222:3: lv_importURI_0_0= RULE_STRING
            {
            lv_importURI_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport307); 

            			createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_0_0, 
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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleIncorporates
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:252:1: entryRuleIncorporates returns [EObject current=null] : iv_ruleIncorporates= ruleIncorporates EOF ;
    public final EObject entryRuleIncorporates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncorporates = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:253:2: (iv_ruleIncorporates= ruleIncorporates EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:254:2: iv_ruleIncorporates= ruleIncorporates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIncorporatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleIncorporates_in_entryRuleIncorporates347);
            iv_ruleIncorporates=ruleIncorporates();
            _fsp--;

             current =iv_ruleIncorporates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncorporates357); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:261:1: ruleIncorporates returns [EObject current=null] : ( (lv_importURI_0_0= RULE_STRING ) ) ;
    public final EObject ruleIncorporates() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:266:6: ( ( (lv_importURI_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:267:1: ( (lv_importURI_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:267:1: ( (lv_importURI_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:268:1: (lv_importURI_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:268:1: (lv_importURI_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:269:3: lv_importURI_0_0= RULE_STRING
            {
            lv_importURI_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncorporates398); 

            			createLeafNode(grammarAccess.getIncorporatesAccess().getImportURISTRINGTerminalRuleCall_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIncorporatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_0_0, 
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
    // $ANTLR end ruleIncorporates


    // $ANTLR start entryRuleParameter
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:299:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:300:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:301:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter438);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter448); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:308:1: ruleParameter returns [EObject current=null] : (this_SingleParameter_0= ruleSingleParameter | this_SweepParameter_1= ruleSweepParameter | this_SweepLink_2= ruleSweepLink ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_SingleParameter_0 = null;

        EObject this_SweepParameter_1 = null;

        EObject this_SweepLink_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:313:6: ( (this_SingleParameter_0= ruleSingleParameter | this_SweepParameter_1= ruleSweepParameter | this_SweepLink_2= ruleSweepLink ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:314:1: (this_SingleParameter_0= ruleSingleParameter | this_SweepParameter_1= ruleSweepParameter | this_SweepLink_2= ruleSweepLink )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:314:1: (this_SingleParameter_0= ruleSingleParameter | this_SweepParameter_1= ruleSweepParameter | this_SweepLink_2= ruleSweepLink )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==16) ) {
                    alt4=1;
                }
                else if ( (LA4_1==17) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("314:1: (this_SingleParameter_0= ruleSingleParameter | this_SweepParameter_1= ruleSweepParameter | this_SweepLink_2= ruleSweepLink )", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==17) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("314:1: (this_SingleParameter_0= ruleSingleParameter | this_SweepParameter_1= ruleSweepParameter | this_SweepLink_2= ruleSweepLink )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:315:5: this_SingleParameter_0= ruleSingleParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParameterAccess().getSingleParameterParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSingleParameter_in_ruleParameter495);
                    this_SingleParameter_0=ruleSingleParameter();
                    _fsp--;

                     
                            current = this_SingleParameter_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:325:5: this_SweepParameter_1= ruleSweepParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParameterAccess().getSweepParameterParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSweepParameter_in_ruleParameter522);
                    this_SweepParameter_1=ruleSweepParameter();
                    _fsp--;

                     
                            current = this_SweepParameter_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:335:5: this_SweepLink_2= ruleSweepLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParameterAccess().getSweepLinkParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSweepLink_in_ruleParameter549);
                    this_SweepLink_2=ruleSweepLink();
                    _fsp--;

                     
                            current = this_SweepLink_2; 
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
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleSingleParameter
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:351:1: entryRuleSingleParameter returns [EObject current=null] : iv_ruleSingleParameter= ruleSingleParameter EOF ;
    public final EObject entryRuleSingleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleParameter = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:352:2: (iv_ruleSingleParameter= ruleSingleParameter EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:353:2: iv_ruleSingleParameter= ruleSingleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSingleParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleSingleParameter_in_entryRuleSingleParameter584);
            iv_ruleSingleParameter=ruleSingleParameter();
            _fsp--;

             current =iv_ruleSingleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleParameter594); 

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
    // $ANTLR end entryRuleSingleParameter


    // $ANTLR start ruleSingleParameter
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:360:1: ruleSingleParameter returns [EObject current=null] : ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleSingleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:365:6: ( ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:366:1: ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:366:1: ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:366:2: ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:366:2: ( ( RULE_ID ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:367:1: ( RULE_ID )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:367:1: ( RULE_ID )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:368:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSingleParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleParameter637); 

            		createLeafNode(grammarAccess.getSingleParameterAccess().getAttributeSAttributeCrossReference_0_0(), "attribute"); 
            	

            }


            }

            match(input,16,FOLLOW_16_in_ruleSingleParameter647); 

                    createLeafNode(grammarAccess.getSingleParameterAccess().getEqualsSignKeyword_1(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:384:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:385:1: (lv_value_2_0= ruleValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:385:1: (lv_value_2_0= ruleValue )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:386:3: lv_value_2_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSingleParameterAccess().getValueValueParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleSingleParameter668);
            lv_value_2_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSingleParameterRule().getType().getClassifier());
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
    // $ANTLR end ruleSingleParameter


    // $ANTLR start entryRuleSweepParameter
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:416:1: entryRuleSweepParameter returns [EObject current=null] : iv_ruleSweepParameter= ruleSweepParameter EOF ;
    public final EObject entryRuleSweepParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSweepParameter = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:417:2: (iv_ruleSweepParameter= ruleSweepParameter EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:418:2: iv_ruleSweepParameter= ruleSweepParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSweepParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleSweepParameter_in_entryRuleSweepParameter704);
            iv_ruleSweepParameter=ruleSweepParameter();
            _fsp--;

             current =iv_ruleSweepParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSweepParameter714); 

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
    // $ANTLR end entryRuleSweepParameter


    // $ANTLR start ruleSweepParameter
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:425:1: ruleSweepParameter returns [EObject current=null] : ( ( ( RULE_ID ) ) '[' ( (lv_startValue_2_0= ruleValue ) ) ',' ( (lv_endValue_4_0= ruleValue ) ) ',' ( (lv_increment_6_0= ruleValue ) ) ']' ) ;
    public final EObject ruleSweepParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_startValue_2_0 = null;

        EObject lv_endValue_4_0 = null;

        EObject lv_increment_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:430:6: ( ( ( ( RULE_ID ) ) '[' ( (lv_startValue_2_0= ruleValue ) ) ',' ( (lv_endValue_4_0= ruleValue ) ) ',' ( (lv_increment_6_0= ruleValue ) ) ']' ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:431:1: ( ( ( RULE_ID ) ) '[' ( (lv_startValue_2_0= ruleValue ) ) ',' ( (lv_endValue_4_0= ruleValue ) ) ',' ( (lv_increment_6_0= ruleValue ) ) ']' )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:431:1: ( ( ( RULE_ID ) ) '[' ( (lv_startValue_2_0= ruleValue ) ) ',' ( (lv_endValue_4_0= ruleValue ) ) ',' ( (lv_increment_6_0= ruleValue ) ) ']' )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:431:2: ( ( RULE_ID ) ) '[' ( (lv_startValue_2_0= ruleValue ) ) ',' ( (lv_endValue_4_0= ruleValue ) ) ',' ( (lv_increment_6_0= ruleValue ) ) ']'
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:431:2: ( ( RULE_ID ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:432:1: ( RULE_ID )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:432:1: ( RULE_ID )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:433:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSweepParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSweepParameter757); 

            		createLeafNode(grammarAccess.getSweepParameterAccess().getAttributeSAttributeCrossReference_0_0(), "attribute"); 
            	

            }


            }

            match(input,17,FOLLOW_17_in_ruleSweepParameter767); 

                    createLeafNode(grammarAccess.getSweepParameterAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:449:1: ( (lv_startValue_2_0= ruleValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:450:1: (lv_startValue_2_0= ruleValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:450:1: (lv_startValue_2_0= ruleValue )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:451:3: lv_startValue_2_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSweepParameterAccess().getStartValueValueParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleSweepParameter788);
            lv_startValue_2_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSweepParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"startValue",
            	        		lv_startValue_2_0, 
            	        		"Value", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleSweepParameter798); 

                    createLeafNode(grammarAccess.getSweepParameterAccess().getCommaKeyword_3(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:477:1: ( (lv_endValue_4_0= ruleValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:478:1: (lv_endValue_4_0= ruleValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:478:1: (lv_endValue_4_0= ruleValue )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:479:3: lv_endValue_4_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSweepParameterAccess().getEndValueValueParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleSweepParameter819);
            lv_endValue_4_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSweepParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"endValue",
            	        		lv_endValue_4_0, 
            	        		"Value", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleSweepParameter829); 

                    createLeafNode(grammarAccess.getSweepParameterAccess().getCommaKeyword_5(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:505:1: ( (lv_increment_6_0= ruleValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:506:1: (lv_increment_6_0= ruleValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:506:1: (lv_increment_6_0= ruleValue )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:507:3: lv_increment_6_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSweepParameterAccess().getIncrementValueParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleSweepParameter850);
            lv_increment_6_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSweepParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"increment",
            	        		lv_increment_6_0, 
            	        		"Value", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,19,FOLLOW_19_in_ruleSweepParameter860); 

                    createLeafNode(grammarAccess.getSweepParameterAccess().getRightSquareBracketKeyword_7(), null); 
                

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
    // $ANTLR end ruleSweepParameter


    // $ANTLR start entryRuleSweepLink
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:541:1: entryRuleSweepLink returns [EObject current=null] : iv_ruleSweepLink= ruleSweepLink EOF ;
    public final EObject entryRuleSweepLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSweepLink = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:542:2: (iv_ruleSweepLink= ruleSweepLink EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:543:2: iv_ruleSweepLink= ruleSweepLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSweepLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleSweepLink_in_entryRuleSweepLink896);
            iv_ruleSweepLink=ruleSweepLink();
            _fsp--;

             current =iv_ruleSweepLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSweepLink906); 

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
    // $ANTLR end entryRuleSweepLink


    // $ANTLR start ruleSweepLink
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:550:1: ruleSweepLink returns [EObject current=null] : ( '[' ( (lv_parameters_1_0= ruleParameter ) )* ']' ) ;
    public final EObject ruleSweepLink() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:555:6: ( ( '[' ( (lv_parameters_1_0= ruleParameter ) )* ']' ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:556:1: ( '[' ( (lv_parameters_1_0= ruleParameter ) )* ']' )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:556:1: ( '[' ( (lv_parameters_1_0= ruleParameter ) )* ']' )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:556:3: '[' ( (lv_parameters_1_0= ruleParameter ) )* ']'
            {
            match(input,17,FOLLOW_17_in_ruleSweepLink941); 

                    createLeafNode(grammarAccess.getSweepLinkAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:560:1: ( (lv_parameters_1_0= ruleParameter ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:561:1: (lv_parameters_1_0= ruleParameter )
            	    {
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:561:1: (lv_parameters_1_0= ruleParameter )
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:562:3: lv_parameters_1_0= ruleParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSweepLinkAccess().getParametersParameterParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleSweepLink962);
            	    lv_parameters_1_0=ruleParameter();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSweepLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"parameters",
            	    	        		lv_parameters_1_0, 
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
            	    break loop5;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleSweepLink973); 

                    createLeafNode(grammarAccess.getSweepLinkAccess().getRightSquareBracketKeyword_2(), null); 
                

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
    // $ANTLR end ruleSweepLink


    // $ANTLR start entryRuleValue
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:596:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:597:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:598:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1009);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1019); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:605:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_RealValue_2 = null;

        EObject this_BooleanValue_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:610:6: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:611:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:611:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case RULE_REAL:
                {
                alt6=3;
                }
                break;
            case 20:
            case 21:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("611:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:612:5: this_IntValue_0= ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue1066);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;

                     
                            current = this_IntValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:622:5: this_StringValue_1= ruleStringValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue1093);
                    this_StringValue_1=ruleStringValue();
                    _fsp--;

                     
                            current = this_StringValue_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:632:5: this_RealValue_2= ruleRealValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRealValue_in_ruleValue1120);
                    this_RealValue_2=ruleRealValue();
                    _fsp--;

                     
                            current = this_RealValue_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:642:5: this_BooleanValue_3= ruleBooleanValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue1147);
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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:658:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:659:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:660:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1182);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue1192); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:667:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INTEGER ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:672:6: ( ( (lv_value_0_0= RULE_INTEGER ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:673:1: ( (lv_value_0_0= RULE_INTEGER ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:673:1: ( (lv_value_0_0= RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:674:1: (lv_value_0_0= RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:674:1: (lv_value_0_0= RULE_INTEGER )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:675:3: lv_value_0_0= RULE_INTEGER
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleIntValue1233); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:705:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:706:2: (iv_ruleRealValue= ruleRealValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:707:2: iv_ruleRealValue= ruleRealValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRealValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue1273);
            iv_ruleRealValue=ruleRealValue();
            _fsp--;

             current =iv_ruleRealValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue1283); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:714:1: ruleRealValue returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:719:6: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:720:1: ( (lv_value_0_0= RULE_REAL ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:720:1: ( (lv_value_0_0= RULE_REAL ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:721:1: (lv_value_0_0= RULE_REAL )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:721:1: (lv_value_0_0= RULE_REAL )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:722:3: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleRealValue1324); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:752:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:753:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:754:2: iv_ruleStringValue= ruleStringValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1364);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1374); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:761:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:766:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:767:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:767:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:768:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:768:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:769:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue1415); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:799:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:800:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:801:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1455);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1465); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:808:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:813:6: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:814:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:814:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:815:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:815:1: (lv_value_0_0= ruleBOOLEAN )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:816:3: lv_value_0_0= ruleBOOLEAN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanValue1510);
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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:846:1: ruleBOOLEAN returns [Enumerator current=null] : ( ( 'true' ) | ( 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:850:6: ( ( ( 'true' ) | ( 'false' ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:851:1: ( ( 'true' ) | ( 'false' ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:851:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("851:1: ( ( 'true' ) | ( 'false' ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:851:2: ( 'true' )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:851:2: ( 'true' )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:851:4: 'true'
                    {
                    match(input,20,FOLLOW_20_in_ruleBOOLEAN1557); 

                            current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:857:6: ( 'false' )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:857:6: ( 'false' )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:857:8: 'false'
                    {
                    match(input,21,FOLLOW_21_in_ruleBOOLEAN1572); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel127 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel164 = new BitSet(new long[]{0x0000000000028022L});
    public static final BitSet FOLLOW_15_in_ruleModel175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIncorporates_in_ruleModel196 = new BitSet(new long[]{0x0000000000028022L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleModel219 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncorporates_in_entryRuleIncorporates347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncorporates357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncorporates398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleParameter_in_ruleParameter495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSweepParameter_in_ruleParameter522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSweepLink_in_ruleParameter549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleParameter_in_entryRuleSingleParameter584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleParameter594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleParameter637 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleParameter647 = new BitSet(new long[]{0x00000000003000D0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleSingleParameter668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSweepParameter_in_entryRuleSweepParameter704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSweepParameter714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSweepParameter757 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSweepParameter767 = new BitSet(new long[]{0x00000000003000D0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleSweepParameter788 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSweepParameter798 = new BitSet(new long[]{0x00000000003000D0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleSweepParameter819 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSweepParameter829 = new BitSet(new long[]{0x00000000003000D0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleSweepParameter850 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSweepParameter860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSweepLink_in_entryRuleSweepLink896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSweepLink906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSweepLink941 = new BitSet(new long[]{0x00000000000A0020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSweepLink962 = new BitSet(new long[]{0x00000000000A0020L});
    public static final BitSet FOLLOW_19_in_ruleSweepLink973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_ruleValue1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntValue1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleRealValue1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanValue1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBOOLEAN1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBOOLEAN1572 = new BitSet(new long[]{0x0000000000000002L});

}