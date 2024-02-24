package com.problemsolving.twopointers;

public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    int xAxis = height.length - 1;
    int left = 0;
    int right = height.length - 1;
    int area = 0;
    while (left != right) {
      int result = Math.min(height[left], height[right]) * xAxis;
      if (result > area) {area = result;}
      if (height[left] <= height[right]) {
        left++;
        xAxis--;
      } else if (height[right] < height[left]) {
        right--;
        xAxis--;
      }
    }

    return area;
  }
}
