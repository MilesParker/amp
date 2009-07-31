package org.eclipse.amp.amf.testing.parser.antlr.internal; 

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
import org.eclipse.amp.amf.testing.services.ATestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalATestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_PLAIN_STRING", "RULE_INT", "RULE_REAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TESTS'", "'('", "':'", "')'", "'='", "'['", "','", "']'", "'Count'", "'Average'", "'Sum'", "'Minimum'", "'Maximum'"
    };
    public static final int RULE_PLAIN_STRING=5;
    public static final int RULE_ID=8;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=7;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalATestParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g"; }


     
     	private ATestGrammarAccess grammarAccess;
     	
        public InternalATestParser(TokenStream input, IAstFactory factory, ATestGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	} 



    // $ANTLR start entryRuleModel
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:73:47: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:74:2: iv_ruleModel= ruleModel EOF
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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:81:1: ruleModel returns [EObject current=null] : ( (lv_name_0= RULE_STRING )? (lv_description_1= RULE_PLAIN_STRING )? (lv_tests_2= ruleTests )? (lv_contraints_3= ruleConstraint )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_description_1=null;
        EObject lv_tests_2 = null;

        EObject lv_contraints_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:86:6: ( ( (lv_name_0= RULE_STRING )? (lv_description_1= RULE_PLAIN_STRING )? (lv_tests_2= ruleTests )? (lv_contraints_3= ruleConstraint )* ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:1: ( (lv_name_0= RULE_STRING )? (lv_description_1= RULE_PLAIN_STRING )? (lv_tests_2= ruleTests )? (lv_contraints_3= ruleConstraint )* )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:1: ( (lv_name_0= RULE_STRING )? (lv_description_1= RULE_PLAIN_STRING )? (lv_tests_2= ruleTests )? (lv_contraints_3= ruleConstraint )* )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:2: (lv_name_0= RULE_STRING )? (lv_description_1= RULE_PLAIN_STRING )? (lv_tests_2= ruleTests )? (lv_contraints_3= ruleConstraint )*
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:2: (lv_name_0= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:89:6: lv_name_0= RULE_STRING
                    {
                    lv_name_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel130); 

                    		createLeafNode(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_0_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:107:3: (lv_description_1= RULE_PLAIN_STRING )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_PLAIN_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:109:6: lv_description_1= RULE_PLAIN_STRING
                    {
                    lv_description_1=(Token)input.LT(1);
                    match(input,RULE_PLAIN_STRING,FOLLOW_RULE_PLAIN_STRING_in_ruleModel161); 

                    		createLeafNode(grammarAccess.getModelAccess().getDescriptionPLAIN_STRINGTerminalRuleCall_1_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_1, "PLAIN_STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:127:3: (lv_tests_2= ruleTests )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:130:6: lv_tests_2= ruleTests
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTests_in_ruleModel204);
                    lv_tests_2=ruleTests();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "tests", lv_tests_2, "Tests", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:148:3: (lv_contraints_3= ruleConstraint )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:151:6: lv_contraints_3= ruleConstraint
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraint_in_ruleModel243);
            	    lv_contraints_3=ruleConstraint();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "contraints", lv_contraints_3, "Constraint", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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


    // $ANTLR start entryRuleTests
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:176:1: entryRuleTests returns [EObject current=null] : iv_ruleTests= ruleTests EOF ;
    public final EObject entryRuleTests() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTests = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:176:47: (iv_ruleTests= ruleTests EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:177:2: iv_ruleTests= ruleTests EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTestsRule(), currentNode); 
            pushFollow(FOLLOW_ruleTests_in_entryRuleTests281);
            iv_ruleTests=ruleTests();
            _fsp--;

             current =iv_ruleTests; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTests291); 

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
    // $ANTLR end entryRuleTests


    // $ANTLR start ruleTests
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:184:1: ruleTests returns [EObject current=null] : ( 'TESTS' (lv_importURI_1= RULE_STRING ) ) ;
    public final EObject ruleTests() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:189:6: ( ( 'TESTS' (lv_importURI_1= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:190:1: ( 'TESTS' (lv_importURI_1= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:190:1: ( 'TESTS' (lv_importURI_1= RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:190:2: 'TESTS' (lv_importURI_1= RULE_STRING )
            {
            match(input,13,FOLLOW_13_in_ruleTests325); 

                    createLeafNode(grammarAccess.getTestsAccess().getTESTSKeyword_0(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:194:1: (lv_importURI_1= RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:196:6: lv_importURI_1= RULE_STRING
            {
            lv_importURI_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTests347); 

            		createLeafNode(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTestsRule().getType().getClassifier());
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
    // $ANTLR end ruleTests


    // $ANTLR start entryRuleConstraint
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:221:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:221:52: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:222:2: iv_ruleConstraint= ruleConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint388);
            iv_ruleConstraint=ruleConstraint();
            _fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint398); 

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
    // $ANTLR end entryRuleConstraint


    // $ANTLR start ruleConstraint
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:229:1: ruleConstraint returns [EObject current=null] : ( (lv_measure_0= ruleMeasure ) '(' ( RULE_STRING ) ':' ( RULE_STRING ) ( ':' ( RULE_STRING ) )? ')' ( '=' '[' (lv_minValue_10= ( ruleIntValue | ruleRealValue ) ) ',' (lv_maxValue_12= ( ruleIntValue | ruleRealValue ) ) ']' ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_minValue_10=null;
        Token lv_maxValue_12=null;
        Enumerator lv_measure_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:234:6: ( ( (lv_measure_0= ruleMeasure ) '(' ( RULE_STRING ) ':' ( RULE_STRING ) ( ':' ( RULE_STRING ) )? ')' ( '=' '[' (lv_minValue_10= ( ruleIntValue | ruleRealValue ) ) ',' (lv_maxValue_12= ( ruleIntValue | ruleRealValue ) ) ']' ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:235:1: ( (lv_measure_0= ruleMeasure ) '(' ( RULE_STRING ) ':' ( RULE_STRING ) ( ':' ( RULE_STRING ) )? ')' ( '=' '[' (lv_minValue_10= ( ruleIntValue | ruleRealValue ) ) ',' (lv_maxValue_12= ( ruleIntValue | ruleRealValue ) ) ']' ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:235:1: ( (lv_measure_0= ruleMeasure ) '(' ( RULE_STRING ) ':' ( RULE_STRING ) ( ':' ( RULE_STRING ) )? ')' ( '=' '[' (lv_minValue_10= ( ruleIntValue | ruleRealValue ) ) ',' (lv_maxValue_12= ( ruleIntValue | ruleRealValue ) ) ']' ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:235:2: (lv_measure_0= ruleMeasure ) '(' ( RULE_STRING ) ':' ( RULE_STRING ) ( ':' ( RULE_STRING ) )? ')' ( '=' '[' (lv_minValue_10= ( ruleIntValue | ruleRealValue ) ) ',' (lv_maxValue_12= ( ruleIntValue | ruleRealValue ) ) ']' )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:235:2: (lv_measure_0= ruleMeasure )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:238:6: lv_measure_0= ruleMeasure
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMeasure_in_ruleConstraint457);
            lv_measure_0=ruleMeasure();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "measure", lv_measure_0, "Measure", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,14,FOLLOW_14_in_ruleConstraint470); 

                    createLeafNode(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:260:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:263:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint492); 

            		createLeafNode(grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0(), "agent"); 
            	

            }

            match(input,15,FOLLOW_15_in_ruleConstraint504); 

                    createLeafNode(grammarAccess.getConstraintAccess().getColonKeyword_3(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:280:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:283:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint526); 

            		createLeafNode(grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0(), "attribute"); 
            	

            }

            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:296:2: ( ':' ( RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:296:3: ':' ( RULE_STRING )
                    {
                    match(input,15,FOLLOW_15_in_ruleConstraint539); 

                            createLeafNode(grammarAccess.getConstraintAccess().getColonKeyword_5_0(), null); 
                        
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:300:1: ( RULE_STRING )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:303:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint561); 

                    		createLeafNode(grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0(), "qualifier"); 
                    	

                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleConstraint575); 

                    createLeafNode(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:320:1: ( '=' '[' (lv_minValue_10= ( ruleIntValue | ruleRealValue ) ) ',' (lv_maxValue_12= ( ruleIntValue | ruleRealValue ) ) ']' )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:320:2: '=' '[' (lv_minValue_10= ( ruleIntValue | ruleRealValue ) ) ',' (lv_maxValue_12= ( ruleIntValue | ruleRealValue ) ) ']'
            {
            match(input,17,FOLLOW_17_in_ruleConstraint585); 

                    createLeafNode(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0(), null); 
                
            match(input,18,FOLLOW_18_in_ruleConstraint594); 

                    createLeafNode(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:328:1: (lv_minValue_10= ( ruleIntValue | ruleRealValue ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:330:6: lv_minValue_10= ( ruleIntValue | ruleRealValue )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:330:21: ( ruleIntValue | ruleRealValue )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_REAL) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("330:21: ( ruleIntValue | ruleRealValue )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:330:23: ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMinValueIntValueParserRuleCall_7_2_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleConstraint620);
                    ruleIntValue();
                    _fsp--;

                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:337:7: ruleRealValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMinValueRealValueParserRuleCall_7_2_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRealValue_in_ruleConstraint634);
                    ruleRealValue();
                    _fsp--;

                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "minValue", lv_minValue_10, null, lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,19,FOLLOW_19_in_ruleConstraint652); 

                    createLeafNode(grammarAccess.getConstraintAccess().getCommaKeyword_7_3(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:362:1: (lv_maxValue_12= ( ruleIntValue | ruleRealValue ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:364:6: lv_maxValue_12= ( ruleIntValue | ruleRealValue )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:364:21: ( ruleIntValue | ruleRealValue )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_REAL) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("364:21: ( ruleIntValue | ruleRealValue )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:364:23: ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMaxValueIntValueParserRuleCall_7_4_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleConstraint678);
                    ruleIntValue();
                    _fsp--;

                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:371:7: ruleRealValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMaxValueRealValueParserRuleCall_7_4_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRealValue_in_ruleConstraint692);
                    ruleRealValue();
                    _fsp--;

                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "maxValue", lv_maxValue_12, null, lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,20,FOLLOW_20_in_ruleConstraint710); 

                    createLeafNode(grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_7_5(), null); 
                

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
    // $ANTLR end ruleConstraint


    // $ANTLR start entryRuleIntValue
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:403:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:403:50: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:404:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue744);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue754); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:411:1: ruleIntValue returns [EObject current=null] : (lv_value_0= RULE_INT ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:416:6: ( (lv_value_0= RULE_INT ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:417:1: (lv_value_0= RULE_INT )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:417:1: (lv_value_0= RULE_INT )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:419:6: lv_value_0= RULE_INT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue800); 

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


    // $ANTLR start entryRuleRealValue
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:444:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:444:51: (iv_ruleRealValue= ruleRealValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:445:2: iv_ruleRealValue= ruleRealValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRealValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue840);
            iv_ruleRealValue=ruleRealValue();
            _fsp--;

             current =iv_ruleRealValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue850); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:452:1: ruleRealValue returns [EObject current=null] : (lv_value_0= RULE_REAL ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:457:6: ( (lv_value_0= RULE_REAL ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:458:1: (lv_value_0= RULE_REAL )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:458:1: (lv_value_0= RULE_REAL )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:460:6: lv_value_0= RULE_REAL
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleRealValue896); 

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


    // $ANTLR start ruleMeasure
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:485:1: ruleMeasure returns [Enumerator current=null] : ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) ) ;
    public final Enumerator ruleMeasure() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:489:6: ( ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:490:1: ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:490:1: ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("490:1: ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:490:2: ( 'Count' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:490:2: ( 'Count' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:490:4: 'Count'
                    {
                    match(input,21,FOLLOW_21_in_ruleMeasure950); 

                            current = grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:496:6: ( 'Average' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:496:6: ( 'Average' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:496:8: 'Average'
                    {
                    match(input,22,FOLLOW_22_in_ruleMeasure965); 

                            current = grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:502:6: ( 'Sum' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:502:6: ( 'Sum' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:502:8: 'Sum'
                    {
                    match(input,23,FOLLOW_23_in_ruleMeasure980); 

                            current = grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:508:6: ( 'Minimum' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:508:6: ( 'Minimum' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:508:8: 'Minimum'
                    {
                    match(input,24,FOLLOW_24_in_ruleMeasure995); 

                            current = grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:514:6: ( 'Maximum' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:514:6: ( 'Maximum' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:514:8: 'Maximum'
                    {
                    match(input,25,FOLLOW_25_in_ruleMeasure1010); 

                            current = grammarAccess.getMeasureAccess().getMAXIMUMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getMAXIMUMEnumLiteralDeclaration_4(), null); 
                        

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
    // $ANTLR end ruleMeasure


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel130 = new BitSet(new long[]{0x0000000003E02022L});
    public static final BitSet FOLLOW_RULE_PLAIN_STRING_in_ruleModel161 = new BitSet(new long[]{0x0000000003E02002L});
    public static final BitSet FOLLOW_ruleTests_in_ruleModel204 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleModel243 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_ruleTests_in_entryRuleTests281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTests291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTests325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTests347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_ruleConstraint457 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstraint470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint492 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstraint504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint526 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleConstraint539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint561 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConstraint575 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConstraint585 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint594 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleConstraint620 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleRealValue_in_ruleConstraint634 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint652 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleConstraint678 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleRealValue_in_ruleConstraint692 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstraint710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleRealValue896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMeasure950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMeasure965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMeasure980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMeasure995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMeasure1010 = new BitSet(new long[]{0x0000000000000002L});

}