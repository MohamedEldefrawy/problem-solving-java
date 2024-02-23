package com.problemsolving;

import com.problemsolving.twopointers.ThreeSum;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

    ThreeSum threeSum = new ThreeSum();
//    List<List<Integer>> result = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//    List<List<Integer>> result = threeSum.threeSum(new int[]{0,1,1});
//    List<List<Integer>> result = threeSum.threeSum(new int[]{0,0,0});
//    List<List<Integer>> result = threeSum.threeSum(new int[]{0,0,0,0});
    List<List<Integer>> result = threeSum.threeSum(new int[]{-2,0,1,1,2});
    System.out.println(result.toString());
  }
}
