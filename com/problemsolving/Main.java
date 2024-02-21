package com.problemsolving;

import com.problemsolving.twopointers.TwoSum2SortedArray;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
//        ValidPalindrome validPalindrome = new ValidPalindrome();
//        boolean result = validPalindrome.isPalindrome("aa");
    TwoSum2SortedArray twoSum2SortedArray = new TwoSum2SortedArray();
//    var result = twoSum2SortedArray.twoSum(new int[]{1,2,3,4,4,9,56,90}, 8);
    var result = twoSum2SortedArray.twoSum(new int[]{2, 7, 11, 15}, 9);
//    var result = twoSum2SortedArray.twoSum(new int[]{-1,0}, -1);
//    var result = twoSum2SortedArray.twoSum(new int[]{5,25,75}, 100);
    System.out.println(Arrays.toString(result));
  }
}
