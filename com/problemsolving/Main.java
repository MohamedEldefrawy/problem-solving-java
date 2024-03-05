package com.problemsolving;

import com.problemsolving.stack.EvaluateReversePolishNotation;
import com.problemsolving.stack.GenerateParentheses;

public class Main {
  public static void main(String[] args) {
    EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
    GenerateParentheses generateParentheses = new GenerateParentheses();
    var result = generateParentheses.generateParenthesis(3);
    System.out.println(result.toString());
  }
}
