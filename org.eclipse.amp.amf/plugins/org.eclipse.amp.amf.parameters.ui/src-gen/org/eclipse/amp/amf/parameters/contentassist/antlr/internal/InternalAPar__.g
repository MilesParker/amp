lexer grammar InternalAPar;
@header {
package org.eclipse.amp.amf.parameters.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'true' ;
T14 : 'false' ;
T15 : 'model' ;
T16 : 'incorporates' ;
T17 : '=' ;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 531
RULE_INTEGER : '-'? ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 533
RULE_REAL : '-'? ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 535
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 537
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 539
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 541
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 543
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 545
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/contentassist/antlr/internal/InternalAPar.g" 547
RULE_ANY_OTHER : .;


