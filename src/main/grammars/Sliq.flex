package com.uncivildev.sliq.lang.core.lexer;

import andel.tokens.Token;import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.uncivildev.sliq.lang.core.psi.SliqTypes;
import com.intellij.psi.TokenType;

%%

%class SliqLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%{
  private int tagBodyState() {
      return yystate() == IN_LIQUID_HEAD ? IN_LIQUID_BODY : IN_TAG;
  }
%}

%state IN_TAG_HEAD
%state IN_TAG
%state IN_OUTPUT
%state IN_LIQUID_HEAD
%state IN_LIQUID_BODY
%state IN_TAG_FILTER
%state IN_LIQUID_FILTER
%state IN_OUTPUT_FILTER
%state IN_COMMENT
%state IN_LIQUID_COMMENT
%state IN_RAW
%state IN_LIQUID_RAW

WHITE_SPACE=[ \n\r\t\f]+
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_-]*
NUMBER=[0-9]+(\.[0-9]+)?
STRING_LITERAL=(\"(\\\"|[^\"])*\"|'(\\'|[^'])*\')

%%

<YYINITIAL> {
  // The `-` strip marker stays in the token text; we return the plain token
  // type because the grammar doesn't declare separate *_STRIP tokens.
  "{%-"                     { yybegin(IN_TAG_HEAD);   return SliqTypes.LIQUID_TAG_START; }
  "{%"                      { yybegin(IN_TAG_HEAD);   return SliqTypes.LIQUID_TAG_START; }
  "{{-"                     { yybegin(IN_OUTPUT);     return SliqTypes.LIQUID_OUTPUT_START; }
  "{{"                      { yybegin(IN_OUTPUT);     return SliqTypes.LIQUID_OUTPUT_START; }
  [^\{]+                    { return SliqTypes.TEMPLATE_TEXT; }
  "{"                       { return SliqTypes.TEMPLATE_TEXT; }
}

// --- Tag name position: keywords only fire here -----------------------------
<IN_TAG_HEAD, IN_LIQUID_HEAD> {
  {WHITE_SPACE}             { return TokenType.WHITE_SPACE; }

  "liquid"                  { yybegin(yystate() == IN_TAG_HEAD ? IN_LIQUID_HEAD : IN_LIQUID_BODY); return SliqTypes.LIQUID; }

  "assign"                  { yybegin(tagBodyState()); return SliqTypes.ASSIGN; }
  "break"                   { yybegin(tagBodyState()); return SliqTypes.BREAK; }
  "capture"                 { yybegin(tagBodyState()); return SliqTypes.CAPTURE; }
  "endcapture"              { yybegin(tagBodyState()); return SliqTypes.ENDCAPTURE; }
  "case"                    { yybegin(tagBodyState()); return SliqTypes.CASE; }
  "endcase"                 { yybegin(tagBodyState()); return SliqTypes.ENDCASE; }
  "comment"                 { yybegin(tagBodyState()); return SliqTypes.COMMENT; }
  "endcomment"              { yybegin(tagBodyState()); return SliqTypes.ENDCOMMENT; }
  "continue"                { yybegin(tagBodyState()); return SliqTypes.CONTINUE; }
  "cycle"                   { yybegin(tagBodyState()); return SliqTypes.CYCLE; }
  "decrement"               { yybegin(tagBodyState()); return SliqTypes.DECREMENT; }
  "doc"                     { yybegin(tagBodyState()); return SliqTypes.DOC; }
  "enddoc"                  { yybegin(tagBodyState()); return SliqTypes.ENDDOC; }
  "echo"                    { yybegin(tagBodyState()); return SliqTypes.ECHO; }
  "else"                    { yybegin(tagBodyState()); return SliqTypes.ELSE; }
  "elsif"                   { yybegin(tagBodyState()); return SliqTypes.ELSIF; }
  "for"                     { yybegin(tagBodyState()); return SliqTypes.FOR; }
  "endfor"                  { yybegin(tagBodyState()); return SliqTypes.ENDFOR; }
  "form"                    { yybegin(tagBodyState()); return SliqTypes.FORM; }
  "endform"                 { yybegin(tagBodyState()); return SliqTypes.ENDFORM; }
  "if"                      { yybegin(tagBodyState()); return SliqTypes.IF; }
  "endif"                   { yybegin(tagBodyState()); return SliqTypes.ENDIF; }
  "increment"               { yybegin(tagBodyState()); return SliqTypes.INCREMENT; }
  "javascript"              { yybegin(tagBodyState()); return SliqTypes.JAVASCRIPT; }
  "endjavascript"           { yybegin(tagBodyState()); return SliqTypes.ENDJAVASCRIPT; }
  "layout"                  { yybegin(tagBodyState()); return SliqTypes.LAYOUT; }
  "paginate"                { yybegin(tagBodyState()); return SliqTypes.PAGINATE; }
  "endpaginate"             { yybegin(tagBodyState()); return SliqTypes.ENDPAGINATE; }
  "raw"                     { yybegin(tagBodyState()); return SliqTypes.RAW; }
  "endraw"                  { yybegin(tagBodyState()); return SliqTypes.ENDRAW; }
  "render"                  { yybegin(tagBodyState()); return SliqTypes.RENDER; }
  "schema"                  { yybegin(tagBodyState()); return SliqTypes.SCHEMA; }
  "endschema"               { yybegin(tagBodyState()); return SliqTypes.ENDSCHEMA; }
  "section"                 { yybegin(tagBodyState()); return SliqTypes.SECTION; }
  "sections"                { yybegin(tagBodyState()); return SliqTypes.SECTIONS; }
  "style"                   { yybegin(tagBodyState()); return SliqTypes.STYLE; }
  "endstyle"                { yybegin(tagBodyState()); return SliqTypes.ENDSTYLE; }
  "stylesheet"              { yybegin(tagBodyState()); return SliqTypes.STYLESHEET; }
  "endstylesheet"           { yybegin(tagBodyState()); return SliqTypes.ENDSTYLESHEET; }
  "tablerow"                { yybegin(tagBodyState()); return SliqTypes.TABLEROW; }
  "endtablerow"             { yybegin(tagBodyState()); return SliqTypes.ENDTABLEROW; }
  "unless"                  { yybegin(tagBodyState()); return SliqTypes.UNLESS; }
  "endunless"               { yybegin(tagBodyState()); return SliqTypes.ENDUNLESS; }
  "when"                    { yybegin(tagBodyState()); return SliqTypes.WHEN; }

  // Custom / generic tag name (handled by generic_tag in the grammar).
  {IDENTIFIER}              { yybegin(tagBodyState()); return SliqTypes.IDENTIFIER; }

  // Empty tag: {%  %} or {%- -%}
  "-%}"                     { yybegin(YYINITIAL); return SliqTypes.LIQUID_TAG_END; }
  "%}"                      { yybegin(YYINITIAL); return SliqTypes.LIQUID_TAG_END; }
}

// --- Literals: valid in both tag and output operand positions ---------------
// Listed BEFORE {IDENTIFIER} so equal-length ties resolve to the keyword.
<IN_TAG, IN_OUTPUT, IN_LIQUID_BODY> {
  "true"                    { return SliqTypes.TRUE; }
  "false"                   { return SliqTypes.FALSE; }
  "nil"                     { return SliqTypes.NIL; }
  "null"                    { return SliqTypes.NIL; }
  "blank"                   { return SliqTypes.BLANK; }
  "empty"                   { return SliqTypes.EMPTY; }
}

// --- Operators / contextual keywords: only meaningful inside a tag ----------
<IN_TAG, IN_LIQUID_BODY> {
  "=="                      { return SliqTypes.EQ; }
  "!="                      { return SliqTypes.NE; }
  ">="                      { return SliqTypes.GE; }
  "<="                      { return SliqTypes.LE; }
  ">"                       { return SliqTypes.GT; }
  "<"                       { return SliqTypes.LT; }
  "="                       { return SliqTypes.SET; }

  "or"                      { return SliqTypes.OR; }
  "and"                     { return SliqTypes.AND; }
  "contains"                { return SliqTypes.CONTAINS; }
  "in"                      { return SliqTypes.IN; }
  "by"                      { return SliqTypes.BY; }
  "with"                    { return SliqTypes.WITH; }
  "as"                      { return SliqTypes.AS; }
  "reversed"                { return SliqTypes.REVERSED; }
}

<IN_TAG> {
  "|"                       { yybegin(IN_TAG_FILTER); return SliqTypes.PIPE; }
}

<IN_OUTPUT> {
  "|"                       { yybegin(IN_OUTPUT_FILTER); return SliqTypes.PIPE; }
}

<IN_LIQUID_BODY> {
  "|"                       { yybegin(IN_LIQUID_FILTER); return SliqTypes.PIPE; }
}

<IN_TAG_FILTER, IN_LIQUID_FILTER, IN_OUTPUT_FILTER> {
    {WHITE_SPACE}             { return TokenType.WHITE_SPACE; }
    // Custom / generic tag name (handled by generic_tag in the grammar).
    {IDENTIFIER}              { return SliqTypes.FILTER; }
}

<IN_TAG_FILTER> {
    ":"                       { yybegin(IN_TAG); }
}

<IN_LIQUID_FILTER> {
    ":"                       { yybegin(IN_LIQUID_BODY); }
}

<IN_OUTPUT_FILTER> {
    ":"                       { yybegin(IN_OUTPUT); }
}



// --- Shared operands & punctuation (after all keyword rules) -----------------
<IN_TAG, IN_OUTPUT, IN_LIQUID_BODY> {
  {NUMBER}                  { return SliqTypes.NUMBER; }
  {STRING_LITERAL}          { return SliqTypes.STRING_LITERAL; }
  {IDENTIFIER}              { return SliqTypes.IDENTIFIER; }

  ".."                      { return SliqTypes.RANGE; }   // longest-match also covers this vs "."
  "."                       { return SliqTypes.DOT; }
  ","                       { return SliqTypes.COMMA; }
  ":"                       { return SliqTypes.COLON; }
  "("                       { return SliqTypes.LPAREN; }
  ")"                       { return SliqTypes.RPAREN; }
  "["                       { return SliqTypes.LBRACKET; }
  "]"                       { return SliqTypes.RBRACKET; }
  "#"                       { return SliqTypes.HASH; }
}

<IN_TAG, IN_OUTPUT> {
  {WHITE_SPACE}             { return TokenType.WHITE_SPACE; }
}

<IN_TAG> {
  "-%}"                     { yybegin(YYINITIAL); return SliqTypes.LIQUID_TAG_END; }
  "%}"                      { yybegin(YYINITIAL); return SliqTypes.LIQUID_TAG_END; }
}

<IN_OUTPUT> {
  "-}}"                     { yybegin(YYINITIAL); return SliqTypes.LIQUID_OUTPUT_END; }
  "}}"                      { yybegin(YYINITIAL); return SliqTypes.LIQUID_OUTPUT_END; }
}

<IN_LIQUID_BODY> {
  [ \t\f]+                  { return TokenType.WHITE_SPACE; }
  [\r\n]+                   { yybegin(IN_LIQUID_HEAD); return TokenType.WHITE_SPACE; }
  "-%}"                     { yybegin(YYINITIAL); return SliqTypes.LIQUID_TAG_END; }
  "%}"                      { yybegin(YYINITIAL); return SliqTypes.LIQUID_TAG_END; }
}

[^]                         { return TokenType.BAD_CHARACTER; }
