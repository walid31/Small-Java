parser grammar SmallJavaParser;

	options { tokenVocab = SmallJavaLexer; }
	
	sjFile			:	lines=line+;
	
	line			:	program (NEWLINE | EOF);
	
	program			:	libraries 
						signature LEFTBRACE 
						varDeclaration
						MAIN LEFTBRACE
						instruction
						RIGHTBRACE
						RIGHTBRACE; 
					
	libraries		:	IMPORT LIB libraries;
	
	signature		:	MODIFICATOR CLASS NAMECLASS;
	
	varDeclaration	:	type ID
					|	type assignment;

		type		:	INT_SJ
					|	FLOAT_SJ
					|	STRING_SJ;
	
	assignment		:	ID ASSIGN expression;
	
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
						expression
						RIGHTBRACE;
						
	si_sinon		:  	SI LEFTPAR cond RIGHTPAR LEFTBRACE
						expression
						RIGHTBRACE
						SINON LEFTBRACE expression RIGHTBRACE;
						
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
					
	read			:	IN_SJ LEFTPAR QUOTE format QUOTE COMMA ID RIGHTPAR;
	
	format			:	INTFORM
					|	FLOATFORM
					|	STRINGFORM; 
					
	write			:	OUT_SJ LEFTPAR QUOTE string QUOTE COMMA ID RIGHTPAR;
	
	string			:	STRINGLIT format STRINGLIT 
					|	format STRINGLIT
					|	STRINGLIT format;  
					
	
	
	
	
	