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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_PLAIN_STRING", "RULE_INT", "RULE_REAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Count'", "'Average'", "'Sum'", "'Minimum'", "'Maximum'", "'TESTS'", "'('", "':'", "')'", "'='", "'['", "','", "']'"
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:63:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:67:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:68:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:68:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:69:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:70:1: ( rule__Model__Group__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:70:2: rule__Model__Group__0
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:82:1: entryRuleTests : ruleTests EOF ;
    public final void entryRuleTests() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:82:16: ( ruleTests EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:83:1: ruleTests EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:90:1: ruleTests : ( ( rule__Tests__Group__0 ) ) ;
    public final void ruleTests() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:94:2: ( ( ( rule__Tests__Group__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:95:1: ( ( rule__Tests__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:95:1: ( ( rule__Tests__Group__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:96:1: ( rule__Tests__Group__0 )
            {
             before(grammarAccess.getTestsAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:97:1: ( rule__Tests__Group__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:97:2: rule__Tests__Group__0
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:109:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:109:21: ( ruleConstraint EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:110:1: ruleConstraint EOF
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:117:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:121:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:122:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:122:1: ( ( rule__Constraint__Group__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:123:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:124:1: ( rule__Constraint__Group__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:124:2: rule__Constraint__Group__0
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


    // $ANTLR start entryRuleIntValue
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:136:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:136:19: ( ruleIntValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:137:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue240);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue247); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:144:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:148:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:149:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:149:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:150:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:151:1: ( rule__IntValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:151:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue274);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:163:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:163:20: ( ruleRealValue EOF )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:164:1: ruleRealValue EOF
            {
             before(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue300);
            ruleRealValue();
            _fsp--;

             after(grammarAccess.getRealValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue307); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:171:1: ruleRealValue : ( ( rule__RealValue__ValueAssignment ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:175:2: ( ( ( rule__RealValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:176:1: ( ( rule__RealValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:176:1: ( ( rule__RealValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:177:1: ( rule__RealValue__ValueAssignment )
            {
             before(grammarAccess.getRealValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:178:1: ( rule__RealValue__ValueAssignment )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:178:2: rule__RealValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__RealValue__ValueAssignment_in_ruleRealValue334);
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


    // $ANTLR start ruleMeasure
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:191:1: ruleMeasure : ( ( rule__Measure__Alternatives ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:195:1: ( ( ( rule__Measure__Alternatives ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:196:1: ( ( rule__Measure__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:196:1: ( ( rule__Measure__Alternatives ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:197:1: ( rule__Measure__Alternatives )
            {
             before(grammarAccess.getMeasureAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:198:1: ( rule__Measure__Alternatives )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:198:2: rule__Measure__Alternatives
            {
            pushFollow(FOLLOW_rule__Measure__Alternatives_in_ruleMeasure371);
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


    // $ANTLR start rule__Constraint__MinValueAlternatives_7_2_0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:209:1: rule__Constraint__MinValueAlternatives_7_2_0 : ( ( ruleIntValue ) | ( ruleRealValue ) );
    public final void rule__Constraint__MinValueAlternatives_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:213:1: ( ( ruleIntValue ) | ( ruleRealValue ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_REAL) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("209:1: rule__Constraint__MinValueAlternatives_7_2_0 : ( ( ruleIntValue ) | ( ruleRealValue ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:214:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:214:1: ( ruleIntValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:215:1: ruleIntValue
                    {
                     before(grammarAccess.getConstraintAccess().getMinValueIntValueParserRuleCall_7_2_0_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Constraint__MinValueAlternatives_7_2_0406);
                    ruleIntValue();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getMinValueIntValueParserRuleCall_7_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:220:6: ( ruleRealValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:220:6: ( ruleRealValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:221:1: ruleRealValue
                    {
                     before(grammarAccess.getConstraintAccess().getMinValueRealValueParserRuleCall_7_2_0_1()); 
                    pushFollow(FOLLOW_ruleRealValue_in_rule__Constraint__MinValueAlternatives_7_2_0423);
                    ruleRealValue();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getMinValueRealValueParserRuleCall_7_2_0_1()); 

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
    // $ANTLR end rule__Constraint__MinValueAlternatives_7_2_0


    // $ANTLR start rule__Constraint__MaxValueAlternatives_7_4_0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:231:1: rule__Constraint__MaxValueAlternatives_7_4_0 : ( ( ruleIntValue ) | ( ruleRealValue ) );
    public final void rule__Constraint__MaxValueAlternatives_7_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:235:1: ( ( ruleIntValue ) | ( ruleRealValue ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_REAL) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("231:1: rule__Constraint__MaxValueAlternatives_7_4_0 : ( ( ruleIntValue ) | ( ruleRealValue ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:236:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:236:1: ( ruleIntValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:237:1: ruleIntValue
                    {
                     before(grammarAccess.getConstraintAccess().getMaxValueIntValueParserRuleCall_7_4_0_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Constraint__MaxValueAlternatives_7_4_0455);
                    ruleIntValue();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getMaxValueIntValueParserRuleCall_7_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:242:6: ( ruleRealValue )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:242:6: ( ruleRealValue )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:243:1: ruleRealValue
                    {
                     before(grammarAccess.getConstraintAccess().getMaxValueRealValueParserRuleCall_7_4_0_1()); 
                    pushFollow(FOLLOW_ruleRealValue_in_rule__Constraint__MaxValueAlternatives_7_4_0472);
                    ruleRealValue();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getMaxValueRealValueParserRuleCall_7_4_0_1()); 

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
    // $ANTLR end rule__Constraint__MaxValueAlternatives_7_4_0


    // $ANTLR start rule__Measure__Alternatives
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:253:1: rule__Measure__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) );
    public final void rule__Measure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:257:1: ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("253:1: rule__Measure__Alternatives : ( ( ( 'Count' ) ) | ( ( 'Average' ) ) | ( ( 'Sum' ) ) | ( ( 'Minimum' ) ) | ( ( 'Maximum' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:258:1: ( ( 'Count' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:258:1: ( ( 'Count' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:259:1: ( 'Count' )
                    {
                     before(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:260:1: ( 'Count' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:260:3: 'Count'
                    {
                    match(input,13,FOLLOW_13_in_rule__Measure__Alternatives505); 

                    }

                     after(grammarAccess.getMeasureAccess().getCOUNTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:265:6: ( ( 'Average' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:265:6: ( ( 'Average' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:266:1: ( 'Average' )
                    {
                     before(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:267:1: ( 'Average' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:267:3: 'Average'
                    {
                    match(input,14,FOLLOW_14_in_rule__Measure__Alternatives526); 

                    }

                     after(grammarAccess.getMeasureAccess().getAVERAGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:272:6: ( ( 'Sum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:272:6: ( ( 'Sum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:273:1: ( 'Sum' )
                    {
                     before(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:274:1: ( 'Sum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:274:3: 'Sum'
                    {
                    match(input,15,FOLLOW_15_in_rule__Measure__Alternatives547); 

                    }

                     after(grammarAccess.getMeasureAccess().getSUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:279:6: ( ( 'Minimum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:279:6: ( ( 'Minimum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:280:1: ( 'Minimum' )
                    {
                     before(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:281:1: ( 'Minimum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:281:3: 'Minimum'
                    {
                    match(input,16,FOLLOW_16_in_rule__Measure__Alternatives568); 

                    }

                     after(grammarAccess.getMeasureAccess().getMINIMUMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:286:6: ( ( 'Maximum' ) )
                    {
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:286:6: ( ( 'Maximum' ) )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:287:1: ( 'Maximum' )
                    {
                     before(grammarAccess.getMeasureAccess().getMAXIMUMEnumLiteralDeclaration_4()); 
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:288:1: ( 'Maximum' )
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:288:3: 'Maximum'
                    {
                    match(input,17,FOLLOW_17_in_rule__Measure__Alternatives589); 

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


    // $ANTLR start rule__Model__Group__0
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:300:1: rule__Model__Group__0 : ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:304:1: ( ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:305:1: ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:305:1: ( ( rule__Model__NameAssignment_0 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:306:1: ( rule__Model__NameAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:307:1: ( rule__Model__NameAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:307:2: rule__Model__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__NameAssignment_0_in_rule__Model__Group__0626);
                    rule__Model__NameAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0636);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:318:1: rule__Model__Group__1 : ( ( rule__Model__DescriptionAssignment_1 )? ) rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:322:1: ( ( ( rule__Model__DescriptionAssignment_1 )? ) rule__Model__Group__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:323:1: ( ( rule__Model__DescriptionAssignment_1 )? ) rule__Model__Group__2
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:323:1: ( ( rule__Model__DescriptionAssignment_1 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:324:1: ( rule__Model__DescriptionAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:325:1: ( rule__Model__DescriptionAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_PLAIN_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:325:2: rule__Model__DescriptionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__DescriptionAssignment_1_in_rule__Model__Group__1664);
                    rule__Model__DescriptionAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1674);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:336:1: rule__Model__Group__2 : ( ( rule__Model__TestsAssignment_2 )? ) rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:340:1: ( ( ( rule__Model__TestsAssignment_2 )? ) rule__Model__Group__3 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:341:1: ( ( rule__Model__TestsAssignment_2 )? ) rule__Model__Group__3
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:341:1: ( ( rule__Model__TestsAssignment_2 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:342:1: ( rule__Model__TestsAssignment_2 )?
            {
             before(grammarAccess.getModelAccess().getTestsAssignment_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:343:1: ( rule__Model__TestsAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:343:2: rule__Model__TestsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__TestsAssignment_2_in_rule__Model__Group__2702);
                    rule__Model__TestsAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getTestsAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2712);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:354:1: rule__Model__Group__3 : ( ( rule__Model__ContraintsAssignment_3 )* ) ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:358:1: ( ( ( rule__Model__ContraintsAssignment_3 )* ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:359:1: ( ( rule__Model__ContraintsAssignment_3 )* )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:359:1: ( ( rule__Model__ContraintsAssignment_3 )* )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:360:1: ( rule__Model__ContraintsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getContraintsAssignment_3()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:361:1: ( rule__Model__ContraintsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=13 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:361:2: rule__Model__ContraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ContraintsAssignment_3_in_rule__Model__Group__3740);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:379:1: rule__Tests__Group__0 : ( 'TESTS' ) rule__Tests__Group__1 ;
    public final void rule__Tests__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:383:1: ( ( 'TESTS' ) rule__Tests__Group__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:384:1: ( 'TESTS' ) rule__Tests__Group__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:384:1: ( 'TESTS' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:385:1: 'TESTS'
            {
             before(grammarAccess.getTestsAccess().getTESTSKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Tests__Group__0784); 
             after(grammarAccess.getTestsAccess().getTESTSKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Tests__Group__1_in_rule__Tests__Group__0794);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:399:1: rule__Tests__Group__1 : ( ( rule__Tests__ImportURIAssignment_1 ) ) ;
    public final void rule__Tests__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:403:1: ( ( ( rule__Tests__ImportURIAssignment_1 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:404:1: ( ( rule__Tests__ImportURIAssignment_1 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:404:1: ( ( rule__Tests__ImportURIAssignment_1 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:405:1: ( rule__Tests__ImportURIAssignment_1 )
            {
             before(grammarAccess.getTestsAccess().getImportURIAssignment_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:406:1: ( rule__Tests__ImportURIAssignment_1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:406:2: rule__Tests__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Tests__ImportURIAssignment_1_in_rule__Tests__Group__1822);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:420:1: rule__Constraint__Group__0 : ( ( rule__Constraint__MeasureAssignment_0 ) ) rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:424:1: ( ( ( rule__Constraint__MeasureAssignment_0 ) ) rule__Constraint__Group__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:425:1: ( ( rule__Constraint__MeasureAssignment_0 ) ) rule__Constraint__Group__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:425:1: ( ( rule__Constraint__MeasureAssignment_0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:426:1: ( rule__Constraint__MeasureAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getMeasureAssignment_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:427:1: ( rule__Constraint__MeasureAssignment_0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:427:2: rule__Constraint__MeasureAssignment_0
            {
            pushFollow(FOLLOW_rule__Constraint__MeasureAssignment_0_in_rule__Constraint__Group__0860);
            rule__Constraint__MeasureAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMeasureAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__0869);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:438:1: rule__Constraint__Group__1 : ( '(' ) rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:442:1: ( ( '(' ) rule__Constraint__Group__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:443:1: ( '(' ) rule__Constraint__Group__2
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:443:1: ( '(' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:444:1: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Constraint__Group__1898); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__1908);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:458:1: rule__Constraint__Group__2 : ( ( rule__Constraint__AgentAssignment_2 ) ) rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:462:1: ( ( ( rule__Constraint__AgentAssignment_2 ) ) rule__Constraint__Group__3 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:463:1: ( ( rule__Constraint__AgentAssignment_2 ) ) rule__Constraint__Group__3
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:463:1: ( ( rule__Constraint__AgentAssignment_2 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:464:1: ( rule__Constraint__AgentAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getAgentAssignment_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:465:1: ( rule__Constraint__AgentAssignment_2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:465:2: rule__Constraint__AgentAssignment_2
            {
            pushFollow(FOLLOW_rule__Constraint__AgentAssignment_2_in_rule__Constraint__Group__2936);
            rule__Constraint__AgentAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAgentAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__2945);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:476:1: rule__Constraint__Group__3 : ( ':' ) rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:480:1: ( ( ':' ) rule__Constraint__Group__4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:481:1: ( ':' ) rule__Constraint__Group__4
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:481:1: ( ':' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:482:1: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Constraint__Group__3974); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__3984);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:496:1: rule__Constraint__Group__4 : ( ( rule__Constraint__AttributeAssignment_4 ) ) rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:500:1: ( ( ( rule__Constraint__AttributeAssignment_4 ) ) rule__Constraint__Group__5 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:501:1: ( ( rule__Constraint__AttributeAssignment_4 ) ) rule__Constraint__Group__5
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:501:1: ( ( rule__Constraint__AttributeAssignment_4 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:502:1: ( rule__Constraint__AttributeAssignment_4 )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAssignment_4()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:503:1: ( rule__Constraint__AttributeAssignment_4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:503:2: rule__Constraint__AttributeAssignment_4
            {
            pushFollow(FOLLOW_rule__Constraint__AttributeAssignment_4_in_rule__Constraint__Group__41012);
            rule__Constraint__AttributeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAttributeAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__41021);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:514:1: rule__Constraint__Group__5 : ( ( rule__Constraint__Group_5__0 )? ) rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:518:1: ( ( ( rule__Constraint__Group_5__0 )? ) rule__Constraint__Group__6 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:519:1: ( ( rule__Constraint__Group_5__0 )? ) rule__Constraint__Group__6
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:519:1: ( ( rule__Constraint__Group_5__0 )? )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:520:1: ( rule__Constraint__Group_5__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_5()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:521:1: ( rule__Constraint__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:521:2: rule__Constraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Constraint__Group_5__0_in_rule__Constraint__Group__51049);
                    rule__Constraint__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__51059);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:532:1: rule__Constraint__Group__6 : ( ')' ) rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:536:1: ( ( ')' ) rule__Constraint__Group__7 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:537:1: ( ')' ) rule__Constraint__Group__7
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:537:1: ( ')' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:538:1: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Constraint__Group__61088); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__61098);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:552:1: rule__Constraint__Group__7 : ( ( rule__Constraint__Group_7__0 ) ) ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:556:1: ( ( ( rule__Constraint__Group_7__0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:557:1: ( ( rule__Constraint__Group_7__0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:557:1: ( ( rule__Constraint__Group_7__0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:558:1: ( rule__Constraint__Group_7__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_7()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:559:1: ( rule__Constraint__Group_7__0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:559:2: rule__Constraint__Group_7__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group_7__0_in_rule__Constraint__Group__71126);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:585:1: rule__Constraint__Group_5__0 : ( ':' ) rule__Constraint__Group_5__1 ;
    public final void rule__Constraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:589:1: ( ( ':' ) rule__Constraint__Group_5__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:590:1: ( ':' ) rule__Constraint__Group_5__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:590:1: ( ':' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:591:1: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Constraint__Group_5__01177); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_5__1_in_rule__Constraint__Group_5__01187);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:605:1: rule__Constraint__Group_5__1 : ( ( rule__Constraint__QualifierAssignment_5_1 ) ) ;
    public final void rule__Constraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:609:1: ( ( ( rule__Constraint__QualifierAssignment_5_1 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:610:1: ( ( rule__Constraint__QualifierAssignment_5_1 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:610:1: ( ( rule__Constraint__QualifierAssignment_5_1 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:611:1: ( rule__Constraint__QualifierAssignment_5_1 )
            {
             before(grammarAccess.getConstraintAccess().getQualifierAssignment_5_1()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:612:1: ( rule__Constraint__QualifierAssignment_5_1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:612:2: rule__Constraint__QualifierAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Constraint__QualifierAssignment_5_1_in_rule__Constraint__Group_5__11215);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:626:1: rule__Constraint__Group_7__0 : ( '=' ) rule__Constraint__Group_7__1 ;
    public final void rule__Constraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:630:1: ( ( '=' ) rule__Constraint__Group_7__1 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:631:1: ( '=' ) rule__Constraint__Group_7__1
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:631:1: ( '=' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:632:1: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0()); 
            match(input,22,FOLLOW_22_in_rule__Constraint__Group_7__01254); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__1_in_rule__Constraint__Group_7__01264);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:646:1: rule__Constraint__Group_7__1 : ( '[' ) rule__Constraint__Group_7__2 ;
    public final void rule__Constraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:650:1: ( ( '[' ) rule__Constraint__Group_7__2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:651:1: ( '[' ) rule__Constraint__Group_7__2
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:651:1: ( '[' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:652:1: '['
            {
             before(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,23,FOLLOW_23_in_rule__Constraint__Group_7__11293); 
             after(grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__2_in_rule__Constraint__Group_7__11303);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:666:1: rule__Constraint__Group_7__2 : ( ( rule__Constraint__MinValueAssignment_7_2 ) ) rule__Constraint__Group_7__3 ;
    public final void rule__Constraint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:670:1: ( ( ( rule__Constraint__MinValueAssignment_7_2 ) ) rule__Constraint__Group_7__3 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:671:1: ( ( rule__Constraint__MinValueAssignment_7_2 ) ) rule__Constraint__Group_7__3
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:671:1: ( ( rule__Constraint__MinValueAssignment_7_2 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:672:1: ( rule__Constraint__MinValueAssignment_7_2 )
            {
             before(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:673:1: ( rule__Constraint__MinValueAssignment_7_2 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:673:2: rule__Constraint__MinValueAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Constraint__MinValueAssignment_7_2_in_rule__Constraint__Group_7__21331);
            rule__Constraint__MinValueAssignment_7_2();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__3_in_rule__Constraint__Group_7__21340);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:684:1: rule__Constraint__Group_7__3 : ( ',' ) rule__Constraint__Group_7__4 ;
    public final void rule__Constraint__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:688:1: ( ( ',' ) rule__Constraint__Group_7__4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:689:1: ( ',' ) rule__Constraint__Group_7__4
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:689:1: ( ',' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:690:1: ','
            {
             before(grammarAccess.getConstraintAccess().getCommaKeyword_7_3()); 
            match(input,24,FOLLOW_24_in_rule__Constraint__Group_7__31369); 
             after(grammarAccess.getConstraintAccess().getCommaKeyword_7_3()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__4_in_rule__Constraint__Group_7__31379);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:704:1: rule__Constraint__Group_7__4 : ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) rule__Constraint__Group_7__5 ;
    public final void rule__Constraint__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:708:1: ( ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) rule__Constraint__Group_7__5 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:709:1: ( ( rule__Constraint__MaxValueAssignment_7_4 ) ) rule__Constraint__Group_7__5
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:709:1: ( ( rule__Constraint__MaxValueAssignment_7_4 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:710:1: ( rule__Constraint__MaxValueAssignment_7_4 )
            {
             before(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:711:1: ( rule__Constraint__MaxValueAssignment_7_4 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:711:2: rule__Constraint__MaxValueAssignment_7_4
            {
            pushFollow(FOLLOW_rule__Constraint__MaxValueAssignment_7_4_in_rule__Constraint__Group_7__41407);
            rule__Constraint__MaxValueAssignment_7_4();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4()); 

            }

            pushFollow(FOLLOW_rule__Constraint__Group_7__5_in_rule__Constraint__Group_7__41416);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:722:1: rule__Constraint__Group_7__5 : ( ']' ) ;
    public final void rule__Constraint__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:726:1: ( ( ']' ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:727:1: ( ']' )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:727:1: ( ']' )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:728:1: ']'
            {
             before(grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_7_5()); 
            match(input,25,FOLLOW_25_in_rule__Constraint__Group_7__51445); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:753:1: rule__Model__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:757:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:758:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:758:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:759:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__NameAssignment_01492); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:768:1: rule__Model__DescriptionAssignment_1 : ( RULE_PLAIN_STRING ) ;
    public final void rule__Model__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:772:1: ( ( RULE_PLAIN_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:773:1: ( RULE_PLAIN_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:773:1: ( RULE_PLAIN_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:774:1: RULE_PLAIN_STRING
            {
             before(grammarAccess.getModelAccess().getDescriptionPLAIN_STRINGTerminalRuleCall_1_0()); 
            match(input,RULE_PLAIN_STRING,FOLLOW_RULE_PLAIN_STRING_in_rule__Model__DescriptionAssignment_11523); 
             after(grammarAccess.getModelAccess().getDescriptionPLAIN_STRINGTerminalRuleCall_1_0()); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:783:1: rule__Model__TestsAssignment_2 : ( ruleTests ) ;
    public final void rule__Model__TestsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:787:1: ( ( ruleTests ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:788:1: ( ruleTests )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:788:1: ( ruleTests )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:789:1: ruleTests
            {
             before(grammarAccess.getModelAccess().getTestsTestsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTests_in_rule__Model__TestsAssignment_21554);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:798:1: rule__Model__ContraintsAssignment_3 : ( ruleConstraint ) ;
    public final void rule__Model__ContraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:802:1: ( ( ruleConstraint ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:803:1: ( ruleConstraint )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:803:1: ( ruleConstraint )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:804:1: ruleConstraint
            {
             before(grammarAccess.getModelAccess().getContraintsConstraintParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Model__ContraintsAssignment_31585);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:813:1: rule__Tests__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Tests__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:817:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:818:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:818:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:819:1: RULE_STRING
            {
             before(grammarAccess.getTestsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Tests__ImportURIAssignment_11616); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:828:1: rule__Constraint__MeasureAssignment_0 : ( ruleMeasure ) ;
    public final void rule__Constraint__MeasureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:832:1: ( ( ruleMeasure ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:833:1: ( ruleMeasure )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:833:1: ( ruleMeasure )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:834:1: ruleMeasure
            {
             before(grammarAccess.getConstraintAccess().getMeasureMeasureEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__Constraint__MeasureAssignment_01647);
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:843:1: rule__Constraint__AgentAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Constraint__AgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:847:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:848:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:848:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:849:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getAgentSAgentCrossReference_2_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:850:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:851:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getAgentSAgentSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__AgentAssignment_21682); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:862:1: rule__Constraint__AttributeAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__Constraint__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:866:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:867:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:867:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:868:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getAttributeSAttributeCrossReference_4_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:869:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:870:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getAttributeSAttributeSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__AttributeAssignment_41721); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:881:1: rule__Constraint__QualifierAssignment_5_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Constraint__QualifierAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:885:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:886:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:886:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:887:1: ( RULE_STRING )
            {
             before(grammarAccess.getConstraintAccess().getQualifierSStateValueCrossReference_5_1_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:888:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:889:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getQualifierSStateValueSTRINGTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__QualifierAssignment_5_11760); 
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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:900:1: rule__Constraint__MinValueAssignment_7_2 : ( ( rule__Constraint__MinValueAlternatives_7_2_0 ) ) ;
    public final void rule__Constraint__MinValueAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:904:1: ( ( ( rule__Constraint__MinValueAlternatives_7_2_0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:905:1: ( ( rule__Constraint__MinValueAlternatives_7_2_0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:905:1: ( ( rule__Constraint__MinValueAlternatives_7_2_0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:906:1: ( rule__Constraint__MinValueAlternatives_7_2_0 )
            {
             before(grammarAccess.getConstraintAccess().getMinValueAlternatives_7_2_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:907:1: ( rule__Constraint__MinValueAlternatives_7_2_0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:907:2: rule__Constraint__MinValueAlternatives_7_2_0
            {
            pushFollow(FOLLOW_rule__Constraint__MinValueAlternatives_7_2_0_in_rule__Constraint__MinValueAssignment_7_21795);
            rule__Constraint__MinValueAlternatives_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMinValueAlternatives_7_2_0()); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:916:1: rule__Constraint__MaxValueAssignment_7_4 : ( ( rule__Constraint__MaxValueAlternatives_7_4_0 ) ) ;
    public final void rule__Constraint__MaxValueAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:920:1: ( ( ( rule__Constraint__MaxValueAlternatives_7_4_0 ) ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:921:1: ( ( rule__Constraint__MaxValueAlternatives_7_4_0 ) )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:921:1: ( ( rule__Constraint__MaxValueAlternatives_7_4_0 ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:922:1: ( rule__Constraint__MaxValueAlternatives_7_4_0 )
            {
             before(grammarAccess.getConstraintAccess().getMaxValueAlternatives_7_4_0()); 
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:923:1: ( rule__Constraint__MaxValueAlternatives_7_4_0 )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:923:2: rule__Constraint__MaxValueAlternatives_7_4_0
            {
            pushFollow(FOLLOW_rule__Constraint__MaxValueAlternatives_7_4_0_in_rule__Constraint__MaxValueAssignment_7_41828);
            rule__Constraint__MaxValueAlternatives_7_4_0();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMaxValueAlternatives_7_4_0()); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:932:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:936:1: ( ( RULE_INT ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:937:1: ( RULE_INT )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:937:1: ( RULE_INT )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:938:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment1861); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 

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
    // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:947:1: rule__RealValue__ValueAssignment : ( RULE_REAL ) ;
    public final void rule__RealValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:951:1: ( ( RULE_REAL ) )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:952:1: ( RULE_REAL )
            {
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:952:1: ( RULE_REAL )
            // ../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g:953:1: RULE_REAL
            {
             before(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment1892); 
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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTests_in_entryRuleTests120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTests127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tests__Group__0_in_ruleTests154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__ValueAssignment_in_ruleRealValue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Alternatives_in_ruleMeasure371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Constraint__MinValueAlternatives_7_2_0406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_rule__Constraint__MinValueAlternatives_7_2_0423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Constraint__MaxValueAlternatives_7_4_0455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_rule__Constraint__MaxValueAlternatives_7_4_0472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Measure__Alternatives505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Measure__Alternatives526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Measure__Alternatives547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Measure__Alternatives568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Measure__Alternatives589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_in_rule__Model__Group__0626 = new BitSet(new long[]{0x000000000007E022L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DescriptionAssignment_1_in_rule__Model__Group__1664 = new BitSet(new long[]{0x000000000007E002L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TestsAssignment_2_in_rule__Model__Group__2702 = new BitSet(new long[]{0x000000000003E002L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContraintsAssignment_3_in_rule__Model__Group__3740 = new BitSet(new long[]{0x000000000003E002L});
    public static final BitSet FOLLOW_18_in_rule__Tests__Group__0784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Tests__Group__1_in_rule__Tests__Group__0794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tests__ImportURIAssignment_1_in_rule__Tests__Group__1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MeasureAssignment_0_in_rule__Constraint__Group__0860 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__0869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Constraint__Group__1898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__AgentAssignment_2_in_rule__Constraint__Group__2936 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Constraint__Group__3974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__AttributeAssignment_4_in_rule__Constraint__Group__41012 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__41021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__0_in_rule__Constraint__Group__51049 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__51059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Constraint__Group__61088 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__61098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__0_in_rule__Constraint__Group__71126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Constraint__Group_5__01177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__1_in_rule__Constraint__Group_5__01187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__QualifierAssignment_5_1_in_rule__Constraint__Group_5__11215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Constraint__Group_7__01254 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__1_in_rule__Constraint__Group_7__01264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Constraint__Group_7__11293 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__2_in_rule__Constraint__Group_7__11303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MinValueAssignment_7_2_in_rule__Constraint__Group_7__21331 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__3_in_rule__Constraint__Group_7__21340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constraint__Group_7__31369 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__4_in_rule__Constraint__Group_7__31379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MaxValueAssignment_7_4_in_rule__Constraint__Group_7__41407 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group_7__5_in_rule__Constraint__Group_7__41416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constraint__Group_7__51445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__NameAssignment_01492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLAIN_STRING_in_rule__Model__DescriptionAssignment_11523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTests_in_rule__Model__TestsAssignment_21554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Model__ContraintsAssignment_31585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Tests__ImportURIAssignment_11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__Constraint__MeasureAssignment_01647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__AgentAssignment_21682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__AttributeAssignment_41721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__QualifierAssignment_5_11760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MinValueAlternatives_7_2_0_in_rule__Constraint__MinValueAssignment_7_21795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MaxValueAlternatives_7_4_0_in_rule__Constraint__MaxValueAssignment_7_41828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment1892 = new BitSet(new long[]{0x0000000000000002L});

}