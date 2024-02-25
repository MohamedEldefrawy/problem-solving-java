package com.problemsolving;

import com.problemsolving.slidingwindow.LongestSubStringWithoutRepeatingCharacters;

public class Main {
  public static void main(String[] args) {
    LongestSubStringWithoutRepeatingCharacters
        longestSubStringWithoutRepeatingCharacters
        = new LongestSubStringWithoutRepeatingCharacters();
//    int result = longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
    int result = longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
//    int result = longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("au");
//    int result = longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("   ");
//    int result = longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("bdb");
//    int result = longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf");
//    int result = longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab");
    System.out.println(result);
  }
}
