package com.problemsolving;

import com.problemsolving.bitmanipulation.BitWiseAndOfNumbersRange;

public class Main {
  public static void main(String[] args) {

    BitWiseAndOfNumbersRange bitWiseAndOfNumbersRange = new BitWiseAndOfNumbersRange();
//    int result = bitWiseAndOfNumbersRange.rangeBitwiseAnd(5,7);
//    int result = bitWiseAndOfNumbersRange.rangeBitwiseAnd(0,0);
    int result = bitWiseAndOfNumbersRange.rangeBitwiseAnd(1,2147483647);
    System.out.println(result);
  }
}
