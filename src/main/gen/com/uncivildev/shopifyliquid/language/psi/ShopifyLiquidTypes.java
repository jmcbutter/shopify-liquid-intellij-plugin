// This is a generated file. Not intended for manual editing.
package com.uncivildev.shopifyliquid.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.uncivildev.shopifyliquid.language.psi.impl.*;

public interface ShopifyLiquidTypes {

  IElementType ACCESSOR = new ShopifyLiquidElementType("ACCESSOR");
  IElementType ARGUMENTS = new ShopifyLiquidElementType("ARGUMENTS");
  IElementType ASSIGN_TAG = new ShopifyLiquidElementType("ASSIGN_TAG");
  IElementType BOOLEAN_LITERAL = new ShopifyLiquidElementType("BOOLEAN_LITERAL");
  IElementType BREAK_TAG = new ShopifyLiquidElementType("BREAK_TAG");
  IElementType CAPTURE_TAG = new ShopifyLiquidElementType("CAPTURE_TAG");
  IElementType CASE_TAG = new ShopifyLiquidElementType("CASE_TAG");
  IElementType COMMENT_TAG = new ShopifyLiquidElementType("COMMENT_TAG");
  IElementType COMPARISON_OPERATOR = new ShopifyLiquidElementType("COMPARISON_OPERATOR");
  IElementType CONDITION = new ShopifyLiquidElementType("CONDITION");
  IElementType CONTINUE_TAG = new ShopifyLiquidElementType("CONTINUE_TAG");
  IElementType CYCLE_TAG = new ShopifyLiquidElementType("CYCLE_TAG");
  IElementType DECREMENT_TAG = new ShopifyLiquidElementType("DECREMENT_TAG");
  IElementType ECHO_TAG = new ShopifyLiquidElementType("ECHO_TAG");
  IElementType ELSE_TAG = new ShopifyLiquidElementType("ELSE_TAG");
  IElementType ELSIF_TAG = new ShopifyLiquidElementType("ELSIF_TAG");
  IElementType ENDCAPTURE_TAG = new ShopifyLiquidElementType("ENDCAPTURE_TAG");
  IElementType ENDCASE_TAG = new ShopifyLiquidElementType("ENDCASE_TAG");
  IElementType ENDCOMMENT_TAG = new ShopifyLiquidElementType("ENDCOMMENT_TAG");
  IElementType ENDFORM_TAG = new ShopifyLiquidElementType("ENDFORM_TAG");
  IElementType ENDFOR_TAG = new ShopifyLiquidElementType("ENDFOR_TAG");
  IElementType ENDIF_TAG = new ShopifyLiquidElementType("ENDIF_TAG");
  IElementType ENDJAVASCRIPT_TAG = new ShopifyLiquidElementType("ENDJAVASCRIPT_TAG");
  IElementType ENDPAGINATE_TAG = new ShopifyLiquidElementType("ENDPAGINATE_TAG");
  IElementType ENDRAW_TAG = new ShopifyLiquidElementType("ENDRAW_TAG");
  IElementType ENDSCHEMA_TAG = new ShopifyLiquidElementType("ENDSCHEMA_TAG");
  IElementType ENDSTYLE_TAG = new ShopifyLiquidElementType("ENDSTYLE_TAG");
  IElementType ENDTABLEROW_TAG = new ShopifyLiquidElementType("ENDTABLEROW_TAG");
  IElementType ENDUNLESS_TAG = new ShopifyLiquidElementType("ENDUNLESS_TAG");
  IElementType EXPRESSION = new ShopifyLiquidElementType("EXPRESSION");
  IElementType FILTER = new ShopifyLiquidElementType("FILTER");
  IElementType FILTER_ARGUMENTS = new ShopifyLiquidElementType("FILTER_ARGUMENTS");
  IElementType FORM_TAG = new ShopifyLiquidElementType("FORM_TAG");
  IElementType FOR_TAG = new ShopifyLiquidElementType("FOR_TAG");
  IElementType GENERIC_TAG = new ShopifyLiquidElementType("GENERIC_TAG");
  IElementType IFCHANGED_TAG = new ShopifyLiquidElementType("IFCHANGED_TAG");
  IElementType IF_TAG = new ShopifyLiquidElementType("IF_TAG");
  IElementType INCREMENT_TAG = new ShopifyLiquidElementType("INCREMENT_TAG");
  IElementType JAVASCRIPT_TAG = new ShopifyLiquidElementType("JAVASCRIPT_TAG");
  IElementType KEYWORD = new ShopifyLiquidElementType("KEYWORD");
  IElementType LAYOUT_TAG = new ShopifyLiquidElementType("LAYOUT_TAG");
  IElementType LIQUID_OUTPUT = new ShopifyLiquidElementType("LIQUID_OUTPUT");
  IElementType LIQUID_TAG = new ShopifyLiquidElementType("LIQUID_TAG");
  IElementType LIQUID_TAG_KW = new ShopifyLiquidElementType("LIQUID_TAG_KW");
  IElementType LITERAL = new ShopifyLiquidElementType("LITERAL");
  IElementType OUTPUT_CONTENT = new ShopifyLiquidElementType("OUTPUT_CONTENT");
  IElementType PAGINATE_TAG = new ShopifyLiquidElementType("PAGINATE_TAG");
  IElementType PARAMETER = new ShopifyLiquidElementType("PARAMETER");
  IElementType PROPERTY = new ShopifyLiquidElementType("PROPERTY");
  IElementType RANGE_EXPRESSION = new ShopifyLiquidElementType("RANGE_EXPRESSION");
  IElementType RAW_TAG = new ShopifyLiquidElementType("RAW_TAG");
  IElementType RENDER_TAG = new ShopifyLiquidElementType("RENDER_TAG");
  IElementType SCHEMA_TAG = new ShopifyLiquidElementType("SCHEMA_TAG");
  IElementType SECTIONS_TAG = new ShopifyLiquidElementType("SECTIONS_TAG");
  IElementType SECTION_TAG = new ShopifyLiquidElementType("SECTION_TAG");
  IElementType STYLESHEET_TAG = new ShopifyLiquidElementType("STYLESHEET_TAG");
  IElementType STYLE_TAG = new ShopifyLiquidElementType("STYLE_TAG");
  IElementType TABLEROW_TAG = new ShopifyLiquidElementType("TABLEROW_TAG");
  IElementType TAG_CONTENT = new ShopifyLiquidElementType("TAG_CONTENT");
  IElementType UNLESS_TAG = new ShopifyLiquidElementType("UNLESS_TAG");
  IElementType VALUE = new ShopifyLiquidElementType("VALUE");
  IElementType VARIABLE_LOOKUP = new ShopifyLiquidElementType("VARIABLE_LOOKUP");
  IElementType WHEN_TAG = new ShopifyLiquidElementType("WHEN_TAG");

