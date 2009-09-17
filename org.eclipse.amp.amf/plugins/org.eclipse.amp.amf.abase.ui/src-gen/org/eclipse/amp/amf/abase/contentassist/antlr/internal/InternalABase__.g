lexer grammar InternalABase;
@header {
package org.eclipse.amp.amf.abase.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T14 : 'true' ;
T15 : 'false' ;

// $ANTLR src "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/contentassist/antlr/internal/InternalABase.g" 335
RULE_INTEGER : '-'? ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/contentassist/antlr/internal/InternalABase.g" 337
RULE_REAL : '-'? ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/contentassist/antlr/internal/InternalABase.g" 339
RULE_DESC_STRING : '\u00AB' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/contentassist/antlr/internal/InternalABase.g" 341
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/contentassist/antlr/internal/InternalABase.g" 343
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/contentassist/antlr/internal/InternalABase.g" 345
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/contentassist/antlr/internal/InternalABase.g" 347
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/contentassist/antlr/internal/InternalABase.g" 349
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/contentassist/antlr/internal/InternalABase.g" 351
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amp.amf.abase.ui/src-gen/org/eclipse/amp/amf/abase/contentassist/antlr/internal/InternalABase.g" 353
RULE_ANY_OTHER : .;


