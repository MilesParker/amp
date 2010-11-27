lexer grammar InternalAPar;
@header {
package org.eclipse.amp.amf.parameters.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T14 : 'true' ;
T15 : 'false' ;
T16 : 'model' ;
T17 : 'incorporates' ;
T18 : '=' ;
T19 : '[' ;
T20 : ',' ;
T21 : ']' ;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g" 1433
RULE_INTEGER : '-'? ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g" 1435
RULE_REAL : '-'? ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g" 1437
RULE_DESC_STRING : '\u00AB' ('\\' ('b'|'t'|'n'|'f'|'r'|'\u00AB'|'\u00BB'|'\\')|~(('\\'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g" 1439
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g" 1441
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g" 1443
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g" 1445
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g" 1447
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g" 1449
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amp.amf.parameters.ui/src-gen/org/eclipse/amp/amf/parameters/ui/contentassist/antlr/internal/InternalAPar.g" 1451
RULE_ANY_OTHER : .;


