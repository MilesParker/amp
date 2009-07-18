package org.eclipse.amp.amf.parameters.contentassist.antlr.internal; 

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
import org.eclipse.amp.amf.parameters.services.AParGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalAParParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TRUE'", "'true'", "'FALSE'", "'false'", "'model'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int RULE_WS=10;
    public static final int RULE_FLOAT=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalAParParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g"; }


     
     	private AParGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AParGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }




    // $ANTLR start entryRuleImport
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:57:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:57:17: ( ruleImport EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:58:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport62);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport69); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:65:1: ruleImport : ( ( rule__Import__Group ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:69:2: ( ( ( rule__Import__Group ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:70:1: ( ( rule__Import__Group ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:70:1: ( ( rule__Import__Group ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:71:1: ( rule__Import__Group )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:72:1: ( rule__Import__Group )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:72:2: rule__Import__Group
            {
            pushFollow(FOLLOW_rule__Import__Group_in_ruleImport96);
            rule__Import__Group();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleParameter
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:85:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:85:20: ( ruleParameter EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:86:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter123);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter130); 

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
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:93:1: ruleParameter : ( ( rule__Parameter__Group ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:97:2: ( ( ( rule__Parameter__Group ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:98:1: ( ( rule__Parameter__Group ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:98:1: ( ( rule__Parameter__Group ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:99:1: ( rule__Parameter__Group )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:100:1: ( rule__Parameter__Group )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:100:2: rule__Parameter__Group
            {
            pushFollow(FOLLOW_rule__Parameter__Group_in_ruleParameter157);
            rule__Parameter__Group();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleValue
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:111:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:111:16: ( ruleValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:112:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue182);
            ruleValue();
            _fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue189); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:119:1: ruleValue : ( ( ( ( rule__Value__ValueAlternatives_0 ) ) ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:123:2: ( ( ( ( ( rule__Value__ValueAlternatives_0 ) ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:124:1: ( ( ( ( rule__Value__ValueAlternatives_0 ) ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:124:1: ( ( ( ( rule__Value__ValueAlternatives_0 ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:125:1: ( ( ( rule__Value__ValueAlternatives_0 ) ) )
            {
             before(grammarAccess.getValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:126:1: ( ( ( rule__Value__ValueAlternatives_0 ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:127:1: ( ( rule__Value__ValueAlternatives_0 ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:127:1: ( ( rule__Value__ValueAlternatives_0 ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:128:1: ( rule__Value__ValueAlternatives_0 )
            {
             before(grammarAccess.getValueAccess().getValueAlternatives_0()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:129:1: ( rule__Value__ValueAlternatives_0 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:129:2: rule__Value__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__Value__ValueAlternatives_0_in_ruleValue223);
            rule__Value__ValueAlternatives_0();
            _fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAlternatives_0()); 

            }


            }

             after(grammarAccess.getValueAccess().getValueAssignment()); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:144:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:144:19: ( ruleIntValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:145:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue256);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue263); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:152:1: ruleIntValue : ( ( ( RULE_INT ) ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:156:2: ( ( ( ( RULE_INT ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:157:1: ( ( ( RULE_INT ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:157:1: ( ( ( RULE_INT ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:158:1: ( ( RULE_INT ) )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:159:1: ( ( RULE_INT ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:160:1: ( RULE_INT )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:160:1: ( RULE_INT )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:161:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue297); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 

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


    // $ANTLR start entryRuleFloatValue
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:176:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:176:21: ( ruleFloatValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:177:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue328);
            ruleFloatValue();
            _fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue335); 

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
    // $ANTLR end entryRuleFloatValue


    // $ANTLR start ruleFloatValue
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:184:1: ruleFloatValue : ( ( ( RULE_FLOAT ) ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:188:2: ( ( ( ( RULE_FLOAT ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:189:1: ( ( ( RULE_FLOAT ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:189:1: ( ( ( RULE_FLOAT ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:190:1: ( ( RULE_FLOAT ) )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:191:1: ( ( RULE_FLOAT ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:192:1: ( RULE_FLOAT )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:192:1: ( RULE_FLOAT )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:193:1: RULE_FLOAT
            {
             before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue369); 
             after(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 

            }


            }

             after(grammarAccess.getFloatValueAccess().getValueAssignment()); 

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
    // $ANTLR end ruleFloatValue


    // $ANTLR start entryRuleStringValue
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:208:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:208:22: ( ruleStringValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:209:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue400);
            ruleStringValue();
            _fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue407); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:216:1: ruleStringValue : ( ( ( RULE_STRING ) ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:220:2: ( ( ( ( RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:221:1: ( ( ( RULE_STRING ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:221:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:222:1: ( ( RULE_STRING ) )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:223:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:224:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:224:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:225:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue441); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:240:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:240:23: ( ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:241:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue472);
            ruleBooleanValue();
            _fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue479); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:248:1: ruleBooleanValue : ( ( ( ruleBOOLEAN ) ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:252:2: ( ( ( ( ruleBOOLEAN ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:253:1: ( ( ( ruleBOOLEAN ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:253:1: ( ( ( ruleBOOLEAN ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:254:1: ( ( ruleBOOLEAN ) )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:255:1: ( ( ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:256:1: ( ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:256:1: ( ruleBOOLEAN )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:257:1: ruleBOOLEAN
            {
             before(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanValue513);
            ruleBOOLEAN();
            _fsp--;

             after(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 

            }


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


    // $ANTLR start ruleBOOLEAN
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:275:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:279:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:280:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:280:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:281:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:282:1: ( rule__BOOLEAN__Alternatives )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:282:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN557);
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


    // $ANTLR start rule__Value__ValueAlternatives_0
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:292:1: rule__Value__ValueAlternatives_0 : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:296:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("292:1: rule__Value__ValueAlternatives_0 : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:297:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:297:1: ( ruleIntValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:298:1: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getValueIntValueParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__ValueAlternatives_0591);
                    ruleIntValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getValueIntValueParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:302:6: ( ruleFloatValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:302:6: ( ruleFloatValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:303:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueAccess().getValueFloatValueParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__Value__ValueAlternatives_0607);
                    ruleFloatValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getValueFloatValueParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:307:6: ( ruleStringValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:307:6: ( ruleStringValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:308:1: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getValueStringValueParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__ValueAlternatives_0623);
                    ruleStringValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getValueStringValueParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:312:6: ( ruleBooleanValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:312:6: ( ruleBooleanValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:313:1: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getValueBooleanValueParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__Value__ValueAlternatives_0639);
                    ruleBooleanValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getValueBooleanValueParserRuleCall_0_3()); 

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
    // $ANTLR end rule__Value__ValueAlternatives_0


    // $ANTLR start rule__BOOLEAN__Alternatives
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:322:1: rule__BOOLEAN__Alternatives : ( ( ( 'TRUE' ) ) | ( ( 'true' ) ) | ( ( 'FALSE' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:326:1: ( ( ( 'TRUE' ) ) | ( ( 'true' ) ) | ( ( 'FALSE' ) ) | ( ( 'false' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("322:1: rule__BOOLEAN__Alternatives : ( ( ( 'TRUE' ) ) | ( ( 'true' ) ) | ( ( 'FALSE' ) ) | ( ( 'false' ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:327:1: ( ( 'TRUE' ) )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:327:1: ( ( 'TRUE' ) )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:328:1: ( 'TRUE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:329:1: ( 'TRUE' )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:329:3: 'TRUE'
                    {
                    match(input,12,FOLLOW_12_in_rule__BOOLEAN__Alternatives671); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:333:6: ( ( 'true' ) )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:333:6: ( ( 'true' ) )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:334:1: ( 'true' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:335:1: ( 'true' )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:335:3: 'true'
                    {
                    match(input,13,FOLLOW_13_in_rule__BOOLEAN__Alternatives691); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:339:6: ( ( 'FALSE' ) )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:339:6: ( ( 'FALSE' ) )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:340:1: ( 'FALSE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:341:1: ( 'FALSE' )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:341:3: 'FALSE'
                    {
                    match(input,14,FOLLOW_14_in_rule__BOOLEAN__Alternatives711); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:345:6: ( ( 'false' ) )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:345:6: ( ( 'false' ) )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:346:1: ( 'false' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:347:1: ( 'false' )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:347:3: 'false'
                    {
                    match(input,15,FOLLOW_15_in_rule__BOOLEAN__Alternatives731); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_3()); 

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


    // $ANTLR start rule__Import__Group
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:358:1: rule__Import__Group : ( 'model' ) ( ( ( RULE_STRING ) ) ) ;
    public final void rule__Import__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:362:1: ( ( 'model' ) ( ( ( RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:363:1: ( 'model' ) ( ( ( RULE_STRING ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:363:1: ( 'model' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:364:1: 'model'
            {
             before(grammarAccess.getImportAccess().getModelKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Import__Group768); 
             after(grammarAccess.getImportAccess().getModelKeyword_0()); 

            }

            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:369:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:370:1: ( ( RULE_STRING ) )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:371:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:372:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:372:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:373:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__Group787); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end rule__Import__Group


    // $ANTLR start rule__Parameter__Group
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:386:1: rule__Parameter__Group : ( ( ( ( RULE_STRING ) ) ) ) ( ( ( ruleValue ) ) ) ;
    public final void rule__Parameter__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:390:1: ( ( ( ( ( RULE_STRING ) ) ) ) ( ( ( ruleValue ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:391:1: ( ( ( ( RULE_STRING ) ) ) ) ( ( ( ruleValue ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:391:1: ( ( ( ( RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:392:1: ( ( ( RULE_STRING ) ) )
            {
             before(grammarAccess.getParameterAccess().getAttributeAssignment_0()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:393:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:394:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:394:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:395:1: ( RULE_STRING )
            {
             before(grammarAccess.getParameterAccess().getAttributeSAttributeCrossReference_0_0()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:396:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:397:1: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getAttributeSAttributeSTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Parameter__Group837); 
             after(grammarAccess.getParameterAccess().getAttributeSAttributeSTRINGTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getAttributeSAttributeCrossReference_0_0()); 

            }


            }

             after(grammarAccess.getParameterAccess().getAttributeAssignment_0()); 

            }

            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:405:1: ( ( ( ruleValue ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:406:1: ( ( ruleValue ) )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_1()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:407:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:408:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:408:1: ( ruleValue )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:409:1: ruleValue
            {
             before(grammarAccess.getParameterAccess().getValueValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Parameter__Group865);
            ruleValue();
            _fsp--;

             after(grammarAccess.getParameterAccess().getValueValueParserRuleCall_1_0()); 

            }


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_1()); 

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
    // $ANTLR end rule__Parameter__Group


 

    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport62 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group_in_ruleImport96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_in_ruleParameter157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ValueAlternatives_0_in_ruleValue223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanValue513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__ValueAlternatives_0591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__Value__ValueAlternatives_0607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__ValueAlternatives_0623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Value__ValueAlternatives_0639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BOOLEAN__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BOOLEAN__Alternatives691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BOOLEAN__Alternatives711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BOOLEAN__Alternatives731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Import__Group768 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__Group787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Parameter__Group837 = new BitSet(new long[]{0x000000000000F070L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Parameter__Group865 = new BitSet(new long[]{0x0000000000000002L});

}