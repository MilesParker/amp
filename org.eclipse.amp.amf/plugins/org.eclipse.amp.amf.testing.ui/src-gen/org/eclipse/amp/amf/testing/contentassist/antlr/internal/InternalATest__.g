lexer grammar InternalATest;
@header {
package org.eclipse.amp.amf.testing.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'Count' ;
T14 : 'Average' ;
T15 : 'Sum' ;
T16 : 'Minimum' ;
T17 : 'Maximum' ;
T18 : 'TESTS' ;
T19 : '(' ;
T20 : ':' ;
T21 : ')' ;
T22 : '=' ;
T23 : '[' ;
T24 : ',' ;
T25 : ']' ;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g" 542
RULE_REAL : '-'? RULE_INT '.' RULE_INT;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g" 544
RULE_PLAIN_STRING : '\u00AB' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g" 546
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g" 548
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g" 550
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g" 552
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g" 554
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g" 556
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/contentassist/antlr/internal/InternalATest.g" 558
RULE_ANY_OTHER : .;


