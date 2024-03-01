package com.problemsolving.stringmanuplation;

import java.util.Locale;

public class Pangrams {
  public String pangrams(String s) {
    s = s.toLowerCase(Locale.ROOT);
    int[] frequency = new int[26];
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ') {
        frequency[s.charAt(i) - 'a'] += 1;
      }
    }

    for (int occurrence : frequency) {
      if (occurrence == 0) {
        return "not pangram";
      }
    }

    return "pangram";
  }
}
