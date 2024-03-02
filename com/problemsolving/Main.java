package com.problemsolving;

import com.problemsolving.arraysandhashing.FlippingTheMatrix;
import com.problemsolving.stack.MinStack;
import com.problemsolving.stack.ValidParentheses;
import com.problemsolving.stringmanuplation.MarsExploration;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(-10);
    minStack.push(14);
    minStack.getMin();
    minStack.getMin();
    minStack.push(-20);
    minStack.getMin();
    minStack.getMin();
    minStack.top();
    minStack.getMin();
    minStack.pop();
    minStack.push(10);
    minStack.push(-7);
    minStack.getMin();
    minStack.push(-7);
    minStack.pop();
    minStack.top();
    minStack.getMin();
    minStack.pop();


  }
}
