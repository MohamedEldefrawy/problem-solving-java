package com.problemsolving.bitmanipulation;

public class BitWiseAndOfNumbersRange {
  public int rangeBitwiseAnd(int left, int right) {
    int shiftingCounter = 0;
    while (left != right) {
      left = left >> 1;
      right = right >> 1;
      shiftingCounter++;
    }
    return left << shiftingCounter;
  }
}
