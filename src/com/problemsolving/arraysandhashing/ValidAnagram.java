package src.com.problemsolving.arraysandhashing;

import java.util.Arrays;

public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    char[] firstString = s.toCharArray();
    char[] secondString = t.toCharArray();
    Arrays.sort(firstString);
    Arrays.sort(secondString);
    return Arrays.equals(firstString,secondString);
  }
}
