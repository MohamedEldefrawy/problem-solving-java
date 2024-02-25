package com.problemsolving.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {
    Set<Character> currentSequence = new HashSet<>();
    int right = 0;
    int result = 0;
    int left = 0;
    while (right < s.length()) {

      while (currentSequence.contains(s.charAt(right))) {
        currentSequence.remove(s.charAt(left));
        left++;
      }
      currentSequence.add(s.charAt(right));
      result = Math.max(result, currentSequence.size());
      right++;
    }

    return result;
  }
}