  IElementType AND = new ShopifyLiquidTokenType("and");
  IElementType AS = new ShopifyLiquidTokenType("as");
  IElementType ASSIGN = new ShopifyLiquidTokenType("assign");
  IElementType BLANK = new ShopifyLiquidTokenType("blank");
  IElementType BREAK = new ShopifyLiquidTokenType("break");
  IElementType BY = new ShopifyLiquidTokenType("by");
  IElementType CAPTURE = new ShopifyLiquidTokenType("capture");
  IElementType CASE = new ShopifyLiquidTokenType("case");
  IElementType COLON = new ShopifyLiquidTokenType(":");
  IElementType COLS = new ShopifyLiquidTokenType("cols");
  IElementType COMMA = new ShopifyLiquidTokenType(",");
  IElementType COMMENT = new ShopifyLiquidTokenType("comment");
  IElementType CONTAINS = new ShopifyLiquidTokenType("contains");
  IElementType CONTINUE = new ShopifyLiquidTokenType("continue");
  IElementType CYCLE = new ShopifyLiquidTokenType("cycle");
  IElementType DECREMENT = new ShopifyLiquidTokenType("decrement");
  IElementType DOT = new ShopifyLiquidTokenType(".");
  IElementType ECHO = new ShopifyLiquidTokenType("echo");
  IElementType ELSE = new ShopifyLiquidTokenType("else");
  IElementType ELSIF = new ShopifyLiquidTokenType("elsif");
  IElementType EMPTY = new ShopifyLiquidTokenType("empty");
  IElementType ENDCAPTURE = new ShopifyLiquidTokenType("endcapture");
  IElementType ENDCASE = new ShopifyLiquidTokenType("endcase");
  IElementType ENDCOMMENT = new ShopifyLiquidTokenType("endcomment");
  IElementType ENDFOR = new ShopifyLiquidTokenType("endfor");
  IElementType ENDFORM = new ShopifyLiquidTokenType("endform");
  IElementType ENDIF = new ShopifyLiquidTokenType("endif");
  IElementType ENDJAVASCRIPT = new ShopifyLiquidTokenType("endjavascript");
  IElementType ENDPAGINATE = new ShopifyLiquidTokenType("endpaginate");
  IElementType ENDRAW = new ShopifyLiquidTokenType("endraw");
  IElementType ENDSCHEMA = new ShopifyLiquidTokenType("endschema");
  IElementType ENDSTYLE = new ShopifyLiquidTokenType("endstyle");
  IElementType ENDTABLEROW = new ShopifyLiquidTokenType("endtablerow");
  IElementType ENDUNLESS = new ShopifyLiquidTokenType("endunless");
  IElementType EQ = new ShopifyLiquidTokenType("==");
  IElementType FALSE = new ShopifyLiquidTokenType("false");
  IElementType FOR = new ShopifyLiquidTokenType("for");
  IElementType FORM = new ShopifyLiquidTokenType("form");
  IElementType GE = new ShopifyLiquidTokenType(">=");
  IElementType GT = new ShopifyLiquidTokenType(">");
  IElementType HASH = new ShopifyLiquidTokenType("#");
  IElementType IDENTIFIER = new ShopifyLiquidTokenType("IDENTIFIER");
  IElementType IF = new ShopifyLiquidTokenType("if");
  IElementType IFCHANGED = new ShopifyLiquidTokenType("ifchanged");
  IElementType IN = new ShopifyLiquidTokenType("in");
  IElementType INCREMENT = new ShopifyLiquidTokenType("increment");
  IElementType JAVASCRIPT = new ShopifyLiquidTokenType("javascript");
  IElementType LAYOUT = new ShopifyLiquidTokenType("layout");
  IElementType LBRACKET = new ShopifyLiquidTokenType("[");
  IElementType LE = new ShopifyLiquidTokenType("<=");
  IElementType LIMIT = new ShopifyLiquidTokenType("limit");
  IElementType LIQUID = new ShopifyLiquidTokenType("liquid");
  IElementType LIQUID_OUTPUT_END = new ShopifyLiquidTokenType("}}");
  IElementType LIQUID_OUTPUT_END_STRIP = new ShopifyLiquidTokenType("-}}");
  IElementType LIQUID_OUTPUT_START = new ShopifyLiquidTokenType("{{");
  IElementType LIQUID_OUTPUT_START_STRIP = new ShopifyLiquidTokenType("{{-");
  IElementType LIQUID_TAG_END = new ShopifyLiquidTokenType("%}");
  IElementType LIQUID_TAG_END_STRIP = new ShopifyLiquidTokenType("-%}");
  IElementType LIQUID_TAG_START = new ShopifyLiquidTokenType("{%");
  IElementType LIQUID_TAG_START_STRIP = new ShopifyLiquidTokenType("{%-");
  IElementType LPAREN = new ShopifyLiquidTokenType("(");
  IElementType LT = new ShopifyLiquidTokenType("<");
  IElementType NE = new ShopifyLiquidTokenType("!=");
  IElementType NIL = new ShopifyLiquidTokenType("nil");
  IElementType NUMBER = new ShopifyLiquidTokenType("NUMBER");
  IElementType OFFSET = new ShopifyLiquidTokenType("offset");
  IElementType OR = new ShopifyLiquidTokenType("or");
  IElementType PAGINATE = new ShopifyLiquidTokenType("paginate");
  IElementType PIPE = new ShopifyLiquidTokenType("|");
  IElementType RANGE = new ShopifyLiquidTokenType("..");
  IElementType RAW = new ShopifyLiquidTokenType("raw");
  IElementType RBRACKET = new ShopifyLiquidTokenType("]");
  IElementType RENDER = new ShopifyLiquidTokenType("render");
  IElementType REVERSED = new ShopifyLiquidTokenType("reversed");
  IElementType RPAREN = new ShopifyLiquidTokenType(")");
  IElementType SCHEMA = new ShopifyLiquidTokenType("schema");
  IElementType SECTION = new ShopifyLiquidTokenType("section");
  IElementType SECTIONS = new ShopifyLiquidTokenType("sections");
  IElementType SET = new ShopifyLiquidTokenType("=");
  IElementType STRING_LITERAL = new ShopifyLiquidTokenType("STRING_LITERAL");
  IElementType STYLE = new ShopifyLiquidTokenType("style");
  IElementType STYLESHEET = new ShopifyLiquidTokenType("stylesheet");
  IElementType TABLEROW = new ShopifyLiquidTokenType("tablerow");
  IElementType TEMPLATE_TEXT = new ShopifyLiquidTokenType("TEMPLATE_TEXT");
  IElementType TRUE = new ShopifyLiquidTokenType("true");
  IElementType UNLESS = new ShopifyLiquidTokenType("unless");
  IElementType WHEN = new ShopifyLiquidTokenType("when");
  IElementType WITH = new ShopifyLiquidTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACCESSOR) {
        return new ShopifyLiquidAccessorImpl(node);
      }
      else if (type == ARGUMENTS) {
        return new ShopifyLiquidArgumentsImpl(node);
      }
      else if (type == ASSIGN_TAG) {
        return new ShopifyLiquidAssignTagImpl(node);
      }
      else if (type == BOOLEAN_LITERAL) {
        return new ShopifyLiquidBooleanLiteralImpl(node);
      }
      else if (type == BREAK_TAG) {
        return new ShopifyLiquidBreakTagImpl(node);
      }
      else if (type == CAPTURE_TAG) {
        return new ShopifyLiquidCaptureTagImpl(node);
      }
      else if (type == CASE_TAG) {
        return new ShopifyLiquidCaseTagImpl(node);
      }
      else if (type == COMMENT_TAG) {
        return new ShopifyLiquidCommentTagImpl(node);
      }
      else if (type == COMPARISON_OPERATOR) {
        return new ShopifyLiquidComparisonOperatorImpl(node);
      }
      else if (type == CONDITION) {
        return new ShopifyLiquidConditionImpl(node);
      }
      else if (type == CONTINUE_TAG) {
        return new ShopifyLiquidContinueTagImpl(node);
      }
      else if (type == CYCLE_TAG) {
        return new ShopifyLiquidCycleTagImpl(node);
      }
      else if (type == DECREMENT_TAG) {
        return new ShopifyLiquidDecrementTagImpl(node);
      }
      else if (type == ECHO_TAG) {
        return new ShopifyLiquidEchoTagImpl(node);
      }
      else if (type == ELSE_TAG) {
        return new ShopifyLiquidElseTagImpl(node);
      }
      else if (type == ELSIF_TAG) {
        return new ShopifyLiquidElsifTagImpl(node);
      }
      else if (type == ENDCAPTURE_TAG) {
        return new ShopifyLiquidEndcaptureTagImpl(node);
      }
      else if (type == ENDCASE_TAG) {
        return new ShopifyLiquidEndcaseTagImpl(node);
      }
      else if (type == ENDCOMMENT_TAG) {
        return new ShopifyLiquidEndcommentTagImpl(node);
      }
      else if (type == ENDFORM_TAG) {
        return new ShopifyLiquidEndformTagImpl(node);
      }
      else if (type == ENDFOR_TAG) {
        return new ShopifyLiquidEndforTagImpl(node);
      }
      else if (type == ENDIF_TAG) {
        return new ShopifyLiquidEndifTagImpl(node);
      }
      else if (type == ENDJAVASCRIPT_TAG) {
        return new ShopifyLiquidEndjavascriptTagImpl(node);
      }
      else if (type == ENDPAGINATE_TAG) {
        return new ShopifyLiquidEndpaginateTagImpl(node);
      }
      else if (type == ENDRAW_TAG) {
        return new ShopifyLiquidEndrawTagImpl(node);
      }
      else if (type == ENDSCHEMA_TAG) {
        return new ShopifyLiquidEndschemaTagImpl(node);
      }
      else if (type == ENDSTYLE_TAG) {
        return new ShopifyLiquidEndstyleTagImpl(node);
      }
      else if (type == ENDTABLEROW_TAG) {
        return new ShopifyLiquidEndtablerowTagImpl(node);
      }
      else if (type == ENDUNLESS_TAG) {
        return new ShopifyLiquidEndunlessTagImpl(node);
      }
      else if (type == EXPRESSION) {
        return new ShopifyLiquidExpressionImpl(node);
      }
      else if (type == FILTER) {
        return new ShopifyLiquidFilterImpl(node);
      }
      else if (type == FILTER_ARGUMENTS) {
        return new ShopifyLiquidFilterArgumentsImpl(node);
      }
      else if (type == FORM_TAG) {
        return new ShopifyLiquidFormTagImpl(node);
      }
      else if (type == FOR_TAG) {
        return new ShopifyLiquidForTagImpl(node);
      }
      else if (type == GENERIC_TAG) {
        return new ShopifyLiquidGenericTagImpl(node);
      }
      else if (type == IFCHANGED_TAG) {
        return new ShopifyLiquidIfchangedTagImpl(node);
      }
      else if (type == IF_TAG) {
        return new ShopifyLiquidIfTagImpl(node);
      }
      else if (type == INCREMENT_TAG) {
        return new ShopifyLiquidIncrementTagImpl(node);
      }
      else if (type == JAVASCRIPT_TAG) {
        return new ShopifyLiquidJavascriptTagImpl(node);
      }
      else if (type == KEYWORD) {
        return new ShopifyLiquidKeywordImpl(node);
      }
      else if (type == LAYOUT_TAG) {
        return new ShopifyLiquidLayoutTagImpl(node);
      }
      else if (type == LIQUID_OUTPUT) {
        return new ShopifyLiquidLiquidOutputImpl(node);
      }
      else if (type == LIQUID_TAG) {
        return new ShopifyLiquidLiquidTagImpl(node);
      }
      else if (type == LIQUID_TAG_KW) {
        return new ShopifyLiquidLiquidTagKwImpl(node);
      }
      else if (type == LITERAL) {
        return new ShopifyLiquidLiteralImpl(node);
      }
      else if (type == OUTPUT_CONTENT) {
        return new ShopifyLiquidOutputContentImpl(node);
      }
      else if (type == PAGINATE_TAG) {
        return new ShopifyLiquidPaginateTagImpl(node);
      }
      else if (type == PARAMETER) {
        return new ShopifyLiquidParameterImpl(node);
      }
      else if (type == PROPERTY) {
        return new ShopifyLiquidPropertyImpl(node);
      }
      else if (type == RANGE_EXPRESSION) {
        return new ShopifyLiquidRangeExpressionImpl(node);
      }
      else if (type == RAW_TAG) {
        return new ShopifyLiquidRawTagImpl(node);
      }
      else if (type == RENDER_TAG) {
        return new ShopifyLiquidRenderTagImpl(node);
      }
      else if (type == SCHEMA_TAG) {
        return new ShopifyLiquidSchemaTagImpl(node);
      }
      else if (type == SECTIONS_TAG) {
        return new ShopifyLiquidSectionsTagImpl(node);
      }
      else if (type == SECTION_TAG) {
        return new ShopifyLiquidSectionTagImpl(node);
      }
      else if (type == STYLESHEET_TAG) {
        return new ShopifyLiquidStylesheetTagImpl(node);
      }
      else if (type == STYLE_TAG) {
        return new ShopifyLiquidStyleTagImpl(node);
      }
      else if (type == TABLEROW_TAG) {
        return new ShopifyLiquidTablerowTagImpl(node);
      }
      else if (type == TAG_CONTENT) {
        return new ShopifyLiquidTagContentImpl(node);
      }
      else if (type == UNLESS_TAG) {
        return new ShopifyLiquidUnlessTagImpl(node);
      }
      else if (type == VALUE) {
        return new ShopifyLiquidValueImpl(node);
      }
      else if (type == VARIABLE_LOOKUP) {
        return new ShopifyLiquidVariableLookupImpl(node);
      }
      else if (type == WHEN_TAG) {
        return new ShopifyLiquidWhenTagImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
