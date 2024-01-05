package src;

import src.com.problemsolving.arraysandhashing.ValidAnagram;

public class Main {
  public static void main(String[] args) {
    ValidAnagram validAnagram = new ValidAnagram();
    var x = validAnagram.isAnagram("anagram", "nagaram");
    System.out.println(x);
  }
}
