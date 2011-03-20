package org.eclipse.amp.amf.abase.ui.contentassist.antlr.internal; 

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
import org.eclipse.amp.amf.abase.services.ABaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalABaseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER", "RULE_REAL", "RULE_STRING", "RULE_DESC_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'"
    };
    public static final int RULE_ID=8;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__14=14;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=5;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_DESC_STRING=7;
    public static final int EOF=-1;
    public static final int RULE_INTEGER=4;
    public static final int RULE_ML_COMMENT=10;

    // delegates
    // delegators


        public InternalABaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalABaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalABaseParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g"; }


     
     	private ABaseGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ABaseGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleValue"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:61:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:62:1: ( ruleValue EOF )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:63:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue61);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue68); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:70:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:74:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:75:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:75:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:76:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:77:1: ( rule__Value__Alternatives )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:77:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue94);
            rule__Value__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntValue"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:89:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:90:1: ( ruleIntValue EOF )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:91:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue121);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue128); 

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:98:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:102:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:103:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:103:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:104:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:105:1: ( rule__IntValue__ValueAssignment )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:105:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue154);
            rule__IntValue__ValueAssignment();

            state._fsp--;


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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleRealValue"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:117:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:118:1: ( ruleRealValue EOF )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:119:1: ruleRealValue EOF
            {
             before(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue181);
            ruleRealValue();

            state._fsp--;

             after(grammarAccess.getRealValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue188); 

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
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:126:1: ruleRealValue : ( ( rule__RealValue__ValueAssignment ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:130:2: ( ( ( rule__RealValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:131:1: ( ( rule__RealValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:131:1: ( ( rule__RealValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:132:1: ( rule__RealValue__ValueAssignment )
            {
             before(grammarAccess.getRealValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:133:1: ( rule__RealValue__ValueAssignment )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:133:2: rule__RealValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__RealValue__ValueAssignment_in_ruleRealValue214);
            rule__RealValue__ValueAssignment();

            state._fsp--;


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
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleStringValue"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:145:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:146:1: ( ruleStringValue EOF )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:147:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue241);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue248); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:154:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:158:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:159:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:159:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:160:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:161:1: ( rule__StringValue__ValueAssignment )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:161:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue274);
            rule__StringValue__ValueAssignment();

            state._fsp--;


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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:173:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:174:1: ( ruleBooleanValue EOF )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:175:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue301);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue308); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:182:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:186:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:187:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:187:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:188:1: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:189:1: ( rule__BooleanValue__ValueAssignment )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:189:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue334);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "ruleBOOLEAN"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:202:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:206:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:207:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:207:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:208:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:209:1: ( rule__BOOLEAN__Alternatives )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:209:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN371);
            rule__BOOLEAN__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:220:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:224:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleRealValue ) | ( ruleBooleanValue ) )
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
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:225:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:225:1: ( ruleIntValue )
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:226:1: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives406);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:231:6: ( ruleStringValue )
                    {
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:231:6: ( ruleStringValue )
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:232:1: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives423);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:237:6: ( ruleRealValue )
                    {
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:237:6: ( ruleRealValue )
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:238:1: ruleRealValue
                    {
                     before(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRealValue_in_rule__Value__Alternatives440);
                    ruleRealValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:243:6: ( ruleBooleanValue )
                    {
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:243:6: ( ruleBooleanValue )
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:244:1: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives457);
                    ruleBooleanValue();

                    state._fsp--;

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:254:1: rule__BOOLEAN__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:258:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
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
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:259:1: ( ( 'true' ) )
                    {
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:259:1: ( ( 'true' ) )
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:260:1: ( 'true' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:261:1: ( 'true' )
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:261:3: 'true'
                    {
                    match(input,14,FOLLOW_14_in_rule__BOOLEAN__Alternatives490); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:266:6: ( ( 'false' ) )
                    {
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:266:6: ( ( 'false' ) )
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:267:1: ( 'false' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:268:1: ( 'false' )
                    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:268:3: 'false'
                    {
                    match(input,15,FOLLOW_15_in_rule__BOOLEAN__Alternatives511); 

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
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:281:1: rule__IntValue__ValueAssignment : ( RULE_INTEGER ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:285:1: ( ( RULE_INTEGER ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:286:1: ( RULE_INTEGER )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:286:1: ( RULE_INTEGER )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:287:1: RULE_INTEGER
            {
             before(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__IntValue__ValueAssignment549); 
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
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__RealValue__ValueAssignment"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:296:1: rule__RealValue__ValueAssignment : ( RULE_REAL ) ;
    public final void rule__RealValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:300:1: ( ( RULE_REAL ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:301:1: ( RULE_REAL )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:301:1: ( RULE_REAL )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:302:1: RULE_REAL
            {
             before(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment580); 
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
    // $ANTLR end "rule__RealValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:311:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:315:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:316:1: ( RULE_STRING )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:316:1: ( RULE_STRING )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:317:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment611); 
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
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:326:1: rule__BooleanValue__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:330:1: ( ( ruleBOOLEAN ) )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:331:1: ( ruleBOOLEAN )
            {
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:331:1: ( ruleBOOLEAN )
            // ../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/ui/contentassist/antlr/internal/InternalABase.g:332:1: ruleBOOLEAN
            {
             before(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__BooleanValue__ValueAssignment642);
            ruleBOOLEAN();

            state._fsp--;

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
    // $ANTLR end "rule__BooleanValue__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__ValueAssignment_in_ruleRealValue214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_rule__Value__Alternatives440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BOOLEAN__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BOOLEAN__Alternatives511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__IntValue__ValueAssignment549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__RealValue__ValueAssignment580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__BooleanValue__ValueAssignment642 = new BitSet(new long[]{0x0000000000000002L});

}