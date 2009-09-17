package org.eclipse.amp.amf.testing.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.amp.amf.testing.services.ATestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalATestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DESC_STRING", "RULE_INTEGER", "RULE_REAL", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Count'", "'Average'", "'Sum'", "'Minimum'", "'Maximum'", "'true'", "'false'", "'TESTS'", "'('", "'.'", "')'", "'='", "'['", "','", "']'"
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
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g"; }


     
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:60:16: ( ruleModel EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:61:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel60);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel67); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:68:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:72:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:73:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:73:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:74:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:75:1: ( rule__Model__Group__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:75:2: rule__Model__Group__0
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:87:1: entryRuleTests : ruleTests EOF ;
    public final void entryRuleTests() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:87:16: ( ruleTests EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:88:1: ruleTests EOF
            {
             before(grammarAccess.getTestsRule()); 
            pushFollow(FOLLOW_ruleTests_in_entryRuleTests120);
            ruleTests();
            _fsp--;

             after(grammarAccess.getTestsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTests127); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:95:1: ruleTests : ( ( rule__Tests__Group__0 ) ) ;
    public final void ruleTests() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:99:2: ( ( ( rule__Tests__Group__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:100:1: ( ( rule__Tests__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:100:1: ( ( rule__Tests__Group__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:101:1: ( rule__Tests__Group__0 )
            {
             before(grammarAccess.getTestsAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:102:1: ( rule__Tests__Group__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:102:2: rule__Tests__Group__0
            {
            pushFollow(FOLLOW_rule__Tests__Group__0_in_ruleTests154);
            rule__Tests__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTestsAccess().getGroup()); 

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


    // $ANTLR start entryRuleConstraint
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:114:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:114:21: ( ruleConstraint EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:115:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint180);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint187); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:122:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:126:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:127:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:127:1: ( ( rule__Constraint__Group__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:128:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:129:1: ( rule__Constraint__Group__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:129:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint214);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:141:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:141:16: ( ruleValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:142:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue240);
            ruleValue();
            _fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue247); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:149:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:153:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:154:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:154:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:155:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:156:1: ( rule__Value__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:156:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue274);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:168:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:168:19: ( ruleIntValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:169:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue300);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue307); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:176:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:180:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:181:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:181:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:182:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:183:1: ( rule__IntValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:183:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue334);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:195:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:195:20: ( ruleRealValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:196:1: ruleRealValue EOF
            {
             before(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue360);
            ruleRealValue();
            _fsp--;

             after(grammarAccess.getRealValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue367); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:203:1: ruleRealValue : ( ( rule__RealValue__ValueAssignment ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:207:2: ( ( ( rule__RealValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:208:1: ( ( rule__RealValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:208:1: ( ( rule__RealValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:209:1: ( rule__RealValue__ValueAssignment )
            {
             before(grammarAccess.getRealValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:210:1: ( rule__RealValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:210:2: rule__RealValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__RealValue__ValueAssignment_in_ruleRealValue394);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:222:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:222:22: ( ruleStringValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:223:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue420);
            ruleStringValue();
            _fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue427); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:230:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:234:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:235:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:235:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:236:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:237:1: ( rule__StringValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:237:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue454);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:249:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:249:23: ( ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:250:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue480);
            ruleBooleanValue();
            _fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue487); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:257:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:261:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:262:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:262:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:263:1: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:264:1: ( rule__BooleanValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:264:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue514);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:277:1: ruleMeasure : ( ( rule__Measure__Alternatives ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:281:1: ( ( ( rule__Measure__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:282:1: ( ( rule__Measure__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:282:1: ( ( rule__Measure__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:283:1: ( rule__Measure__Alternatives )
            {
             before(grammarAccess.getMeasureAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:284:1: ( rule__Measure__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:284:2: rule__Measure__Alternatives
            {
            pushFollow(FOLLOW_rule__Measure__Alternatives_in_ruleMeasure551);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:296:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:300:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:301:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:301:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:302:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:303:1: ( rule__BOOLEAN__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:303:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN587);
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


    // $ANTLR start rule__Value__Alternatives
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:314:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:318:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) )
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
            case 19:
            case 20:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("314:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:319:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:319:1: ( ruleIntValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:320:1: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives622);
                    ruleIntValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:325:6: ( ruleStringValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:325:6: ( ruleStringValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:326:1: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives639);
                    ruleStringValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:331:6: ( ruleRealValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:331:6: ( ruleRealValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:332:1: ruleRealValue
                    {
                     before(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRealValue_in_rule__Value__Alternatives656);
                    ruleRealValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:337:6: ( ruleBooleanValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:337:6: ( ruleBooleanValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:338:1: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives673);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:348:1: rule__Measure__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) );
    public final void rule__Measure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:352:1: ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("348:1: rule__Measure__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:353:1: ( ( 'Count' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:353:1: ( ( 'Count' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:354:1: ( 'Count' )
                    {
                     before(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:355:1: ( 'Count' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:355:3: 'Count'
                    {
                    match(input,14,FOLLOW_14_in_rule__Measure__Alternatives706); 

                    }

                     after(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:360:6: ( ( 'Average' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:360:6: ( ( 'Average' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:361:1: ( 'Average' )
                    {
                     before(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:362:1: ( 'Average' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:362:3: 'Average'
                    {
                    match(input,15,FOLLOW_15_in_rule__Measure__Alternatives727); 

                    }

                     after(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:367:6: ( ( 'Sum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:367:6: ( ( 'Sum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:368:1: ( 'Sum' )
                    {
                     before(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:369:1: ( 'Sum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:369:3: 'Sum'
                    {
                    match(input,16,FOLLOW_16_in_rule__Measure__Alternatives748); 

                    }

                     after(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:374:6: ( ( 'Minimum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:374:6: ( ( 'Minimum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:375:1: ( 'Minimum' )
                    {
                     before(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:376:1: ( 'Minimum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:376:3: 'Minimum'
                    {
                    match(input,17,FOLLOW_17_in_rule__Measure__Alternatives769); 

                    }

                     after(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:381:6: ( ( 'Maximum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:381:6: ( ( 'Maximum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:382:1: ( 'Maximum' )
                    {
                     before(grammarAccess.getMeasureAccess().getMAXIMUMEnumLiteralDeclaration_4()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:383:1: ( 'Maximum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:383:3: 'Maximum'
                    {
                    match(input,18,FOLLOW_18_in_rule__Measure__Alternatives790); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:393:1: rule__BOOLEAN__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:397:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("393:1: rule__BOOLEAN__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:398:1: ( ( 'true' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:398:1: ( ( 'true' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:399:1: ( 'true' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:400:1: ( 'true' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:400:3: 'true'
                    {
                    match(input,19,FOLLOW_19_in_rule__BOOLEAN__Alternatives826); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:405:6: ( ( 'false' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:405:6: ( ( 'false' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:406:1: ( 'false' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:407:1: ( 'false' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:407:3: 'false'
                    {
                    match(input,20,FOLLOW_20_in_rule__BOOLEAN__Alternatives847); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:419:1: rule__Model__Group__0 : ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:423:1: ( ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:424:1: ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:424:1: ( ( rule__Model__NameAssignment_0 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:425:1: ( rule__Model__NameAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:426:1: ( rule__Model__NameAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:426:2: rule__Model__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__NameAssignment_0_in_rule__Model__Group__0884);
                    rule__Model__NameAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0894);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:437:1: rule__Model__Group__1 : ( ( rule__Model__DescriptionAssignment_1 )? ) rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:441:1: ( ( ( rule__Model__DescriptionAssignment_1 )? ) rule__Model__Group__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:442:1: ( ( rule__Model__DescriptionAssignment_1 )? ) rule__Model__Group__2
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:442:1: ( ( rule__Model__DescriptionAssignment_1 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:443:1: ( rule__Model__DescriptionAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:444:1: ( rule__Model__DescriptionAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DESC_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:444:2: rule__Model__DescriptionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__DescriptionAssignment_1_in_rule__Model__Group__1922);
                    rule__Model__DescriptionAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1932);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:455:1: rule__Model__Group__2 : ( ( rule__Model__TestsAssignment_2 )? ) rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:459:1: ( ( ( rule__Model__TestsAssignment_2 )? ) rule__Model__Group__3 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:460:1: ( ( rule__Model__TestsAssignment_2 )? ) rule__Model__Group__3
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:460:1: ( ( rule__Model__TestsAssignment_2 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:461:1: ( rule__Model__TestsAssignment_2 )?
            {
             before(grammarAccess.getModelAccess().getTestsAssignment_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:462:1: ( rule__Model__TestsAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:462:2: rule__Model__TestsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__TestsAssignment_2_in_rule__Model__Group__2960);
                    rule__Model__TestsAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getTestsAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2970);
            rule__Model__Group__3();
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


    // $ANTLR start rule__Model__Group__3
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:473:1: rule__Model__Group__3 : ( ( rule__Model__ContraintsAssignment_3 )* ) ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:477:1: ( ( ( rule__Model__ContraintsAssignment_3 )* ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:478:1: ( ( rule__Model__ContraintsAssignment_3 )* )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:478:1: ( ( rule__Model__ContraintsAssignment_3 )* )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:479:1: ( rule__Model__ContraintsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getContraintsAssignment_3()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:480:1: ( rule__Model__ContraintsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=18)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:480:2: rule__Model__ContraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ContraintsAssignment_3_in_rule__Model__Group__3998);
            	    rule__Model__ContraintsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getContraintsAssignment_3()); 

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
    // $ANTLR end rule__Model__Group__3


    // $ANTLR start rule__Tests__Group__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:498:1: rule__Tests__Group__0 : ( 'TESTS' ) rule__Tests__Group__1 ;
    public final void rule__Tests__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:502:1: ( ( 'TESTS' ) rule__Tests__Group__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:503:1: ( 'TESTS' ) rule__Tests__Group__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:503:1: ( 'TESTS' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:504:1: 'TESTS'
            {
             before(grammarAccess.getTestsAccess().getTESTSKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Tests__Group__01042); 
             after(grammarAccess.getTestsAccess().getTESTSKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Tests__Group__1_in_rule__Tests__Group__01052);
            rule__Tests__Group__1();
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
    // $ANTLR end rule__Tests__Group__0


    // $ANTLR start rule__Tests__Group__1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:518:1: rule__Tests__Group__1 : ( ( rule__Tests__ImportURIAssignment_1 ) ) ;
    public final void rule__Tests__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:522:1: ( ( ( rule__Tests__ImportURIAssignment_1 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:523:1: ( ( rule__Tests__ImportURIAssignment_1 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:523:1: ( ( rule__Tests__ImportURIAssignment_1 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:524:1: ( rule__Tests__ImportURIAssignment_1 )
            {
             before(grammarAccess.getTestsAccess().getImportURIAssignment_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:525:1: ( rule__Tests__ImportURIAssignment_1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:525:2: rule__Tests__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Tests__ImportURIAssignment_1_in_rule__Tests__Group__11080);
            rule__Tests__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTestsAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end rule__Tests__Group__1


    // $ANTLR start rule__Constraint__Group__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:539:1: rule__Constraint__Group__0 : ( ( rule__Constraint__MeasureAssignment_0 ) ) rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:543:1: ( ( ( rule__Constraint__MeasureAssignment_0 ) ) rule__Constraint__Group__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:544:1: ( ( rule__Constraint__MeasureAssignment_0 ) ) rule__Constraint__Group__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:544:1: ( ( rule__Constraint__MeasureAssignment_0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:545:1: ( rule__Constraint__MeasureAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getMeasureAssignment_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:546:1: ( rule__Constraint__MeasureAssignment_0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:546:2: rule__Constraint__MeasureAssignment_0
            {
            pushFollow(FOLLOW_rule__Constraint__MeasureAssignment_0_in_rule__Constraint__Group__01118);
            rule__Constraint__MeasureAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMeasureAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__01127);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:557:1: rule__Constraint__Group__1 : ( '(' ) rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:561:1: ( ( '(' ) rule__Constraint__Group__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:562:1: ( '(' ) rule__Constraint__Group__2
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:562:1: ( '(' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:563:1: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Constraint__Group__11156); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__11166);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:577:1: rule__Constraint__Group__2 : ( ( rule__Constraint__AgentAssignment_2 ) ) rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:581:1: ( ( ( rule__Constraint__AgentAssignment_2 ) ) rule__Constraint__Group__3 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:582:1: ( ( rule__Constraint__AgentAssignment_2 ) ) rule__Constraint__Group__3
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:582:1: ( ( rule__Constraint__AgentAssignment_2 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:583:1: ( rule__Constraint__AgentAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getAgentAssignment_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:584:1: ( rule__Constraint__AgentAssignment_2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:584:2: rule__Constraint__AgentAssignment_2
            {
            pushFollow(FOLLOW_rule__Constraint__AgentAssignment_2_in_rule__Constraint__Group__21194);
            rule__Constraint__AgentAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAgentAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__21203);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:595:1: rule__Constraint__Group__3 : ( '.' ) rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:599:1: ( ( '.' ) rule__Constraint__Group__4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:600:1: ( '.' ) rule__Constraint__Group__4
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:600:1: ( '.' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:601:1: '.'
            {
             before(grammarAccess.getConstraintAccess().getFullStopKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Constraint__Group__31232); 
             after(grammarAccess.getConstraintAccess().getFullStopKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__31242);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:615:1: rule__Constraint__Group__4 : ( ( rule__Constraint__AttributeAssignment_4 ) ) rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:619:1: ( ( ( rule__Constraint__AttributeAssignment_4 ) ) rule__Constraint__Group__5 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:620:1: ( ( rule__Constraint__AttributeAssignment_4 ) ) rule__Constraint__Group__5
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:620:1: ( ( rule__Constraint__AttributeAssignment_4 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:621:1: ( rule__Constraint__AttributeAssignment_4 )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAssignment_4()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:622:1: ( rule__Constraint__AttributeAssignment_4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:622:2: rule__Constraint__AttributeAssignment_4
            {
            pushFollow(FOLLOW_rule__Constraint__AttributeAssignment_4_in_rule__Constraint__Group__41270);
            rule__Constraint__AttributeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAttributeAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__41279);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:633:1: rule__Constraint__Group__5 : ( ( rule__Constraint__Group_5__0 )? ) rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:637:1: ( ( ( rule__Constraint__Group_5__0 )? ) rule__Constraint__Group__6 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:638:1: ( ( rule__Constraint__Group_5__0 )? ) rule__Constraint__Group__6
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:638:1: ( ( rule__Constraint__Group_5__0 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:639:1: ( rule__Constraint__Group_5__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_5()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:640:1: ( rule__Constraint__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:640:2: rule__Constraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Constraint__Group_5__0_in_rule__Constraint__Group__51307);
                    rule__Constraint__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__51317);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:651:1: rule__Constraint__Group__6 : ( ')' ) rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:655:1: ( ( ')' ) rule__Constraint__Group__7 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:656:1: ( ')' ) rule__Constraint__Group__7
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:656:1: ( ')' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:657:1: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__Constraint__Group__61346); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__61356);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:671:1: rule__Constraint__Group__7 : ( ( rule__Constraint__Group_7__0 ) ) ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:675:1: ( ( ( rule__Constraint__Group_7__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:676:1: ( ( rule__Constraint__Group_7__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:676:1: ( ( rule__Constraint__Group_7__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:677:1: ( rule__Constraint__Group_7__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_7()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:678:1: ( rule__Constraint__Group_7__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:678:2: rule__Constraint__Group_7__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7__0_in_rule__Constraint__Group__71384);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:704:1: rule__Constraint__Group_5__0 : ( '=' ) rule__Constraint__Group_5__1 ;
    public final void rule__Constraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:708:1: ( ( '=' ) rule__Constraint__Group_5__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:709:1: ( '=' ) rule__Constraint__Group_5__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:709:1: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:710:1: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0()); 
            match(input,25,FOLLOW_25_in_rule__Constraint__Group_5__01435); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_5__1_in_rule__Constraint__Group_5__01445);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:724:1: rule__Constraint__Group_5__1 : ( ( rule__Constraint__QualifierAssignment_5_1 ) ) ;
    public final void rule__Constraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:728:1: ( ( ( rule__Constraint__QualifierAssignment_5_1 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:729:1: ( ( rule__Constraint__QualifierAssignment_5_1 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:729:1: ( ( rule__Constraint__QualifierAssignment_5_1 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:730:1: ( rule__Constraint__QualifierAssignment_5_1 )
            {
             before(grammarAccess.getConstraintAccess().getQualifierAssignment_5_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:731:1: ( rule__Constraint__QualifierAssignment_5_1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:731:2: rule__Constraint__QualifierAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Constraint__QualifierAssignment_5_1_in_rule__Constraint__Group_5__11473);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:745:1: rule__Constraint__Group_7__0 : ( '=' ) rule__Constraint__Group_7__1 ;
    public final void rule__Constraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:749:1: ( ( '=' ) rule__Constraint__Group_7__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:750:1: ( '=' ) rule__Constraint__Group_7__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:750:1: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:751:1: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0()); 
            match(input,25,FOLLOW_25_in_rule__Constraint__Group_7__01512); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__1_in_rule__Constraint__Group_7__01522);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:765:1: rule__Constraint__Group_7__1 : ( '[' ) rule__Constraint__Group_7__2 ;
    public final void rule__Constraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:769:1: ( ( '[' ) rule__Constraint__Group_7__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:770:1: ( '[' ) rule__Constraint__Group_7__2
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:770:1: ( '[' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:771:1: '['
            {
             before(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,26,FOLLOW_26_in_rule__Constraint__Group_7__11551); 
             after(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__2_in_rule__Constraint__Group_7__11561);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:785:1: rule__Constraint__Group_7__2 : ( ( rule__Constraint__MinValueAssignment_7_2 ) ) rule__Constraint__Group_7__3 ;
    public final void rule__Constraint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:789:1: ( ( ( rule__Constraint__MinValueAssignment_7_2 ) ) rule__Constraint__Group_7__3 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:790:1: ( ( rule__Constraint__MinValueAssignment_7_2 ) ) rule__Constraint__Group_7__3
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:790:1: ( ( rule__Constraint__MinValueAssignment_7_2 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:791:1: ( rule__Constraint__MinValueAssignment_7_2 )
            {
             before(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:792:1: ( rule__Constraint__MinValueAssignment_7_2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:792:2: rule__Constraint__MinValueAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Constraint__MinValueAssignment_7_2_in_rule__Constraint__Group_7__21589);
            rule__Constraint__MinValueAssignment_7_2();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__3_in_rule__Constraint__Group_7__21598);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:803:1: rule__Constraint__Group_7__3 : ( ',' ) rule__Constraint__Group_7__4 ;
    public final void rule__Constraint__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:807:1: ( ( ',' ) rule__Constraint__Group_7__4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:808:1: ( ',' ) rule__Constraint__Group_7__4
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:808:1: ( ',' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:809:1: ','
            {
             before(grammarAccess.getConstraintAccess().getCommaKeyword_7_3()); 
            match(input,27,FOLLOW_27_in_rule__Constraint__Group_7__31627); 
             after(grammarAccess.getConstraintAccess().getCommaKeyword_7_3()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__4_in_rule__Constraint__Group_7__31637);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:823:1: rule__Constraint__Group_7__4 : ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) rule__Constraint__Group_7__5 ;
    public final void rule__Constraint__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:827:1: ( ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) rule__Constraint__Group_7__5 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:828:1: ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) rule__Constraint__Group_7__5
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:828:1: ( ( rule__Constraint__MaxValueAssignment_7_4 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:829:1: ( rule__Constraint__MaxValueAssignment_7_4 )
            {
             before(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:830:1: ( rule__Constraint__MaxValueAssignment_7_4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:830:2: rule__Constraint__MaxValueAssignment_7_4
            {
            pushFollow(FOLLOW_rule__Constraint__MaxValueAssignment_7_4_in_rule__Constraint__Group_7__41665);
            rule__Constraint__MaxValueAssignment_7_4();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__5_in_rule__Constraint__Group_7__41674);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:841:1: rule__Constraint__Group_7__5 : ( ']' ) ;
    public final void rule__Constraint__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:845:1: ( ( ']' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:846:1: ( ']' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:846:1: ( ']' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:847:1: ']'
            {
             before(grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_7_5()); 
            match(input,28,FOLLOW_28_in_rule__Constraint__Group_7__51703); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:872:1: rule__Model__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:876:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:877:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:877:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:878:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__NameAssignment_01750); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:887:1: rule__Model__DescriptionAssignment_1 : ( RULE_DESC_STRING ) ;
    public final void rule__Model__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:891:1: ( ( RULE_DESC_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:892:1: ( RULE_DESC_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:892:1: ( RULE_DESC_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:893:1: RULE_DESC_STRING
            {
             before(grammarAccess.getModelAccess().getDescriptionDESC_STRINGTerminalRuleCall_1_0()); 
            match(input,RULE_DESC_STRING,FOLLOW_RULE_DESC_STRING_in_rule__Model__DescriptionAssignment_11781); 
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


    // $ANTLR start rule__Model__TestsAssignment_2
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:902:1: rule__Model__TestsAssignment_2 : ( ruleTests ) ;
    public final void rule__Model__TestsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:906:1: ( ( ruleTests ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:907:1: ( ruleTests )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:907:1: ( ruleTests )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:908:1: ruleTests
            {
             before(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTests_in_rule__Model__TestsAssignment_21812);
            ruleTests();
            _fsp--;

             after(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Model__TestsAssignment_2


    // $ANTLR start rule__Model__ContraintsAssignment_3
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:917:1: rule__Model__ContraintsAssignment_3 : ( ruleConstraint ) ;
    public final void rule__Model__ContraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:921:1: ( ( ruleConstraint ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:922:1: ( ruleConstraint )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:922:1: ( ruleConstraint )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:923:1: ruleConstraint
            {
             before(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Model__ContraintsAssignment_31843);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Model__ContraintsAssignment_3


    // $ANTLR start rule__Tests__ImportURIAssignment_1
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:932:1: rule__Tests__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Tests__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:936:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:937:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:937:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:938:1: RULE_STRING
            {
             before(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Tests__ImportURIAssignment_11874); 
             after(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Tests__ImportURIAssignment_1


    // $ANTLR start rule__Constraint__MeasureAssignment_0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:947:1: rule__Constraint__MeasureAssignment_0 : ( ruleMeasure ) ;
    public final void rule__Constraint__MeasureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:951:1: ( ( ruleMeasure ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:952:1: ( ruleMeasure )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:952:1: ( ruleMeasure )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:953:1: ruleMeasure
            {
             before(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__Constraint__MeasureAssignment_01905);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:962:1: rule__Constraint__AgentAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Constraint__AgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:966:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:967:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:967:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:968:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:969:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:970:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getAgentSAgentSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__AgentAssignment_21940); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:981:1: rule__Constraint__AttributeAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__Constraint__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:985:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:986:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:986:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:987:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:988:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:989:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getAttributeSAttributeSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__AttributeAssignment_41979); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1000:1: rule__Constraint__QualifierAssignment_5_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Constraint__QualifierAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1004:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1005:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1005:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1006:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1007:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1008:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getQualifierSStateValueSTRINGTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__QualifierAssignment_5_12018); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1019:1: rule__Constraint__MinValueAssignment_7_2 : ( ruleValue ) ;
    public final void rule__Constraint__MinValueAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1023:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1024:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1024:1: ( ruleValue )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1025:1: ruleValue
            {
             before(grammarAccess.getConstraintAccess().getMinValueValueParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Constraint__MinValueAssignment_7_22053);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1034:1: rule__Constraint__MaxValueAssignment_7_4 : ( ruleValue ) ;
    public final void rule__Constraint__MaxValueAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1038:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1039:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1039:1: ( ruleValue )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1040:1: ruleValue
            {
             before(grammarAccess.getConstraintAccess().getMaxValueValueParserRuleCall_7_4_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Constraint__MaxValueAssignment_7_42084);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1049:1: rule__IntValue__ValueAssignment : ( RULE_INTEGER ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1053:1: ( ( RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1054:1: ( RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1054:1: ( RULE_INTEGER )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1055:1: RULE_INTEGER
            {
             before(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__IntValue__ValueAssignment2115); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1064:1: rule__RealValue__ValueAssignment : ( RULE_REAL ) ;
    public final void rule__RealValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1068:1: ( ( RULE_REAL ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1069:1: ( RULE_REAL )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1069:1: ( RULE_REAL )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1070:1: RULE_REAL
            {
             before(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment2146); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1079:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1083:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1084:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1084:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1085:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment2177); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1094:1: rule__BooleanValue__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1098:1: ( ( ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1099:1: ( ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1099:1: ( ruleBOOLEAN )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:1100:1: ruleBOOLEAN
            {
             before(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__BooleanValue__ValueAssignment2208);
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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTests_in_entryRuleTests120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTests127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tests__Group__0_in_ruleTests154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__ValueAssignment_in_ruleRealValue394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Alternatives_in_ruleMeasure551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_rule__Value__Alternatives656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Measure__Alternatives706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Measure__Alternatives727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Measure__Alternatives748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Measure__Alternatives769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Measure__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BOOLEAN__Alternatives826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BOOLEAN__Alternatives847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_in_rule__Model__Group__0884 = new BitSet(new long[]{0x000000000027C022L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DescriptionAssignment_1_in_rule__Model__Group__1922 = new BitSet(new long[]{0x000000000027C002L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TestsAssignment_2_in_rule__Model__Group__2960 = new BitSet(new long[]{0x000000000007C002L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContraintsAssignment_3_in_rule__Model__Group__3998 = new BitSet(new long[]{0x000000000007C002L});
    public static final BitSet FOLLOW_21_in_rule__Tests__Group__01042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Tests__Group__1_in_rule__Tests__Group__01052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tests__ImportURIAssignment_1_in_rule__Tests__Group__11080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MeasureAssignment_0_in_rule__Constraint__Group__01118 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__01127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Constraint__Group__11156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__11166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__AgentAssignment_2_in_rule__Constraint__Group__21194 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__21203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Constraint__Group__31232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__31242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__AttributeAssignment_4_in_rule__Constraint__Group__41270 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__41279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__0_in_rule__Constraint__Group__51307 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__51317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constraint__Group__61346 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__61356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__0_in_rule__Constraint__Group__71384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constraint__Group_5__01435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__1_in_rule__Constraint__Group_5__01445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__QualifierAssignment_5_1_in_rule__Constraint__Group_5__11473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constraint__Group_7__01512 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__1_in_rule__Constraint__Group_7__01522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Constraint__Group_7__11551 = new BitSet(new long[]{0x00000000001800D0L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__2_in_rule__Constraint__Group_7__11561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MinValueAssignment_7_2_in_rule__Constraint__Group_7__21589 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__3_in_rule__Constraint__Group_7__21598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constraint__Group_7__31627 = new BitSet(new long[]{0x00000000001800D0L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__4_in_rule__Constraint__Group_7__31637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MaxValueAssignment_7_4_in_rule__Constraint__Group_7__41665 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__5_in_rule__Constraint__Group_7__41674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constraint__Group_7__51703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__NameAssignment_01750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESC_STRING_in_rule__Model__DescriptionAssignment_11781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTests_in_rule__Model__TestsAssignment_21812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Model__ContraintsAssignment_31843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Tests__ImportURIAssignment_11874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__Constraint__MeasureAssignment_01905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__AgentAssignment_21940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__AttributeAssignment_41979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__QualifierAssignment_5_12018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Constraint__MinValueAssignment_7_22053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Constraint__MaxValueAssignment_7_42084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__IntValue__ValueAssignment2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__BooleanValue__ValueAssignment2208 = new BitSet(new long[]{0x0000000000000002L});

}