package com.problemsolving.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class GenerateParentheses {
  Deque<Character> stack = new ArrayDeque<>();
  List<String> result = new ArrayList<>();

  public List<String> generateParenthesis(int n) {
    backtrack(0, 0, n);
    return result;
  }

  private void backtrack(int openNumber, int closeNumber, int n) {
    if (openNumber == closeNumber && closeNumber == n) {
      StringBuilder temp = new StringBuilder();
      for (Character c : stack)
      {
        temp.append(c);
      }
      result.add(temp.toString());
    }

    if (openNumber < n) {
      stack.addLast('(');
      backtrack(openNumber + 1, closeNumber, n);
      stack.removeLast();
    }
    if (closeNumber < openNumber) {
      stack.addLast(')');
      backtrack(openNumber, closeNumber + 1, n);
      stack.removeLast();
    }
  }
}
