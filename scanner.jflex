/**************************
 Scanner
***************************/

import java_cup.runtime.*;

%%

//%class ClassName
%unicode
%cup
%line
%column

%{
	private Symbol sym(int type) {
		return new Symbol(type, yyline, yycolumn);
	}
	
	private Symbol sym(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}
	
%}

comment 	= "[[+" ~ "+]]" 
sep 		= "##"

token1 = "A_"( ({oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}) 
				| ({oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}) 
				| ({oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}{separator}{oddNumber}))
separator = "*"
oddNumber = ("-" (273 | 271 | 2[0-6][13579] | 1[0-9][13579] | [1-9][13579] | [13579]) )
			| ([13579] | [1-9][13579] | [123][0-9][13579] | 4[0-4][13579] | 45[1357])
token2   = "B_"{dateToken2}
dateToken2 = 2023"/"(09|"September")"/"(2[2-9] | 30)
			| 2023"/"(10|"October")"/"(0[1-9] | [12][0-9] | 3[01])
			| 2023"/"(11|"November")"/"(0[1-9] | [12][0-9] | 30)
			| 2023"/"(12|"December")"/"(0[1-9] | [12][0-9] | 3[01])
			| 2024"/"(01|"January")"/"(0[1-9] | [12][0-9] | 3[01])
			| 2024"/"(02|"February")"/"(0[1-7])


token3 = "C_"({hexNum}{separatorToken3}{hexNum}{separatorToken3}{hexNum}{separatorToken3}{hexNum})({separatorToken3}{hexNum}{separatorToken3}{hexNum})*
separatorToken3 = "*"|"$"|"&"
hexNum = ( [A-Fa-f0-9]{4} | [A-Fa-f0-9]{8} )




// monthDay =	((01|03|05|07|08|10|12)"/"((0[1-9])|([1-2][0-9])|(3(0|1)))) | ((04|06|09|11)"/"((0[1-9])|([1-2][0-9])| 30 )) | (02"/"((0[1-9])|([1-2][0-9])))
// dayMonth = 	(((0[1-9])|([1-2][0-9])|(3(0|1)))"/"(01|03|05|07|08|10|12)) | (((0[1-9])|([1-2][0-9])| 30 )"/"(04|06|09|11)) | (((0[1-9])|([1-2][0-9]))"/"02)
// year =	2[0-9]{3}
// date = 	{dayMonth}"/"{year}
// date 		= (2015"/"12"/"((1[2-9])|(2[0-9])|(3(0|1))))|(2016"/"((01"/"((0[1-46-9])|([1-2][0-9])|(3(0|1))))|(02"/"((0[1-9])|([1-2][0-9])))|(03"/"((0[1-9])|(1[0-3])))))

// binary 		= 	(101 | 110 | 111 | 1[1|0]{3} | 1[1|0]{4} | 1[1|0]{5} | 10(10001 | 10000 | 0[1|0]{4}))"-"? /*binary number between 101 to 1010001. Numbers are separated by the character "-"*/
// evenhex =	( "-"(5[02468AaCcEe] | [1-4][02468AaCcEe] | [02468AaCcEe]) | ([02468ACEace] | [1-9a-fA-F][02468ACEace] | [0-9aA][0-9abAB][0246]) )
// operators = (","|")"|"("|"["|"]"|"+"|"."|"/"|"*"|"-"|"="|";"|"^"|"?")
// q_string 		= 	\" ~ \"
// idCStyle 		= 	[a-zA-Z_][a-zA-Z0-9_]*
// word 			=	[a-zA-Z]+
// email 			= 	([a-zA-Z0-9_\.])+"@"([a-zA-Z])+"."([a-zA-Z])+
// file 			= 	[a-zA-Z][a-zA-Z0-9]*"."[a-zA-Z]{3}

// sign 			= 	("+"|"-")
// number 			=	[0-9]+
// nonZeroNumber 	=  	[1-9][0-9]*
uint 			=  	0 | [1-9][0-9]*
// realNumber 		=  	([0-9][0-9]*"."[0-9][0-9]) /* Double*/
// doubleExp		= 	(([0-9]+\.[0-9]*) | ([0-9]*\.[0-9]+)) (e|E('+'|'-')?[0-9]+)?

