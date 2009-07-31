lexer grammar InternalATest;
@header {
package org.eclipse.amp.amf.testing.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'TESTS' ;
T14 : '(' ;
T15 : ':' ;
T16 : ')' ;
T17 : '=' ;
T18 : '[' ;
T19 : ',' ;
T20 : ']' ;
T21 : 'Count' ;
T22 : 'Average' ;
T23 : 'Sum' ;
T24 : 'Minimum' ;
T25 : 'Maximum' ;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 523
RULE_REAL : '-'? RULE_INT ('.' RULE_INT)?;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 525
RULE_PLAIN_STRING : '\u00AB' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 527
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 529
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 531
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 533
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 535
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 537
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 539
RULE_ANY_OTHER : .;


