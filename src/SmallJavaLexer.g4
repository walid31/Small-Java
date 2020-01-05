lexer grammar SmallJavaLexer;

	// Whitespace 
	NEWLINE : '\n';
	WS : [\t]+ -> skip;
	
	// Keywords
	IMPORT		:	'import';
	INT_SJ		:	'int_SJ';
	FLOAT_SJ	:	'float_SJ';
	STRING_SJ	:	'string_SJ';
	SI			:	'Si';
	ALORS		:	'Alors';
	SINON		:	'Sinon';
	IN_SJ		:	'In_SJ';
	OUT_SJ		:	'Out_SJ';
	CLASS		:	'class_SJ'; 
	MAIN		:	'main_SJ';
	LIB			:	'Small_Java.lang' | 'Small_Java.io';
	MODIFICATOR :	'public' | 'protected';
	
	// Operators
	PLUS		:	'+';
	MINUS		:	'-';
	MULT		:	'*';
	DIVISION	:	'/';
	SUP			:	'>';
	INF			:	'<';
	EQUAL		:	'=';
	ASSIGN		:	':=';
	DIFF		:	'!=';
	SUPEQ		:	'>=';
	INFEQ		:	'<=';
	AND			:	'&';
	OR			:	'|';
	NEGATION	:	'!';
	LEFTPAR		:	'(';
	RIGHTPAR	:	')';
	LEFTBRACE	:	'{';
	RIGHTBRACE	:	'}';
	QUOTE		:	'"';
	COMMA		:	',';	
	SEMICOLON	:	';';
	
	// Literals
	INTLIT		:	[0]|[1-9][0-9]*;
	FLOATLIT	:	[0]|[1-9][0-9]* '.' [0-9]+;
	STRINGLIT	:	'"'	[a-zA-Z0-9]*'"';
	
	// Identifiers
	ID			:	[a-z][a-zA-Z0-9_]*;
	NAMECLASS		:	[A-Z][a-zA-Z0-9_]*;
	
	// Format
	INTFORM		:	'%d';
	FLOATFORM	:	'%f';
	STRINGFORM	:	'%s'; 
