package com.problemsolving.arraysandhashing;

import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        int[] postfix = new int[nums.length];
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        postfix[nums.length - 1] = nums[nums.length - 1];

        // prepare prefix array
        for (int i = 0; i < nums.length - 1; i++) {
            prefix[i + 1] = prefix[i] * nums[i + 1];
        }

        // prepare postfix array
        for (int i = nums.length - 1; i >= 1; i--) {
            postfix[i - 1] = postfix[i] * nums[i - 1];
        }

        int prefixIndex = -1;
        int postFixIndex = 1;
        for (int i = 0; i < result.length; i++) {
            if (i > prefixIndex && i < postFixIndex && prefixIndex != -1 && postFixIndex != result.length) {
                result[i] = prefix[prefixIndex] * postfix[postFixIndex];
                prefixIndex++;
                postFixIndex++;
            } else if (postFixIndex >= result.length) {
                result[i] = prefix[prefixIndex];
                prefixIndex++;
            } else {
                result[i] = postfix[postFixIndex];
                prefixIndex++;
                postFixIndex++;
            }
        }

        return result;
    }

    public int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];
        int left = 1, right = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
        }

        for (int i = nums.length - 1; i > 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}
