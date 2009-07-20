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




    // $ANTLR start entryRuleModel
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:55:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:55:16: ( ruleModel EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:56:1: ruleModel EOF
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:63:1: ruleModel : ( ( rule__Model__Group ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:67:2: ( ( ( rule__Model__Group ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:68:1: ( ( rule__Model__Group ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:68:1: ( ( rule__Model__Group ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:69:1: ( rule__Model__Group )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:70:1: ( rule__Model__Group )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:70:2: rule__Model__Group
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


    // $ANTLR start entryRuleImport
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:81:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:81:17: ( ruleImport EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:82:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport119);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport126); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:89:1: ruleImport : ( ( rule__Import__Group ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:93:2: ( ( ( rule__Import__Group ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:94:1: ( ( rule__Import__Group ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:94:1: ( ( rule__Import__Group ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:95:1: ( rule__Import__Group )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:96:1: ( rule__Import__Group )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:96:2: rule__Import__Group
            {
            pushFollow(FOLLOW_rule__Import__Group_in_ruleImport153);
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:109:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:109:20: ( ruleParameter EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:110:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter180);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter187); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:117:1: ruleParameter : ( ( rule__Parameter__Group ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:121:2: ( ( ( rule__Parameter__Group ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:122:1: ( ( rule__Parameter__Group ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:122:1: ( ( rule__Parameter__Group ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:123:1: ( rule__Parameter__Group )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:124:1: ( rule__Parameter__Group )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:124:2: rule__Parameter__Group
            {
            pushFollow(FOLLOW_rule__Parameter__Group_in_ruleParameter214);
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:135:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:135:16: ( ruleValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:136:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue239);
            ruleValue();
            _fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue246); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:143:1: ruleValue : ( ( ( ( rule__Value__ValueAlternatives_0 ) ) ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:147:2: ( ( ( ( ( rule__Value__ValueAlternatives_0 ) ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:148:1: ( ( ( ( rule__Value__ValueAlternatives_0 ) ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:148:1: ( ( ( ( rule__Value__ValueAlternatives_0 ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:149:1: ( ( ( rule__Value__ValueAlternatives_0 ) ) )
            {
             before(grammarAccess.getValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:150:1: ( ( ( rule__Value__ValueAlternatives_0 ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:151:1: ( ( rule__Value__ValueAlternatives_0 ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:151:1: ( ( rule__Value__ValueAlternatives_0 ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:152:1: ( rule__Value__ValueAlternatives_0 )
            {
             before(grammarAccess.getValueAccess().getValueAlternatives_0()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:153:1: ( rule__Value__ValueAlternatives_0 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:153:2: rule__Value__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__Value__ValueAlternatives_0_in_ruleValue280);
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:168:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:168:19: ( ruleIntValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:169:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue313);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue320); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:176:1: ruleIntValue : ( ( ( RULE_INT ) ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:180:2: ( ( ( ( RULE_INT ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:181:1: ( ( ( RULE_INT ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:181:1: ( ( ( RULE_INT ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:182:1: ( ( RULE_INT ) )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:183:1: ( ( RULE_INT ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:184:1: ( RULE_INT )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:184:1: ( RULE_INT )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:185:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue354); 
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:200:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:200:21: ( ruleFloatValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:201:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue385);
            ruleFloatValue();
            _fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue392); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:208:1: ruleFloatValue : ( ( ( RULE_FLOAT ) ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:212:2: ( ( ( ( RULE_FLOAT ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:213:1: ( ( ( RULE_FLOAT ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:213:1: ( ( ( RULE_FLOAT ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:214:1: ( ( RULE_FLOAT ) )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:215:1: ( ( RULE_FLOAT ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:216:1: ( RULE_FLOAT )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:216:1: ( RULE_FLOAT )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:217:1: RULE_FLOAT
            {
             before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue426); 
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:232:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:232:22: ( ruleStringValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:233:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue457);
            ruleStringValue();
            _fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue464); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:240:1: ruleStringValue : ( ( ( RULE_STRING ) ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:244:2: ( ( ( ( RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:245:1: ( ( ( RULE_STRING ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:245:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:246:1: ( ( RULE_STRING ) )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:247:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:248:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:248:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:249:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue498); 
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:264:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:264:23: ( ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:265:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue529);
            ruleBooleanValue();
            _fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue536); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:272:1: ruleBooleanValue : ( ( ( ruleBOOLEAN ) ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:276:2: ( ( ( ( ruleBOOLEAN ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:277:1: ( ( ( ruleBOOLEAN ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:277:1: ( ( ( ruleBOOLEAN ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:278:1: ( ( ruleBOOLEAN ) )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:279:1: ( ( ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:280:1: ( ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:280:1: ( ruleBOOLEAN )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:281:1: ruleBOOLEAN
            {
             before(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanValue570);
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:297:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:301:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:302:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:302:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:303:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:304:1: ( rule__BOOLEAN__Alternatives )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:304:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN612);
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:314:1: rule__Value__ValueAlternatives_0 : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:318:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) )
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
                    new NoViableAltException("314:1: rule__Value__ValueAlternatives_0 : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:319:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:319:1: ( ruleIntValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:320:1: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getValueIntValueParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__ValueAlternatives_0646);
                    ruleIntValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getValueIntValueParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:324:6: ( ruleFloatValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:324:6: ( ruleFloatValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:325:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueAccess().getValueFloatValueParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__Value__ValueAlternatives_0662);
                    ruleFloatValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getValueFloatValueParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:329:6: ( ruleStringValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:329:6: ( ruleStringValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:330:1: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getValueStringValueParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__ValueAlternatives_0678);
                    ruleStringValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getValueStringValueParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:334:6: ( ruleBooleanValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:334:6: ( ruleBooleanValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:335:1: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getValueBooleanValueParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__Value__ValueAlternatives_0694);
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:344:1: rule__BOOLEAN__Alternatives : ( ( ( 'TRUE' ) ) | ( ( 'true' ) ) | ( ( 'FALSE' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:348:1: ( ( ( 'TRUE' ) ) | ( ( 'true' ) ) | ( ( 'FALSE' ) ) | ( ( 'false' ) ) )
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
                    new NoViableAltException("344:1: rule__BOOLEAN__Alternatives : ( ( ( 'TRUE' ) ) | ( ( 'true' ) ) | ( ( 'FALSE' ) ) | ( ( 'false' ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:349:1: ( ( 'TRUE' ) )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:349:1: ( ( 'TRUE' ) )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:350:1: ( 'TRUE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:351:1: ( 'TRUE' )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:351:3: 'TRUE'
                    {
                    match(input,12,FOLLOW_12_in_rule__BOOLEAN__Alternatives726); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:355:6: ( ( 'true' ) )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:355:6: ( ( 'true' ) )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:356:1: ( 'true' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:357:1: ( 'true' )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:357:3: 'true'
                    {
                    match(input,13,FOLLOW_13_in_rule__BOOLEAN__Alternatives746); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:361:6: ( ( 'FALSE' ) )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:361:6: ( ( 'FALSE' ) )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:362:1: ( 'FALSE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:363:1: ( 'FALSE' )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:363:3: 'FALSE'
                    {
                    match(input,14,FOLLOW_14_in_rule__BOOLEAN__Alternatives766); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:367:6: ( ( 'false' ) )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:367:6: ( ( 'false' ) )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:368:1: ( 'false' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:369:1: ( 'false' )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:369:3: 'false'
                    {
                    match(input,15,FOLLOW_15_in_rule__BOOLEAN__Alternatives786); 

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


    // $ANTLR start rule__Model__Group
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:379:1: rule__Model__Group : ( ( ( ruleImport ) ) ) ( ( ( ruleImport ) )* ) ( ( ( ruleParameter ) )* ) ;
    public final void rule__Model__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:383:1: ( ( ( ( ruleImport ) ) ) ( ( ( ruleImport ) )* ) ( ( ( ruleParameter ) )* ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:384:1: ( ( ( ruleImport ) ) ) ( ( ( ruleImport ) )* ) ( ( ( ruleParameter ) )* )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:384:1: ( ( ( ruleImport ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:385:1: ( ( ruleImport ) )
            {
             before(grammarAccess.getModelAccess().getModelAssignment_0()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:386:1: ( ( ruleImport ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:387:1: ( ruleImport )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:387:1: ( ruleImport )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:388:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getModelImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__Group828);
            ruleImport();
            _fsp--;

             after(grammarAccess.getModelAccess().getModelImportParserRuleCall_0_0()); 

            }


            }

             after(grammarAccess.getModelAccess().getModelAssignment_0()); 

            }

            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:394:1: ( ( ( ruleImport ) )* )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:395:1: ( ( ruleImport ) )*
            {
             before(grammarAccess.getModelAccess().getIncorporatesAssignment_1()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:396:1: ( ( ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:397:1: ( ruleImport )
            	    {
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:397:1: ( ruleImport )
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:398:1: ruleImport
            	    {
            	     before(grammarAccess.getModelAccess().getIncorporatesImportParserRuleCall_1_0()); 
            	    pushFollow(FOLLOW_ruleImport_in_rule__Model__Group852);
            	    ruleImport();
            	    _fsp--;

            	     after(grammarAccess.getModelAccess().getIncorporatesImportParserRuleCall_1_0()); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getIncorporatesAssignment_1()); 

            }

            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:404:1: ( ( ( ruleParameter ) )* )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:405:1: ( ( ruleParameter ) )*
            {
             before(grammarAccess.getModelAccess().getParametersAssignment_2()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:406:1: ( ( ruleParameter ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:407:1: ( ruleParameter )
            	    {
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:407:1: ( ruleParameter )
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:408:1: ruleParameter
            	    {
            	     before(grammarAccess.getModelAccess().getParametersParameterParserRuleCall_2_0()); 
            	    pushFollow(FOLLOW_ruleParameter_in_rule__Model__Group877);
            	    ruleParameter();
            	    _fsp--;

            	     after(grammarAccess.getModelAccess().getParametersParameterParserRuleCall_2_0()); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getParametersAssignment_2()); 

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


    // $ANTLR start rule__Import__Group
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:420:1: rule__Import__Group : ( 'model' ) ( ( ( RULE_STRING ) ) ) ;
    public final void rule__Import__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:424:1: ( ( 'model' ) ( ( ( RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:425:1: ( 'model' ) ( ( ( RULE_STRING ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:425:1: ( 'model' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:426:1: 'model'
            {
             before(grammarAccess.getImportAccess().getModelKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Import__Group917); 
             after(grammarAccess.getImportAccess().getModelKeyword_0()); 

            }

            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:431:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:432:1: ( ( RULE_STRING ) )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:433:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:434:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:434:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:435:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__Group936); 
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:448:1: rule__Parameter__Group : ( ( ( ( RULE_STRING ) ) ) ) ( ( ( ruleValue ) ) ) ;
    public final void rule__Parameter__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:452:1: ( ( ( ( ( RULE_STRING ) ) ) ) ( ( ( ruleValue ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:453:1: ( ( ( ( RULE_STRING ) ) ) ) ( ( ( ruleValue ) ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:453:1: ( ( ( ( RULE_STRING ) ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:454:1: ( ( ( RULE_STRING ) ) )
            {
             before(grammarAccess.getParameterAccess().getAttributeAssignment_0()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:455:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:456:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:456:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:457:1: ( RULE_STRING )
            {
             before(grammarAccess.getParameterAccess().getAttributeSAttributeCrossReference_0_0()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:458:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:459:1: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getAttributeSAttributeSTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Parameter__Group986); 
             after(grammarAccess.getParameterAccess().getAttributeSAttributeSTRINGTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getAttributeSAttributeCrossReference_0_0()); 

            }


            }

             after(grammarAccess.getParameterAccess().getAttributeAssignment_0()); 

            }

            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:467:1: ( ( ( ruleValue ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:468:1: ( ( ruleValue ) )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_1()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:469:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:470:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:470:1: ( ruleValue )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g:471:1: ruleValue
            {
             before(grammarAccess.getParameterAccess().getValueValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Parameter__Group1014);
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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group_in_ruleImport153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_in_ruleParameter214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ValueAlternatives_0_in_ruleValue280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanValue570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__ValueAlternatives_0646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__Value__ValueAlternatives_0662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__ValueAlternatives_0678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Value__ValueAlternatives_0694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BOOLEAN__Alternatives726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BOOLEAN__Alternatives746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BOOLEAN__Alternatives766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BOOLEAN__Alternatives786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__Group828 = new BitSet(new long[]{0x0000000000010042L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__Group852 = new BitSet(new long[]{0x0000000000010042L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Model__Group877 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16_in_rule__Import__Group917 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__Group936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Parameter__Group986 = new BitSet(new long[]{0x000000000000F070L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Parameter__Group1014 = new BitSet(new long[]{0x0000000000000002L});

}