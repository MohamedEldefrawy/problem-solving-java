package src;

import src.com.problemsolving.arraysandhashing.LongestConsecutiveSequence;
import src.com.problemsolving.twopointers.ValidPalindrome;

public class Main {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
//        boolean result = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
//        boolean result = validPalindrome.isPalindrome("race a car");
//        boolean result = validPalindrome.isPalindrome("");
        boolean result = validPalindrome.isPalindrome("aa");
        System.out.println(result);
    }
}
