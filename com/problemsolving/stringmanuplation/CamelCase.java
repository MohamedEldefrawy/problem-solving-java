package com.problemsolving.stringmanuplation;

public class CamelCase {
  public int camelcase(String s) {
    int counter = 1;
    for (int i = 0; i < s.length(); i++) {
      if ((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) {counter++;}
    }

    return counter;
  }
}
