lexer grammar InternalATest;
@header {
package org.eclipse.amp.amf.testing.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : 'tests' ;
T15 : 'contains' ;
T16 : '(' ;
T17 : '.' ;
T18 : '=' ;
T19 : ')' ;
T20 : '[' ;
T21 : ',' ;
T22 : ']' ;
T23 : 'Count' ;
T24 : 'Average' ;
T25 : 'Sum' ;
T26 : 'Minimum' ;
T27 : 'Maximum' ;
T28 : 'true' ;
T29 : 'false' ;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 779
RULE_INTEGER : '-'? ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 781
RULE_REAL : '-'? ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 783
RULE_DESC_STRING : '\u00AB' ('\\' ('b'|'t'|'n'|'f'|'r'|'\u00AB'|'\u00BB'|'\\')|~(('\\'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 785
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 787
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 789
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 791
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 793
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 795
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amp.amf.testing/src-gen/org/eclipse/amp/amf/testing/parser/antlr/internal/InternalATest.g" 797
RULE_ANY_OTHER : .;


