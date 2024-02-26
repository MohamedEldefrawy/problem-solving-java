package com.problemsolving.slidingwindow;

public class LongestRepeatingCharacterReplacement {
  public int characterReplacement(String s, int k) {
    int result = 0;
    int ptr1 = 0;
    int maxFrequency = 0;
    int[] frequency = new int[26];
    int ptr2 = 0;

    while (ptr2 < s.length()) {
      frequency[s.charAt(ptr2) - 'A']++;
      maxFrequency = Math.max(maxFrequency, frequency[s.charAt(ptr2) - 'A']);

      // break the window size since we couldn't replace more than k steps
      if (ptr2 - ptr1 + 1 - maxFrequency > k) {
        frequency[s.charAt(ptr1) - 'A']--;
        ptr1++;
      }

      result = Math.max(result, ptr2 - ptr1 + 1);
      ptr2++;
    }

    return result;
  }
}
