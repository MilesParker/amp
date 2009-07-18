lexer grammar InternalAPar;
@header {
package org.eclipse.amp.amf.parameters.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'TRUE' ;
T13 : 'true' ;
T14 : 'FALSE' ;
T15 : 'false' ;
T16 : 'model' ;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 422
RULE_FLOAT : RULE_INT '.' RULE_INT;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 424
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 426
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 428
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 430
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 432
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 434
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 436
RULE_ANY_OTHER : .;


