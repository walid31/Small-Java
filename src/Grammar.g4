grammar Grammar;
	
	sjFile			:	lines=line+;
	
	line			:	program (NEWLINE | EOF);
	
	program			:	libraries 
						signature LEFTBRACE 
						varDeclaration
						MAIN LEFTBRACE
						instruction
						RIGHTBRACE
						RIGHTBRACE; 
					
	libraries		:	IMPORT LIB SEMICOLON libraries
					|	IMPORT LIB SEMICOLON;
	
	signature		:	MODIFICATOR CLASS NAMECLASS;
	
	varDeclaration	:	type SEMICOLON
					|	type assignment;

		type		:	INT_SJ
					|	FLOAT_SJ
					|	STRING_SJ;
	
	assignment		:	ID ASSIGN expression SEMICOLON;
	
	expression		:	value 
					|	value operator=(DIVISION|MULT) value
					|	value operator=(PLUS|MINUS)	value;
					
	
	value			:	INTLIT
					|	FLOATLIT
					|	STRINGLIT
					|	ID;
					
	instruction		:	inst
					|	inst instruction;
					
					
	inst			:	assignment
					|	condition
					|	read
					|	write;
					
	condition		:	si
					|   si_sinon;
					
	si				:	SI LEFTPAR cond RIGHTPAR LEFTBRACE
						expression SEMICOLON
						RIGHTBRACE;
						
	si_sinon		:  	SI LEFTPAR cond RIGHTPAR LEFTBRACE
						expression
						RIGHTBRACE
						SINON LEFTBRACE expression SEMICOLON RIGHTBRACE SEMICOLON;
						
	cond			:	comparaison
					|	value logic_operator value
					|	comparaison logic_operator comparaison
					|	NEGATION value
					|	NEGATION comparaison;
					
	logic_operator	:	AND
					|	OR;
						
	comparaison		:	value comp_operator value
					|	value comp_operator comparaison;
	
	comp_operator	:	SUP
					|	INF
					|	EQUAL
					|	DIFF
					|	SUPEQ
					|	INFEQ;
					
	read			:	IN_SJ LEFTPAR QUOTE format QUOTE COMMA ID RIGHTPAR SEMICOLON;
	
	format			:	INTFORM
					|	FLOATFORM
					|	STRINGFORM; 
					
	write			:	OUT_SJ LEFTPAR QUOTE string QUOTE COMMA ID RIGHTPAR SEMICOLON;
	
	string			:	STRINGLIT format STRINGLIT 
					|	format STRINGLIT
					|	STRINGLIT format;  
					
	

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
	
	
	
	

