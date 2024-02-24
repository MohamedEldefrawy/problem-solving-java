package com.problemsolving;

import com.problemsolving.twopointers.ContainerWithMostWater;

public class Main {
  public static void main(String[] args) {
    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
//    int result = containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
//    int result = containerWithMostWater.maxArea(new int[]{1, 1});
    int result = containerWithMostWater.maxArea(new int[]{0, 2});
//    int result = containerWithMostWater.maxArea(new int[]{1, 0, 0, 0, 0, 0, 0, 2, 2});
    System.out.println(result);
  }
}
