package src;

import src.com.problemsolving.arraysandhashing.GroupAnagrams;

public class Main {
  public static void main(String[] args) {
    GroupAnagrams groupAnagrams = new GroupAnagrams();
    var x = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    for (var sub : x
    ) {
      System.out.println(sub.toString());
    }
  }
}
