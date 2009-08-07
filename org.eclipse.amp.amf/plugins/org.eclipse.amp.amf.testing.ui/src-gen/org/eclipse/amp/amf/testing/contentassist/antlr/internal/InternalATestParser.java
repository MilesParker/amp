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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER", "RULE_REAL", "RULE_STRING", "RULE_PLAIN_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Count'", "'Average'", "'Sum'", "'Minimum'", "'Maximum'", "'TESTS'", "'('", "'.'", "')'", "'='", "'['", "','", "']'"
    };
    public static final int RULE_PLAIN_STRING=7;
    public static final int RULE_ID=8;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=5;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_INTEGER=4;
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




    // $ANTLR start entryRuleModel
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:55:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:55:16: ( ruleModel EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:56:1: ruleModel EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:63:1: ruleModel : ( ( rule__Model__Group ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:67:2: ( ( ( rule__Model__Group ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:68:1: ( ( rule__Model__Group ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:68:1: ( ( rule__Model__Group ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:69:1: ( rule__Model__Group )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:70:1: ( rule__Model__Group )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:70:2: rule__Model__Group
            {
            pushFollow(FOLLOW_rule__Model__Group_in_ruleModel94);
            rule__Model__Group();
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:81:1: entryRuleTests : ruleTests EOF ;
    public final void entryRuleTests() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:81:16: ( ruleTests EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:82:1: ruleTests EOF
            {
             before(grammarAccess.getTestsRule()); 
            pushFollow(FOLLOW_ruleTests_in_entryRuleTests119);
            ruleTests();
            _fsp--;

             after(grammarAccess.getTestsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTests126); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:89:1: ruleTests : ( ( rule__Tests__Group ) ) ;
    public final void ruleTests() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:93:2: ( ( ( rule__Tests__Group ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:94:1: ( ( rule__Tests__Group ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:94:1: ( ( rule__Tests__Group ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:95:1: ( rule__Tests__Group )
            {
             before(grammarAccess.getTestsAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:96:1: ( rule__Tests__Group )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:96:2: rule__Tests__Group
            {
            pushFollow(FOLLOW_rule__Tests__Group_in_ruleTests153);
            rule__Tests__Group();
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:107:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:107:21: ( ruleConstraint EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:108:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint178);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint185); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:115:1: ruleConstraint : ( ( rule__Constraint__Group ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:119:2: ( ( ( rule__Constraint__Group ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:120:1: ( ( rule__Constraint__Group ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:120:1: ( ( rule__Constraint__Group ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:121:1: ( rule__Constraint__Group )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:122:1: ( rule__Constraint__Group )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:122:2: rule__Constraint__Group
            {
            pushFollow(FOLLOW_rule__Constraint__Group_in_ruleConstraint212);
            rule__Constraint__Group();
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:133:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:133:16: ( ruleValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:134:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue237);
            ruleValue();
            _fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue244); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:141:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:145:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:146:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:146:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:147:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:148:1: ( rule__Value__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:148:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue271);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:159:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:159:19: ( ruleIntValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:160:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue296);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue303); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:167:1: ruleIntValue : ( ( ( RULE_INTEGER ) ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:171:2: ( ( ( ( RULE_INTEGER ) ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:172:1: ( ( ( RULE_INTEGER ) ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:172:1: ( ( ( RULE_INTEGER ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:173:1: ( ( RULE_INTEGER ) )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:174:1: ( ( RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:175:1: ( RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:175:1: ( RULE_INTEGER )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:176:1: RULE_INTEGER
            {
             before(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleIntValue337); 
             after(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); 

            }


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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:191:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:191:20: ( ruleRealValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:192:1: ruleRealValue EOF
            {
             before(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue368);
            ruleRealValue();
            _fsp--;

             after(grammarAccess.getRealValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue375); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:199:1: ruleRealValue : ( ( ( RULE_REAL ) ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:203:2: ( ( ( ( RULE_REAL ) ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:204:1: ( ( ( RULE_REAL ) ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:204:1: ( ( ( RULE_REAL ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:205:1: ( ( RULE_REAL ) )
            {
             before(grammarAccess.getRealValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:206:1: ( ( RULE_REAL ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:207:1: ( RULE_REAL )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:207:1: ( RULE_REAL )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:208:1: RULE_REAL
            {
             before(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleRealValue409); 
             after(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 

            }


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


    // $ANTLR start ruleMeasure
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:224:1: ruleMeasure : ( ( rule__Measure__Alternatives ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:228:1: ( ( ( rule__Measure__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:229:1: ( ( rule__Measure__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:229:1: ( ( rule__Measure__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:230:1: ( rule__Measure__Alternatives )
            {
             before(grammarAccess.getMeasureAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:231:1: ( rule__Measure__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:231:2: rule__Measure__Alternatives
            {
            pushFollow(FOLLOW_rule__Measure__Alternatives_in_ruleMeasure451);
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


    // $ANTLR start rule__Value__Alternatives
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:241:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleRealValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:245:1: ( ( ruleIntValue ) | ( ruleRealValue ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INTEGER) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_REAL) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("241:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleRealValue ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:246:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:246:1: ( ruleIntValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:247:1: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives485);
                    ruleIntValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:251:6: ( ruleRealValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:251:6: ( ruleRealValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:252:1: ruleRealValue
                    {
                     before(grammarAccess.getValueAccess().getRealValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRealValue_in_rule__Value__Alternatives501);
                    ruleRealValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getRealValueParserRuleCall_1()); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:261:1: rule__Measure__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) );
    public final void rule__Measure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:265:1: ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) )
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
                    new NoViableAltException("261:1: rule__Measure__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:266:1: ( ( 'Count' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:266:1: ( ( 'Count' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:267:1: ( 'Count' )
                    {
                     before(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:268:1: ( 'Count' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:268:3: 'Count'
                    {
                    match(input,14,FOLLOW_14_in_rule__Measure__Alternatives533); 

                    }

                     after(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:272:6: ( ( 'Average' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:272:6: ( ( 'Average' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:273:1: ( 'Average' )
                    {
                     before(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:274:1: ( 'Average' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:274:3: 'Average'
                    {
                    match(input,15,FOLLOW_15_in_rule__Measure__Alternatives553); 

                    }

                     after(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:278:6: ( ( 'Sum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:278:6: ( ( 'Sum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:279:1: ( 'Sum' )
                    {
                     before(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:280:1: ( 'Sum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:280:3: 'Sum'
                    {
                    match(input,16,FOLLOW_16_in_rule__Measure__Alternatives573); 

                    }

                     after(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:284:6: ( ( 'Minimum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:284:6: ( ( 'Minimum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:285:1: ( 'Minimum' )
                    {
                     before(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:286:1: ( 'Minimum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:286:3: 'Minimum'
                    {
                    match(input,17,FOLLOW_17_in_rule__Measure__Alternatives593); 

                    }

                     after(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:290:6: ( ( 'Maximum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:290:6: ( ( 'Maximum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:291:1: ( 'Maximum' )
                    {
                     before(grammarAccess.getMeasureAccess().getMAXIMUMEnumLiteralDeclaration_4()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:292:1: ( 'Maximum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:292:3: 'Maximum'
                    {
                    match(input,18,FOLLOW_18_in_rule__Measure__Alternatives613); 

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


    // $ANTLR start rule__Model__Group
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:302:1: rule__Model__Group : ( ( ( RULE_STRING ) )? ) ( ( ( RULE_PLAIN_STRING ) )? ) ( ( ( ruleTests ) )? ) ( ( ( ruleConstraint ) )* ) ;
    public final void rule__Model__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:306:1: ( ( ( ( RULE_STRING ) )? ) ( ( ( RULE_PLAIN_STRING ) )? ) ( ( ( ruleTests ) )? ) ( ( ( ruleConstraint ) )* ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:307:1: ( ( ( RULE_STRING ) )? ) ( ( ( RULE_PLAIN_STRING ) )? ) ( ( ( ruleTests ) )? ) ( ( ( ruleConstraint ) )* )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:307:1: ( ( ( RULE_STRING ) )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:308:1: ( ( RULE_STRING ) )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:309:1: ( ( RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:310:1: ( RULE_STRING )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:310:1: ( RULE_STRING )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:311:1: RULE_STRING
                    {
                     before(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__Group655); 
                     after(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_0()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:317:1: ( ( ( RULE_PLAIN_STRING ) )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:318:1: ( ( RULE_PLAIN_STRING ) )?
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:319:1: ( ( RULE_PLAIN_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_PLAIN_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:320:1: ( RULE_PLAIN_STRING )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:320:1: ( RULE_PLAIN_STRING )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:321:1: RULE_PLAIN_STRING
                    {
                     before(grammarAccess.getModelAccess().getDescriptionPLAIN_STRINGTerminalRuleCall_1_0()); 
                    match(input,RULE_PLAIN_STRING,FOLLOW_RULE_PLAIN_STRING_in_rule__Model__Group680); 
                     after(grammarAccess.getModelAccess().getDescriptionPLAIN_STRINGTerminalRuleCall_1_0()); 

                    }


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_1()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:327:1: ( ( ( ruleTests ) )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:328:1: ( ( ruleTests ) )?
            {
             before(grammarAccess.getModelAccess().getTestsAssignment_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:329:1: ( ( ruleTests ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:330:1: ( ruleTests )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:330:1: ( ruleTests )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:331:1: ruleTests
                    {
                     before(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_ruleTests_in_rule__Model__Group705);
                    ruleTests();
                    _fsp--;

                     after(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0()); 

                    }


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getTestsAssignment_2()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:337:1: ( ( ( ruleConstraint ) )* )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:338:1: ( ( ruleConstraint ) )*
            {
             before(grammarAccess.getModelAccess().getContraintsAssignment_3()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:339:1: ( ( ruleConstraint ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:340:1: ( ruleConstraint )
            	    {
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:340:1: ( ruleConstraint )
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:341:1: ruleConstraint
            	    {
            	     before(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_3_0()); 
            	    pushFollow(FOLLOW_ruleConstraint_in_rule__Model__Group730);
            	    ruleConstraint();
            	    _fsp--;

            	     after(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_3_0()); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end rule__Model__Group


    // $ANTLR start rule__Tests__Group
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:353:1: rule__Tests__Group : ( 'TESTS' ) ( ( ( RULE_STRING ) ) ) ;
    public final void rule__Tests__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:357:1: ( ( 'TESTS' ) ( ( ( RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:358:1: ( 'TESTS' ) ( ( ( RULE_STRING ) ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:358:1: ( 'TESTS' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:359:1: 'TESTS'
            {
             before(grammarAccess.getTestsAccess().getTESTSKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Tests__Group770); 
             after(grammarAccess.getTestsAccess().getTESTSKeyword_0()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:364:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:365:1: ( ( RULE_STRING ) )
            {
             before(grammarAccess.getTestsAccess().getImportURIAssignment_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:366:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:367:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:367:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:368:1: RULE_STRING
            {
             before(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Tests__Group789); 
             after(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


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
    // $ANTLR end rule__Tests__Group


    // $ANTLR start rule__Constraint__Group
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:380:1: rule__Constraint__Group : ( ( ( ruleMeasure ) ) ) ( '(' ) ( ( ( ( RULE_STRING ) ) ) ) ( '.' ) ( ( ( ( RULE_STRING ) ) ) ) ( ( rule__Constraint__Group_5 )? ) ( ')' ) ( ( rule__Constraint__Group_7 ) ) ;
    public final void rule__Constraint__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:384:1: ( ( ( ( ruleMeasure ) ) ) ( '(' ) ( ( ( ( RULE_STRING ) ) ) ) ( '.' ) ( ( ( ( RULE_STRING ) ) ) ) ( ( rule__Constraint__Group_5 )? ) ( ')' ) ( ( rule__Constraint__Group_7 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:385:1: ( ( ( ruleMeasure ) ) ) ( '(' ) ( ( ( ( RULE_STRING ) ) ) ) ( '.' ) ( ( ( ( RULE_STRING ) ) ) ) ( ( rule__Constraint__Group_5 )? ) ( ')' ) ( ( rule__Constraint__Group_7 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:385:1: ( ( ( ruleMeasure ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:386:1: ( ( ruleMeasure ) )
            {
             before(grammarAccess.getConstraintAccess().getMeasureAssignment_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:387:1: ( ( ruleMeasure ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:388:1: ( ruleMeasure )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:388:1: ( ruleMeasure )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:389:1: ruleMeasure
            {
             before(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__Constraint__Group834);
            ruleMeasure();
            _fsp--;

             after(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0()); 

            }


            }

             after(grammarAccess.getConstraintAccess().getMeasureAssignment_0()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:395:1: ( '(' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:396:1: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Constraint__Group852); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:401:1: ( ( ( ( RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:402:1: ( ( ( RULE_STRING ) ) )
            {
             before(grammarAccess.getConstraintAccess().getAgentAssignment_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:403:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:404:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:404:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:405:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:406:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:407:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getAgentSAgentSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__Group875); 
             after(grammarAccess.getConstraintAccess().getAgentSAgentSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0()); 

            }


            }

             after(grammarAccess.getConstraintAccess().getAgentAssignment_2()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:415:1: ( '.' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:416:1: '.'
            {
             before(grammarAccess.getConstraintAccess().getFullStopKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Constraint__Group897); 
             after(grammarAccess.getConstraintAccess().getFullStopKeyword_3()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:421:1: ( ( ( ( RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:422:1: ( ( ( RULE_STRING ) ) )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAssignment_4()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:423:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:424:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:424:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:425:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:426:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:427:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getAttributeSAttributeSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__Group920); 
             after(grammarAccess.getConstraintAccess().getAttributeSAttributeSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0()); 

            }


            }

             after(grammarAccess.getConstraintAccess().getAttributeAssignment_4()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:435:1: ( ( rule__Constraint__Group_5 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:436:1: ( rule__Constraint__Group_5 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_5()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:437:1: ( rule__Constraint__Group_5 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:437:2: rule__Constraint__Group_5
                    {
                    pushFollow(FOLLOW_rule__Constraint__Group_5_in_rule__Constraint__Group941);
                    rule__Constraint__Group_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_5()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:439:1: ( ')' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:440:1: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__Constraint__Group954); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:445:1: ( ( rule__Constraint__Group_7 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:446:1: ( rule__Constraint__Group_7 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_7()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:447:1: ( rule__Constraint__Group_7 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:447:2: rule__Constraint__Group_7
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7_in_rule__Constraint__Group966);
            rule__Constraint__Group_7();
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
    // $ANTLR end rule__Constraint__Group


    // $ANTLR start rule__Constraint__Group_5
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:455:1: rule__Constraint__Group_5 : ( '=' ) ( ( ( ( RULE_STRING ) ) ) ) ;
    public final void rule__Constraint__Group_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:459:1: ( ( '=' ) ( ( ( ( RULE_STRING ) ) ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:460:1: ( '=' ) ( ( ( ( RULE_STRING ) ) ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:460:1: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:461:1: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0()); 
            match(input,23,FOLLOW_23_in_rule__Constraint__Group_5999); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_5_0()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:466:1: ( ( ( ( RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:467:1: ( ( ( RULE_STRING ) ) )
            {
             before(grammarAccess.getConstraintAccess().getQualifierAssignment_5_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:468:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:469:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:469:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:470:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:471:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:472:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getQualifierSStateValueSTRINGTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__Group_51022); 
             after(grammarAccess.getConstraintAccess().getQualifierSStateValueSTRINGTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0()); 

            }


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
    // $ANTLR end rule__Constraint__Group_5


    // $ANTLR start rule__Constraint__Group_7
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:486:1: rule__Constraint__Group_7 : ( '=' ) ( '[' ) ( ( ( ruleValue ) ) ) ( ',' ) ( ( ( ruleValue ) ) ) ( ']' ) ;
    public final void rule__Constraint__Group_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:490:1: ( ( '=' ) ( '[' ) ( ( ( ruleValue ) ) ) ( ',' ) ( ( ( ruleValue ) ) ) ( ']' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:491:1: ( '=' ) ( '[' ) ( ( ( ruleValue ) ) ) ( ',' ) ( ( ( ruleValue ) ) ) ( ']' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:491:1: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:492:1: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0()); 
            match(input,23,FOLLOW_23_in_rule__Constraint__Group_71065); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:497:1: ( '[' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:498:1: '['
            {
             before(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,24,FOLLOW_24_in_rule__Constraint__Group_71078); 
             after(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:503:1: ( ( ( ruleValue ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:504:1: ( ( ruleValue ) )
            {
             before(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:505:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:506:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:506:1: ( ruleValue )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:507:1: ruleValue
            {
             before(grammarAccess.getConstraintAccess().getMinValueValueParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Constraint__Group_71097);
            ruleValue();
            _fsp--;

             after(grammarAccess.getConstraintAccess().getMinValueValueParserRuleCall_7_2_0()); 

            }


            }

             after(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:513:1: ( ',' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:514:1: ','
            {
             before(grammarAccess.getConstraintAccess().getCommaKeyword_7_3()); 
            match(input,25,FOLLOW_25_in_rule__Constraint__Group_71115); 
             after(grammarAccess.getConstraintAccess().getCommaKeyword_7_3()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:519:1: ( ( ( ruleValue ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:520:1: ( ( ruleValue ) )
            {
             before(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:521:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:522:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:522:1: ( ruleValue )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:523:1: ruleValue
            {
             before(grammarAccess.getConstraintAccess().getMaxValueValueParserRuleCall_7_4_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Constraint__Group_71134);
            ruleValue();
            _fsp--;

             after(grammarAccess.getConstraintAccess().getMaxValueValueParserRuleCall_7_4_0()); 

            }


            }

             after(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4()); 

            }

            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:529:1: ( ']' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:530:1: ']'
            {
             before(grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_7_5()); 
            match(input,26,FOLLOW_26_in_rule__Constraint__Group_71152); 
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
    // $ANTLR end rule__Constraint__Group_7


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTests_in_entryRuleTests119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTests126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tests__Group_in_ruleTests153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_in_ruleConstraint212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntValue337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleRealValue409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Alternatives_in_ruleMeasure451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_rule__Value__Alternatives501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Measure__Alternatives533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Measure__Alternatives553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Measure__Alternatives573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Measure__Alternatives593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Measure__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__Group655 = new BitSet(new long[]{0x00000000000FC082L});
    public static final BitSet FOLLOW_RULE_PLAIN_STRING_in_rule__Model__Group680 = new BitSet(new long[]{0x00000000000FC002L});
    public static final BitSet FOLLOW_ruleTests_in_rule__Model__Group705 = new BitSet(new long[]{0x000000000007C002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Model__Group730 = new BitSet(new long[]{0x000000000007C002L});
    public static final BitSet FOLLOW_19_in_rule__Tests__Group770 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Tests__Group789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__Constraint__Group834 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rule__Constraint__Group852 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__Group875 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule__Constraint__Group897 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__Group920 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5_in_rule__Constraint__Group941 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rule__Constraint__Group954 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7_in_rule__Constraint__Group966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Constraint__Group_5999 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__Group_51022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Constraint__Group_71065 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rule__Constraint__Group_71078 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Constraint__Group_71097 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rule__Constraint__Group_71115 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Constraint__Group_71134 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rule__Constraint__Group_71152 = new BitSet(new long[]{0x0000000000000002L});

}