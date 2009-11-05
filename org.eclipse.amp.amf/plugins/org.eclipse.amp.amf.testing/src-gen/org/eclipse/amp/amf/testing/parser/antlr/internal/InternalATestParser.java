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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DESC_STRING", "RULE_INTEGER", "RULE_REAL", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'tests'", "'contains'", "'('", "'.'", "'='", "')'", "'['", "','", "']'", "'Count'", "'Average'", "'Sum'", "'Minimum'", "'Maximum'", "'true'", "'false'"
    };
    public static final int RULE_ID=8;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=7;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_DESC_STRING=5;
    public static final int RULE_INTEGER=6;
    public static final int RULE_ML_COMMENT=10;

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:81:1: ruleModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_description_1_0= RULE_DESC_STRING ) )? ( ( ( 'tests' ( (lv_tests_3_0= ruleTests ) ) )? ( (lv_contraints_4_0= ruleConstraint ) )+ ) | ( 'contains' ( (lv_contains_6_0= ruleTestMember ) )* ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        EObject lv_tests_3_0 = null;

        EObject lv_contraints_4_0 = null;

        EObject lv_contains_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:86:6: ( ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_description_1_0= RULE_DESC_STRING ) )? ( ( ( 'tests' ( (lv_tests_3_0= ruleTests ) ) )? ( (lv_contraints_4_0= ruleConstraint ) )+ ) | ( 'contains' ( (lv_contains_6_0= ruleTestMember ) )* ) )? ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:1: ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_description_1_0= RULE_DESC_STRING ) )? ( ( ( 'tests' ( (lv_tests_3_0= ruleTests ) ) )? ( (lv_contraints_4_0= ruleConstraint ) )+ ) | ( 'contains' ( (lv_contains_6_0= ruleTestMember ) )* ) )? )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:1: ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_description_1_0= RULE_DESC_STRING ) )? ( ( ( 'tests' ( (lv_tests_3_0= ruleTests ) ) )? ( (lv_contraints_4_0= ruleConstraint ) )+ ) | ( 'contains' ( (lv_contains_6_0= ruleTestMember ) )* ) )? )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:2: ( (lv_name_0_0= RULE_STRING ) )? ( (lv_description_1_0= RULE_DESC_STRING ) )? ( ( ( 'tests' ( (lv_tests_3_0= ruleTests ) ) )? ( (lv_contraints_4_0= ruleConstraint ) )+ ) | ( 'contains' ( (lv_contains_6_0= ruleTestMember ) )* ) )?
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:2: ( (lv_name_0_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:88:1: (lv_name_0_0= RULE_STRING )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:88:1: (lv_name_0_0= RULE_STRING )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:89:3: lv_name_0_0= RULE_STRING
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

            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:111:3: ( (lv_description_1_0= RULE_DESC_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DESC_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:112:1: (lv_description_1_0= RULE_DESC_STRING )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:112:1: (lv_description_1_0= RULE_DESC_STRING )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:113:3: lv_description_1_0= RULE_DESC_STRING
                    {
                    lv_description_1_0=(Token)input.LT(1);
                    match(input,RULE_DESC_STRING,FOLLOW_RULE_DESC_STRING_in_ruleModel148); 

                    			createLeafNode(grammarAccess.getModelAccess().getDescriptionDESC_STRINGTerminalRuleCall_1_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_1_0, 
                    	        		"DESC_STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:135:3: ( ( ( 'tests' ( (lv_tests_3_0= ruleTests ) ) )? ( (lv_contraints_4_0= ruleConstraint ) )+ ) | ( 'contains' ( (lv_contains_6_0= ruleTestMember ) )* ) )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14||(LA6_0>=23 && LA6_0<=27)) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:135:4: ( ( 'tests' ( (lv_tests_3_0= ruleTests ) ) )? ( (lv_contraints_4_0= ruleConstraint ) )+ )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:135:4: ( ( 'tests' ( (lv_tests_3_0= ruleTests ) ) )? ( (lv_contraints_4_0= ruleConstraint ) )+ )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:135:5: ( 'tests' ( (lv_tests_3_0= ruleTests ) ) )? ( (lv_contraints_4_0= ruleConstraint ) )+
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:135:5: ( 'tests' ( (lv_tests_3_0= ruleTests ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:135:6: 'tests' ( (lv_tests_3_0= ruleTests ) )
                            {
                            match(input,14,FOLLOW_14_in_ruleModel166); 

                                    createLeafNode(grammarAccess.getModelAccess().getTestsKeyword_2_0_0_0(), null); 
                                
                            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:139:1: ( (lv_tests_3_0= ruleTests ) )
                            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:140:1: (lv_tests_3_0= ruleTests )
                            {
                            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:140:1: (lv_tests_3_0= ruleTests )
                            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:141:3: lv_tests_3_0= ruleTests
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0_0_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleTests_in_ruleModel187);
                            lv_tests_3_0=ruleTests();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"tests",
                            	        		lv_tests_3_0, 
                            	        		"Tests", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:163:4: ( (lv_contraints_4_0= ruleConstraint ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=23 && LA4_0<=27)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:164:1: (lv_contraints_4_0= ruleConstraint )
                    	    {
                    	    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:164:1: (lv_contraints_4_0= ruleConstraint )
                    	    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:165:3: lv_contraints_4_0= ruleConstraint
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_2_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstraint_in_ruleModel210);
                    	    lv_contraints_4_0=ruleConstraint();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contraints",
                    	    	        		lv_contraints_4_0, 
                    	    	        		"Constraint", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


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


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:188:6: ( 'contains' ( (lv_contains_6_0= ruleTestMember ) )* )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:188:6: ( 'contains' ( (lv_contains_6_0= ruleTestMember ) )* )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:188:7: 'contains' ( (lv_contains_6_0= ruleTestMember ) )*
                    {
                    match(input,15,FOLLOW_15_in_ruleModel228); 

                            createLeafNode(grammarAccess.getModelAccess().getContainsKeyword_2_1_0(), null); 
                        
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:192:1: ( (lv_contains_6_0= ruleTestMember ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_STRING) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:193:1: (lv_contains_6_0= ruleTestMember )
                    	    {
                    	    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:193:1: (lv_contains_6_0= ruleTestMember )
                    	    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:194:3: lv_contains_6_0= ruleTestMember
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContainsTestMemberParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTestMember_in_ruleModel249);
                    	    lv_contains_6_0=ruleTestMember();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contains",
                    	    	        		lv_contains_6_0, 
                    	    	        		"TestMember", 
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


                    }


                    }
                    break;

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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleTests
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:223:1: entryRuleTests returns [EObject current=null] : iv_ruleTests= ruleTests EOF ;
    public final EObject entryRuleTests() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTests = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:223:47: (iv_ruleTests= ruleTests EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:224:2: iv_ruleTests= ruleTests EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTestsRule(), currentNode); 
            pushFollow(FOLLOW_ruleTests_in_entryRuleTests286);
            iv_ruleTests=ruleTests();
            _fsp--;

             current =iv_ruleTests; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTests296); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:231:1: ruleTests returns [EObject current=null] : ( (lv_importURI_0_0= RULE_STRING ) ) ;
    public final EObject ruleTests() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:236:6: ( ( (lv_importURI_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:237:1: ( (lv_importURI_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:237:1: ( (lv_importURI_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:238:1: (lv_importURI_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:238:1: (lv_importURI_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:239:3: lv_importURI_0_0= RULE_STRING
            {
            lv_importURI_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTests337); 

            			createLeafNode(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTestsRule().getType().getClassifier());
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
    // $ANTLR end ruleTests


    // $ANTLR start entryRuleTestMember
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:268:1: entryRuleTestMember returns [EObject current=null] : iv_ruleTestMember= ruleTestMember EOF ;
    public final EObject entryRuleTestMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestMember = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:268:52: (iv_ruleTestMember= ruleTestMember EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:269:2: iv_ruleTestMember= ruleTestMember EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTestMemberRule(), currentNode); 
            pushFollow(FOLLOW_ruleTestMember_in_entryRuleTestMember374);
            iv_ruleTestMember=ruleTestMember();
            _fsp--;

             current =iv_ruleTestMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestMember384); 

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
    // $ANTLR end entryRuleTestMember


    // $ANTLR start ruleTestMember
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:276:1: ruleTestMember returns [EObject current=null] : ( (lv_importURI_0_0= RULE_STRING ) ) ;
    public final EObject ruleTestMember() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:281:6: ( ( (lv_importURI_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:282:1: ( (lv_importURI_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:282:1: ( (lv_importURI_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:283:1: (lv_importURI_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:283:1: (lv_importURI_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:284:3: lv_importURI_0_0= RULE_STRING
            {
            lv_importURI_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTestMember425); 

            			createLeafNode(grammarAccess.getTestMemberAccess().getImportURISTRINGTerminalRuleCall_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTestMemberRule().getType().getClassifier());
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
    // $ANTLR end ruleTestMember


    // $ANTLR start entryRuleConstraint
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:313:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:313:52: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:314:2: iv_ruleConstraint= ruleConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint462);
            iv_ruleConstraint=ruleConstraint();
            _fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint472); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:321:1: ruleConstraint returns [EObject current=null] : ( ( (lv_measure_0_0= ruleMeasure ) ) '(' ( ( RULE_STRING ) ) '.' ( ( RULE_STRING ) ) ( '=' ( ( RULE_STRING ) ) )? ')' ( '=' '[' ( (lv_minValue_10_0= ruleValue ) ) ',' ( (lv_maxValue_12_0= ruleValue ) ) ']' ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Enumerator lv_measure_0_0 = null;

        EObject lv_minValue_10_0 = null;

        EObject lv_maxValue_12_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:326:6: ( ( ( (lv_measure_0_0= ruleMeasure ) ) '(' ( ( RULE_STRING ) ) '.' ( ( RULE_STRING ) ) ( '=' ( ( RULE_STRING ) ) )? ')' ( '=' '[' ( (lv_minValue_10_0= ruleValue ) ) ',' ( (lv_maxValue_12_0= ruleValue ) ) ']' ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:327:1: ( ( (lv_measure_0_0= ruleMeasure ) ) '(' ( ( RULE_STRING ) ) '.' ( ( RULE_STRING ) ) ( '=' ( ( RULE_STRING ) ) )? ')' ( '=' '[' ( (lv_minValue_10_0= ruleValue ) ) ',' ( (lv_maxValue_12_0= ruleValue ) ) ']' ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:327:1: ( ( (lv_measure_0_0= ruleMeasure ) ) '(' ( ( RULE_STRING ) ) '.' ( ( RULE_STRING ) ) ( '=' ( ( RULE_STRING ) ) )? ')' ( '=' '[' ( (lv_minValue_10_0= ruleValue ) ) ',' ( (lv_maxValue_12_0= ruleValue ) ) ']' ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:327:2: ( (lv_measure_0_0= ruleMeasure ) ) '(' ( ( RULE_STRING ) ) '.' ( ( RULE_STRING ) ) ( '=' ( ( RULE_STRING ) ) )? ')' ( '=' '[' ( (lv_minValue_10_0= ruleValue ) ) ',' ( (lv_maxValue_12_0= ruleValue ) ) ']' )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:327:2: ( (lv_measure_0_0= ruleMeasure ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:328:1: (lv_measure_0_0= ruleMeasure )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:328:1: (lv_measure_0_0= ruleMeasure )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:329:3: lv_measure_0_0= ruleMeasure
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMeasure_in_ruleConstraint518);
            lv_measure_0_0=ruleMeasure();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"measure",
            	        		lv_measure_0_0, 
            	        		"Measure", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleConstraint527); 

                    createLeafNode(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:355:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:356:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:356:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:357:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint545); 

            		createLeafNode(grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0(), "agent"); 
            	

            }


            }

            match(input,17,FOLLOW_17_in_ruleConstraint554); 

                    createLeafNode(grammarAccess.getConstraintAccess().getFullStopKeyword_3(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:373:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:374:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:374:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:375:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint572); 

            		createLeafNode(grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0(), "attribute"); 
            	

            }


            }

            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:387:2: ( '=' ( ( RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:387:3: '=' ( ( RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleConstraint582); 

                            createLeafNode(grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0(), null); 
                        
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:391:1: ( ( RULE_STRING ) )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:392:1: ( RULE_STRING )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:392:1: ( RULE_STRING )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:393:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint600); 

                    		createLeafNode(grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0(), "qualifier"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleConstraint611); 

                    createLeafNode(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:409:1: ( '=' '[' ( (lv_minValue_10_0= ruleValue ) ) ',' ( (lv_maxValue_12_0= ruleValue ) ) ']' )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:409:2: '=' '[' ( (lv_minValue_10_0= ruleValue ) ) ',' ( (lv_maxValue_12_0= ruleValue ) ) ']'
            {
            match(input,18,FOLLOW_18_in_ruleConstraint621); 

                    createLeafNode(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0(), null); 
                
            match(input,20,FOLLOW_20_in_ruleConstraint630); 

                    createLeafNode(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:417:1: ( (lv_minValue_10_0= ruleValue ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:418:1: (lv_minValue_10_0= ruleValue )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:418:1: (lv_minValue_10_0= ruleValue )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:419:3: lv_minValue_10_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMinValueValueParserRuleCall_7_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleConstraint651);
            lv_minValue_10_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"minValue",
            	        		lv_minValue_10_0, 
            	        		"Value", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleConstraint660); 

                    createLeafNode(grammarAccess.getConstraintAccess().getCommaKeyword_7_3(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:445:1: ( (lv_maxValue_12_0= ruleValue ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:446:1: (lv_maxValue_12_0= ruleValue )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:446:1: (lv_maxValue_12_0= ruleValue )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:447:3: lv_maxValue_12_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMaxValueValueParserRuleCall_7_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleConstraint681);
            lv_maxValue_12_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"maxValue",
            	        		lv_maxValue_12_0, 
            	        		"Value", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,22,FOLLOW_22_in_ruleConstraint690); 

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


    // $ANTLR start entryRuleValue
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:480:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:480:47: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:481:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue724);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue734); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:488:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_RealValue_2 = null;

        EObject this_BooleanValue_3 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:493:6: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:494:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:494:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_REAL:
                {
                alt8=3;
                }
                break;
            case 28:
            case 29:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("494:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:495:5: this_IntValue_0= ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue781);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;

                     
                            current = this_IntValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:505:5: this_StringValue_1= ruleStringValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue808);
                    this_StringValue_1=ruleStringValue();
                    _fsp--;

                     
                            current = this_StringValue_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:515:5: this_RealValue_2= ruleRealValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRealValue_in_ruleValue835);
                    this_RealValue_2=ruleRealValue();
                    _fsp--;

                     
                            current = this_RealValue_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:525:5: this_BooleanValue_3= ruleBooleanValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue862);
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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:540:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:540:50: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:541:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue894);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue904); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:548:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INTEGER ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:553:6: ( ( (lv_value_0_0= RULE_INTEGER ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:554:1: ( (lv_value_0_0= RULE_INTEGER ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:554:1: ( (lv_value_0_0= RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:555:1: (lv_value_0_0= RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:555:1: (lv_value_0_0= RULE_INTEGER )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:556:3: lv_value_0_0= RULE_INTEGER
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleIntValue945); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:585:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:585:51: (iv_ruleRealValue= ruleRealValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:586:2: iv_ruleRealValue= ruleRealValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRealValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue982);
            iv_ruleRealValue=ruleRealValue();
            _fsp--;

             current =iv_ruleRealValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue992); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:593:1: ruleRealValue returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:598:6: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:599:1: ( (lv_value_0_0= RULE_REAL ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:599:1: ( (lv_value_0_0= RULE_REAL ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:600:1: (lv_value_0_0= RULE_REAL )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:600:1: (lv_value_0_0= RULE_REAL )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:601:3: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleRealValue1033); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:630:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:630:53: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:631:2: iv_ruleStringValue= ruleStringValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1070);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1080); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:638:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:643:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:644:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:644:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:645:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:645:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:646:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue1121); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:675:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:675:54: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:676:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1158);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1168); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:683:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:688:6: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:689:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:689:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:690:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:690:1: (lv_value_0_0= ruleBOOLEAN )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:691:3: lv_value_0_0= ruleBOOLEAN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanValue1213);
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


    // $ANTLR start ruleMeasure
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:720:1: ruleMeasure returns [Enumerator current=null] : ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) ) ;
    public final Enumerator ruleMeasure() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:724:6: ( ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:725:1: ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:725:1: ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            case 27:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("725:1: ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:725:2: ( 'Count' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:725:2: ( 'Count' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:725:4: 'Count'
                    {
                    match(input,23,FOLLOW_23_in_ruleMeasure1259); 

                            current = grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:731:6: ( 'Average' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:731:6: ( 'Average' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:731:8: 'Average'
                    {
                    match(input,24,FOLLOW_24_in_ruleMeasure1274); 

                            current = grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:737:6: ( 'Sum' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:737:6: ( 'Sum' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:737:8: 'Sum'
                    {
                    match(input,25,FOLLOW_25_in_ruleMeasure1289); 

                            current = grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:743:6: ( 'Minimum' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:743:6: ( 'Minimum' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:743:8: 'Minimum'
                    {
                    match(input,26,FOLLOW_26_in_ruleMeasure1304); 

                            current = grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:749:6: ( 'Maximum' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:749:6: ( 'Maximum' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:749:8: 'Maximum'
                    {
                    match(input,27,FOLLOW_27_in_ruleMeasure1319); 

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


    // $ANTLR start ruleBOOLEAN
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:759:1: ruleBOOLEAN returns [Enumerator current=null] : ( ( 'true' ) | ( 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:763:6: ( ( ( 'true' ) | ( 'false' ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:764:1: ( ( 'true' ) | ( 'false' ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:764:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("764:1: ( ( 'true' ) | ( 'false' ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:764:2: ( 'true' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:764:2: ( 'true' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:764:4: 'true'
                    {
                    match(input,28,FOLLOW_28_in_ruleBOOLEAN1362); 

                            current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:770:6: ( 'false' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:770:6: ( 'false' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:770:8: 'false'
                    {
                    match(input,29,FOLLOW_29_in_ruleBOOLEAN1377); 

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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel125 = new BitSet(new long[]{0x000000000F80C022L});
    public static final BitSet FOLLOW_RULE_DESC_STRING_in_ruleModel148 = new BitSet(new long[]{0x000000000F80C002L});
    public static final BitSet FOLLOW_14_in_ruleModel166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTests_in_ruleModel187 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleModel210 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_15_in_ruleModel228 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTestMember_in_ruleModel249 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTests_in_entryRuleTests286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTests296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTests337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestMember_in_entryRuleTestMember374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestMember384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTestMember425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_ruleConstraint518 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConstraint527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint545 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConstraint554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint572 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint600 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint611 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint621 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstraint630 = new BitSet(new long[]{0x00000000300000D0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleConstraint651 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstraint660 = new BitSet(new long[]{0x00000000300000D0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleConstraint681 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleConstraint690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_ruleValue835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntValue945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleRealValue1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanValue1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMeasure1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMeasure1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMeasure1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMeasure1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMeasure1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBOOLEAN1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBOOLEAN1377 = new BitSet(new long[]{0x0000000000000002L});

}