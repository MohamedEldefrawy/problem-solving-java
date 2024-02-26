package com.problemsolving;

import com.problemsolving.slidingwindow.LongestRepeatingCharacterReplacement;

public class Main {
  public static void main(String[] args) {
    LongestRepeatingCharacterReplacement  longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
//    int result = longestRepeatingCharacterReplacement.characterReplacement("ABAB",2);
    int result = longestRepeatingCharacterReplacement.characterReplacement("AABABBA",1);
//    int result = longestRepeatingCharacterReplacement.characterReplacement("A",1);
//    int result = longestRepeatingCharacterReplacement.characterReplacement("ABAA",0);
//    int result = longestRepeatingCharacterReplacement.characterReplacement("ABBBABBB",2);
    System.out.println(result);
  }
}