//evenNumber	= /*0 to 198*/ ([02468] | [1-9][02468] | 1[0-9][02468]) 
//oddNumber	= /*1 to 199*/ ([13579] | [1-9][13579] | 1[0-9][13579]) 

// hour 			= 	/* HH:MM:SS*/ (((0|1)[0-9])|(2[0-3]))":"([0-5][0-9])":"([0-5][0-9])
// timeAmPm    	= 	((0[0-9])|(1[0-2]))":"([0-5][0-9]) ("am"|"pm")?

// ip_num 			= 	(2(([0-4][0-9])|(5[0-5])))|(1[0-9][0-9])|([1-9][0-9])|([0-9])
// ip 				= 	{ip_num}"."{ip_num}"."{ip_num}"."{ip_num}

// ISBN = [0-9]{2}"-"[0-9]{2}"-"[0-9A-Fa-f]{5}"-"[A-Za-z0-9]

%%

// "->"    	{ return sym(sym.ARROW); }
"-"		{ return sym(sym.MINUS); }
"+"		{ return sym(sym.PLUS); }
"/"		{ return sym(sym.DIV); }
"*"		{ return sym(sym.STAR); }
"("		{ return sym(sym.OB); }
")"		{ return sym(sym.CB); }
"["		{ return sym(sym.OS); }
"]"		{ return sym(sym.CS); }
// "{"		{ return sym(sym.OC); }
// "}"		{ return sym(sym.CC); }
";"		{ return sym(sym.SC); }
","		{ return sym(sym.CM); }
// "."		{ return sym(sym.D); }
// ":"		{ return sym(sym.DD); }
// "="		{ return sym(sym.EQ); }
// "|"		{ return sym(sym.PIPE); }
// "$"		{ return sym(sym.DOLLAR); }
// "&"		{ return sym(sym.AND); }
// "!"		{ return sym(sym.NOT); }
// "=="		{ return sym(sym.DEQ); }
// " "	{ return sym(sym.); }

// "TRUE"		{return sym(sym.TRUE_WD, new String(yytext()));}
// "FALSE"      {return sym(sym.FALSE_WD, new String(yytext()));}
// "IF"         {return sym(sym.IF_WD, new String(yytext()));}
// "FI"         {return sym(sym.FI_WD, new String(yytext()));}
// "OR"         {return sym(sym.OR_WD, new String(yytext()));}
// "AND"        {return sym(sym.AND_WD, new String(yytext()));}
// "DO"         {return sym(sym.DO_WD, new String(yytext()));}
// "DONE"       {return sym(sym.DONE_WD, new String(yytext()));}
// "PRINT"      {return sym(sym.PRINT_WD, new String(yytext()));}

"INS" {return sym(sym.INS_WD, new String(yytext()));}
"CMP" {return sym(sym.CMP_WD, new String(yytext()));}
"SUM" {return sym(sym.SUM_WD, new String(yytext()));}


// {ip}		{ return sym(sym.IP, new String(yytext())); }
// {hour}	{ return sym(sym.HOUR); }
// {date}	{ return sym(sym.DATE); }
// {file}	{return sym(sym.FILE, new String(yytext()));}
{sep}	{ return sym(sym.SEP); }
{token1}	{ return sym(sym.TOKEN1); }
{token2}	{ return sym(sym.TOKEN2); }
{token3}	{ return sym(sym.TOKEN3); }
// {q_string}	{ return sym(sym.QSTRING, new String(yytext()));}
// {realNumber}	{return sym(sym.RNUMB, Double.valueOf(yytext()));}
{uint}		{return sym(sym.UINT, Integer.parseInt(yytext()));}
{comment}	{;}

\n|\r|\r\n 	{;}
[ \t]		{;}

// .				{ System.out.println("Scanner Error: " + yytext()); }
