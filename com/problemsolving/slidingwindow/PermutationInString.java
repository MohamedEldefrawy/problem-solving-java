package com.problemsolving.slidingwindow;

public class PermutationInString {
  public boolean checkInclusion(String s1, String s2) {
    int[] s1Frequency = new int[26];
    int[] s2Frequency = new int[26];
    int matches;
    int right = s1.length();
    int left = 0;

    for (int i = 0; i < s1.length(); i++) {
      s1Frequency[s1.charAt(i) - 'a']++;
    }

    while (right <= s2.length()) {

      for (int i = left; i < right; i++) {
        s2Frequency[s2.charAt(i) - 'a']++;
      }

      matches = calculateMatches(s1Frequency, s2Frequency);

      if (matches != 26) {
        s2Frequency = new int[26];
        left++;
        right++;
      } else {return true;}
    }
    return false;
  }

  private int calculateMatches(int[] arr1, int[] arr2) {
    int matches = 0;
    for (int i = 0; i < 26; i++) {
      if (arr1[i] == arr2[i]) {matches++;}
    }
    return matches;
  }

}
