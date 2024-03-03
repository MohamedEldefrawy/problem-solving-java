package com.problemsolving.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
  public int evalRPN(String[] tokens) {
    Stack<Integer> arithmeticOperations = new Stack<>();

    for (String token : tokens) {
      switch (token) {
        case "+" -> arithmeticOperations.push(arithmeticOperations.pop() + arithmeticOperations.pop());
        case "-" -> {
          Integer secondNumber = arithmeticOperations.pop();
          Integer firstNumber = arithmeticOperations.pop();
          arithmeticOperations.push(firstNumber - secondNumber);
        }
        case "*" -> arithmeticOperations.push(arithmeticOperations.pop() * arithmeticOperations.pop());
        case "/" -> {
          Integer secondNumber = arithmeticOperations.pop();
          Integer firstNumber = arithmeticOperations.pop();
          arithmeticOperations.push(firstNumber / secondNumber);
        }
        default -> arithmeticOperations.push(Integer.parseInt(token));
      }
    }
    return arithmeticOperations.pop();
  }
}
