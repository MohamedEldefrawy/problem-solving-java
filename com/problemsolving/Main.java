package com.problemsolving;

import com.problemsolving.stringmanuplation.CamelCase;
import com.problemsolving.stringmanuplation.SuperReducedString;

public class Main {
  public static void main(String[] args) {
    SuperReducedString superReducedString = new SuperReducedString();
//    String result = superReducedString.superReducedString("aaabccddd");
    String result = superReducedString.superReducedString("aa");
    System.out.println(result);
  }
}
