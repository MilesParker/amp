lexer grammar InternalABase;
@header {
package org.eclipse.amp.amf.abase.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : 'true' ;
T15 : 'false' ;

// $ANTLR src "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g" 318
RULE_INTEGER : '-'? ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g" 320
RULE_REAL : '-'? ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g" 322
RULE_DESC_STRING : '\u00AB' ('\\' ('b'|'t'|'n'|'f'|'r'|'\u00AB'|'\u00BB'|'\\')|~(('\\'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g" 324
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g" 326
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g" 328
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g" 330
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g" 332
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g" 334
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amp.amf.abase/src-gen/org/eclipse/amp/amf/abase/parser/antlr/internal/InternalABase.g" 336
RULE_ANY_OTHER : .;


