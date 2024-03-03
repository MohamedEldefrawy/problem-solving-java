package com.problemsolving;

import com.problemsolving.stack.EvaluateReversePolishNotation;

public class Main {
  public static void main(String[] args) {
    EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
    int result = evaluateReversePolishNotation.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});
    System.out.println(result);
  }
}
