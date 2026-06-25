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

%state TAG
%state RAW_HEAD
%state RAW


LIQUID_TAG_START=\{%-?
LIQUID_TAG_END=-?%\}
WHITE_SPACE=[ \n\r\t\f]+

%{
  private int beginningOfEndRawTag(CharSequence text) {
      return text.toString().indexOf(' ');
  }
%}
%%

<YYINITIAL> {
  // The `-` strip marker stays in the token text; we return the plain token
  // type because the grammar doesn't declare separate *_STRIP tokens.
  {LIQUID_TAG_START}             { yybegin(TAG);     return SliqTypes.LIQUID_TAG_BEGIN; }

  ([^\{]+|\{)                    { return SliqTypes.TEMPLATE_TEXT; }
}

<TAG> {
  {WHITE_SPACE}             { return TokenType.WHITE_SPACE; }

  "raw"                     { yybegin(RAW_HEAD); return SliqTypes.TAG_NAME_RAW; }
  "endraw"                  { return SliqTypes.TAG_NAME_ENDRAW; }

  {LIQUID_TAG_END}          { yybegin(YYINITIAL); return SliqTypes.LIQUID_TAG_END; }
}

<RAW_HEAD> {
  {WHITE_SPACE}             { return TokenType.WHITE_SPACE; }

  -?%\}                     { yybegin(RAW); return SliqTypes.LIQUID_TAG_END; }
}

<RAW> {
  \{%-? / \s*endraw\s*-?%\}   { yybegin(TAG); return SliqTypes.LIQUID_TAG_BEGIN; }
  [^{]+                       { return SliqTypes.RAW_TEXT; }
  "{"                         { return SliqTypes.RAW_TEXT; }
}

[^]                         { return TokenType.BAD_CHARACTER; }
