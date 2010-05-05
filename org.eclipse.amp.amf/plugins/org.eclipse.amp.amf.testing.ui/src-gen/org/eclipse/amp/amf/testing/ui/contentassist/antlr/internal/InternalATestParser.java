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
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.amp.amf.testing.services.ATestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalATestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DESC_STRING", "RULE_ID", "RULE_INTEGER", "RULE_REAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Count'", "'Average'", "'Sum'", "'Minimum'", "'Maximum'", "'true'", "'false'", "'tests'", "'contains'", "'('", "'.'", "')'", "'='", "'['", "','", "']'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=8;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_DESC_STRING=5;
    public static final int RULE_INTEGER=7;
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:62:1: ( ruleModel EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:63:1: ruleModel EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:77:1: ( rule__Model__Group__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:77:2: rule__Model__Group__0
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:89:1: entryRuleTests : ruleTests EOF ;
    public final void entryRuleTests() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:90:1: ( ruleTests EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:91:1: ruleTests EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:98:1: ruleTests : ( ( rule__Tests__ImportURIAssignment ) ) ;
    public final void ruleTests() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:102:2: ( ( ( rule__Tests__ImportURIAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:103:1: ( ( rule__Tests__ImportURIAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:103:1: ( ( rule__Tests__ImportURIAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:104:1: ( rule__Tests__ImportURIAssignment )
            {
             before(grammarAccess.getTestsAccess().getImportURIAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:105:1: ( rule__Tests__ImportURIAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:105:2: rule__Tests__ImportURIAssignment
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:117:1: entryRuleTestMember : ruleTestMember EOF ;
    public final void entryRuleTestMember() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:118:1: ( ruleTestMember EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:119:1: ruleTestMember EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:126:1: ruleTestMember : ( ( rule__TestMember__ImportURIAssignment ) ) ;
    public final void ruleTestMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:130:2: ( ( ( rule__TestMember__ImportURIAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:131:1: ( ( rule__TestMember__ImportURIAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:131:1: ( ( rule__TestMember__ImportURIAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:132:1: ( rule__TestMember__ImportURIAssignment )
            {
             before(grammarAccess.getTestMemberAccess().getImportURIAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:133:1: ( rule__TestMember__ImportURIAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:133:2: rule__TestMember__ImportURIAssignment
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:145:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:146:1: ( ruleConstraint EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:147:1: ruleConstraint EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:154:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:158:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:159:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:159:1: ( ( rule__Constraint__Group__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:160:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:161:1: ( rule__Constraint__Group__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:161:2: rule__Constraint__Group__0
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:173:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:174:1: ( ruleValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:175:1: ruleValue EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:182:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:186:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:187:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:187:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:188:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:189:1: ( rule__Value__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:189:2: rule__Value__Alternatives
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:201:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:202:1: ( ruleIntValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:203:1: ruleIntValue EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:210:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:214:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:215:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:215:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:216:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:217:1: ( rule__IntValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:217:2: rule__IntValue__ValueAssignment
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:229:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:230:1: ( ruleRealValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:231:1: ruleRealValue EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:238:1: ruleRealValue : ( ( rule__RealValue__ValueAssignment ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:242:2: ( ( ( rule__RealValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:243:1: ( ( rule__RealValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:243:1: ( ( rule__RealValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:244:1: ( rule__RealValue__ValueAssignment )
            {
             before(grammarAccess.getRealValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:245:1: ( rule__RealValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:245:2: rule__RealValue__ValueAssignment
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:257:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:258:1: ( ruleStringValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:259:1: ruleStringValue EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:266:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:270:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:271:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:271:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:272:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:273:1: ( rule__StringValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:273:2: rule__StringValue__ValueAssignment
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:285:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:286:1: ( ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:287:1: ruleBooleanValue EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:294:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:298:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:299:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:299:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:300:1: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:301:1: ( rule__BooleanValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:301:2: rule__BooleanValue__ValueAssignment
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:314:1: ruleMeasure : ( ( rule__Measure__Alternatives ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:318:1: ( ( ( rule__Measure__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:319:1: ( ( rule__Measure__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:319:1: ( ( rule__Measure__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:320:1: ( rule__Measure__Alternatives )
            {
             before(grammarAccess.getMeasureAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:321:1: ( rule__Measure__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:321:2: rule__Measure__Alternatives
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:333:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:337:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:338:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:338:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:339:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:340:1: ( rule__BOOLEAN__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:340:2: rule__BOOLEAN__Alternatives
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:351:1: rule__Model__Alternatives_2 : ( ( ( rule__Model__Group_2_0__0 ) ) | ( ( rule__Model__Group_2_1__0 ) ) );
    public final void rule__Model__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:355:1: ( ( ( rule__Model__Group_2_0__0 ) ) | ( ( rule__Model__Group_2_1__0 ) ) )
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
                    new NoViableAltException("351:1: rule__Model__Alternatives_2 : ( ( ( rule__Model__Group_2_0__0 ) ) | ( ( rule__Model__Group_2_1__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:356:1: ( ( rule__Model__Group_2_0__0 ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:356:1: ( ( rule__Model__Group_2_0__0 ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:357:1: ( rule__Model__Group_2_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_2_0()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:358:1: ( rule__Model__Group_2_0__0 )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:358:2: rule__Model__Group_2_0__0
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
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:362:6: ( ( rule__Model__Group_2_1__0 ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:362:6: ( ( rule__Model__Group_2_1__0 ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:363:1: ( rule__Model__Group_2_1__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_2_1()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:364:1: ( rule__Model__Group_2_1__0 )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:364:2: rule__Model__Group_2_1__0
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:373:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:377:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) )
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
                    new NoViableAltException("373:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:378:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:378:1: ( ruleIntValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:379:1: ruleIntValue
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
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:384:6: ( ruleStringValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:384:6: ( ruleStringValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:385:1: ruleStringValue
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
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:390:6: ( ruleRealValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:390:6: ( ruleRealValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:391:1: ruleRealValue
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
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:396:6: ( ruleBooleanValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:396:6: ( ruleBooleanValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:397:1: ruleBooleanValue
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:407:1: rule__Measure__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) );
    public final void rule__Measure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:411:1: ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) )
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
                    new NoViableAltException("407:1: rule__Measure__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:412:1: ( ( 'Count' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:412:1: ( ( 'Count' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:413:1: ( 'Count' )
                    {
                     before(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:414:1: ( 'Count' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:414:3: 'Count'
                    {
                    match(input,14,FOLLOW_14_in_rule__Measure__Alternatives817); 

                    }

                     after(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:419:6: ( ( 'Average' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:419:6: ( ( 'Average' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:420:1: ( 'Average' )
                    {
                     before(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:421:1: ( 'Average' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:421:3: 'Average'
                    {
                    match(input,15,FOLLOW_15_in_rule__Measure__Alternatives838); 

                    }

                     after(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:426:6: ( ( 'Sum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:426:6: ( ( 'Sum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:427:1: ( 'Sum' )
                    {
                     before(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:428:1: ( 'Sum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:428:3: 'Sum'
                    {
                    match(input,16,FOLLOW_16_in_rule__Measure__Alternatives859); 

                    }

                     after(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:433:6: ( ( 'Minimum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:433:6: ( ( 'Minimum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:434:1: ( 'Minimum' )
                    {
                     before(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:435:1: ( 'Minimum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:435:3: 'Minimum'
                    {
                    match(input,17,FOLLOW_17_in_rule__Measure__Alternatives880); 

                    }

                     after(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:440:6: ( ( 'Maximum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:440:6: ( ( 'Maximum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:441:1: ( 'Maximum' )
                    {
                     before(grammarAccess.getMeasureAccess().getMAXIMUMEnumLiteralDeclaration_4()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:442:1: ( 'Maximum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:442:3: 'Maximum'
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:452:1: rule__BOOLEAN__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:456:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
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
                    new NoViableAltException("452:1: rule__BOOLEAN__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:457:1: ( ( 'true' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:457:1: ( ( 'true' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:458:1: ( 'true' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:459:1: ( 'true' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:459:3: 'true'
                    {
                    match(input,19,FOLLOW_19_in_rule__BOOLEAN__Alternatives937); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:464:6: ( ( 'false' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:464:6: ( ( 'false' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:465:1: ( 'false' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:466:1: ( 'false' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:466:3: 'false'
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:478:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:482:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:483:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0991);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0994);
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


    // $ANTLR start rule__Model__Group__0__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:490:1: rule__Model__Group__0__Impl : ( ( rule__Model__NameAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:494:1: ( ( ( rule__Model__NameAssignment_0 )? ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:495:1: ( ( rule__Model__NameAssignment_0 )? )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:495:1: ( ( rule__Model__NameAssignment_0 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:496:1: ( rule__Model__NameAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:497:1: ( rule__Model__NameAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:497:2: rule__Model__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__NameAssignment_0_in_rule__Model__Group__0__Impl1021);
                    rule__Model__NameAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_0()); 

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
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:507:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:511:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:512:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11052);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11055);
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


    // $ANTLR start rule__Model__Group__1__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:519:1: rule__Model__Group__1__Impl : ( ( rule__Model__DescriptionAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:523:1: ( ( ( rule__Model__DescriptionAssignment_1 )? ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:524:1: ( ( rule__Model__DescriptionAssignment_1 )? )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:524:1: ( ( rule__Model__DescriptionAssignment_1 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:525:1: ( rule__Model__DescriptionAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:526:1: ( rule__Model__DescriptionAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DESC_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:526:2: rule__Model__DescriptionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__DescriptionAssignment_1_in_rule__Model__Group__1__Impl1082);
                    rule__Model__DescriptionAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__Model__Group__2
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:536:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:540:1: ( rule__Model__Group__2__Impl )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:541:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21113);
            rule__Model__Group__2__Impl();
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
    // $ANTLR end rule__Model__Group__2


    // $ANTLR start rule__Model__Group__2__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:547:1: rule__Model__Group__2__Impl : ( ( rule__Model__Alternatives_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:551:1: ( ( ( rule__Model__Alternatives_2 )? ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:552:1: ( ( rule__Model__Alternatives_2 )? )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:552:1: ( ( rule__Model__Alternatives_2 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:553:1: ( rule__Model__Alternatives_2 )?
            {
             before(grammarAccess.getModelAccess().getAlternatives_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:554:1: ( rule__Model__Alternatives_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=14 && LA7_0<=18)||(LA7_0>=21 && LA7_0<=22)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:554:2: rule__Model__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__Model__Alternatives_2_in_rule__Model__Group__2__Impl1140);
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
    // $ANTLR end rule__Model__Group__2__Impl


    // $ANTLR start rule__Model__Group_2_0__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:570:1: rule__Model__Group_2_0__0 : rule__Model__Group_2_0__0__Impl rule__Model__Group_2_0__1 ;
    public final void rule__Model__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:574:1: ( rule__Model__Group_2_0__0__Impl rule__Model__Group_2_0__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:575:2: rule__Model__Group_2_0__0__Impl rule__Model__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_2_0__0__Impl_in_rule__Model__Group_2_0__01177);
            rule__Model__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group_2_0__1_in_rule__Model__Group_2_0__01180);
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


    // $ANTLR start rule__Model__Group_2_0__0__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:582:1: rule__Model__Group_2_0__0__Impl : ( ( rule__Model__Group_2_0_0__0 )? ) ;
    public final void rule__Model__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:586:1: ( ( ( rule__Model__Group_2_0_0__0 )? ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:587:1: ( ( rule__Model__Group_2_0_0__0 )? )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:587:1: ( ( rule__Model__Group_2_0_0__0 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:588:1: ( rule__Model__Group_2_0_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2_0_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:589:1: ( rule__Model__Group_2_0_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:589:2: rule__Model__Group_2_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_2_0_0__0_in_rule__Model__Group_2_0__0__Impl1207);
                    rule__Model__Group_2_0_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_2_0_0()); 

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
    // $ANTLR end rule__Model__Group_2_0__0__Impl


    // $ANTLR start rule__Model__Group_2_0__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:599:1: rule__Model__Group_2_0__1 : rule__Model__Group_2_0__1__Impl ;
    public final void rule__Model__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:603:1: ( rule__Model__Group_2_0__1__Impl )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:604:2: rule__Model__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_2_0__1__Impl_in_rule__Model__Group_2_0__11238);
            rule__Model__Group_2_0__1__Impl();
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
    // $ANTLR end rule__Model__Group_2_0__1


    // $ANTLR start rule__Model__Group_2_0__1__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:610:1: rule__Model__Group_2_0__1__Impl : ( ( ( rule__Model__ContraintsAssignment_2_0_1 ) ) ( ( rule__Model__ContraintsAssignment_2_0_1 )* ) ) ;
    public final void rule__Model__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:614:1: ( ( ( ( rule__Model__ContraintsAssignment_2_0_1 ) ) ( ( rule__Model__ContraintsAssignment_2_0_1 )* ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:615:1: ( ( ( rule__Model__ContraintsAssignment_2_0_1 ) ) ( ( rule__Model__ContraintsAssignment_2_0_1 )* ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:615:1: ( ( ( rule__Model__ContraintsAssignment_2_0_1 ) ) ( ( rule__Model__ContraintsAssignment_2_0_1 )* ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:616:1: ( ( rule__Model__ContraintsAssignment_2_0_1 ) ) ( ( rule__Model__ContraintsAssignment_2_0_1 )* )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:616:1: ( ( rule__Model__ContraintsAssignment_2_0_1 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:617:1: ( rule__Model__ContraintsAssignment_2_0_1 )
            {
             before(grammarAccess.getModelAccess().getContraintsAssignment_2_0_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:618:1: ( rule__Model__ContraintsAssignment_2_0_1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:618:2: rule__Model__ContraintsAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Model__ContraintsAssignment_2_0_1_in_rule__Model__Group_2_0__1__Impl1267);
            rule__Model__ContraintsAssignment_2_0_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getContraintsAssignment_2_0_1()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:621:1: ( ( rule__Model__ContraintsAssignment_2_0_1 )* )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:622:1: ( rule__Model__ContraintsAssignment_2_0_1 )*
            {
             before(grammarAccess.getModelAccess().getContraintsAssignment_2_0_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:623:1: ( rule__Model__ContraintsAssignment_2_0_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=14 && LA9_0<=18)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:623:2: rule__Model__ContraintsAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ContraintsAssignment_2_0_1_in_rule__Model__Group_2_0__1__Impl1279);
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
    // $ANTLR end rule__Model__Group_2_0__1__Impl


    // $ANTLR start rule__Model__Group_2_0_0__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:638:1: rule__Model__Group_2_0_0__0 : rule__Model__Group_2_0_0__0__Impl rule__Model__Group_2_0_0__1 ;
    public final void rule__Model__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:642:1: ( rule__Model__Group_2_0_0__0__Impl rule__Model__Group_2_0_0__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:643:2: rule__Model__Group_2_0_0__0__Impl rule__Model__Group_2_0_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_2_0_0__0__Impl_in_rule__Model__Group_2_0_0__01316);
            rule__Model__Group_2_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group_2_0_0__1_in_rule__Model__Group_2_0_0__01319);
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


    // $ANTLR start rule__Model__Group_2_0_0__0__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:650:1: rule__Model__Group_2_0_0__0__Impl : ( 'tests' ) ;
    public final void rule__Model__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:654:1: ( ( 'tests' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:655:1: ( 'tests' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:655:1: ( 'tests' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:656:1: 'tests'
            {
             before(grammarAccess.getModelAccess().getTestsKeyword_2_0_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group_2_0_0__0__Impl1347); 
             after(grammarAccess.getModelAccess().getTestsKeyword_2_0_0_0()); 

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
    // $ANTLR end rule__Model__Group_2_0_0__0__Impl


    // $ANTLR start rule__Model__Group_2_0_0__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:669:1: rule__Model__Group_2_0_0__1 : rule__Model__Group_2_0_0__1__Impl ;
    public final void rule__Model__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:673:1: ( rule__Model__Group_2_0_0__1__Impl )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:674:2: rule__Model__Group_2_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_2_0_0__1__Impl_in_rule__Model__Group_2_0_0__11378);
            rule__Model__Group_2_0_0__1__Impl();
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
    // $ANTLR end rule__Model__Group_2_0_0__1


    // $ANTLR start rule__Model__Group_2_0_0__1__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:680:1: rule__Model__Group_2_0_0__1__Impl : ( ( rule__Model__TestsAssignment_2_0_0_1 ) ) ;
    public final void rule__Model__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:684:1: ( ( ( rule__Model__TestsAssignment_2_0_0_1 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:685:1: ( ( rule__Model__TestsAssignment_2_0_0_1 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:685:1: ( ( rule__Model__TestsAssignment_2_0_0_1 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:686:1: ( rule__Model__TestsAssignment_2_0_0_1 )
            {
             before(grammarAccess.getModelAccess().getTestsAssignment_2_0_0_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:687:1: ( rule__Model__TestsAssignment_2_0_0_1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:687:2: rule__Model__TestsAssignment_2_0_0_1
            {
            pushFollow(FOLLOW_rule__Model__TestsAssignment_2_0_0_1_in_rule__Model__Group_2_0_0__1__Impl1405);
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
    // $ANTLR end rule__Model__Group_2_0_0__1__Impl


    // $ANTLR start rule__Model__Group_2_1__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:701:1: rule__Model__Group_2_1__0 : rule__Model__Group_2_1__0__Impl rule__Model__Group_2_1__1 ;
    public final void rule__Model__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:705:1: ( rule__Model__Group_2_1__0__Impl rule__Model__Group_2_1__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:706:2: rule__Model__Group_2_1__0__Impl rule__Model__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_2_1__0__Impl_in_rule__Model__Group_2_1__01439);
            rule__Model__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group_2_1__1_in_rule__Model__Group_2_1__01442);
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


    // $ANTLR start rule__Model__Group_2_1__0__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:713:1: rule__Model__Group_2_1__0__Impl : ( 'contains' ) ;
    public final void rule__Model__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:717:1: ( ( 'contains' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:718:1: ( 'contains' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:718:1: ( 'contains' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:719:1: 'contains'
            {
             before(grammarAccess.getModelAccess().getContainsKeyword_2_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group_2_1__0__Impl1470); 
             after(grammarAccess.getModelAccess().getContainsKeyword_2_1_0()); 

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
    // $ANTLR end rule__Model__Group_2_1__0__Impl


    // $ANTLR start rule__Model__Group_2_1__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:732:1: rule__Model__Group_2_1__1 : rule__Model__Group_2_1__1__Impl ;
    public final void rule__Model__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:736:1: ( rule__Model__Group_2_1__1__Impl )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:737:2: rule__Model__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_2_1__1__Impl_in_rule__Model__Group_2_1__11501);
            rule__Model__Group_2_1__1__Impl();
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
    // $ANTLR end rule__Model__Group_2_1__1


    // $ANTLR start rule__Model__Group_2_1__1__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:743:1: rule__Model__Group_2_1__1__Impl : ( ( rule__Model__ContainsAssignment_2_1_1 )* ) ;
    public final void rule__Model__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:747:1: ( ( ( rule__Model__ContainsAssignment_2_1_1 )* ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:748:1: ( ( rule__Model__ContainsAssignment_2_1_1 )* )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:748:1: ( ( rule__Model__ContainsAssignment_2_1_1 )* )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:749:1: ( rule__Model__ContainsAssignment_2_1_1 )*
            {
             before(grammarAccess.getModelAccess().getContainsAssignment_2_1_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:750:1: ( rule__Model__ContainsAssignment_2_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:750:2: rule__Model__ContainsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ContainsAssignment_2_1_1_in_rule__Model__Group_2_1__1__Impl1528);
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
    // $ANTLR end rule__Model__Group_2_1__1__Impl


    // $ANTLR start rule__Constraint__Group__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:764:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:768:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:769:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__01563);
            rule__Constraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__01566);
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


    // $ANTLR start rule__Constraint__Group__0__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:776:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__MeasureAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:780:1: ( ( ( rule__Constraint__MeasureAssignment_0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:781:1: ( ( rule__Constraint__MeasureAssignment_0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:781:1: ( ( rule__Constraint__MeasureAssignment_0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:782:1: ( rule__Constraint__MeasureAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getMeasureAssignment_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:783:1: ( rule__Constraint__MeasureAssignment_0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:783:2: rule__Constraint__MeasureAssignment_0
            {
            pushFollow(FOLLOW_rule__Constraint__MeasureAssignment_0_in_rule__Constraint__Group__0__Impl1593);
            rule__Constraint__MeasureAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMeasureAssignment_0()); 

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
    // $ANTLR end rule__Constraint__Group__0__Impl


    // $ANTLR start rule__Constraint__Group__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:793:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:797:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:798:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__11623);
            rule__Constraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__11626);
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


    // $ANTLR start rule__Constraint__Group__1__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:805:1: rule__Constraint__Group__1__Impl : ( '(' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:809:1: ( ( '(' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:810:1: ( '(' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:810:1: ( '(' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:811:1: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Constraint__Group__1__Impl1654); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end rule__Constraint__Group__1__Impl


    // $ANTLR start rule__Constraint__Group__2
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:824:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:828:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:829:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__21685);
            rule__Constraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__21688);
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


    // $ANTLR start rule__Constraint__Group__2__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:836:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__AgentAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:840:1: ( ( ( rule__Constraint__AgentAssignment_2 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:841:1: ( ( rule__Constraint__AgentAssignment_2 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:841:1: ( ( rule__Constraint__AgentAssignment_2 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:842:1: ( rule__Constraint__AgentAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getAgentAssignment_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:843:1: ( rule__Constraint__AgentAssignment_2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:843:2: rule__Constraint__AgentAssignment_2
            {
            pushFollow(FOLLOW_rule__Constraint__AgentAssignment_2_in_rule__Constraint__Group__2__Impl1715);
            rule__Constraint__AgentAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAgentAssignment_2()); 

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
    // $ANTLR end rule__Constraint__Group__2__Impl


    // $ANTLR start rule__Constraint__Group__3
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:853:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:857:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:858:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__31745);
            rule__Constraint__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__31748);
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


    // $ANTLR start rule__Constraint__Group__3__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:865:1: rule__Constraint__Group__3__Impl : ( '.' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:869:1: ( ( '.' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:870:1: ( '.' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:870:1: ( '.' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:871:1: '.'
            {
             before(grammarAccess.getConstraintAccess().getFullStopKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Constraint__Group__3__Impl1776); 
             after(grammarAccess.getConstraintAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end rule__Constraint__Group__3__Impl


    // $ANTLR start rule__Constraint__Group__4
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:884:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:888:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:889:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__41807);
            rule__Constraint__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__41810);
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


    // $ANTLR start rule__Constraint__Group__4__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:896:1: rule__Constraint__Group__4__Impl : ( ( rule__Constraint__AttributeAssignment_4 ) ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:900:1: ( ( ( rule__Constraint__AttributeAssignment_4 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:901:1: ( ( rule__Constraint__AttributeAssignment_4 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:901:1: ( ( rule__Constraint__AttributeAssignment_4 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:902:1: ( rule__Constraint__AttributeAssignment_4 )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAssignment_4()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:903:1: ( rule__Constraint__AttributeAssignment_4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:903:2: rule__Constraint__AttributeAssignment_4
            {
            pushFollow(FOLLOW_rule__Constraint__AttributeAssignment_4_in_rule__Constraint__Group__4__Impl1837);
            rule__Constraint__AttributeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAttributeAssignment_4()); 

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
    // $ANTLR end rule__Constraint__Group__4__Impl


    // $ANTLR start rule__Constraint__Group__5
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:913:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:917:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:918:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
            {
            pushFollow(FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__51867);
            rule__Constraint__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__51870);
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


    // $ANTLR start rule__Constraint__Group__5__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:925:1: rule__Constraint__Group__5__Impl : ( ( rule__Constraint__Group_5__0 )? ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:929:1: ( ( ( rule__Constraint__Group_5__0 )? ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:930:1: ( ( rule__Constraint__Group_5__0 )? )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:930:1: ( ( rule__Constraint__Group_5__0 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:931:1: ( rule__Constraint__Group_5__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_5()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:932:1: ( rule__Constraint__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:932:2: rule__Constraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Constraint__Group_5__0_in_rule__Constraint__Group__5__Impl1897);
                    rule__Constraint__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_5()); 

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
    // $ANTLR end rule__Constraint__Group__5__Impl


    // $ANTLR start rule__Constraint__Group__6
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:942:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:946:1: ( rule__Constraint__Group__6__Impl rule__Constraint__Group__7 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:947:2: rule__Constraint__Group__6__Impl rule__Constraint__Group__7
            {
            pushFollow(FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__61928);
            rule__Constraint__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__61931);
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


    // $ANTLR start rule__Constraint__Group__6__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:954:1: rule__Constraint__Group__6__Impl : ( ')' ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:958:1: ( ( ')' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:959:1: ( ')' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:959:1: ( ')' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:960:1: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__Constraint__Group__6__Impl1959); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end rule__Constraint__Group__6__Impl


    // $ANTLR start rule__Constraint__Group__7
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:973:1: rule__Constraint__Group__7 : rule__Constraint__Group__7__Impl ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:977:1: ( rule__Constraint__Group__7__Impl )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:978:2: rule__Constraint__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__7__Impl_in_rule__Constraint__Group__71990);
            rule__Constraint__Group__7__Impl();
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
    // $ANTLR end rule__Constraint__Group__7


    // $ANTLR start rule__Constraint__Group__7__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:984:1: rule__Constraint__Group__7__Impl : ( ( rule__Constraint__Group_7__0 ) ) ;
    public final void rule__Constraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:988:1: ( ( ( rule__Constraint__Group_7__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:989:1: ( ( rule__Constraint__Group_7__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:989:1: ( ( rule__Constraint__Group_7__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:990:1: ( rule__Constraint__Group_7__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_7()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:991:1: ( rule__Constraint__Group_7__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:991:2: rule__Constraint__Group_7__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7__0_in_rule__Constraint__Group__7__Impl2017);
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
    // $ANTLR end rule__Constraint__Group__7__Impl


    // $ANTLR start rule__Constraint__Group_5__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1017:1: rule__Constraint__Group_5__0 : rule__Constraint__Group_5__0__Impl rule__Constraint__Group_5__1 ;
    public final void rule__Constraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1021:1: ( rule__Constraint__Group_5__0__Impl rule__Constraint__Group_5__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1022:2: rule__Constraint__Group_5__0__Impl rule__Constraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group_5__0__Impl_in_rule__Constraint__Group_5__02063);
            rule__Constraint__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group_5__1_in_rule__Constraint__Group_5__02066);
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


    // $ANTLR start rule__Constraint__Group_5__0__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1029:1: rule__Constraint__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Constraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1033:1: ( ( '=' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1034:1: ( '=' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1034:1: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1035:1: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__Constraint__Group_5__0__Impl2094); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0()); 

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
    // $ANTLR end rule__Constraint__Group_5__0__Impl


    // $ANTLR start rule__Constraint__Group_5__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1048:1: rule__Constraint__Group_5__1 : rule__Constraint__Group_5__1__Impl ;
    public final void rule__Constraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1052:1: ( rule__Constraint__Group_5__1__Impl )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1053:2: rule__Constraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group_5__1__Impl_in_rule__Constraint__Group_5__12125);
            rule__Constraint__Group_5__1__Impl();
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
    // $ANTLR end rule__Constraint__Group_5__1


    // $ANTLR start rule__Constraint__Group_5__1__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1059:1: rule__Constraint__Group_5__1__Impl : ( ( rule__Constraint__QualifierAssignment_5_1 ) ) ;
    public final void rule__Constraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1063:1: ( ( ( rule__Constraint__QualifierAssignment_5_1 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1064:1: ( ( rule__Constraint__QualifierAssignment_5_1 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1064:1: ( ( rule__Constraint__QualifierAssignment_5_1 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1065:1: ( rule__Constraint__QualifierAssignment_5_1 )
            {
             before(grammarAccess.getConstraintAccess().getQualifierAssignment_5_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1066:1: ( rule__Constraint__QualifierAssignment_5_1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1066:2: rule__Constraint__QualifierAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Constraint__QualifierAssignment_5_1_in_rule__Constraint__Group_5__1__Impl2152);
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
    // $ANTLR end rule__Constraint__Group_5__1__Impl


    // $ANTLR start rule__Constraint__Group_7__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1080:1: rule__Constraint__Group_7__0 : rule__Constraint__Group_7__0__Impl rule__Constraint__Group_7__1 ;
    public final void rule__Constraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1084:1: ( rule__Constraint__Group_7__0__Impl rule__Constraint__Group_7__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1085:2: rule__Constraint__Group_7__0__Impl rule__Constraint__Group_7__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7__0__Impl_in_rule__Constraint__Group_7__02186);
            rule__Constraint__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group_7__1_in_rule__Constraint__Group_7__02189);
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


    // $ANTLR start rule__Constraint__Group_7__0__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1092:1: rule__Constraint__Group_7__0__Impl : ( '=' ) ;
    public final void rule__Constraint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1096:1: ( ( '=' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1097:1: ( '=' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1097:1: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1098:1: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Constraint__Group_7__0__Impl2217); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0()); 

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
    // $ANTLR end rule__Constraint__Group_7__0__Impl


    // $ANTLR start rule__Constraint__Group_7__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1111:1: rule__Constraint__Group_7__1 : rule__Constraint__Group_7__1__Impl rule__Constraint__Group_7__2 ;
    public final void rule__Constraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1115:1: ( rule__Constraint__Group_7__1__Impl rule__Constraint__Group_7__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1116:2: rule__Constraint__Group_7__1__Impl rule__Constraint__Group_7__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7__1__Impl_in_rule__Constraint__Group_7__12248);
            rule__Constraint__Group_7__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group_7__2_in_rule__Constraint__Group_7__12251);
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


    // $ANTLR start rule__Constraint__Group_7__1__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1123:1: rule__Constraint__Group_7__1__Impl : ( '[' ) ;
    public final void rule__Constraint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1127:1: ( ( '[' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1128:1: ( '[' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1128:1: ( '[' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1129:1: '['
            {
             before(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,27,FOLLOW_27_in_rule__Constraint__Group_7__1__Impl2279); 
             after(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1()); 

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
    // $ANTLR end rule__Constraint__Group_7__1__Impl


    // $ANTLR start rule__Constraint__Group_7__2
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1142:1: rule__Constraint__Group_7__2 : rule__Constraint__Group_7__2__Impl rule__Constraint__Group_7__3 ;
    public final void rule__Constraint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1146:1: ( rule__Constraint__Group_7__2__Impl rule__Constraint__Group_7__3 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1147:2: rule__Constraint__Group_7__2__Impl rule__Constraint__Group_7__3
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7__2__Impl_in_rule__Constraint__Group_7__22310);
            rule__Constraint__Group_7__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group_7__3_in_rule__Constraint__Group_7__22313);
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


    // $ANTLR start rule__Constraint__Group_7__2__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1154:1: rule__Constraint__Group_7__2__Impl : ( ( rule__Constraint__MinValueAssignment_7_2 ) ) ;
    public final void rule__Constraint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1158:1: ( ( ( rule__Constraint__MinValueAssignment_7_2 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1159:1: ( ( rule__Constraint__MinValueAssignment_7_2 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1159:1: ( ( rule__Constraint__MinValueAssignment_7_2 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1160:1: ( rule__Constraint__MinValueAssignment_7_2 )
            {
             before(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1161:1: ( rule__Constraint__MinValueAssignment_7_2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1161:2: rule__Constraint__MinValueAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Constraint__MinValueAssignment_7_2_in_rule__Constraint__Group_7__2__Impl2340);
            rule__Constraint__MinValueAssignment_7_2();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2()); 

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
    // $ANTLR end rule__Constraint__Group_7__2__Impl


    // $ANTLR start rule__Constraint__Group_7__3
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1171:1: rule__Constraint__Group_7__3 : rule__Constraint__Group_7__3__Impl rule__Constraint__Group_7__4 ;
    public final void rule__Constraint__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1175:1: ( rule__Constraint__Group_7__3__Impl rule__Constraint__Group_7__4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1176:2: rule__Constraint__Group_7__3__Impl rule__Constraint__Group_7__4
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7__3__Impl_in_rule__Constraint__Group_7__32370);
            rule__Constraint__Group_7__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group_7__4_in_rule__Constraint__Group_7__32373);
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


    // $ANTLR start rule__Constraint__Group_7__3__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1183:1: rule__Constraint__Group_7__3__Impl : ( ',' ) ;
    public final void rule__Constraint__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1187:1: ( ( ',' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1188:1: ( ',' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1188:1: ( ',' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1189:1: ','
            {
             before(grammarAccess.getConstraintAccess().getCommaKeyword_7_3()); 
            match(input,28,FOLLOW_28_in_rule__Constraint__Group_7__3__Impl2401); 
             after(grammarAccess.getConstraintAccess().getCommaKeyword_7_3()); 

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
    // $ANTLR end rule__Constraint__Group_7__3__Impl


    // $ANTLR start rule__Constraint__Group_7__4
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1202:1: rule__Constraint__Group_7__4 : rule__Constraint__Group_7__4__Impl rule__Constraint__Group_7__5 ;
    public final void rule__Constraint__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1206:1: ( rule__Constraint__Group_7__4__Impl rule__Constraint__Group_7__5 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1207:2: rule__Constraint__Group_7__4__Impl rule__Constraint__Group_7__5
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7__4__Impl_in_rule__Constraint__Group_7__42432);
            rule__Constraint__Group_7__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group_7__5_in_rule__Constraint__Group_7__42435);
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


    // $ANTLR start rule__Constraint__Group_7__4__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1214:1: rule__Constraint__Group_7__4__Impl : ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) ;
    public final void rule__Constraint__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1218:1: ( ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1219:1: ( ( rule__Constraint__MaxValueAssignment_7_4 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1219:1: ( ( rule__Constraint__MaxValueAssignment_7_4 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1220:1: ( rule__Constraint__MaxValueAssignment_7_4 )
            {
             before(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1221:1: ( rule__Constraint__MaxValueAssignment_7_4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1221:2: rule__Constraint__MaxValueAssignment_7_4
            {
            pushFollow(FOLLOW_rule__Constraint__MaxValueAssignment_7_4_in_rule__Constraint__Group_7__4__Impl2462);
            rule__Constraint__MaxValueAssignment_7_4();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4()); 

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
    // $ANTLR end rule__Constraint__Group_7__4__Impl


    // $ANTLR start rule__Constraint__Group_7__5
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1231:1: rule__Constraint__Group_7__5 : rule__Constraint__Group_7__5__Impl ;
    public final void rule__Constraint__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1235:1: ( rule__Constraint__Group_7__5__Impl )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1236:2: rule__Constraint__Group_7__5__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7__5__Impl_in_rule__Constraint__Group_7__52492);
            rule__Constraint__Group_7__5__Impl();
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
    // $ANTLR end rule__Constraint__Group_7__5


    // $ANTLR start rule__Constraint__Group_7__5__Impl
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1242:1: rule__Constraint__Group_7__5__Impl : ( ']' ) ;
    public final void rule__Constraint__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1246:1: ( ( ']' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1247:1: ( ']' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1247:1: ( ']' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1248:1: ']'
            {
             before(grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_7_5()); 
            match(input,29,FOLLOW_29_in_rule__Constraint__Group_7__5__Impl2520); 
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
    // $ANTLR end rule__Constraint__Group_7__5__Impl


    // $ANTLR start rule__Model__NameAssignment_0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1274:1: rule__Model__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1278:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1279:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1279:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1280:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__NameAssignment_02568); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1289:1: rule__Model__DescriptionAssignment_1 : ( RULE_DESC_STRING ) ;
    public final void rule__Model__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1293:1: ( ( RULE_DESC_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1294:1: ( RULE_DESC_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1294:1: ( RULE_DESC_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1295:1: RULE_DESC_STRING
            {
             before(grammarAccess.getModelAccess().getDescriptionDESC_STRINGTerminalRuleCall_1_0()); 
            match(input,RULE_DESC_STRING,FOLLOW_RULE_DESC_STRING_in_rule__Model__DescriptionAssignment_12599); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1304:1: rule__Model__TestsAssignment_2_0_0_1 : ( ruleTests ) ;
    public final void rule__Model__TestsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1308:1: ( ( ruleTests ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1309:1: ( ruleTests )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1309:1: ( ruleTests )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1310:1: ruleTests
            {
             before(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0_0_1_0()); 
            pushFollow(FOLLOW_ruleTests_in_rule__Model__TestsAssignment_2_0_0_12630);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1319:1: rule__Model__ContraintsAssignment_2_0_1 : ( ruleConstraint ) ;
    public final void rule__Model__ContraintsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1323:1: ( ( ruleConstraint ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1324:1: ( ruleConstraint )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1324:1: ( ruleConstraint )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1325:1: ruleConstraint
            {
             before(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Model__ContraintsAssignment_2_0_12661);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1334:1: rule__Model__ContainsAssignment_2_1_1 : ( ruleTestMember ) ;
    public final void rule__Model__ContainsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1338:1: ( ( ruleTestMember ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1339:1: ( ruleTestMember )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1339:1: ( ruleTestMember )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1340:1: ruleTestMember
            {
             before(grammarAccess.getModelAccess().getContainsTestMemberParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleTestMember_in_rule__Model__ContainsAssignment_2_1_12692);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1349:1: rule__Tests__ImportURIAssignment : ( RULE_STRING ) ;
    public final void rule__Tests__ImportURIAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1353:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1354:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1354:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1355:1: RULE_STRING
            {
             before(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Tests__ImportURIAssignment2723); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1364:1: rule__TestMember__ImportURIAssignment : ( RULE_STRING ) ;
    public final void rule__TestMember__ImportURIAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1368:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1369:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1369:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1370:1: RULE_STRING
            {
             before(grammarAccess.getTestMemberAccess().getImportURISTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TestMember__ImportURIAssignment2754); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1379:1: rule__Constraint__MeasureAssignment_0 : ( ruleMeasure ) ;
    public final void rule__Constraint__MeasureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1383:1: ( ( ruleMeasure ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1384:1: ( ruleMeasure )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1384:1: ( ruleMeasure )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1385:1: ruleMeasure
            {
             before(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__Constraint__MeasureAssignment_02785);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1394:1: rule__Constraint__AgentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__AgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1398:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1399:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1399:1: ( ( RULE_ID ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1400:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1401:1: ( RULE_ID )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1402:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getAgentSAgentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__AgentAssignment_22820); 
             after(grammarAccess.getConstraintAccess().getAgentSAgentIDTerminalRuleCall_2_0_1()); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1413:1: rule__Constraint__AttributeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1417:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1418:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1418:1: ( ( RULE_ID ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1419:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1420:1: ( RULE_ID )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1421:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getAttributeSAttributeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__AttributeAssignment_42859); 
             after(grammarAccess.getConstraintAccess().getAttributeSAttributeIDTerminalRuleCall_4_0_1()); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1432:1: rule__Constraint__QualifierAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__QualifierAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1436:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1437:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1437:1: ( ( RULE_ID ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1438:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1439:1: ( RULE_ID )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1440:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getQualifierSStateValueIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__QualifierAssignment_5_12898); 
             after(grammarAccess.getConstraintAccess().getQualifierSStateValueIDTerminalRuleCall_5_1_0_1()); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1451:1: rule__Constraint__MinValueAssignment_7_2 : ( ruleValue ) ;
    public final void rule__Constraint__MinValueAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1455:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1456:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1456:1: ( ruleValue )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1457:1: ruleValue
            {
             before(grammarAccess.getConstraintAccess().getMinValueValueParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Constraint__MinValueAssignment_7_22933);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1466:1: rule__Constraint__MaxValueAssignment_7_4 : ( ruleValue ) ;
    public final void rule__Constraint__MaxValueAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1470:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1471:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1471:1: ( ruleValue )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1472:1: ruleValue
            {
             before(grammarAccess.getConstraintAccess().getMaxValueValueParserRuleCall_7_4_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Constraint__MaxValueAssignment_7_42964);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1481:1: rule__IntValue__ValueAssignment : ( RULE_INTEGER ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1485:1: ( ( RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1486:1: ( RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1486:1: ( RULE_INTEGER )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1487:1: RULE_INTEGER
            {
             before(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__IntValue__ValueAssignment2995); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1496:1: rule__RealValue__ValueAssignment : ( RULE_REAL ) ;
    public final void rule__RealValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1500:1: ( ( RULE_REAL ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1501:1: ( RULE_REAL )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1501:1: ( RULE_REAL )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1502:1: RULE_REAL
            {
             before(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment3026); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1511:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1515:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1516:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1516:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1517:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment3057); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1526:1: rule__BooleanValue__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1530:1: ( ( ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1531:1: ( ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1531:1: ( ruleBOOLEAN )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g:1532:1: ruleBOOLEAN
            {
             before(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__BooleanValue__ValueAssignment3088);
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
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0991 = new BitSet(new long[]{0x000000000067C022L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_in_rule__Model__Group__0__Impl1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11052 = new BitSet(new long[]{0x000000000067C002L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DescriptionAssignment_1_in_rule__Model__Group__1__Impl1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_2_in_rule__Model__Group__2__Impl1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0__0__Impl_in_rule__Model__Group_2_0__01177 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0__1_in_rule__Model__Group_2_0__01180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0_0__0_in_rule__Model__Group_2_0__0__Impl1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0__1__Impl_in_rule__Model__Group_2_0__11238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContraintsAssignment_2_0_1_in_rule__Model__Group_2_0__1__Impl1267 = new BitSet(new long[]{0x000000000007C002L});
    public static final BitSet FOLLOW_rule__Model__ContraintsAssignment_2_0_1_in_rule__Model__Group_2_0__1__Impl1279 = new BitSet(new long[]{0x000000000007C002L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0_0__0__Impl_in_rule__Model__Group_2_0_0__01316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0_0__1_in_rule__Model__Group_2_0_0__01319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group_2_0_0__0__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2_0_0__1__Impl_in_rule__Model__Group_2_0_0__11378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TestsAssignment_2_0_0_1_in_rule__Model__Group_2_0_0__1__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2_1__0__Impl_in_rule__Model__Group_2_1__01439 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group_2_1__1_in_rule__Model__Group_2_1__01442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group_2_1__0__Impl1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2_1__1__Impl_in_rule__Model__Group_2_1__11501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContainsAssignment_2_1_1_in_rule__Model__Group_2_1__1__Impl1528 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__01563 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__01566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MeasureAssignment_0_in_rule__Constraint__Group__0__Impl1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__11623 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__11626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Constraint__Group__1__Impl1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__21685 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__21688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__AgentAssignment_2_in_rule__Constraint__Group__2__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__31745 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__31748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constraint__Group__3__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__41807 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__41810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__AttributeAssignment_4_in_rule__Constraint__Group__4__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__51867 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__51870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__0_in_rule__Constraint__Group__5__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__61928 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__61931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constraint__Group__6__Impl1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7__Impl_in_rule__Constraint__Group__71990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__0_in_rule__Constraint__Group__7__Impl2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__0__Impl_in_rule__Constraint__Group_5__02063 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__1_in_rule__Constraint__Group_5__02066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Constraint__Group_5__0__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__1__Impl_in_rule__Constraint__Group_5__12125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__QualifierAssignment_5_1_in_rule__Constraint__Group_5__1__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__0__Impl_in_rule__Constraint__Group_7__02186 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__1_in_rule__Constraint__Group_7__02189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Constraint__Group_7__0__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__1__Impl_in_rule__Constraint__Group_7__12248 = new BitSet(new long[]{0x0000000000180190L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__2_in_rule__Constraint__Group_7__12251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constraint__Group_7__1__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__2__Impl_in_rule__Constraint__Group_7__22310 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__3_in_rule__Constraint__Group_7__22313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MinValueAssignment_7_2_in_rule__Constraint__Group_7__2__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__3__Impl_in_rule__Constraint__Group_7__32370 = new BitSet(new long[]{0x0000000000180190L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__4_in_rule__Constraint__Group_7__32373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constraint__Group_7__3__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__4__Impl_in_rule__Constraint__Group_7__42432 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__5_in_rule__Constraint__Group_7__42435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MaxValueAssignment_7_4_in_rule__Constraint__Group_7__4__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__5__Impl_in_rule__Constraint__Group_7__52492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Constraint__Group_7__5__Impl2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__NameAssignment_02568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESC_STRING_in_rule__Model__DescriptionAssignment_12599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTests_in_rule__Model__TestsAssignment_2_0_0_12630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Model__ContraintsAssignment_2_0_12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestMember_in_rule__Model__ContainsAssignment_2_1_12692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Tests__ImportURIAssignment2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TestMember__ImportURIAssignment2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__Constraint__MeasureAssignment_02785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__AgentAssignment_22820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__AttributeAssignment_42859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__QualifierAssignment_5_12898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Constraint__MinValueAssignment_7_22933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Constraint__MaxValueAssignment_7_42964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__IntValue__ValueAssignment2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__BooleanValue__ValueAssignment3088 = new BitSet(new long[]{0x0000000000000002L});

}