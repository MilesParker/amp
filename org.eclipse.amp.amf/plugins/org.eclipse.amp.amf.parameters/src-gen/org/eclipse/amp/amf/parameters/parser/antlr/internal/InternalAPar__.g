lexer grammar InternalAPar;
@header {
package org.eclipse.amp.amf.parameters.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : 'model' ;
T15 : 'incorporates' ;
T16 : '=' ;
T17 : 'true' ;
T18 : 'false' ;

// $ANTLR src "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g" 611
RULE_INTEGER : '-'? ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g" 613
RULE_REAL : '-'? ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g" 615
RULE_DESC_STRING : '\u00AB' ('\\' ('b'|'t'|'n'|'f'|'r'|'\u00AB'|'\u00BB'|'\\')|~(('\\'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g" 617
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g" 619
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g" 621
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g" 623
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g" 625
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g" 627
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters/src-gen/org/eclipse/amp/amf/parameters/parser/antlr/internal/InternalAPar.g" 629
RULE_ANY_OTHER : .;


