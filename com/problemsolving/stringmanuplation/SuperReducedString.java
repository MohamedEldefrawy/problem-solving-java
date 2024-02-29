package com.problemsolving.stringmanuplation;

public class SuperReducedString {
  public String superReducedString(String s) {
    if (s.length() == 1) {return s;}
    StringBuilder stringBuilder = new StringBuilder(s);

    int firstPointer = 0;
    int secondPointer = 1;
    while (secondPointer < stringBuilder.length()) {
      if (stringBuilder.charAt(firstPointer) == stringBuilder.charAt(secondPointer)) {
        stringBuilder.deleteCharAt(firstPointer);
        stringBuilder.deleteCharAt(firstPointer);
        firstPointer = 0;
        secondPointer = 1;
      } else {
        firstPointer++;
        secondPointer++;
      }
    }
    return stringBuilder.isEmpty() ? "Empty String" : stringBuilder.toString();
  }

}
