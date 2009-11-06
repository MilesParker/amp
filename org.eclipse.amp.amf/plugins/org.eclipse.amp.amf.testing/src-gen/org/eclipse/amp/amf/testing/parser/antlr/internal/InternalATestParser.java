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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:81:1: ruleModel returns [EObject current=null] : ( (lv_name_0= RULE_STRING )? (lv_description_1= RULE_DESC_STRING )? ( ( ( 'tests' (lv_tests_3= ruleTests ) )? (lv_contraints_4= ruleConstraint )+ ) | ( 'contains' (lv_contains_6= ruleTestMember )* ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_description_1=null;
        EObject lv_tests_3 = null;

        EObject lv_contraints_4 = null;

        EObject lv_contains_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:86:6: ( ( (lv_name_0= RULE_STRING )? (lv_description_1= RULE_DESC_STRING )? ( ( ( 'tests' (lv_tests_3= ruleTests ) )? (lv_contraints_4= ruleConstraint )+ ) | ( 'contains' (lv_contains_6= ruleTestMember )* ) )? ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:1: ( (lv_name_0= RULE_STRING )? (lv_description_1= RULE_DESC_STRING )? ( ( ( 'tests' (lv_tests_3= ruleTests ) )? (lv_contraints_4= ruleConstraint )+ ) | ( 'contains' (lv_contains_6= ruleTestMember )* ) )? )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:1: ( (lv_name_0= RULE_STRING )? (lv_description_1= RULE_DESC_STRING )? ( ( ( 'tests' (lv_tests_3= ruleTests ) )? (lv_contraints_4= ruleConstraint )+ ) | ( 'contains' (lv_contains_6= ruleTestMember )* ) )? )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:87:2: (lv_name_0= RULE_STRING )? (lv_description_1= RULE_DESC_STRING )? ( ( ( 'tests' (lv_tests_3= ruleTests ) )? (lv_contraints_4= ruleConstraint )+ ) | ( 'contains' (lv_contains_6= ruleTestMember )* ) )?
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

            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:107:3: (lv_description_1= RULE_DESC_STRING )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DESC_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:109:6: lv_description_1= RULE_DESC_STRING
                    {
                    lv_description_1=(Token)input.LT(1);
                    match(input,RULE_DESC_STRING,FOLLOW_RULE_DESC_STRING_in_ruleModel161); 

                    		createLeafNode(grammarAccess.getModelAccess().getDescriptionDESC_STRINGTerminalRuleCall_1_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_1, "DESC_STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:127:3: ( ( ( 'tests' (lv_tests_3= ruleTests ) )? (lv_contraints_4= ruleConstraint )+ ) | ( 'contains' (lv_contains_6= ruleTestMember )* ) )?
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
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:127:4: ( ( 'tests' (lv_tests_3= ruleTests ) )? (lv_contraints_4= ruleConstraint )+ )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:127:4: ( ( 'tests' (lv_tests_3= ruleTests ) )? (lv_contraints_4= ruleConstraint )+ )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:127:5: ( 'tests' (lv_tests_3= ruleTests ) )? (lv_contraints_4= ruleConstraint )+
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:127:5: ( 'tests' (lv_tests_3= ruleTests ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:127:6: 'tests' (lv_tests_3= ruleTests )
                            {
                            match(input,14,FOLLOW_14_in_ruleModel182); 

                                    createLeafNode(grammarAccess.getModelAccess().getTestsKeyword_2_0_0_0(), null); 
                                
                            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:131:1: (lv_tests_3= ruleTests )
                            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:134:6: lv_tests_3= ruleTests
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0_0_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleTests_in_ruleModel216);
                            lv_tests_3=ruleTests();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "tests", lv_tests_3, "Tests", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:152:4: (lv_contraints_4= ruleConstraint )+
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
                    	    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:155:6: lv_contraints_4= ruleConstraint
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_2_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstraint_in_ruleModel256);
                    	    lv_contraints_4=ruleConstraint();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "contraints", lv_contraints_4, "Constraint", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

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
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:174:6: ( 'contains' (lv_contains_6= ruleTestMember )* )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:174:6: ( 'contains' (lv_contains_6= ruleTestMember )* )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:174:7: 'contains' (lv_contains_6= ruleTestMember )*
                    {
                    match(input,15,FOLLOW_15_in_ruleModel278); 

                            createLeafNode(grammarAccess.getModelAccess().getContainsKeyword_2_1_0(), null); 
                        
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:178:1: (lv_contains_6= ruleTestMember )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_STRING) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:181:6: lv_contains_6= ruleTestMember
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContainsTestMemberParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTestMember_in_ruleModel312);
                    	    lv_contains_6=ruleTestMember();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "contains", lv_contains_6, "TestMember", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:206:1: entryRuleTests returns [EObject current=null] : iv_ruleTests= ruleTests EOF ;
    public final EObject entryRuleTests() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTests = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:206:47: (iv_ruleTests= ruleTests EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:207:2: iv_ruleTests= ruleTests EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTestsRule(), currentNode); 
            pushFollow(FOLLOW_ruleTests_in_entryRuleTests353);
            iv_ruleTests=ruleTests();
            _fsp--;

             current =iv_ruleTests; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTests363); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:214:1: ruleTests returns [EObject current=null] : (lv_importURI_0= RULE_STRING ) ;
    public final EObject ruleTests() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:219:6: ( (lv_importURI_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:220:1: (lv_importURI_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:220:1: (lv_importURI_0= RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:222:6: lv_importURI_0= RULE_STRING
            {
            lv_importURI_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTests409); 

            		createLeafNode(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_0(), "importURI"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTestsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "importURI", lv_importURI_0, "STRING", lastConsumedNode);
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
    // $ANTLR end ruleTests


    // $ANTLR start entryRuleTestMember
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:247:1: entryRuleTestMember returns [EObject current=null] : iv_ruleTestMember= ruleTestMember EOF ;
    public final EObject entryRuleTestMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestMember = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:247:52: (iv_ruleTestMember= ruleTestMember EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:248:2: iv_ruleTestMember= ruleTestMember EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTestMemberRule(), currentNode); 
            pushFollow(FOLLOW_ruleTestMember_in_entryRuleTestMember449);
            iv_ruleTestMember=ruleTestMember();
            _fsp--;

             current =iv_ruleTestMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestMember459); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:255:1: ruleTestMember returns [EObject current=null] : (lv_importURI_0= RULE_STRING ) ;
    public final EObject ruleTestMember() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:260:6: ( (lv_importURI_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:261:1: (lv_importURI_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:261:1: (lv_importURI_0= RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:263:6: lv_importURI_0= RULE_STRING
            {
            lv_importURI_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTestMember505); 

            		createLeafNode(grammarAccess.getTestMemberAccess().getImportURISTRINGTerminalRuleCall_0(), "importURI"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTestMemberRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "importURI", lv_importURI_0, "STRING", lastConsumedNode);
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
    // $ANTLR end ruleTestMember


    // $ANTLR start entryRuleConstraint
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:288:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:288:52: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:289:2: iv_ruleConstraint= ruleConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint545);
            iv_ruleConstraint=ruleConstraint();
            _fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint555); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:296:1: ruleConstraint returns [EObject current=null] : ( (lv_measure_0= ruleMeasure ) '(' ( RULE_STRING ) '.' ( RULE_STRING ) ( '=' ( RULE_STRING ) )? ')' ( '=' '[' (lv_minValue_10= ruleValue ) ',' (lv_maxValue_12= ruleValue ) ']' ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Enumerator lv_measure_0 = null;

        EObject lv_minValue_10 = null;

        EObject lv_maxValue_12 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:301:6: ( ( (lv_measure_0= ruleMeasure ) '(' ( RULE_STRING ) '.' ( RULE_STRING ) ( '=' ( RULE_STRING ) )? ')' ( '=' '[' (lv_minValue_10= ruleValue ) ',' (lv_maxValue_12= ruleValue ) ']' ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:302:1: ( (lv_measure_0= ruleMeasure ) '(' ( RULE_STRING ) '.' ( RULE_STRING ) ( '=' ( RULE_STRING ) )? ')' ( '=' '[' (lv_minValue_10= ruleValue ) ',' (lv_maxValue_12= ruleValue ) ']' ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:302:1: ( (lv_measure_0= ruleMeasure ) '(' ( RULE_STRING ) '.' ( RULE_STRING ) ( '=' ( RULE_STRING ) )? ')' ( '=' '[' (lv_minValue_10= ruleValue ) ',' (lv_maxValue_12= ruleValue ) ']' ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:302:2: (lv_measure_0= ruleMeasure ) '(' ( RULE_STRING ) '.' ( RULE_STRING ) ( '=' ( RULE_STRING ) )? ')' ( '=' '[' (lv_minValue_10= ruleValue ) ',' (lv_maxValue_12= ruleValue ) ']' )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:302:2: (lv_measure_0= ruleMeasure )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:305:6: lv_measure_0= ruleMeasure
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMeasure_in_ruleConstraint614);
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

            match(input,16,FOLLOW_16_in_ruleConstraint627); 

                    createLeafNode(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:327:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:330:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint649); 

            		createLeafNode(grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0(), "agent"); 
            	

            }

            match(input,17,FOLLOW_17_in_ruleConstraint661); 

                    createLeafNode(grammarAccess.getConstraintAccess().getFullStopKeyword_3(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:347:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:350:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint683); 

            		createLeafNode(grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0(), "attribute"); 
            	

            }

            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:363:2: ( '=' ( RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:363:3: '=' ( RULE_STRING )
                    {
                    match(input,18,FOLLOW_18_in_ruleConstraint696); 

                            createLeafNode(grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0(), null); 
                        
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:367:1: ( RULE_STRING )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:370:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint718); 

                    		createLeafNode(grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0(), "qualifier"); 
                    	

                    }


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleConstraint732); 

                    createLeafNode(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:387:1: ( '=' '[' (lv_minValue_10= ruleValue ) ',' (lv_maxValue_12= ruleValue ) ']' )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:387:2: '=' '[' (lv_minValue_10= ruleValue ) ',' (lv_maxValue_12= ruleValue ) ']'
            {
            match(input,18,FOLLOW_18_in_ruleConstraint742); 

                    createLeafNode(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0(), null); 
                
            match(input,20,FOLLOW_20_in_ruleConstraint751); 

                    createLeafNode(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:395:1: (lv_minValue_10= ruleValue )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:398:6: lv_minValue_10= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMinValueValueParserRuleCall_7_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleConstraint785);
            lv_minValue_10=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "minValue", lv_minValue_10, "Value", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,21,FOLLOW_21_in_ruleConstraint798); 

                    createLeafNode(grammarAccess.getConstraintAccess().getCommaKeyword_7_3(), null); 
                
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:420:1: (lv_maxValue_12= ruleValue )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:423:6: lv_maxValue_12= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getMaxValueValueParserRuleCall_7_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleConstraint832);
            lv_maxValue_12=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "maxValue", lv_maxValue_12, "Value", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_ruleConstraint845); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:452:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:452:47: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:453:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue879);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue889); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:460:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_RealValue_2 = null;

        EObject this_BooleanValue_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:465:6: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:466:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:466:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )
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
                    new NoViableAltException("466:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_RealValue_2= ruleRealValue | this_BooleanValue_3= ruleBooleanValue )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:467:5: this_IntValue_0= ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue936);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;

                     
                            current = this_IntValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:477:5: this_StringValue_1= ruleStringValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue963);
                    this_StringValue_1=ruleStringValue();
                    _fsp--;

                     
                            current = this_StringValue_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:487:5: this_RealValue_2= ruleRealValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRealValue_in_ruleValue990);
                    this_RealValue_2=ruleRealValue();
                    _fsp--;

                     
                            current = this_RealValue_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:497:5: this_BooleanValue_3= ruleBooleanValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue1017);
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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:512:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:512:50: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:513:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1049);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue1059); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:520:1: ruleIntValue returns [EObject current=null] : (lv_value_0= RULE_INTEGER ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:525:6: ( (lv_value_0= RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:526:1: (lv_value_0= RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:526:1: (lv_value_0= RULE_INTEGER )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:528:6: lv_value_0= RULE_INTEGER
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleIntValue1105); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:553:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:553:51: (iv_ruleRealValue= ruleRealValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:554:2: iv_ruleRealValue= ruleRealValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRealValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue1145);
            iv_ruleRealValue=ruleRealValue();
            _fsp--;

             current =iv_ruleRealValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue1155); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:561:1: ruleRealValue returns [EObject current=null] : (lv_value_0= RULE_REAL ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:566:6: ( (lv_value_0= RULE_REAL ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:567:1: (lv_value_0= RULE_REAL )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:567:1: (lv_value_0= RULE_REAL )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:569:6: lv_value_0= RULE_REAL
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleRealValue1201); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:594:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:594:53: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:595:2: iv_ruleStringValue= ruleStringValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1241);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1251); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:602:1: ruleStringValue returns [EObject current=null] : (lv_value_0= RULE_STRING ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:607:6: ( (lv_value_0= RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:608:1: (lv_value_0= RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:608:1: (lv_value_0= RULE_STRING )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:610:6: lv_value_0= RULE_STRING
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue1297); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:635:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:635:54: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:636:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1337);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1347); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:643:1: ruleBooleanValue returns [EObject current=null] : (lv_value_0= ruleBOOLEAN ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:648:6: ( (lv_value_0= ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:649:1: (lv_value_0= ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:649:1: (lv_value_0= ruleBOOLEAN )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:652:6: lv_value_0= ruleBOOLEAN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanValue1405);
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


    // $ANTLR start ruleMeasure
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:677:1: ruleMeasure returns [Enumerator current=null] : ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) ) ;
    public final Enumerator ruleMeasure() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:681:6: ( ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:682:1: ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:682:1: ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) )
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
                    new NoViableAltException("682:1: ( ( 'Count' ) | ( 'Average' ) | ( 'Sum' ) | ( 'Minimum' ) | ( 'Maximum' ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:682:2: ( 'Count' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:682:2: ( 'Count' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:682:4: 'Count'
                    {
                    match(input,23,FOLLOW_23_in_ruleMeasure1455); 

                            current = grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:688:6: ( 'Average' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:688:6: ( 'Average' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:688:8: 'Average'
                    {
                    match(input,24,FOLLOW_24_in_ruleMeasure1470); 

                            current = grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:694:6: ( 'Sum' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:694:6: ( 'Sum' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:694:8: 'Sum'
                    {
                    match(input,25,FOLLOW_25_in_ruleMeasure1485); 

                            current = grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:700:6: ( 'Minimum' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:700:6: ( 'Minimum' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:700:8: 'Minimum'
                    {
                    match(input,26,FOLLOW_26_in_ruleMeasure1500); 

                            current = grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:706:6: ( 'Maximum' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:706:6: ( 'Maximum' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:706:8: 'Maximum'
                    {
                    match(input,27,FOLLOW_27_in_ruleMeasure1515); 

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
    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:716:1: ruleBOOLEAN returns [Enumerator current=null] : ( ( 'true' ) | ( 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:720:6: ( ( ( 'true' ) | ( 'false' ) ) )
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:721:1: ( ( 'true' ) | ( 'false' ) )
            {
            // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:721:1: ( ( 'true' ) | ( 'false' ) )
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
                    new NoViableAltException("721:1: ( ( 'true' ) | ( 'false' ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:721:2: ( 'true' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:721:2: ( 'true' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:721:4: 'true'
                    {
                    match(input,28,FOLLOW_28_in_ruleBOOLEAN1558); 

                            current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:727:6: ( 'false' )
                    {
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:727:6: ( 'false' )
                    // ../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g:727:8: 'false'
                    {
                    match(input,29,FOLLOW_29_in_ruleBOOLEAN1573); 

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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel130 = new BitSet(new long[]{0x000000000F80C022L});
    public static final BitSet FOLLOW_RULE_DESC_STRING_in_ruleModel161 = new BitSet(new long[]{0x000000000F80C002L});
    public static final BitSet FOLLOW_14_in_ruleModel182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTests_in_ruleModel216 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleModel256 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_15_in_ruleModel278 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTestMember_in_ruleModel312 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTests_in_entryRuleTests353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTests363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTests409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestMember_in_entryRuleTestMember449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestMember459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTestMember505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_ruleConstraint614 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConstraint627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint649 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConstraint661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint683 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint718 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint732 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint742 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstraint751 = new BitSet(new long[]{0x00000000300000D0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleConstraint785 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstraint798 = new BitSet(new long[]{0x00000000300000D0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleConstraint832 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleConstraint845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_ruleValue990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntValue1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleRealValue1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanValue1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMeasure1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMeasure1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMeasure1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMeasure1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMeasure1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBOOLEAN1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBOOLEAN1573 = new BitSet(new long[]{0x0000000000000002L});

}