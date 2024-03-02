package com.problemsolving.stack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {
  public boolean isValid(String s) {
    Stack<Character> characters = new Stack<>();
    HashMap<Character, Character> parentheses = new HashMap<>();
    parentheses.put('}', '{');
    parentheses.put(']', '[');
    parentheses.put(')', '(');
    for (int i = 0; i < s.length(); i++) {
      if (parentheses.containsKey(s.charAt(i)) &&  !characters.isEmpty() && Objects.equals(characters.peek(), parentheses.get(s.charAt(i)))) {
        characters.pop();
      }
      else
        characters.push(s.charAt(i));
    }
    return characters.isEmpty();
  }
}
