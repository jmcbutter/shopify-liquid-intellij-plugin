package com.uncivildev.shopifyliquid.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidTypes;
import com.intellij.psi.TokenType;

%%

%class ShopifyLiquidLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%state IN_TAG
%state IN_OUTPUT

WHITE_SPACE=[ \n\r\t\f]+
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_-]*
PROPERTY=(\.{IDENTIFIER}|\['{IDENTIFIER}'\]|\[\"{IDENTIFIER}\"\])
NUMBER=[0-9]+(\.[0-9]+)?
STRING_LITERAL=(\"(\\\"|[^\"])*\"|'(\\'|[^'])*\')


%%

<YYINITIAL> {
  "{%-"                     { yybegin(IN_TAG); return ShopifyLiquidTypes.LIQUID_TAG_START_STRIP; }
  "{%"                      { yybegin(IN_TAG); return ShopifyLiquidTypes.LIQUID_TAG_START; }
  "{{-"                     { yybegin(IN_OUTPUT); return ShopifyLiquidTypes.LIQUID_OUTPUT_START_STRIP; }
  "{{"                      { yybegin(IN_OUTPUT); return ShopifyLiquidTypes.LIQUID_OUTPUT_START; }
  [^\{]+                    { return ShopifyLiquidTypes.TEMPLATE_TEXT; }
  "{"                       { return ShopifyLiquidTypes.TEMPLATE_TEXT; }
}

<IN_TAG, IN_OUTPUT> {
  {WHITE_SPACE}             { return TokenType.WHITE_SPACE; }

  // Keywords / Tags
  "assign"                  { return ShopifyLiquidTypes.ASSIGN; }
  "break"                   { return ShopifyLiquidTypes.BREAK; }
  "capture"                 { return ShopifyLiquidTypes.CAPTURE; }
  "endcapture"              { return ShopifyLiquidTypes.ENDCAPTURE; }
  "case"                    { return ShopifyLiquidTypes.CASE; }
  "endcase"                 { return ShopifyLiquidTypes.ENDCASE; }
  "comment"                 { return ShopifyLiquidTypes.COMMENT; }
  "endcomment"              { return ShopifyLiquidTypes.ENDCOMMENT; }
  "continue"                { return ShopifyLiquidTypes.CONTINUE; }
  "cycle"                   { return ShopifyLiquidTypes.CYCLE; }
  "decrement"               { return ShopifyLiquidTypes.DECREMENT; }
  "echo"                    { return ShopifyLiquidTypes.ECHO; }
  "else"                    { return ShopifyLiquidTypes.ELSE; }
  "elsif"                   { return ShopifyLiquidTypes.ELSIF; }
  "for"                     { return ShopifyLiquidTypes.FOR; }
  "endfor"                  { return ShopifyLiquidTypes.ENDFOR; }
  "form"                    { return ShopifyLiquidTypes.FORM; }
  "endform"                 { return ShopifyLiquidTypes.ENDFORM; }
  "if"                      { return ShopifyLiquidTypes.IF; }
  "endif"                   { return ShopifyLiquidTypes.ENDIF; }
  "ifchanged"               { return ShopifyLiquidTypes.IFCHANGED; }
  "increment"               { return ShopifyLiquidTypes.INCREMENT; }
  "javascript"              { return ShopifyLiquidTypes.JAVASCRIPT; }
  "endjavascript"           { return ShopifyLiquidTypes.ENDJAVASCRIPT; }
  "layout"                  { return ShopifyLiquidTypes.LAYOUT; }
  "liquid"                  { return ShopifyLiquidTypes.LIQUID; }
  "paginate"                { return ShopifyLiquidTypes.PAGINATE; }
  "endpaginate"             { return ShopifyLiquidTypes.ENDPAGINATE; }
  "raw"                     { return ShopifyLiquidTypes.RAW; }
  "endraw"                  { return ShopifyLiquidTypes.ENDRAW; }
  "render"                  { return ShopifyLiquidTypes.RENDER; }
  "schema"                  { return ShopifyLiquidTypes.SCHEMA; }
  "endschema"               { return ShopifyLiquidTypes.ENDSCHEMA; }
  "section"                 { return ShopifyLiquidTypes.SECTION; }
  "sections"                { return ShopifyLiquidTypes.SECTIONS; }
  "style"                   { return ShopifyLiquidTypes.STYLE; }
  "endstyle"                { return ShopifyLiquidTypes.ENDSTYLE; }
  "stylesheet"              { return ShopifyLiquidTypes.STYLESHEET; }
  "tablerow"                { return ShopifyLiquidTypes.TABLEROW; }
  "endtablerow"             { return ShopifyLiquidTypes.ENDTABLEROW; }
  "unless"                  { return ShopifyLiquidTypes.UNLESS; }
  "endunless"               { return ShopifyLiquidTypes.ENDUNLESS; }
  "when"                    { return ShopifyLiquidTypes.WHEN; }

  // Operators & Other keywords
  "="                       { return ShopifyLiquidTypes.SET; }
  "=="                      { return ShopifyLiquidTypes.EQ; }
  "!="                      { return ShopifyLiquidTypes.NE; }
  ">="                      { return ShopifyLiquidTypes.GE; }
  "<="                      { return ShopifyLiquidTypes.LE; }
  ">"                       { return ShopifyLiquidTypes.GT; }
  "<"                       { return ShopifyLiquidTypes.LT; }
  "or"                      { return ShopifyLiquidTypes.OR; }
  "and"                     { return ShopifyLiquidTypes.AND; }
  "contains"                { return ShopifyLiquidTypes.CONTAINS; }
  "in"                      { return ShopifyLiquidTypes.IN; }
  "by"                      { return ShopifyLiquidTypes.BY; }
  "with"                    { return ShopifyLiquidTypes.WITH; }
  "as"                      { return ShopifyLiquidTypes.AS; }
  "reversed"                { return ShopifyLiquidTypes.REVERSED; }
  "offset"                  { return ShopifyLiquidTypes.OFFSET; }
  "limit"                   { return ShopifyLiquidTypes.LIMIT; }
  "cols"                    { return ShopifyLiquidTypes.COLS; }

  // Literals
  "false"                   { return ShopifyLiquidTypes.FALSE; }
  "true"                    { return ShopifyLiquidTypes.TRUE; }
  "nil"                     { return ShopifyLiquidTypes.NIL; }
  "null"                    { return ShopifyLiquidTypes.NIL; }
  "blank"                   { return ShopifyLiquidTypes.BLANK; }
  "empty"                   { return ShopifyLiquidTypes.EMPTY; }

  {NUMBER}                  { return ShopifyLiquidTypes.NUMBER; }
  {STRING_LITERAL}          { return ShopifyLiquidTypes.STRING_LITERAL; }
  {IDENTIFIER}              { return ShopifyLiquidTypes.IDENTIFIER; }

  "."                       { return ShopifyLiquidTypes.DOT; }
  ","                       { return ShopifyLiquidTypes.COMMA; }
  ":"                       { return ShopifyLiquidTypes.COLON; }
  "|"                       { return ShopifyLiquidTypes.PIPE; }
  "("                       { return ShopifyLiquidTypes.LPAREN; }
  ")"                       { return ShopifyLiquidTypes.RPAREN; }
  "["                       { return ShopifyLiquidTypes.LBRACKET; }
  "]"                       { return ShopifyLiquidTypes.RBRACKET; }
  ".."                      { return ShopifyLiquidTypes.RANGE; }
  "#"                       { return ShopifyLiquidTypes.HASH; }
}

<IN_TAG> {
  "-%}"                     { yybegin(YYINITIAL); return ShopifyLiquidTypes.LIQUID_TAG_END_STRIP; }
  "%}"                      { yybegin(YYINITIAL); return ShopifyLiquidTypes.LIQUID_TAG_END; }
}

<IN_OUTPUT> {
  "-}}"                     { yybegin(YYINITIAL); return ShopifyLiquidTypes.LIQUID_OUTPUT_END_STRIP; }
  "}}"                      { yybegin(YYINITIAL); return ShopifyLiquidTypes.LIQUID_OUTPUT_END; }
}

[^]                         { return TokenType.BAD_CHARACTER; }




