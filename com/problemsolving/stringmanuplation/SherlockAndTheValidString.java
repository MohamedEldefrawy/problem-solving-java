package com.problemsolving.stringmanuplation;

import java.util.HashSet;
import java.util.Set;

public class SherlockAndTheValidString {
  public String isValid(String s) {

    Set<Integer> frequencies = new HashSet<>();
    int[] frequencyArray = new int[26];
    for (int i = 0; i < s.length(); i++) {
      frequencyArray[s.charAt(i) - 'a'] += 1;
    }

    for (int i = 0; i < 26; i++) {
      if (frequencyArray[i] != 0) {
        frequencies.add(frequencyArray[i]);
      }
    }

    if (frequencies.size() > 2) {
      return "NO";
    }

    if (frequencies.size() == 1) {
      return "YES";
    }

    int min = frequencies.stream().mapToInt(Integer::intValue).min().getAsInt();
    int max = frequencies.stream().mapToInt(Integer::intValue).max().getAsInt();
    int sameAsMin = 0;
    int sameAsMax = 0;
    for (int i = 0; i < 26; i++) {
      if (frequencyArray[i] == min && frequencyArray[i] != 0) {
        sameAsMin++;
      } else if (frequencyArray[i] == max && frequencyArray[i] != 0) {
        sameAsMax++;
      }
    }

    if (min == 1 && sameAsMin == 1) {
      return "YES";
    }
    if (max - min == 1 && sameAsMax == 1) {
      return "YES";
    }
    return "NO";
  }
}
