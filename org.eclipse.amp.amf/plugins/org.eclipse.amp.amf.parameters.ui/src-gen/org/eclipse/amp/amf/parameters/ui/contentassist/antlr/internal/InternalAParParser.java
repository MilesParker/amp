package org.eclipse.amp.amf.parameters.ui.contentassist.antlr.internal; 

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
import org.eclipse.amp.amf.parameters.services.AParGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalAParParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INTEGER", "RULE_REAL", "RULE_DESC_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'model'", "'incorporates'", "'='"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=7;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_DESC_STRING=8;
    public static final int EOF=-1;
    public static final int RULE_INTEGER=6;
    public static final int RULE_ML_COMMENT=10;

        public InternalAParParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g"; }


     
     	private AParGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AParGrammarAccess grammarAccess) {
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:61:1: ( ruleModel EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:62:1: ruleModel EOF
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:76:1: ( rule__Model__Group__0 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:76:2: rule__Model__Group__0
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


    // $ANTLR start entryRuleImport
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:89:1: ( ruleImport EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:97:1: ruleImport : ( ( rule__Import__ImportURIAssignment ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:101:2: ( ( ( rule__Import__ImportURIAssignment ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:102:1: ( ( rule__Import__ImportURIAssignment ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:102:1: ( ( rule__Import__ImportURIAssignment ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:103:1: ( rule__Import__ImportURIAssignment )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:104:1: ( rule__Import__ImportURIAssignment )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:104:2: rule__Import__ImportURIAssignment
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_in_ruleImport154);
            rule__Import__ImportURIAssignment();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment()); 

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


    // $ANTLR start entryRuleIncorporates
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:116:1: entryRuleIncorporates : ruleIncorporates EOF ;
    public final void entryRuleIncorporates() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:117:1: ( ruleIncorporates EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:118:1: ruleIncorporates EOF
            {
             before(grammarAccess.getIncorporatesRule()); 
            pushFollow(FOLLOW_ruleIncorporates_in_entryRuleIncorporates181);
            ruleIncorporates();
            _fsp--;

             after(grammarAccess.getIncorporatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncorporates188); 

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
    // $ANTLR end entryRuleIncorporates


    // $ANTLR start ruleIncorporates
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:125:1: ruleIncorporates : ( ( rule__Incorporates__ImportURIAssignment ) ) ;
    public final void ruleIncorporates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:129:2: ( ( ( rule__Incorporates__ImportURIAssignment ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:130:1: ( ( rule__Incorporates__ImportURIAssignment ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:130:1: ( ( rule__Incorporates__ImportURIAssignment ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:131:1: ( rule__Incorporates__ImportURIAssignment )
            {
             before(grammarAccess.getIncorporatesAccess().getImportURIAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:132:1: ( rule__Incorporates__ImportURIAssignment )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:132:2: rule__Incorporates__ImportURIAssignment
            {
            pushFollow(FOLLOW_rule__Incorporates__ImportURIAssignment_in_ruleIncorporates214);
            rule__Incorporates__ImportURIAssignment();
            _fsp--;


            }

             after(grammarAccess.getIncorporatesAccess().getImportURIAssignment()); 

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
    // $ANTLR end ruleIncorporates


    // $ANTLR start entryRuleParameter
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:144:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:145:1: ( ruleParameter EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:146:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter241);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter248); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:153:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:157:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:158:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:158:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:159:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:160:1: ( rule__Parameter__Group__0 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:160:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter274);
            rule__Parameter__Group__0();
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:172:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:173:1: ( ruleValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:174:1: ruleValue EOF
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:181:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:185:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:186:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:186:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:187:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:188:1: ( rule__Value__Alternatives )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:188:2: rule__Value__Alternatives
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:200:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:201:1: ( ruleIntValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:202:1: ruleIntValue EOF
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:209:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:213:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:214:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:214:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:215:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:216:1: ( rule__IntValue__ValueAssignment )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:216:2: rule__IntValue__ValueAssignment
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:228:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:229:1: ( ruleRealValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:230:1: ruleRealValue EOF
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:237:1: ruleRealValue : ( ( rule__RealValue__ValueAssignment ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:241:2: ( ( ( rule__RealValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:242:1: ( ( rule__RealValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:242:1: ( ( rule__RealValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:243:1: ( rule__RealValue__ValueAssignment )
            {
             before(grammarAccess.getRealValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:244:1: ( rule__RealValue__ValueAssignment )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:244:2: rule__RealValue__ValueAssignment
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:256:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:257:1: ( ruleStringValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:258:1: ruleStringValue EOF
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:265:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:269:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:270:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:270:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:271:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:272:1: ( rule__StringValue__ValueAssignment )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:272:2: rule__StringValue__ValueAssignment
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:284:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:285:1: ( ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:286:1: ruleBooleanValue EOF
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:293:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:297:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:298:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:298:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:299:1: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:300:1: ( rule__BooleanValue__ValueAssignment )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:300:2: rule__BooleanValue__ValueAssignment
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


    // $ANTLR start ruleBOOLEAN
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:313:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:317:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:318:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:318:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:319:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:320:1: ( rule__BOOLEAN__Alternatives )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:320:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN611);
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:331:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:335:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) )
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
            case 14:
            case 15:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("331:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:336:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:336:1: ( ruleIntValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:337:1: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives646);
                    ruleIntValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:342:6: ( ruleStringValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:342:6: ( ruleStringValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:343:1: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives663);
                    ruleStringValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:348:6: ( ruleRealValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:348:6: ( ruleRealValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:349:1: ruleRealValue
                    {
                     before(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRealValue_in_rule__Value__Alternatives680);
                    ruleRealValue();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:354:6: ( ruleBooleanValue )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:354:6: ( ruleBooleanValue )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:355:1: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives697);
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


    // $ANTLR start rule__BOOLEAN__Alternatives
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:365:1: rule__BOOLEAN__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:369:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("365:1: rule__BOOLEAN__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:370:1: ( ( 'true' ) )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:370:1: ( ( 'true' ) )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:371:1: ( 'true' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:372:1: ( 'true' )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:372:3: 'true'
                    {
                    match(input,14,FOLLOW_14_in_rule__BOOLEAN__Alternatives730); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:377:6: ( ( 'false' ) )
                    {
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:377:6: ( ( 'false' ) )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:378:1: ( 'false' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:379:1: ( 'false' )
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:379:3: 'false'
                    {
                    match(input,15,FOLLOW_15_in_rule__BOOLEAN__Alternatives751); 

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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:391:1: rule__Model__Group__0 : ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:395:1: ( ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:396:1: ( ( rule__Model__NameAssignment_0 )? ) rule__Model__Group__1
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:396:1: ( ( rule__Model__NameAssignment_0 )? )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:397:1: ( rule__Model__NameAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:398:1: ( rule__Model__NameAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:398:2: rule__Model__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__NameAssignment_0_in_rule__Model__Group__0788);
                    rule__Model__NameAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0798);
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:409:1: rule__Model__Group__1 : ( 'model' ) rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:413:1: ( ( 'model' ) rule__Model__Group__2 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:414:1: ( 'model' ) rule__Model__Group__2
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:414:1: ( 'model' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:415:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group__1827); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1837);
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:429:1: rule__Model__Group__2 : ( ( rule__Model__ModelAssignment_2 ) ) rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:433:1: ( ( ( rule__Model__ModelAssignment_2 ) ) rule__Model__Group__3 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:434:1: ( ( rule__Model__ModelAssignment_2 ) ) rule__Model__Group__3
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:434:1: ( ( rule__Model__ModelAssignment_2 ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:435:1: ( rule__Model__ModelAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getModelAssignment_2()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:436:1: ( rule__Model__ModelAssignment_2 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:436:2: rule__Model__ModelAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__ModelAssignment_2_in_rule__Model__Group__2865);
            rule__Model__ModelAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getModelAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2874);
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:447:1: rule__Model__Group__3 : ( ( rule__Model__Group_3__0 )* ) rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:451:1: ( ( ( rule__Model__Group_3__0 )* ) rule__Model__Group__4 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:452:1: ( ( rule__Model__Group_3__0 )* ) rule__Model__Group__4
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:452:1: ( ( rule__Model__Group_3__0 )* )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:453:1: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:454:1: ( rule__Model__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:454:2: rule__Model__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3902);
            	    rule__Model__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3912);
            rule__Model__Group__4();
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
    // $ANTLR end rule__Model__Group__3


    // $ANTLR start rule__Model__Group__4
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:465:1: rule__Model__Group__4 : ( ( rule__Model__ParametersAssignment_4 )* ) ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:469:1: ( ( ( rule__Model__ParametersAssignment_4 )* ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:470:1: ( ( rule__Model__ParametersAssignment_4 )* )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:470:1: ( ( rule__Model__ParametersAssignment_4 )* )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:471:1: ( rule__Model__ParametersAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getParametersAssignment_4()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:472:1: ( rule__Model__ParametersAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:472:2: rule__Model__ParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__ParametersAssignment_4_in_rule__Model__Group__4940);
            	    rule__Model__ParametersAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getParametersAssignment_4()); 

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
    // $ANTLR end rule__Model__Group__4


    // $ANTLR start rule__Model__Group_3__0
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:492:1: rule__Model__Group_3__0 : ( 'incorporates' ) rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:496:1: ( ( 'incorporates' ) rule__Model__Group_3__1 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:497:1: ( 'incorporates' ) rule__Model__Group_3__1
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:497:1: ( 'incorporates' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:498:1: 'incorporates'
            {
             before(grammarAccess.getModelAccess().getIncorporatesKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__Model__Group_3__0986); 
             after(grammarAccess.getModelAccess().getIncorporatesKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__0996);
            rule__Model__Group_3__1();
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
    // $ANTLR end rule__Model__Group_3__0


    // $ANTLR start rule__Model__Group_3__1
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:512:1: rule__Model__Group_3__1 : ( ( rule__Model__IncorporatesAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:516:1: ( ( ( rule__Model__IncorporatesAssignment_3_1 ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:517:1: ( ( rule__Model__IncorporatesAssignment_3_1 ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:517:1: ( ( rule__Model__IncorporatesAssignment_3_1 ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:518:1: ( rule__Model__IncorporatesAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getIncorporatesAssignment_3_1()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:519:1: ( rule__Model__IncorporatesAssignment_3_1 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:519:2: rule__Model__IncorporatesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Model__IncorporatesAssignment_3_1_in_rule__Model__Group_3__11024);
            rule__Model__IncorporatesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getIncorporatesAssignment_3_1()); 

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
    // $ANTLR end rule__Model__Group_3__1


    // $ANTLR start rule__Parameter__Group__0
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:533:1: rule__Parameter__Group__0 : ( ( rule__Parameter__AttributeAssignment_0 ) ) rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:537:1: ( ( ( rule__Parameter__AttributeAssignment_0 ) ) rule__Parameter__Group__1 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:538:1: ( ( rule__Parameter__AttributeAssignment_0 ) ) rule__Parameter__Group__1
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:538:1: ( ( rule__Parameter__AttributeAssignment_0 ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:539:1: ( rule__Parameter__AttributeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getAttributeAssignment_0()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:540:1: ( rule__Parameter__AttributeAssignment_0 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:540:2: rule__Parameter__AttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__AttributeAssignment_0_in_rule__Parameter__Group__01062);
            rule__Parameter__AttributeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getAttributeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__01071);
            rule__Parameter__Group__1();
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
    // $ANTLR end rule__Parameter__Group__0


    // $ANTLR start rule__Parameter__Group__1
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:551:1: rule__Parameter__Group__1 : ( '=' ) rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:555:1: ( ( '=' ) rule__Parameter__Group__2 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:556:1: ( '=' ) rule__Parameter__Group__2
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:556:1: ( '=' )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:557:1: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Parameter__Group__11100); 
             after(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__11110);
            rule__Parameter__Group__2();
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
    // $ANTLR end rule__Parameter__Group__1


    // $ANTLR start rule__Parameter__Group__2
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:571:1: rule__Parameter__Group__2 : ( ( rule__Parameter__ValueAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:575:1: ( ( ( rule__Parameter__ValueAssignment_2 ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:576:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:576:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:577:1: ( rule__Parameter__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_2()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:578:1: ( rule__Parameter__ValueAssignment_2 )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:578:2: rule__Parameter__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__ValueAssignment_2_in_rule__Parameter__Group__21138);
            rule__Parameter__ValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_2()); 

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
    // $ANTLR end rule__Parameter__Group__2


    // $ANTLR start rule__Model__NameAssignment_0
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:595:1: rule__Model__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:599:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:600:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:600:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:601:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__NameAssignment_01179); 
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


    // $ANTLR start rule__Model__ModelAssignment_2
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:610:1: rule__Model__ModelAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:614:1: ( ( ruleImport ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:615:1: ( ruleImport )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:615:1: ( ruleImport )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:616:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getModelImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ModelAssignment_21210);
            ruleImport();
            _fsp--;

             after(grammarAccess.getModelAccess().getModelImportParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Model__ModelAssignment_2


    // $ANTLR start rule__Model__IncorporatesAssignment_3_1
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:625:1: rule__Model__IncorporatesAssignment_3_1 : ( ruleIncorporates ) ;
    public final void rule__Model__IncorporatesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:629:1: ( ( ruleIncorporates ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:630:1: ( ruleIncorporates )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:630:1: ( ruleIncorporates )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:631:1: ruleIncorporates
            {
             before(grammarAccess.getModelAccess().getIncorporatesIncorporatesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIncorporates_in_rule__Model__IncorporatesAssignment_3_11241);
            ruleIncorporates();
            _fsp--;

             after(grammarAccess.getModelAccess().getIncorporatesIncorporatesParserRuleCall_3_1_0()); 

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
    // $ANTLR end rule__Model__IncorporatesAssignment_3_1


    // $ANTLR start rule__Model__ParametersAssignment_4
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:640:1: rule__Model__ParametersAssignment_4 : ( ruleParameter ) ;
    public final void rule__Model__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:644:1: ( ( ruleParameter ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:645:1: ( ruleParameter )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:645:1: ( ruleParameter )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:646:1: ruleParameter
            {
             before(grammarAccess.getModelAccess().getParametersParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Model__ParametersAssignment_41272);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getModelAccess().getParametersParameterParserRuleCall_4_0()); 

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
    // $ANTLR end rule__Model__ParametersAssignment_4


    // $ANTLR start rule__Import__ImportURIAssignment
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:655:1: rule__Import__ImportURIAssignment : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:659:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:660:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:660:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:661:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment1303); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end rule__Import__ImportURIAssignment


    // $ANTLR start rule__Incorporates__ImportURIAssignment
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:670:1: rule__Incorporates__ImportURIAssignment : ( RULE_STRING ) ;
    public final void rule__Incorporates__ImportURIAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:674:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:675:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:675:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:676:1: RULE_STRING
            {
             before(grammarAccess.getIncorporatesAccess().getImportURISTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Incorporates__ImportURIAssignment1334); 
             after(grammarAccess.getIncorporatesAccess().getImportURISTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end rule__Incorporates__ImportURIAssignment


    // $ANTLR start rule__Parameter__AttributeAssignment_0
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:685:1: rule__Parameter__AttributeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:689:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:690:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:690:1: ( ( RULE_ID ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:691:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getAttributeSAttributeCrossReference_0_0()); 
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:692:1: ( RULE_ID )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:693:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getAttributeSAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__AttributeAssignment_01369); 
             after(grammarAccess.getParameterAccess().getAttributeSAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getAttributeSAttributeCrossReference_0_0()); 

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
    // $ANTLR end rule__Parameter__AttributeAssignment_0


    // $ANTLR start rule__Parameter__ValueAssignment_2
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:704:1: rule__Parameter__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Parameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:708:1: ( ( ruleValue ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:709:1: ( ruleValue )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:709:1: ( ruleValue )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:710:1: ruleValue
            {
             before(grammarAccess.getParameterAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Parameter__ValueAssignment_21404);
            ruleValue();
            _fsp--;

             after(grammarAccess.getParameterAccess().getValueValueParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Parameter__ValueAssignment_2


    // $ANTLR start rule__IntValue__ValueAssignment
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:719:1: rule__IntValue__ValueAssignment : ( RULE_INTEGER ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:723:1: ( ( RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:724:1: ( RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:724:1: ( RULE_INTEGER )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:725:1: RULE_INTEGER
            {
             before(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__IntValue__ValueAssignment1435); 
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:734:1: rule__RealValue__ValueAssignment : ( RULE_REAL ) ;
    public final void rule__RealValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:738:1: ( ( RULE_REAL ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:739:1: ( RULE_REAL )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:739:1: ( RULE_REAL )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:740:1: RULE_REAL
            {
             before(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment1466); 
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:749:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:753:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:754:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:754:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:755:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment1497); 
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
    // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:764:1: rule__BooleanValue__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:768:1: ( ( ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:769:1: ( ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:769:1: ( ruleBOOLEAN )
            // ../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g:770:1: ruleBOOLEAN
            {
             before(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__BooleanValue__ValueAssignment1528);
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
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncorporates_in_entryRuleIncorporates181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncorporates188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Incorporates__ImportURIAssignment_in_ruleIncorporates214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter274 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_rule__Value__Alternatives680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BOOLEAN__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BOOLEAN__Alternatives751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_in_rule__Model__Group__0788 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group__1827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ModelAssignment_2_in_rule__Model__Group__2865 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3902 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ParametersAssignment_4_in_rule__Model__Group__4940 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group_3__0986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__0996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__IncorporatesAssignment_3_1_in_rule__Model__Group_3__11024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__AttributeAssignment_0_in_rule__Parameter__Group__01062 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__01071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Parameter__Group__11100 = new BitSet(new long[]{0x000000000000C0D0L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__11110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ValueAssignment_2_in_rule__Parameter__Group__21138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__NameAssignment_01179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ModelAssignment_21210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncorporates_in_rule__Model__IncorporatesAssignment_3_11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Model__ParametersAssignment_41272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Incorporates__ImportURIAssignment1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__AttributeAssignment_01369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Parameter__ValueAssignment_21404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__IntValue__ValueAssignment1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__BooleanValue__ValueAssignment1528 = new BitSet(new long[]{0x0000000000000002L});

}