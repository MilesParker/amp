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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INTEGER", "RULE_REAL", "RULE_DESC_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'incorporates'", "'['", "']'", "'='", "'true'", "'false'"
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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:87:1: ruleModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) )? 'model' ( (lv_model_2_0= ruleImport ) ) ( 'incorporates' '[' ( (lv_incorporates_5_0= ruleIncorporates ) )* ']' )? ( (lv_agents_7_0= ruleAgentParameters ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_model_2_0 = null;

        EObject lv_incorporates_5_0 = null;

        EObject lv_agents_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:92:6: ( ( ( (lv_name_0_0= RULE_STRING ) )? 'model' ( (lv_model_2_0= ruleImport ) ) ( 'incorporates' '[' ( (lv_incorporates_5_0= ruleIncorporates ) )* ']' )? ( (lv_agents_7_0= ruleAgentParameters ) )* ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:93:1: ( ( (lv_name_0_0= RULE_STRING ) )? 'model' ( (lv_model_2_0= ruleImport ) ) ( 'incorporates' '[' ( (lv_incorporates_5_0= ruleIncorporates ) )* ']' )? ( (lv_agents_7_0= ruleAgentParameters ) )* )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:93:1: ( ( (lv_name_0_0= RULE_STRING ) )? 'model' ( (lv_model_2_0= ruleImport ) ) ( 'incorporates' '[' ( (lv_incorporates_5_0= ruleIncorporates ) )* ']' )? ( (lv_agents_7_0= ruleAgentParameters ) )* )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:93:2: ( (lv_name_0_0= RULE_STRING ) )? 'model' ( (lv_model_2_0= ruleImport ) ) ( 'incorporates' '[' ( (lv_incorporates_5_0= ruleIncorporates ) )* ']' )? ( (lv_agents_7_0= ruleAgentParameters ) )*
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

            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:145:2: ( 'incorporates' '[' ( (lv_incorporates_5_0= ruleIncorporates ) )* ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:145:4: 'incorporates' '[' ( (lv_incorporates_5_0= ruleIncorporates ) )* ']'
                    {
                    match(input,15,FOLLOW_15_in_ruleModel175); 

                            createLeafNode(grammarAccess.getModelAccess().getIncorporatesKeyword_3_0(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleModel185); 

                            createLeafNode(grammarAccess.getModelAccess().getLeftSquareBracketKeyword_3_1(), null); 
                        
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:153:1: ( (lv_incorporates_5_0= ruleIncorporates ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_STRING) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:154:1: (lv_incorporates_5_0= ruleIncorporates )
                    	    {
                    	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:154:1: (lv_incorporates_5_0= ruleIncorporates )
                    	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:155:3: lv_incorporates_5_0= ruleIncorporates
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getIncorporatesIncorporatesParserRuleCall_3_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIncorporates_in_ruleModel206);
                    	    lv_incorporates_5_0=ruleIncorporates();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"incorporates",
                    	    	        		lv_incorporates_5_0, 
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

                    match(input,17,FOLLOW_17_in_ruleModel217); 

                            createLeafNode(grammarAccess.getModelAccess().getRightSquareBracketKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:181:3: ( (lv_agents_7_0= ruleAgentParameters ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:182:1: (lv_agents_7_0= ruleAgentParameters )
            	    {
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:182:1: (lv_agents_7_0= ruleAgentParameters )
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:183:3: lv_agents_7_0= ruleAgentParameters
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getAgentsAgentParametersParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAgentParameters_in_ruleModel240);
            	    lv_agents_7_0=ruleAgentParameters();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"agents",
            	    	        		lv_agents_7_0, 
            	    	        		"AgentParameters", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start entryRuleAgentParameters
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:213:1: entryRuleAgentParameters returns [EObject current=null] : iv_ruleAgentParameters= ruleAgentParameters EOF ;
    public final EObject entryRuleAgentParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentParameters = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:214:2: (iv_ruleAgentParameters= ruleAgentParameters EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:215:2: iv_ruleAgentParameters= ruleAgentParameters EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAgentParametersRule(), currentNode); 
            pushFollow(FOLLOW_ruleAgentParameters_in_entryRuleAgentParameters277);
            iv_ruleAgentParameters=ruleAgentParameters();
            _fsp--;

             current =iv_ruleAgentParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgentParameters287); 

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
    // $ANTLR end entryRuleAgentParameters


    // $ANTLR start ruleAgentParameters
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:222:1: ruleAgentParameters returns [EObject current=null] : ( ( ( RULE_STRING ) ) '[' ( (lv_parameters_2_0= ruleParameter ) )* ']' ) ;
    public final EObject ruleAgentParameters() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:227:6: ( ( ( ( RULE_STRING ) ) '[' ( (lv_parameters_2_0= ruleParameter ) )* ']' ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:228:1: ( ( ( RULE_STRING ) ) '[' ( (lv_parameters_2_0= ruleParameter ) )* ']' )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:228:1: ( ( ( RULE_STRING ) ) '[' ( (lv_parameters_2_0= ruleParameter ) )* ']' )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:228:2: ( ( RULE_STRING ) ) '[' ( (lv_parameters_2_0= ruleParameter ) )* ']'
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:228:2: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:229:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:229:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:230:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAgentParametersRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAgentParameters330); 

            		createLeafNode(grammarAccess.getAgentParametersAccess().getAgentSAgentCrossReference_0_0(), "agent"); 
            	

            }


            }

            match(input,16,FOLLOW_16_in_ruleAgentParameters340); 

                    createLeafNode(grammarAccess.getAgentParametersAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:246:1: ( (lv_parameters_2_0= ruleParameter ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:247:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:247:1: (lv_parameters_2_0= ruleParameter )
            	    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:248:3: lv_parameters_2_0= ruleParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAgentParametersAccess().getParametersParameterParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleAgentParameters361);
            	    lv_parameters_2_0=ruleParameter();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAgentParametersRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"parameters",
            	    	        		lv_parameters_2_0, 
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

            match(input,17,FOLLOW_17_in_ruleAgentParameters372); 

                    createLeafNode(grammarAccess.getAgentParametersAccess().getRightSquareBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleAgentParameters


    // $ANTLR start entryRuleImport
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:282:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:283:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:284:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport408);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport418); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:291:1: ruleImport returns [EObject current=null] : ( (lv_importURI_0_0= RULE_STRING ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:296:6: ( ( (lv_importURI_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:297:1: ( (lv_importURI_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:297:1: ( (lv_importURI_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:298:1: (lv_importURI_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:298:1: (lv_importURI_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:299:3: lv_importURI_0_0= RULE_STRING
            {
            lv_importURI_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport459); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:329:1: entryRuleIncorporates returns [EObject current=null] : iv_ruleIncorporates= ruleIncorporates EOF ;
    public final EObject entryRuleIncorporates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncorporates = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:330:2: (iv_ruleIncorporates= ruleIncorporates EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:331:2: iv_ruleIncorporates= ruleIncorporates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIncorporatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleIncorporates_in_entryRuleIncorporates499);
            iv_ruleIncorporates=ruleIncorporates();
            _fsp--;

             current =iv_ruleIncorporates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncorporates509); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:338:1: ruleIncorporates returns [EObject current=null] : ( (lv_importURI_0_0= RULE_STRING ) ) ;
    public final EObject ruleIncorporates() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:343:6: ( ( (lv_importURI_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:344:1: ( (lv_importURI_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:344:1: ( (lv_importURI_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:345:1: (lv_importURI_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:345:1: (lv_importURI_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:346:3: lv_importURI_0_0= RULE_STRING
            {
            lv_importURI_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncorporates550); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:376:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:377:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:378:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter590);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter600); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:385:1: ruleParameter returns [EObject current=null] : ( ( ( RULE_STRING ) ) '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:390:6: ( ( ( ( RULE_STRING ) ) '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:391:1: ( ( ( RULE_STRING ) ) '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:391:1: ( ( ( RULE_STRING ) ) '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:391:2: ( ( RULE_STRING ) ) '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:391:2: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:392:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:392:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:393:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter643); 

            		createLeafNode(grammarAccess.getParameterAccess().getAttributeSAttributeCrossReference_0_0(), "attribute"); 
            	

            }


            }

            match(input,18,FOLLOW_18_in_ruleParameter653); 

                    createLeafNode(grammarAccess.getParameterAccess().getEqualsSignKeyword_1(), null); 
                
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:409:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:410:1: (lv_value_2_0= ruleValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:410:1: (lv_value_2_0= ruleValue )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:411:3: lv_value_2_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getValueValueParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleParameter674);
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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:441:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:442:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:443:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue710);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue720); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:450:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_RealValue_2 = null;

        EObject this_BooleanValue_3 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:455:6: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:456:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:456:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
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
            case 19:
            case 20:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("456:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:457:5: this_IntValue_0= ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue767);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;

                     
                            current = this_IntValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:467:5: this_StringValue_1= ruleStringValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue794);
                    this_StringValue_1=ruleStringValue();
                    _fsp--;

                     
                            current = this_StringValue_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:477:5: this_RealValue_2= ruleRealValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRealValue_in_ruleValue821);
                    this_RealValue_2=ruleRealValue();
                    _fsp--;

                     
                            current = this_RealValue_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:487:5: this_BooleanValue_3= ruleBooleanValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue848);
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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:503:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:504:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:505:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue883);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue893); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:512:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INTEGER ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:517:6: ( ( (lv_value_0_0= RULE_INTEGER ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:518:1: ( (lv_value_0_0= RULE_INTEGER ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:518:1: ( (lv_value_0_0= RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:519:1: (lv_value_0_0= RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:519:1: (lv_value_0_0= RULE_INTEGER )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:520:3: lv_value_0_0= RULE_INTEGER
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleIntValue934); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:550:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:551:2: (iv_ruleRealValue= ruleRealValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:552:2: iv_ruleRealValue= ruleRealValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRealValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue974);
            iv_ruleRealValue=ruleRealValue();
            _fsp--;

             current =iv_ruleRealValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue984); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:559:1: ruleRealValue returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:564:6: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:565:1: ( (lv_value_0_0= RULE_REAL ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:565:1: ( (lv_value_0_0= RULE_REAL ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:566:1: (lv_value_0_0= RULE_REAL )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:566:1: (lv_value_0_0= RULE_REAL )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:567:3: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleRealValue1025); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:597:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:598:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:599:2: iv_ruleStringValue= ruleStringValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1065);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1075); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:606:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:611:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:612:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:612:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:613:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:613:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:614:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue1116); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:644:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:645:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:646:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1156);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1166); 

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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:653:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:658:6: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:659:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:659:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:660:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:660:1: (lv_value_0_0= ruleBOOLEAN )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:661:3: lv_value_0_0= ruleBOOLEAN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanValue1211);
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
    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:691:1: ruleBOOLEAN returns [Enumerator current=null] : ( ( 'true' ) | ( 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:695:6: ( ( ( 'true' ) | ( 'false' ) ) )
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:696:1: ( ( 'true' ) | ( 'false' ) )
            {
            // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:696:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("696:1: ( ( 'true' ) | ( 'false' ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:696:2: ( 'true' )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:696:2: ( 'true' )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:696:4: 'true'
                    {
                    match(input,19,FOLLOW_19_in_ruleBOOLEAN1258); 

                            current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:702:6: ( 'false' )
                    {
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:702:6: ( 'false' )
                    // ../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g:702:8: 'false'
                    {
                    match(input,20,FOLLOW_20_in_ruleBOOLEAN1273); 

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
    public static final BitSet FOLLOW_ruleImport_in_ruleModel164 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_15_in_ruleModel175 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModel185 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleIncorporates_in_ruleModel206 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleModel217 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAgentParameters_in_ruleModel240 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAgentParameters_in_entryRuleAgentParameters277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgentParameters287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAgentParameters330 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAgentParameters340 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAgentParameters361 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleAgentParameters372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncorporates_in_entryRuleIncorporates499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncorporates509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncorporates550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter643 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleParameter653 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameter674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_ruleValue821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntValue934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleRealValue1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanValue1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBOOLEAN1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBOOLEAN1273 = new BitSet(new long[]{0x0000000000000002L});

}