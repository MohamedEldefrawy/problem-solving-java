package com.problemsolving.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

  private final List<Integer> stack;
  private final List<Integer> minimumStack;
  private int min = 0;


  public MinStack() {
    stack = new ArrayList<>();
    minimumStack = new ArrayList<>();
  }

  public void push(int val) {

    if (stack.isEmpty()) {
      stack.add(val);
    } else {
      stack.addLast(val);
    }

    if (minimumStack.isEmpty()) {
      minimumStack.add(val);
      min = val;
    } else {
      min = Math.min(val, min);
      minimumStack.addLast(min);

    }
  }

  public void pop() {
    if (!stack.isEmpty()) {
      stack.removeLast();
      minimumStack.removeLast();
      if (!minimumStack.isEmpty()) {
        min = minimumStack.getLast();
      }
    }
  }

  public int top() {
    return stack.getLast();
  }

  public int getMin() {
    return minimumStack.getLast();
  }

}
