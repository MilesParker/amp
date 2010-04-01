package org.eclipse.amp.amf.testing.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.amp.amf.testing.services.ATestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalATestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DESC_STRING", "RULE_INTEGER", "RULE_REAL", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Count'", "'Average'", "'Sum'", "'Minimum'", "'Maximum'", "'true'", "'false'", "'tests'", "'contains'", "'('", "'.'", "')'", "'='", "'['", "','", "']'"
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
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g"; }


     
     	private ATestGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ATestGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleModel
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:61:1: ( ruleModel EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:76:1: ( rule__Model__Group__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleTests
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:88:1: entryRuleTests : ruleTests EOF ;
    public final void entryRuleTests() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:89:1: ( ruleTests EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:90:1: ruleTests EOF
            {
             before(grammarAccess.getTestsRule()); 
            pushFollow(FOLLOW_ruleTests_in_entryRuleTests121);
            ruleTests();
            _fsp--;

             after(grammarAccess.getTestsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTests128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTests


    // $ANTLR start ruleTests
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:97:1: ruleTests : ( ( rule__Tests__ImportURIAssignment ) ) ;
    public final void ruleTests() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:101:2: ( ( ( rule__Tests__ImportURIAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:102:1: ( ( rule__Tests__ImportURIAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:102:1: ( ( rule__Tests__ImportURIAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:103:1: ( rule__Tests__ImportURIAssignment )
            {
             before(grammarAccess.getTestsAccess().getImportURIAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:104:1: ( rule__Tests__ImportURIAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:104:2: rule__Tests__ImportURIAssignment
            {
            pushFollow(FOLLOW_rule__Tests__ImportURIAssignment_in_ruleTests154);
            rule__Tests__ImportURIAssignment();
            _fsp--;


            }

             after(grammarAccess.getTestsAccess().getImportURIAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTests


    // $ANTLR start entryRuleTestMember
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:116:1: entryRuleTestMember : ruleTestMember EOF ;
    public final void entryRuleTestMember() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:117:1: ( ruleTestMember EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:118:1: ruleTestMember EOF
            {
             before(grammarAccess.getTestMemberRule()); 
            pushFollow(FOLLOW_ruleTestMember_in_entryRuleTestMember181);
            ruleTestMember();
            _fsp--;

             after(grammarAccess.getTestMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestMember188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTestMember


    // $ANTLR start ruleTestMember
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:125:1: ruleTestMember : ( ( rule__TestMember__ImportURIAssignment ) ) ;
    public final void ruleTestMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:129:2: ( ( ( rule__TestMember__ImportURIAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:130:1: ( ( rule__TestMember__ImportURIAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:130:1: ( ( rule__TestMember__ImportURIAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:131:1: ( rule__TestMember__ImportURIAssignment )
            {
             before(grammarAccess.getTestMemberAccess().getImportURIAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:132:1: ( rule__TestMember__ImportURIAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:132:2: rule__TestMember__ImportURIAssignment
            {
            pushFollow(FOLLOW_rule__TestMember__ImportURIAssignment_in_ruleTestMember214);
            rule__TestMember__ImportURIAssignment();
            _fsp--;


            }

             after(grammarAccess.getTestMemberAccess().getImportURIAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTestMember


    // $ANTLR start entryRuleConstraint
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:144:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:145:1: ( ruleConstraint EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:146:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint241);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleConstraint


    // $ANTLR start ruleConstraint
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:153:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:157:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:158:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:158:1: ( ( rule__Constraint__Group__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:159:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:160:1: ( rule__Constraint__Group__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:160:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint274);
            rule__Constraint__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConstraint


    // $ANTLR start entryRuleValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:172:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:173:1: ( ruleValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:174:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue301);
            ruleValue();
            _fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleValue


    // $ANTLR start ruleValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:181:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:185:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:186:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:186:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:187:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:188:1: ( rule__Value__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:188:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue334);
            rule__Value__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleValue


    // $ANTLR start entryRuleIntValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:200:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:201:1: ( ruleIntValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:202:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue361);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleIntValue


    // $ANTLR start ruleIntValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:209:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:213:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:214:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:214:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:215:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:216:1: ( rule__IntValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:216:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue394);
            rule__IntValue__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleRealValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:228:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:229:1: ( ruleRealValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:230:1: ruleRealValue EOF
            {
             before(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue421);
            ruleRealValue();
            _fsp--;

             after(grammarAccess.getRealValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRealValue


    // $ANTLR start ruleRealValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:237:1: ruleRealValue : ( ( rule__RealValue__ValueAssignment ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:241:2: ( ( ( rule__RealValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:242:1: ( ( rule__RealValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:242:1: ( ( rule__RealValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:243:1: ( rule__RealValue__ValueAssignment )
            {
             before(grammarAccess.getRealValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:244:1: ( rule__RealValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:244:2: rule__RealValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__RealValue__ValueAssignment_in_ruleRealValue454);
            rule__RealValue__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getRealValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRealValue


    // $ANTLR start entryRuleStringValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:256:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:257:1: ( ruleStringValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:258:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue481);
            ruleStringValue();
            _fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStringValue


    // $ANTLR start ruleStringValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:265:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:269:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:270:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:270:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:271:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:272:1: ( rule__StringValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:272:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue514);
            rule__StringValue__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringValue


    // $ANTLR start entryRuleBooleanValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:284:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:285:1: ( ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:286:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue541);
            ruleBooleanValue();
            _fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBooleanValue


    // $ANTLR start ruleBooleanValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:293:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:297:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:298:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:298:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:299:1: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:300:1: ( rule__BooleanValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:300:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue574);
            rule__BooleanValue__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBooleanValue


    // $ANTLR start ruleMeasure
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:313:1: ruleMeasure : ( ( rule__Measure__Alternatives ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:317:1: ( ( ( rule__Measure__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:318:1: ( ( rule__Measure__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:318:1: ( ( rule__Measure__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:319:1: ( rule__Measure__Alternatives )
            {
             before(grammarAccess.getMeasureAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:320:1: ( rule__Measure__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:320:2: rule__Measure__Alternatives
            {
            pushFollow(FOLLOW_rule__Measure__Alternatives_in_ruleMeasure611);
            rule__Measure__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMeasureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMeasure


    // $ANTLR start ruleBOOLEAN
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:332:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:336:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:337:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:337:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:338:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:339:1: ( rule__BOOLEAN__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:339:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN647);
            rule__BOOLEAN__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBOOLEAN


    // $ANTLR start rule__Model__Alternatives_2
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:350:1: rule__Model__Alternatives_2 : ( ( ( rule__Model__Group_2_0__0 ) ) | ( ( rule__Model__Group_2_1__0 ) ) );
    public final void rule__Model__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:354:1: ( ( ( rule__Model__Group_2_0__0 ) ) | ( ( rule__Model__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=14 && LA1_0<=18)||LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("350:1: rule__Model__Alternatives_2 : ( ( ( rule__Model__Group_2_0__0 ) ) | ( ( rule__Model__Group_2_1__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:355:1: ( ( rule__Model__Group_2_0__0 ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:355:1: ( ( rule__Model__Group_2_0__0 ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:356:1: ( rule__Model__Group_2_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_2_0()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:357:1: ( rule__Model__Group_2_0__0 )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:357:2: rule__Model__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_2_0__0_in_rule__Model__Alternatives_2682);
                    rule__Model__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:361:6: ( ( rule__Model__Group_2_1__0 ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:361:6: ( ( rule__Model__Group_2_1__0 ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:362:1: ( rule__Model__Group_2_1__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_2_1()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:363:1: ( rule__Model__Group_2_1__0 )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:363:2: rule__Model__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_2_1__0_in_rule__Model__Alternatives_2700);
                    rule__Model__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Alternatives_2


    // $ANTLR start rule__Value__Alternatives
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:372:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:376:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case RULE_REAL:
                {
                alt2=3;
                }
                break;
            case 19:
            case 20:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("372:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:377:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:377:1: ( ruleIntValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:378:1: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives733);
                    ruleIntValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:383:6: ( ruleStringValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:383:6: ( ruleStringValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:384:1: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives750);
                    ruleStringValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:389:6: ( ruleRealValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:389:6: ( ruleRealValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:390:1: ruleRealValue
                    {
                     before(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRealValue_in_rule__Value__Alternatives767);
                    ruleRealValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:395:6: ( ruleBooleanValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:395:6: ( ruleBooleanValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:396:1: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives784);
                    ruleBooleanValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Value__Alternatives


    // $ANTLR start rule__Measure__Alternatives
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:406:1: rule__Measure__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) );
    public final void rule__Measure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:410:1: ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("406:1: rule__Measure__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:411:1: ( ( 'Count' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:411:1: ( ( 'Count' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:412:1: ( 'Count' )
                    {
                     before(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:413:1: ( 'Count' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:413:3: 'Count'
                    {
                    match(input,14,FOLLOW_14_in_rule__Measure__Alternatives817); 

                    }

                     after(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:418:6: ( ( 'Average' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:418:6: ( ( 'Average' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:419:1: ( 'Average' )
                    {
                     before(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:420:1: ( 'Average' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:420:3: 'Average'
                    {
                    match(input,15,FOLLOW_15_in_rule__Measure__Alternatives838); 

                    }

                     after(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:425:6: ( ( 'Sum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:425:6: ( ( 'Sum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:426:1: ( 'Sum' )
                    {
                     before(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:427:1: ( 'Sum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:427:3: 'Sum'
                    {
                    match(input,16,FOLLOW_16_in_rule__Measure__Alternatives859); 

                    }

                     after(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:432:6: ( ( 'Minimum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:432:6: ( ( 'Minimum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:433:1: ( 'Minimum' )
                    {
                     before(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:434:1: ( 'Minimum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:434:3: 'Minimum'
                    {
                    match(input,17,FOLLOW_17_in_rule__Measure__Alternatives880); 

                    }

                     after(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:439:6: ( ( 'Maximum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:439:6: ( ( 'Maximum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:440:1: ( 'Maximum' )
                    {
                     before(grammarAccess.getMeasureAccess().getMAXIMUMEnumLiteralDeclaration_4()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:441:1: ( 'Maximum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:441:3: 'Maximum'
                    {
                    match(input,18,FOLLOW_18_in_rule__Measure__Alternatives901); 

                    }

                     after(grammarAccess.getMeasureAccess().getMAXIMUMEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Measure__Alternatives


    // $ANTLR start rule__BOOLEAN__Alternatives
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:451:1: rule__BOOLEAN__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:455:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("451:1: rule__BOOLEAN__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:456:1: ( ( 'true' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:456:1: ( ( 'true' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:457:1: ( 'true' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:458:1: ( 'true' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:458:3: 'true'
                    {
                    match(input,19,FOLLOW_19_in_rule__BOOLEAN__Alternatives937); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:463:6: ( ( 'false' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:463:6: ( ( 'false' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:464:1: ( 'false' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:465:1: ( 'false' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:465:3: 'false'
                    {
                    match(input,20,FOLLOW_20_in_rule__BOOLEAN__Alternatives958); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BOOLEAN__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:477:1: rule__Model__Group__0 : ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:481:1: ( ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:482:1: ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:482:1: ( ( rule__Model__NameAssignment_0 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:483:1: ( rule__Model__NameAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:484:1: ( rule__Model__NameAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:484:2: rule__Model__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__NameAssignment_0_in_rule__Model__Group__0995);
                    rule__Model__NameAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01005);
            rule__Model__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:495:1: rule__Model__Group__1 : ( ( rule__Model__DescriptionAssignment_1 )? ) rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:499:1: ( ( ( rule__Model__DescriptionAssignment_1 )? ) rule__Model__Group__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:500:1: ( ( rule__Model__DescriptionAssignment_1 )? ) rule__Model__Group__2
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:500:1: ( ( rule__Model__DescriptionAssignment_1 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:501:1: ( rule__Model__DescriptionAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:502:1: ( rule__Model__DescriptionAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DESC_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:502:2: rule__Model__DescriptionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__DescriptionAssignment_1_in_rule__Model__Group__11033);
                    rule__Model__DescriptionAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11043);
            rule__Model__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__2
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:513:1: rule__Model__Group__2 : ( ( rule__Model__Alternatives_2 )? ) ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:517:1: ( ( ( rule__Model__Alternatives_2 )? ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:518:1: ( ( rule__Model__Alternatives_2 )? )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:518:1: ( ( rule__Model__Alternatives_2 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:519:1: ( rule__Model__Alternatives_2 )?
            {
             before(grammarAccess.getModelAccess().getAlternatives_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:520:1: ( rule__Model__Alternatives_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=14 && LA7_0<=18)||(LA7_0>=21 && LA7_0<=22)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:520:2: rule__Model__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__Model__Alternatives_2_in_rule__Model__Group__21071);
                    rule__Model__Alternatives_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__2


    // $ANTLR start rule__Model__Group_2_0__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:536:1: rule__Model__Group_2_0__0 : ( ( rule__Model__Group_2_0_0__0 )? ) rule__Model__Group_2_0__1 ;
    public final void rule__Model__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:540:1: ( ( ( rule__Model__Group_2_0_0__0 )? ) rule__Model__Group_2_0__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:541:1: ( ( rule__Model__Group_2_0_0__0 )? ) rule__Model__Group_2_0__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:541:1: ( ( rule__Model__Group_2_0_0__0 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:542:1: ( rule__Model__Group_2_0_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2_0_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:543:1: ( rule__Model__Group_2_0_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:543:2: rule__Model__Group_2_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_2_0_0__0_in_rule__Model__Group_2_0__01112);
                    rule__Model__Group_2_0_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_2_0_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group_2_0__1_in_rule__Model__Group_2_0__01122);
            rule__Model__Group_2_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_2_0__0


    // $ANTLR start rule__Model__Group_2_0__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:554:1: rule__Model__Group_2_0__1 : ( ( ( rule__Model__ContraintsAssignment_2_0_1 ) ) ( ( rule__Model__ContraintsAssignment_2_0_1 )* ) ) ;
    public final void rule__Model__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:558:1: ( ( ( ( rule__Model__ContraintsAssignment_2_0_1 ) ) ( ( rule__Model__ContraintsAssignment_2_0_1 )* ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:559:1: ( ( ( rule__Model__ContraintsAssignment_2_0_1 ) ) ( ( rule__Model__ContraintsAssignment_2_0_1 )* ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:559:1: ( ( ( rule__Model__ContraintsAssignment_2_0_1 ) ) ( ( rule__Model__ContraintsAssignment_2_0_1 )* ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:560:1: ( ( rule__Model__ContraintsAssignment_2_0_1 ) ) ( ( rule__Model__ContraintsAssignment_2_0_1 )* )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:560:1: ( ( rule__Model__ContraintsAssignment_2_0_1 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:561:1: ( rule__Model__ContraintsAssignment_2_0_1 )
            {
             before(grammarAccess.getModelAccess().getContraintsAssignment_2_0_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:562:1: ( rule__Model__ContraintsAssignment_2_0_1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:562:2: rule__Model__ContraintsAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Model__ContraintsAssignment_2_0_1_in_rule__Model__Group_2_0__11152);
            rule__Model__ContraintsAssignment_2_0_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getContraintsAssignment_2_0_1()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:565:1: ( ( rule__Model__ContraintsAssignment_2_0_1 )* )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:566:1: ( rule__Model__ContraintsAssignment_2_0_1 )*
            {
             before(grammarAccess.getModelAccess().getContraintsAssignment_2_0_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:567:1: ( rule__Model__ContraintsAssignment_2_0_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=14 && LA9_0<=18)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:567:2: rule__Model__ContraintsAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ContraintsAssignment_2_0_1_in_rule__Model__Group_2_0__11164);
            	    rule__Model__ContraintsAssignment_2_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getContraintsAssignment_2_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_2_0__1


    // $ANTLR start rule__Model__Group_2_0_0__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:582:1: rule__Model__Group_2_0_0__0 : ( 'tests' ) rule__Model__Group_2_0_0__1 ;
    public final void rule__Model__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:586:1: ( ( 'tests' ) rule__Model__Group_2_0_0__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:587:1: ( 'tests' ) rule__Model__Group_2_0_0__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:587:1: ( 'tests' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:588:1: 'tests'
            {
             before(grammarAccess.getModelAccess().getTestsKeyword_2_0_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group_2_0_0__01206); 
             after(grammarAccess.getModelAccess().getTestsKeyword_2_0_0_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group_2_0_0__1_in_rule__Model__Group_2_0_0__01216);
            rule__Model__Group_2_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_2_0_0__0


    // $ANTLR start rule__Model__Group_2_0_0__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:602:1: rule__Model__Group_2_0_0__1 : ( ( rule__Model__TestsAssignment_2_0_0_1 ) ) ;
    public final void rule__Model__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:606:1: ( ( ( rule__Model__TestsAssignment_2_0_0_1 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:607:1: ( ( rule__Model__TestsAssignment_2_0_0_1 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:607:1: ( ( rule__Model__TestsAssignment_2_0_0_1 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:608:1: ( rule__Model__TestsAssignment_2_0_0_1 )
            {
             before(grammarAccess.getModelAccess().getTestsAssignment_2_0_0_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:609:1: ( rule__Model__TestsAssignment_2_0_0_1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:609:2: rule__Model__TestsAssignment_2_0_0_1
            {
            pushFollow(FOLLOW_rule__Model__TestsAssignment_2_0_0_1_in_rule__Model__Group_2_0_0__11244);
            rule__Model__TestsAssignment_2_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getTestsAssignment_2_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_2_0_0__1


    // $ANTLR start rule__Model__Group_2_1__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:623:1: rule__Model__Group_2_1__0 : ( 'contains' ) rule__Model__Group_2_1__1 ;
    public final void rule__Model__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:627:1: ( ( 'contains' ) rule__Model__Group_2_1__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:628:1: ( 'contains' ) rule__Model__Group_2_1__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:628:1: ( 'contains' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:629:1: 'contains'
            {
             before(grammarAccess.getModelAccess().getContainsKeyword_2_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group_2_1__01283); 
             after(grammarAccess.getModelAccess().getContainsKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group_2_1__1_in_rule__Model__Group_2_1__01293);
            rule__Model__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_2_1__0


    // $ANTLR start rule__Model__Group_2_1__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:643:1: rule__Model__Group_2_1__1 : ( ( rule__Model__ContainsAssignment_2_1_1 )* ) ;
    public final void rule__Model__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:647:1: ( ( ( rule__Model__ContainsAssignment_2_1_1 )* ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:648:1: ( ( rule__Model__ContainsAssignment_2_1_1 )* )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:648:1: ( ( rule__Model__ContainsAssignment_2_1_1 )* )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:649:1: ( rule__Model__ContainsAssignment_2_1_1 )*
            {
             before(grammarAccess.getModelAccess().getContainsAssignment_2_1_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:650:1: ( rule__Model__ContainsAssignment_2_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:650:2: rule__Model__ContainsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ContainsAssignment_2_1_1_in_rule__Model__Group_2_1__11321);
            	    rule__Model__ContainsAssignment_2_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getContainsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_2_1__1


    // $ANTLR start rule__Constraint__Group__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:664:1: rule__Constraint__Group__0 : ( ( rule__Constraint__MeasureAssignment_0 ) ) rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:668:1: ( ( ( rule__Constraint__MeasureAssignment_0 ) ) rule__Constraint__Group__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:669:1: ( ( rule__Constraint__MeasureAssignment_0 ) ) rule__Constraint__Group__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:669:1: ( ( rule__Constraint__MeasureAssignment_0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:670:1: ( rule__Constraint__MeasureAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getMeasureAssignment_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:671:1: ( rule__Constraint__MeasureAssignment_0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:671:2: rule__Constraint__MeasureAssignment_0
            {
            pushFollow(FOLLOW_rule__Constraint__MeasureAssignment_0_in_rule__Constraint__Group__01360);
            rule__Constraint__MeasureAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMeasureAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__01369);
            rule__Constraint__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__0


    // $ANTLR start rule__Constraint__Group__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:682:1: rule__Constraint__Group__1 : ( '(' ) rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:686:1: ( ( '(' ) rule__Constraint__Group__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:687:1: ( '(' ) rule__Constraint__Group__2
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:687:1: ( '(' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:688:1: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Constraint__Group__11398); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__11408);
            rule__Constraint__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__1


    // $ANTLR start rule__Constraint__Group__2
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:702:1: rule__Constraint__Group__2 : ( ( rule__Constraint__AgentAssignment_2 ) ) rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:706:1: ( ( ( rule__Constraint__AgentAssignment_2 ) ) rule__Constraint__Group__3 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:707:1: ( ( rule__Constraint__AgentAssignment_2 ) ) rule__Constraint__Group__3
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:707:1: ( ( rule__Constraint__AgentAssignment_2 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:708:1: ( rule__Constraint__AgentAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getAgentAssignment_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:709:1: ( rule__Constraint__AgentAssignment_2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:709:2: rule__Constraint__AgentAssignment_2
            {
            pushFollow(FOLLOW_rule__Constraint__AgentAssignment_2_in_rule__Constraint__Group__21436);
            rule__Constraint__AgentAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAgentAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__21445);
            rule__Constraint__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__2


    // $ANTLR start rule__Constraint__Group__3
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:720:1: rule__Constraint__Group__3 : ( '.' ) rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:724:1: ( ( '.' ) rule__Constraint__Group__4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:725:1: ( '.' ) rule__Constraint__Group__4
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:725:1: ( '.' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:726:1: '.'
            {
             before(grammarAccess.getConstraintAccess().getFullStopKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Constraint__Group__31474); 
             after(grammarAccess.getConstraintAccess().getFullStopKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__31484);
            rule__Constraint__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__3


    // $ANTLR start rule__Constraint__Group__4
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:740:1: rule__Constraint__Group__4 : ( ( rule__Constraint__AttributeAssignment_4 ) ) rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:744:1: ( ( ( rule__Constraint__AttributeAssignment_4 ) ) rule__Constraint__Group__5 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:745:1: ( ( rule__Constraint__AttributeAssignment_4 ) ) rule__Constraint__Group__5
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:745:1: ( ( rule__Constraint__AttributeAssignment_4 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:746:1: ( rule__Constraint__AttributeAssignment_4 )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAssignment_4()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:747:1: ( rule__Constraint__AttributeAssignment_4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:747:2: rule__Constraint__AttributeAssignment_4
            {
            pushFollow(FOLLOW_rule__Constraint__AttributeAssignment_4_in_rule__Constraint__Group__41512);
            rule__Constraint__AttributeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAttributeAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__41521);
            rule__Constraint__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__4


    // $ANTLR start rule__Constraint__Group__5
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:758:1: rule__Constraint__Group__5 : ( ( rule__Constraint__Group_5__0 )? ) rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:762:1: ( ( ( rule__Constraint__Group_5__0 )? ) rule__Constraint__Group__6 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:763:1: ( ( rule__Constraint__Group_5__0 )? ) rule__Constraint__Group__6
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:763:1: ( ( rule__Constraint__Group_5__0 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:764:1: ( rule__Constraint__Group_5__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_5()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:765:1: ( rule__Constraint__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:765:2: rule__Constraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Constraint__Group_5__0_in_rule__Constraint__Group__51549);
                    rule__Constraint__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__51559);
            rule__Constraint__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__5


    // $ANTLR start rule__Constraint__Group__6
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:776:1: rule__Constraint__Group__6 : ( ')' ) rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:780:1: ( ( ')' ) rule__Constraint__Group__7 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:781:1: ( ')' ) rule__Constraint__Group__7
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:781:1: ( ')' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:782:1: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__Constraint__Group__61588); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__61598);
            rule__Constraint__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__6


    // $ANTLR start rule__Constraint__Group__7
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:796:1: rule__Constraint__Group__7 : ( ( rule__Constraint__Group_7__0 ) ) ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:800:1: ( ( ( rule__Constraint__Group_7__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:801:1: ( ( rule__Constraint__Group_7__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:801:1: ( ( rule__Constraint__Group_7__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:802:1: ( rule__Constraint__Group_7__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_7()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:803:1: ( rule__Constraint__Group_7__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:803:2: rule__Constraint__Group_7__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7__0_in_rule__Constraint__Group__71626);
            rule__Constraint__Group_7__0();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__7


    // $ANTLR start rule__Constraint__Group_5__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:829:1: rule__Constraint__Group_5__0 : ( '=' ) rule__Constraint__Group_5__1 ;
    public final void rule__Constraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:833:1: ( ( '=' ) rule__Constraint__Group_5__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:834:1: ( '=' ) rule__Constraint__Group_5__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:834:1: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:835:1: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__Constraint__Group_5__01677); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_5__1_in_rule__Constraint__Group_5__01687);
            rule__Constraint__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group_5__0


    // $ANTLR start rule__Constraint__Group_5__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:849:1: rule__Constraint__Group_5__1 : ( ( rule__Constraint__QualifierAssignment_5_1 ) ) ;
    public final void rule__Constraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:853:1: ( ( ( rule__Constraint__QualifierAssignment_5_1 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:854:1: ( ( rule__Constraint__QualifierAssignment_5_1 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:854:1: ( ( rule__Constraint__QualifierAssignment_5_1 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:855:1: ( rule__Constraint__QualifierAssignment_5_1 )
            {
             before(grammarAccess.getConstraintAccess().getQualifierAssignment_5_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:856:1: ( rule__Constraint__QualifierAssignment_5_1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:856:2: rule__Constraint__QualifierAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Constraint__QualifierAssignment_5_1_in_rule__Constraint__Group_5__11715);
            rule__Constraint__QualifierAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getQualifierAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group_5__1


    // $ANTLR start rule__Constraint__Group_7__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:870:1: rule__Constraint__Group_7__0 : ( '=' ) rule__Constraint__Group_7__1 ;
    public final void rule__Constraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:874:1: ( ( '=' ) rule__Constraint__Group_7__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:875:1: ( '=' ) rule__Constraint__Group_7__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:875:1: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:876:1: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Constraint__Group_7__01754); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__1_in_rule__Constraint__Group_7__01764);
            rule__Constraint__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group_7__0


    // $ANTLR start rule__Constraint__Group_7__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:890:1: rule__Constraint__Group_7__1 : ( '[' ) rule__Constraint__Group_7__2 ;
    public final void rule__Constraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:894:1: ( ( '[' ) rule__Constraint__Group_7__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:895:1: ( '[' ) rule__Constraint__Group_7__2
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:895:1: ( '[' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:896:1: '['
            {
             before(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,27,FOLLOW_27_in_rule__Constraint__Group_7__11793); 
             after(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__2_in_rule__Constraint__Group_7__11803);
            rule__Constraint__Group_7__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group_7__1


    // $ANTLR start rule__Constraint__Group_7__2
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:910:1: rule__Constraint__Group_7__2 : ( ( rule__Constraint__MinValueAssignment_7_2 ) ) rule__Constraint__Group_7__3 ;
    public final void rule__Constraint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:914:1: ( ( ( rule__Constraint__MinValueAssignment_7_2 ) ) rule__Constraint__Group_7__3 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:915:1: ( ( rule__Constraint__MinValueAssignment_7_2 ) ) rule__Constraint__Group_7__3
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:915:1: ( ( rule__Constraint__MinValueAssignment_7_2 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:916:1: ( rule__Constraint__MinValueAssignment_7_2 )
            {
             before(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:917:1: ( rule__Constraint__MinValueAssignment_7_2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:917:2: rule__Constraint__MinValueAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Constraint__MinValueAssignment_7_2_in_rule__Constraint__Group_7__21831);
            rule__Constraint__MinValueAssignment_7_2();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__3_in_rule__Constraint__Group_7__21840);
            rule__Constraint__Group_7__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group_7__2


    // $ANTLR start rule__Constraint__Group_7__3
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:928:1: rule__Constraint__Group_7__3 : ( ',' ) rule__Constraint__Group_7__4 ;
    public final void rule__Constraint__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:932:1: ( ( ',' ) rule__Constraint__Group_7__4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:933:1: ( ',' ) rule__Constraint__Group_7__4
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:933:1: ( ',' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:934:1: ','
            {
             before(grammarAccess.getConstraintAccess().getCommaKeyword_7_3()); 
            match(input,28,FOLLOW_28_in_rule__Constraint__Group_7__31869); 
             after(grammarAccess.getConstraintAccess().getCommaKeyword_7_3()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__4_in_rule__Constraint__Group_7__31879);
            rule__Constraint__Group_7__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group_7__3


    // $ANTLR start rule__Constraint__Group_7__4
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:948:1: rule__Constraint__Group_7__4 : ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) rule__Constraint__Group_7__5 ;
    public final void rule__Constraint__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:952:1: ( ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) rule__Constraint__Group_7__5 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:953:1: ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) rule__Constraint__Group_7__5
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:953:1: ( ( rule__Constraint__MaxValueAssignment_7_4 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:954:1: ( rule__Constraint__MaxValueAssignment_7_4 )
            {
             before(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:955:1: ( rule__Constraint__MaxValueAssignment_7_4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:955:2: rule__Constraint__MaxValueAssignment_7_4
            {
            pushFollow(FOLLOW_rule__Constraint__MaxValueAssignment_7_4_in_rule__Constraint__Group_7__41907);
            rule__Constraint__MaxValueAssignment_7_4();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__5_in_rule__Constraint__Group_7__41916);
            rule__Constraint__Group_7__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group_7__4


    // $ANTLR start rule__Constraint__Group_7__5
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:966:1: rule__Constraint__Group_7__5 : ( ']' ) ;
    public final void rule__Constraint__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:970:1: ( ( ']' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:971:1: ( ']' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:971:1: ( ']' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:972:1: ']'
            {
             before(grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_7_5()); 
            match(input,29,FOLLOW_29_in_rule__Constraint__Group_7__51945); 
             after(grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group_7__5


    // $ANTLR start rule__Model__NameAssignment_0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:998:1: rule__Model__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1002:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1003:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1003:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1004:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__NameAssignment_01993); 
             after(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__NameAssignment_0


    // $ANTLR start rule__Model__DescriptionAssignment_1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1013:1: rule__Model__DescriptionAssignment_1 : ( RULE_DESC_STRING ) ;
    public final void rule__Model__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1017:1: ( ( RULE_DESC_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1018:1: ( RULE_DESC_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1018:1: ( RULE_DESC_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1019:1: RULE_DESC_STRING
            {
             before(grammarAccess.getModelAccess().getDescriptionDESC_STRINGTerminalRuleCall_1_0()); 
            match(input,RULE_DESC_STRING,FOLLOW_RULE_DESC_STRING_in_rule__Model__DescriptionAssignment_12024); 
             after(grammarAccess.getModelAccess().getDescriptionDESC_STRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__DescriptionAssignment_1


    // $ANTLR start rule__Model__TestsAssignment_2_0_0_1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1028:1: rule__Model__TestsAssignment_2_0_0_1 : ( ruleTests ) ;
    public final void rule__Model__TestsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1032:1: ( ( ruleTests ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1033:1: ( ruleTests )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1033:1: ( ruleTests )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1034:1: ruleTests
            {
             before(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0_0_1_0()); 
            pushFollow(FOLLOW_ruleTests_in_rule__Model__TestsAssignment_2_0_0_12055);
            ruleTests();
            _fsp--;

             after(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__TestsAssignment_2_0_0_1


    // $ANTLR start rule__Model__ContraintsAssignment_2_0_1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1043:1: rule__Model__ContraintsAssignment_2_0_1 : ( ruleConstraint ) ;
    public final void rule__Model__ContraintsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1047:1: ( ( ruleConstraint ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1048:1: ( ruleConstraint )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1048:1: ( ruleConstraint )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1049:1: ruleConstraint
            {
             before(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Model__ContraintsAssignment_2_0_12086);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ContraintsAssignment_2_0_1


    // $ANTLR start rule__Model__ContainsAssignment_2_1_1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1058:1: rule__Model__ContainsAssignment_2_1_1 : ( ruleTestMember ) ;
    public final void rule__Model__ContainsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1062:1: ( ( ruleTestMember ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1063:1: ( ruleTestMember )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1063:1: ( ruleTestMember )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1064:1: ruleTestMember
            {
             before(grammarAccess.getModelAccess().getContainsTestMemberParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleTestMember_in_rule__Model__ContainsAssignment_2_1_12117);
            ruleTestMember();
            _fsp--;

             after(grammarAccess.getModelAccess().getContainsTestMemberParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ContainsAssignment_2_1_1


    // $ANTLR start rule__Tests__ImportURIAssignment
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1073:1: rule__Tests__ImportURIAssignment : ( RULE_STRING ) ;
    public final void rule__Tests__ImportURIAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1077:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1078:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1078:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1079:1: RULE_STRING
            {
             before(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Tests__ImportURIAssignment2148); 
             after(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tests__ImportURIAssignment


    // $ANTLR start rule__TestMember__ImportURIAssignment
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1088:1: rule__TestMember__ImportURIAssignment : ( RULE_STRING ) ;
    public final void rule__TestMember__ImportURIAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1092:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1093:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1093:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1094:1: RULE_STRING
            {
             before(grammarAccess.getTestMemberAccess().getImportURISTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TestMember__ImportURIAssignment2179); 
             after(grammarAccess.getTestMemberAccess().getImportURISTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TestMember__ImportURIAssignment


    // $ANTLR start rule__Constraint__MeasureAssignment_0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1103:1: rule__Constraint__MeasureAssignment_0 : ( ruleMeasure ) ;
    public final void rule__Constraint__MeasureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1107:1: ( ( ruleMeasure ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1108:1: ( ruleMeasure )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1108:1: ( ruleMeasure )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1109:1: ruleMeasure
            {
             before(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__Constraint__MeasureAssignment_02210);
            ruleMeasure();
            _fsp--;

             after(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__MeasureAssignment_0


    // $ANTLR start rule__Constraint__AgentAssignment_2
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1118:1: rule__Constraint__AgentAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Constraint__AgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1122:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1123:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1123:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1124:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1125:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1126:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getAgentSAgentSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__AgentAssignment_22245); 
             after(grammarAccess.getConstraintAccess().getAgentSAgentSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__AgentAssignment_2


    // $ANTLR start rule__Constraint__AttributeAssignment_4
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1137:1: rule__Constraint__AttributeAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__Constraint__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1141:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1142:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1142:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1143:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1144:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1145:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getAttributeSAttributeSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__AttributeAssignment_42284); 
             after(grammarAccess.getConstraintAccess().getAttributeSAttributeSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__AttributeAssignment_4


    // $ANTLR start rule__Constraint__QualifierAssignment_5_1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1156:1: rule__Constraint__QualifierAssignment_5_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Constraint__QualifierAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1160:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1161:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1161:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1162:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1163:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1164:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getQualifierSStateValueSTRINGTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__QualifierAssignment_5_12323); 
             after(grammarAccess.getConstraintAccess().getQualifierSStateValueSTRINGTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__QualifierAssignment_5_1


    // $ANTLR start rule__Constraint__MinValueAssignment_7_2
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1175:1: rule__Constraint__MinValueAssignment_7_2 : ( ruleValue ) ;
    public final void rule__Constraint__MinValueAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1179:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1180:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1180:1: ( ruleValue )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1181:1: ruleValue
            {
             before(grammarAccess.getConstraintAccess().getMinValueValueParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Constraint__MinValueAssignment_7_22358);
            ruleValue();
            _fsp--;

             after(grammarAccess.getConstraintAccess().getMinValueValueParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__MinValueAssignment_7_2


    // $ANTLR start rule__Constraint__MaxValueAssignment_7_4
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1190:1: rule__Constraint__MaxValueAssignment_7_4 : ( ruleValue ) ;
    public final void rule__Constraint__MaxValueAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1194:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1195:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1195:1: ( ruleValue )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1196:1: ruleValue
            {
             before(grammarAccess.getConstraintAccess().getMaxValueValueParserRuleCall_7_4_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Constraint__MaxValueAssignment_7_42389);
            ruleValue();
            _fsp--;

             after(grammarAccess.getConstraintAccess().getMaxValueValueParserRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__MaxValueAssignment_7_4


    // $ANTLR start rule__IntValue__ValueAssignment
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1205:1: rule__IntValue__ValueAssignment : ( RULE_INTEGER ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1209:1: ( ( RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1210:1: ( RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1210:1: ( RULE_INTEGER )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1211:1: RULE_INTEGER
            {
             before(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__IntValue__ValueAssignment2420); 
             after(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntValue__ValueAssignment


    // $ANTLR start rule__RealValue__ValueAssignment
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1220:1: rule__RealValue__ValueAssignment : ( RULE_REAL ) ;
    public final void rule__RealValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1224:1: ( ( RULE_REAL ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1225:1: ( RULE_REAL )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1225:1: ( RULE_REAL )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1226:1: RULE_REAL
            {
             before(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment2451); 
             after(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RealValue__ValueAssignment


    // $ANTLR start rule__StringValue__ValueAssignment
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1235:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1239:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1240:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1240:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1241:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment2482); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValue__ValueAssignment


    // $ANTLR start rule__BooleanValue__ValueAssignment
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1250:1: rule__BooleanValue__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1254:1: ( ( ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1255:1: ( ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1255:1: ( ruleBOOLEAN )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1256:1: ruleBOOLEAN
            {
             before(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__BooleanValue__ValueAssignment2513);
            ruleBOOLEAN();
            _fsp--;

             after(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BooleanValue__ValueAssignment


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTests_in_entryRuleTests121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTests128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tests__ImportURIAssignment_in_ruleTests154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestMember_in_entryRuleTestMember181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestMember188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestMember__ImportURIAssignment_in_ruleTestMember214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__ValueAssignment_in_ruleRealValue454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Alternatives_in_ruleMeasure611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0__0_in_rule__Model__Alternatives_2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2_1__0_in_rule__Model__Alternatives_2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_rule__Value__Alternatives767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Measure__Alternatives817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Measure__Alternatives838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Measure__Alternatives859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Measure__Alternatives880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Measure__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BOOLEAN__Alternatives937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BOOLEAN__Alternatives958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_in_rule__Model__Group__0995 = new BitSet(new long[]{0x000000000067C022L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DescriptionAssignment_1_in_rule__Model__Group__11033 = new BitSet(new long[]{0x000000000067C002L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_2_in_rule__Model__Group__21071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0_0__0_in_rule__Model__Group_2_0__01112 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0__1_in_rule__Model__Group_2_0__01122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContraintsAssignment_2_0_1_in_rule__Model__Group_2_0__11152 = new BitSet(new long[]{0x000000000007C002L});
    public static final BitSet FOLLOW_rule__Model__ContraintsAssignment_2_0_1_in_rule__Model__Group_2_0__11164 = new BitSet(new long[]{0x000000000007C002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group_2_0_0__01206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0_0__1_in_rule__Model__Group_2_0_0__01216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TestsAssignment_2_0_0_1_in_rule__Model__Group_2_0_0__11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group_2_1__01283 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group_2_1__1_in_rule__Model__Group_2_1__01293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContainsAssignment_2_1_1_in_rule__Model__Group_2_1__11321 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Constraint__MeasureAssignment_0_in_rule__Constraint__Group__01360 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__01369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Constraint__Group__11398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__AgentAssignment_2_in_rule__Constraint__Group__21436 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__21445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constraint__Group__31474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__31484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__AttributeAssignment_4_in_rule__Constraint__Group__41512 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__41521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__0_in_rule__Constraint__Group__51549 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__51559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constraint__Group__61588 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__61598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__0_in_rule__Constraint__Group__71626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Constraint__Group_5__01677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__1_in_rule__Constraint__Group_5__01687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__QualifierAssignment_5_1_in_rule__Constraint__Group_5__11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Constraint__Group_7__01754 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__1_in_rule__Constraint__Group_7__01764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constraint__Group_7__11793 = new BitSet(new long[]{0x00000000001800D0L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__2_in_rule__Constraint__Group_7__11803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MinValueAssignment_7_2_in_rule__Constraint__Group_7__21831 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__3_in_rule__Constraint__Group_7__21840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constraint__Group_7__31869 = new BitSet(new long[]{0x00000000001800D0L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__4_in_rule__Constraint__Group_7__31879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MaxValueAssignment_7_4_in_rule__Constraint__Group_7__41907 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__5_in_rule__Constraint__Group_7__41916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Constraint__Group_7__51945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__NameAssignment_01993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESC_STRING_in_rule__Model__DescriptionAssignment_12024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTests_in_rule__Model__TestsAssignment_2_0_0_12055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Model__ContraintsAssignment_2_0_12086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestMember_in_rule__Model__ContainsAssignment_2_1_12117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Tests__ImportURIAssignment2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TestMember__ImportURIAssignment2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__Constraint__MeasureAssignment_02210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__AgentAssignment_22245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__AttributeAssignment_42284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__QualifierAssignment_5_12323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Constraint__MinValueAssignment_7_22358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Constraint__MaxValueAssignment_7_42389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__IntValue__ValueAssignment2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__BooleanValue__ValueAssignment2513 = new BitSet(new long[]{0x0000000000000002L});

}