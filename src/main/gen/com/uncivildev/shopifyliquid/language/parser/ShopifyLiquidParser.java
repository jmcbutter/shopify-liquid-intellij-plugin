// This is a generated file. Not intended for manual editing.
package com.uncivildev.shopifyliquid.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ShopifyLiquidParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return shopifyLiquidFile(b, l + 1);
  }

  /* ********************************************************** */
  // DOT IDENTIFIER | LBRACKET expression RBRACKET
  public static boolean accessor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor")) return false;
    if (!nextTokenIs(b, "<accessor>", DOT, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACCESSOR, "<accessor>");
    r = parseTokens(b, 0, DOT, IDENTIFIER);
    if (!r) r = accessor_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LBRACKET expression RBRACKET
  private static boolean accessor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression (COMMA expression)*
  public static boolean arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENTS, "<arguments>");
    r = expression(b, l + 1);
    r = r && arguments_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA expression)*
  private static boolean arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arguments_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arguments_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ASSIGN IDENTIFIER SET expression
  public static boolean assign_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_tag")) return false;
    if (!nextTokenIs(b, ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASSIGN, IDENTIFIER, SET);
    r = r && expression(b, l + 1);
    exit_section_(b, m, ASSIGN_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // TRUE | FALSE
  public static boolean boolean_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_literal")) return false;
    if (!nextTokenIs(b, "<boolean literal>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BREAK
  public static boolean break_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_tag")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    exit_section_(b, m, BREAK_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // CAPTURE IDENTIFIER
  public static boolean capture_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_tag")) return false;
    if (!nextTokenIs(b, CAPTURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CAPTURE, IDENTIFIER);
    exit_section_(b, m, CAPTURE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // CASE variable_lookup
  public static boolean case_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_tag")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && variable_lookup(b, l + 1);
    exit_section_(b, m, CASE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // COMMENT (HASH TEMPLATE_TEXT?)?
  public static boolean comment_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_tag")) return false;
    if (!nextTokenIs(b, COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    r = r && comment_tag_1(b, l + 1);
    exit_section_(b, m, COMMENT_TAG, r);
    return r;
  }

  // (HASH TEMPLATE_TEXT?)?
  private static boolean comment_tag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_tag_1")) return false;
    comment_tag_1_0(b, l + 1);
    return true;
  }

  // HASH TEMPLATE_TEXT?
  private static boolean comment_tag_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_tag_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && comment_tag_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TEMPLATE_TEXT?
  private static boolean comment_tag_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_tag_1_0_1")) return false;
    consumeToken(b, TEMPLATE_TEXT);
    return true;
  }

  /* ********************************************************** */
  // EQ | NE | GT | LT | GE | LE | CONTAINS
  public static boolean comparison_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_OPERATOR, "<comparison operator>");
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NE);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, GE);
    if (!r) r = consumeToken(b, LE);
    if (!r) r = consumeToken(b, CONTAINS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression (comparison_operator expression)?
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = expression(b, l + 1);
    r = r && condition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comparison_operator expression)?
  private static boolean condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1")) return false;
    condition_1_0(b, l + 1);
    return true;
  }

  // comparison_operator expression
  private static boolean condition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparison_operator(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONTINUE
  public static boolean continue_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_tag")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    exit_section_(b, m, CONTINUE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // CYCLE (literal (COLON literal)? (COMMA literal)*)
  public static boolean cycle_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cycle_tag")) return false;
    if (!nextTokenIs(b, CYCLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CYCLE);
    r = r && cycle_tag_1(b, l + 1);
    exit_section_(b, m, CYCLE_TAG, r);
    return r;
  }

  // literal (COLON literal)? (COMMA literal)*
  private static boolean cycle_tag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cycle_tag_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal(b, l + 1);
    r = r && cycle_tag_1_1(b, l + 1);
    r = r && cycle_tag_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLON literal)?
  private static boolean cycle_tag_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cycle_tag_1_1")) return false;
    cycle_tag_1_1_0(b, l + 1);
    return true;
  }

  // COLON literal
  private static boolean cycle_tag_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cycle_tag_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA literal)*
  private static boolean cycle_tag_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cycle_tag_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cycle_tag_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cycle_tag_1_2", c)) break;
    }
    return true;
  }

  // COMMA literal
  private static boolean cycle_tag_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cycle_tag_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DECREMENT variable_lookup
  public static boolean decrement_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decrement_tag")) return false;
    if (!nextTokenIs(b, DECREMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECREMENT);
    r = r && variable_lookup(b, l + 1);
    exit_section_(b, m, DECREMENT_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ECHO expression
  public static boolean echo_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "echo_tag")) return false;
    if (!nextTokenIs(b, ECHO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ECHO);
    r = r && expression(b, l + 1);
    exit_section_(b, m, ECHO_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ELSE
  public static boolean else_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_tag")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    exit_section_(b, m, ELSE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ELSIF condition
  public static boolean elsif_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elsif_tag")) return false;
    if (!nextTokenIs(b, ELSIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSIF);
    r = r && condition(b, l + 1);
    exit_section_(b, m, ELSIF_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDCAPTURE
  public static boolean endcapture_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endcapture_tag")) return false;
    if (!nextTokenIs(b, ENDCAPTURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDCAPTURE);
    exit_section_(b, m, ENDCAPTURE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDCASE
  public static boolean endcase_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endcase_tag")) return false;
    if (!nextTokenIs(b, ENDCASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDCASE);
    exit_section_(b, m, ENDCASE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDCOMMENT
  public static boolean endcomment_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endcomment_tag")) return false;
    if (!nextTokenIs(b, ENDCOMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDCOMMENT);
    exit_section_(b, m, ENDCOMMENT_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDFOR
  public static boolean endfor_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endfor_tag")) return false;
    if (!nextTokenIs(b, ENDFOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDFOR);
    exit_section_(b, m, ENDFOR_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDFORM
  public static boolean endform_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endform_tag")) return false;
    if (!nextTokenIs(b, ENDFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDFORM);
    exit_section_(b, m, ENDFORM_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDIF
  public static boolean endif_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endif_tag")) return false;
    if (!nextTokenIs(b, ENDIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDIF);
    exit_section_(b, m, ENDIF_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDJAVASCRIPT
  public static boolean endjavascript_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endjavascript_tag")) return false;
    if (!nextTokenIs(b, ENDJAVASCRIPT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDJAVASCRIPT);
    exit_section_(b, m, ENDJAVASCRIPT_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDPAGINATE
  public static boolean endpaginate_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endpaginate_tag")) return false;
    if (!nextTokenIs(b, ENDPAGINATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDPAGINATE);
    exit_section_(b, m, ENDPAGINATE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDRAW
  public static boolean endraw_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endraw_tag")) return false;
    if (!nextTokenIs(b, ENDRAW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDRAW);
    exit_section_(b, m, ENDRAW_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDSCHEMA
  public static boolean endschema_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endschema_tag")) return false;
    if (!nextTokenIs(b, ENDSCHEMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDSCHEMA);
    exit_section_(b, m, ENDSCHEMA_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDSTYLE
  public static boolean endstyle_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endstyle_tag")) return false;
    if (!nextTokenIs(b, ENDSTYLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDSTYLE);
    exit_section_(b, m, ENDSTYLE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDTABLEROW
  public static boolean endtablerow_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endtablerow_tag")) return false;
    if (!nextTokenIs(b, ENDTABLEROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDTABLEROW);
    exit_section_(b, m, ENDTABLEROW_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ENDUNLESS
  public static boolean endunless_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endunless_tag")) return false;
    if (!nextTokenIs(b, ENDUNLESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDUNLESS);
    exit_section_(b, m, ENDUNLESS_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // value (PIPE filter)*
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = value(b, l + 1);
    r = r && expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (PIPE filter)*
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_1", c)) break;
    }
    return true;
  }

  // PIPE filter
  private static boolean expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE);
    r = r && filter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (COLON filter_arguments)?
  public static boolean filter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && filter_1(b, l + 1);
    exit_section_(b, m, FILTER, r);
    return r;
  }

  // (COLON filter_arguments)?
  private static boolean filter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filter_1")) return false;
    filter_1_0(b, l + 1);
    return true;
  }

  // COLON filter_arguments
  private static boolean filter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && filter_arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // arguments (COLON arguments)*
  public static boolean filter_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filter_arguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILTER_ARGUMENTS, "<filter arguments>");
    r = arguments(b, l + 1);
    r = r && filter_arguments_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COLON arguments)*
  private static boolean filter_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filter_arguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!filter_arguments_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "filter_arguments_1", c)) break;
    }
    return true;
  }

  // COLON arguments
  private static boolean filter_arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filter_arguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOR IDENTIFIER IN (variable_lookup | range_expression) (REVERSED)? (property)*
  public static boolean for_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_tag")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, IDENTIFIER, IN);
    r = r && for_tag_3(b, l + 1);
    r = r && for_tag_4(b, l + 1);
    r = r && for_tag_5(b, l + 1);
    exit_section_(b, m, FOR_TAG, r);
    return r;
  }

  // variable_lookup | range_expression
  private static boolean for_tag_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_tag_3")) return false;
    boolean r;
    r = variable_lookup(b, l + 1);
    if (!r) r = range_expression(b, l + 1);
    return r;
  }

  // (REVERSED)?
  private static boolean for_tag_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_tag_4")) return false;
    consumeToken(b, REVERSED);
    return true;
  }

  // (property)*
  private static boolean for_tag_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_tag_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!for_tag_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_tag_5", c)) break;
    }
    return true;
  }

  // (property)
  private static boolean for_tag_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_tag_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FORM (literal | variable_lookup) (COMMA (literal | variable_lookup))* (property)*
  public static boolean form_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form_tag")) return false;
    if (!nextTokenIs(b, FORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FORM);
    r = r && form_tag_1(b, l + 1);
    r = r && form_tag_2(b, l + 1);
    r = r && form_tag_3(b, l + 1);
    exit_section_(b, m, FORM_TAG, r);
    return r;
  }

  // literal | variable_lookup
  private static boolean form_tag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form_tag_1")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = variable_lookup(b, l + 1);
    return r;
  }

  // (COMMA (literal | variable_lookup))*
  private static boolean form_tag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form_tag_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!form_tag_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "form_tag_2", c)) break;
    }
    return true;
  }

  // COMMA (literal | variable_lookup)
  private static boolean form_tag_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form_tag_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && form_tag_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // literal | variable_lookup
  private static boolean form_tag_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form_tag_2_0_1")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = variable_lookup(b, l + 1);
    return r;
  }

  // (property)*
  private static boolean form_tag_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form_tag_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!form_tag_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "form_tag_3", c)) break;
    }
    return true;
  }

  // (property)
  private static boolean form_tag_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form_tag_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (parameter | expression)*
  public static boolean generic_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_tag")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && generic_tag_1(b, l + 1);
    exit_section_(b, m, GENERIC_TAG, r);
    return r;
  }

  // (parameter | expression)*
  private static boolean generic_tag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_tag_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generic_tag_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_tag_1", c)) break;
    }
    return true;
  }

  // parameter | expression
  private static boolean generic_tag_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_tag_1_0")) return false;
    boolean r;
    r = parameter(b, l + 1);
    if (!r) r = expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IF condition
  public static boolean if_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_tag")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && condition(b, l + 1);
    exit_section_(b, m, IF_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // IFCHANGED
  public static boolean ifchanged_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifchanged_tag")) return false;
    if (!nextTokenIs(b, IFCHANGED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IFCHANGED);
    exit_section_(b, m, IFCHANGED_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // INCREMENT variable_lookup
  public static boolean increment_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "increment_tag")) return false;
    if (!nextTokenIs(b, INCREMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCREMENT);
    r = r && variable_lookup(b, l + 1);
    exit_section_(b, m, INCREMENT_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // TEMPLATE_TEXT | liquid_tag | liquid_output
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    r = consumeToken(b, TEMPLATE_TEXT);
    if (!r) r = liquid_tag(b, l + 1);
    if (!r) r = liquid_output(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // JAVASCRIPT
  public static boolean javascript_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "javascript_tag")) return false;
    if (!nextTokenIs(b, JAVASCRIPT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, JAVASCRIPT);
    exit_section_(b, m, JAVASCRIPT_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // ASSIGN | BREAK | CAPTURE | ENDCAPTURE | CASE | ENDCASE | COMMENT | ENDCOMMENT | CONTINUE | CYCLE | DECREMENT | ECHO | ELSE | ELSIF | FOR | ENDFOR | FORM | ENDFORM | IF | ENDIF | IFCHANGED | INCREMENT | JAVASCRIPT | ENDJAVASCRIPT | LAYOUT | LIQUID | PAGINATE | ENDPAGINATE | RAW | ENDRAW | RENDER | SCHEMA | ENDSCHEMA | SECTION | SECTIONS | STYLE | ENDSTYLE | STYLESHEET | TABLEROW | ENDTABLEROW | UNLESS | ENDUNLESS | WHEN | IN | BY | WITH | AS | REVERSED | OFFSET | LIMIT | COLS | OR | AND | CONTAINS | HASH
  public static boolean keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD, "<keyword>");
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, CAPTURE);
    if (!r) r = consumeToken(b, ENDCAPTURE);
    if (!r) r = consumeToken(b, CASE);
    if (!r) r = consumeToken(b, ENDCASE);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, ENDCOMMENT);
    if (!r) r = consumeToken(b, CONTINUE);
    if (!r) r = consumeToken(b, CYCLE);
    if (!r) r = consumeToken(b, DECREMENT);
    if (!r) r = consumeToken(b, ECHO);
    if (!r) r = consumeToken(b, ELSE);
    if (!r) r = consumeToken(b, ELSIF);
    if (!r) r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, ENDFOR);
    if (!r) r = consumeToken(b, FORM);
    if (!r) r = consumeToken(b, ENDFORM);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, ENDIF);
    if (!r) r = consumeToken(b, IFCHANGED);
    if (!r) r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, JAVASCRIPT);
    if (!r) r = consumeToken(b, ENDJAVASCRIPT);
    if (!r) r = consumeToken(b, LAYOUT);
    if (!r) r = consumeToken(b, LIQUID);
    if (!r) r = consumeToken(b, PAGINATE);
    if (!r) r = consumeToken(b, ENDPAGINATE);
    if (!r) r = consumeToken(b, RAW);
    if (!r) r = consumeToken(b, ENDRAW);
    if (!r) r = consumeToken(b, RENDER);
    if (!r) r = consumeToken(b, SCHEMA);
    if (!r) r = consumeToken(b, ENDSCHEMA);
    if (!r) r = consumeToken(b, SECTION);
    if (!r) r = consumeToken(b, SECTIONS);
    if (!r) r = consumeToken(b, STYLE);
    if (!r) r = consumeToken(b, ENDSTYLE);
    if (!r) r = consumeToken(b, STYLESHEET);
    if (!r) r = consumeToken(b, TABLEROW);
    if (!r) r = consumeToken(b, ENDTABLEROW);
    if (!r) r = consumeToken(b, UNLESS);
    if (!r) r = consumeToken(b, ENDUNLESS);
    if (!r) r = consumeToken(b, WHEN);
    if (!r) r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, BY);
    if (!r) r = consumeToken(b, WITH);
    if (!r) r = consumeToken(b, AS);
    if (!r) r = consumeToken(b, REVERSED);
    if (!r) r = consumeToken(b, OFFSET);
    if (!r) r = consumeToken(b, LIMIT);
    if (!r) r = consumeToken(b, COLS);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, CONTAINS);
    if (!r) r = consumeToken(b, HASH);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LAYOUT (literal | NIL)
  public static boolean layout_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layout_tag")) return false;
    if (!nextTokenIs(b, LAYOUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LAYOUT);
    r = r && layout_tag_1(b, l + 1);
    exit_section_(b, m, LAYOUT_TAG, r);
    return r;
  }

  // literal | NIL
  private static boolean layout_tag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layout_tag_1")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = consumeToken(b, NIL);
    return r;
  }

  /* ********************************************************** */
  // (LIQUID_OUTPUT_START | LIQUID_OUTPUT_START_STRIP) output_content (LIQUID_OUTPUT_END | LIQUID_OUTPUT_END_STRIP)
  public static boolean liquid_output(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liquid_output")) return false;
    if (!nextTokenIs(b, "<liquid output>", LIQUID_OUTPUT_START, LIQUID_OUTPUT_START_STRIP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIQUID_OUTPUT, "<liquid output>");
    r = liquid_output_0(b, l + 1);
    r = r && output_content(b, l + 1);
    r = r && liquid_output_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LIQUID_OUTPUT_START | LIQUID_OUTPUT_START_STRIP
  private static boolean liquid_output_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liquid_output_0")) return false;
    boolean r;
    r = consumeToken(b, LIQUID_OUTPUT_START);
    if (!r) r = consumeToken(b, LIQUID_OUTPUT_START_STRIP);
    return r;
  }

  // LIQUID_OUTPUT_END | LIQUID_OUTPUT_END_STRIP
  private static boolean liquid_output_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liquid_output_2")) return false;
    boolean r;
    r = consumeToken(b, LIQUID_OUTPUT_END);
    if (!r) r = consumeToken(b, LIQUID_OUTPUT_END_STRIP);
    return r;
  }

  /* ********************************************************** */
  // (LIQUID_TAG_START | LIQUID_TAG_START_STRIP) tag_content (LIQUID_TAG_END | LIQUID_TAG_END_STRIP)
  public static boolean liquid_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liquid_tag")) return false;
    if (!nextTokenIs(b, "<liquid tag>", LIQUID_TAG_START, LIQUID_TAG_START_STRIP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIQUID_TAG, "<liquid tag>");
    r = liquid_tag_0(b, l + 1);
    r = r && tag_content(b, l + 1);
    r = r && liquid_tag_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LIQUID_TAG_START | LIQUID_TAG_START_STRIP
  private static boolean liquid_tag_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liquid_tag_0")) return false;
    boolean r;
    r = consumeToken(b, LIQUID_TAG_START);
    if (!r) r = consumeToken(b, LIQUID_TAG_START_STRIP);
    return r;
  }

  // LIQUID_TAG_END | LIQUID_TAG_END_STRIP
  private static boolean liquid_tag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liquid_tag_2")) return false;
    boolean r;
    r = consumeToken(b, LIQUID_TAG_END);
    if (!r) r = consumeToken(b, LIQUID_TAG_END_STRIP);
    return r;
  }

  /* ********************************************************** */
  // LIQUID
  public static boolean liquid_tag_kw(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liquid_tag_kw")) return false;
    if (!nextTokenIs(b, LIQUID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIQUID);
    exit_section_(b, m, LIQUID_TAG_KW, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | STRING_LITERAL | boolean_literal | NIL | BLANK | EMPTY
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = boolean_literal(b, l + 1);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, BLANK);
    if (!r) r = consumeToken(b, EMPTY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean output_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OUTPUT_CONTENT, "<output content>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PAGINATE variable_lookup BY NUMBER (property)*
  public static boolean paginate_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paginate_tag")) return false;
    if (!nextTokenIs(b, PAGINATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAGINATE);
    r = r && variable_lookup(b, l + 1);
    r = r && consumeTokens(b, 0, BY, NUMBER);
    r = r && paginate_tag_4(b, l + 1);
    exit_section_(b, m, PAGINATE_TAG, r);
    return r;
  }

  // (property)*
  private static boolean paginate_tag_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paginate_tag_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paginate_tag_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paginate_tag_4", c)) break;
    }
    return true;
  }

  // (property)
  private static boolean paginate_tag_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paginate_tag_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON (literal | variable_lookup)
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, null);
    r = consumeTokens(b, 1, IDENTIFIER, COLON);
    p = r; // pin = 1
    r = r && parameter_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // literal | variable_lookup
  private static boolean parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = variable_lookup(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON expression
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, null);
    r = consumeTokens(b, 1, IDENTIFIER, COLON);
    p = r; // pin = 1
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LPAREN (NUMBER | variable_lookup) RANGE (NUMBER | variable_lookup) RPAREN
  public static boolean range_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_expression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && range_expression_1(b, l + 1);
    r = r && consumeToken(b, RANGE);
    r = r && range_expression_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, RANGE_EXPRESSION, r);
    return r;
  }

  // NUMBER | variable_lookup
  private static boolean range_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_expression_1")) return false;
    boolean r;
    r = consumeToken(b, NUMBER);
    if (!r) r = variable_lookup(b, l + 1);
    return r;
  }

  // NUMBER | variable_lookup
  private static boolean range_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_expression_3")) return false;
    boolean r;
    r = consumeToken(b, NUMBER);
    if (!r) r = variable_lookup(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // RAW
  public static boolean raw_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_tag")) return false;
    if (!nextTokenIs(b, RAW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RAW);
    exit_section_(b, m, RAW_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // RENDER (STRING_LITERAL | variable_lookup) ((FOR | WITH) variable_lookup AS IDENTIFIER | (COMMA property)*)?
  public static boolean render_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "render_tag")) return false;
    if (!nextTokenIs(b, RENDER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RENDER);
    r = r && render_tag_1(b, l + 1);
    r = r && render_tag_2(b, l + 1);
    exit_section_(b, m, RENDER_TAG, r);
    return r;
  }

  // STRING_LITERAL | variable_lookup
  private static boolean render_tag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "render_tag_1")) return false;
    boolean r;
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = variable_lookup(b, l + 1);
    return r;
  }

  // ((FOR | WITH) variable_lookup AS IDENTIFIER | (COMMA property)*)?
  private static boolean render_tag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "render_tag_2")) return false;
    render_tag_2_0(b, l + 1);
    return true;
  }

  // (FOR | WITH) variable_lookup AS IDENTIFIER | (COMMA property)*
  private static boolean render_tag_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "render_tag_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = render_tag_2_0_0(b, l + 1);
    if (!r) r = render_tag_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (FOR | WITH) variable_lookup AS IDENTIFIER
  private static boolean render_tag_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "render_tag_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = render_tag_2_0_0_0(b, l + 1);
    r = r && variable_lookup(b, l + 1);
    r = r && consumeTokens(b, 0, AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // FOR | WITH
  private static boolean render_tag_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "render_tag_2_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, WITH);
    return r;
  }

  // (COMMA property)*
  private static boolean render_tag_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "render_tag_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!render_tag_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "render_tag_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA property
  private static boolean render_tag_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "render_tag_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SCHEMA
  public static boolean schema_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "schema_tag")) return false;
    if (!nextTokenIs(b, SCHEMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SCHEMA);
    exit_section_(b, m, SCHEMA_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // SECTION (STRING_LITERAL | variable_lookup)
  public static boolean section_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "section_tag")) return false;
    if (!nextTokenIs(b, SECTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SECTION);
    r = r && section_tag_1(b, l + 1);
    exit_section_(b, m, SECTION_TAG, r);
    return r;
  }

  // STRING_LITERAL | variable_lookup
  private static boolean section_tag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "section_tag_1")) return false;
    boolean r;
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = variable_lookup(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SECTIONS (STRING_LITERAL | variable_lookup)
  public static boolean sections_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sections_tag")) return false;
    if (!nextTokenIs(b, SECTIONS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SECTIONS);
    r = r && sections_tag_1(b, l + 1);
    exit_section_(b, m, SECTIONS_TAG, r);
    return r;
  }

  // STRING_LITERAL | variable_lookup
  private static boolean sections_tag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sections_tag_1")) return false;
    boolean r;
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = variable_lookup(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // item*
  static boolean shopifyLiquidFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shopifyLiquidFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shopifyLiquidFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // STYLE
  public static boolean style_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "style_tag")) return false;
    if (!nextTokenIs(b, STYLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STYLE);
    exit_section_(b, m, STYLE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // STYLESHEET
  public static boolean stylesheet_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stylesheet_tag")) return false;
    if (!nextTokenIs(b, STYLESHEET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STYLESHEET);
    exit_section_(b, m, STYLESHEET_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // TABLEROW IDENTIFIER IN (variable_lookup | range_expression) (property)*
  public static boolean tablerow_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablerow_tag")) return false;
    if (!nextTokenIs(b, TABLEROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TABLEROW, IDENTIFIER, IN);
    r = r && tablerow_tag_3(b, l + 1);
    r = r && tablerow_tag_4(b, l + 1);
    exit_section_(b, m, TABLEROW_TAG, r);
    return r;
  }

  // variable_lookup | range_expression
  private static boolean tablerow_tag_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablerow_tag_3")) return false;
    boolean r;
    r = variable_lookup(b, l + 1);
    if (!r) r = range_expression(b, l + 1);
    return r;
  }

  // (property)*
  private static boolean tablerow_tag_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablerow_tag_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tablerow_tag_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tablerow_tag_4", c)) break;
    }
    return true;
  }

  // (property)
  private static boolean tablerow_tag_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablerow_tag_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assign_tag | break_tag | capture_tag | endcapture_tag | case_tag | endcase_tag |
  //     comment_tag | endcomment_tag | continue_tag | cycle_tag | decrement_tag |
  //     echo_tag | else_tag | elsif_tag | for_tag | endfor_tag | form_tag | endform_tag |
  //     if_tag | endif_tag | ifchanged_tag | increment_tag | javascript_tag |
  //     endjavascript_tag | layout_tag | liquid_tag_kw | paginate_tag | endpaginate_tag |
  //     raw_tag | endraw_tag | render_tag | schema_tag | endschema_tag |
  //     section_tag | sections_tag | style_tag | endstyle_tag | stylesheet_tag |
  //     tablerow_tag | endtablerow_tag | unless_tag | endunless_tag | when_tag |
  //     generic_tag
  static boolean tag_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_body")) return false;
    boolean r;
    r = assign_tag(b, l + 1);
    if (!r) r = break_tag(b, l + 1);
    if (!r) r = capture_tag(b, l + 1);
    if (!r) r = endcapture_tag(b, l + 1);
    if (!r) r = case_tag(b, l + 1);
    if (!r) r = endcase_tag(b, l + 1);
    if (!r) r = comment_tag(b, l + 1);
    if (!r) r = endcomment_tag(b, l + 1);
    if (!r) r = continue_tag(b, l + 1);
    if (!r) r = cycle_tag(b, l + 1);
    if (!r) r = decrement_tag(b, l + 1);
    if (!r) r = echo_tag(b, l + 1);
    if (!r) r = else_tag(b, l + 1);
    if (!r) r = elsif_tag(b, l + 1);
    if (!r) r = for_tag(b, l + 1);
    if (!r) r = endfor_tag(b, l + 1);
    if (!r) r = form_tag(b, l + 1);
    if (!r) r = endform_tag(b, l + 1);
    if (!r) r = if_tag(b, l + 1);
    if (!r) r = endif_tag(b, l + 1);
    if (!r) r = ifchanged_tag(b, l + 1);
    if (!r) r = increment_tag(b, l + 1);
    if (!r) r = javascript_tag(b, l + 1);
    if (!r) r = endjavascript_tag(b, l + 1);
    if (!r) r = layout_tag(b, l + 1);
    if (!r) r = liquid_tag_kw(b, l + 1);
    if (!r) r = paginate_tag(b, l + 1);
    if (!r) r = endpaginate_tag(b, l + 1);
    if (!r) r = raw_tag(b, l + 1);
    if (!r) r = endraw_tag(b, l + 1);
    if (!r) r = render_tag(b, l + 1);
    if (!r) r = schema_tag(b, l + 1);
    if (!r) r = endschema_tag(b, l + 1);
    if (!r) r = section_tag(b, l + 1);
    if (!r) r = sections_tag(b, l + 1);
    if (!r) r = style_tag(b, l + 1);
    if (!r) r = endstyle_tag(b, l + 1);
    if (!r) r = stylesheet_tag(b, l + 1);
    if (!r) r = tablerow_tag(b, l + 1);
    if (!r) r = endtablerow_tag(b, l + 1);
    if (!r) r = unless_tag(b, l + 1);
    if (!r) r = endunless_tag(b, l + 1);
    if (!r) r = when_tag(b, l + 1);
    if (!r) r = generic_tag(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (tag_body)?
  public static boolean tag_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_content")) return false;
    Marker m = enter_section_(b, l, _NONE_, TAG_CONTENT, "<tag content>");
    tag_content_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // (tag_body)
  private static boolean tag_content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_content_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tag_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UNLESS condition
  public static boolean unless_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unless_tag")) return false;
    if (!nextTokenIs(b, UNLESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNLESS);
    r = r && condition(b, l + 1);
    exit_section_(b, m, UNLESS_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // literal | variable_lookup | range_expression
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = literal(b, l + 1);
    if (!r) r = variable_lookup(b, l + 1);
    if (!r) r = range_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (accessor)*
  public static boolean variable_lookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_lookup")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && variable_lookup_1(b, l + 1);
    exit_section_(b, m, VARIABLE_LOOKUP, r);
    return r;
  }

  // (accessor)*
  private static boolean variable_lookup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_lookup_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variable_lookup_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_lookup_1", c)) break;
    }
    return true;
  }

  // (accessor)
  private static boolean variable_lookup_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_lookup_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = accessor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WHEN (value ((OR | COMMA) value)*)
  public static boolean when_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_tag")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && when_tag_1(b, l + 1);
    exit_section_(b, m, WHEN_TAG, r);
    return r;
  }

  // value ((OR | COMMA) value)*
  private static boolean when_tag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_tag_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && when_tag_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((OR | COMMA) value)*
  private static boolean when_tag_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_tag_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!when_tag_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "when_tag_1_1", c)) break;
    }
    return true;
  }

  // (OR | COMMA) value
  private static boolean when_tag_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_tag_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = when_tag_1_1_0_0(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OR | COMMA
  private static boolean when_tag_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_tag_1_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

}
