package com.problemsolving.twopointers;

public class TwoSum2SortedArray {
  public int[] twoSum(int[] numbers, int target) {
    int secondPointer = numbers.length - 1;
    int[] result = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] + numbers[secondPointer] != target) {
        if (numbers[i] + numbers[secondPointer] > target) {
          secondPointer--;
          i--;
        }
      } else {
        result[0] = ++i;
        result[1] = ++secondPointer;
        break;
      }
    }

    return result;
  }
}
