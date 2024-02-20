package src;

import src.com.problemsolving.arraysandhashing.LongestConsecutiveSequence;

public class Main {
    public static void main(String[] args) {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int result = longestConsecutiveSequence.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
        System.out.println(result);
    }
}
