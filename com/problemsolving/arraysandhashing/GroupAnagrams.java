package com.problemsolving.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String word : strs) {
      char[] chars = word.toCharArray();
      Arrays.sort(chars);
      if (!map.containsKey(String.valueOf(chars))) {
        map.put(String.valueOf(chars), new ArrayList<>());
        map.get(String.valueOf(chars)).add(word);
      } else {
        map.get(String.valueOf(chars)).add(word);
      }
    }
    return map.values().stream().toList();
  }

}
