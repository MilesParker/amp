lexer grammar InternalATest;
@header {
package org.eclipse.amp.amf.testing.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T14 : 'Count' ;
T15 : 'Average' ;
T16 : 'Sum' ;
T17 : 'Minimum' ;
T18 : 'Maximum' ;
T19 : 'true' ;
T20 : 'false' ;
T21 : 'tests' ;
T22 : 'contains' ;
T23 : '(' ;
T24 : '.' ;
T25 : ')' ;
T26 : '=' ;
T27 : '[' ;
T28 : ',' ;
T29 : ']' ;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g" 1542
RULE_INTEGER : '-'? ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g" 1544
RULE_REAL : '-'? ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g" 1546
RULE_DESC_STRING : '\u00AB' ('\\' ('b'|'t'|'n'|'f'|'r'|'\u00AB'|'\u00BB'|'\\')|~(('\\'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g" 1548
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g" 1550
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g" 1552
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g" 1554
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g" 1556
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g" 1558
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amp.amf.testing.ui/src-gen/org/eclipse/amp/amf/testing/ui/contentassist/antlr/internal/InternalATest.g" 1560
RULE_ANY_OTHER : .;


