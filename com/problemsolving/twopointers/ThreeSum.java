package com.problemsolving.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        if (nums[i] + nums[left] + nums[right] == 0) {
          result.add(List.of(nums[i], nums[left], nums[right]));

          //  skip redundant numbers to enhance performance
          while (left < right && nums[left] == nums[left + 1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right - 1]) {
            right--;
          }

          left++;
          right--;
        } else if (nums[i] + nums[left] + nums[right] < 0) {
          left++;
        } else {
          right--;
        }
      }

    }

    var resultSet = new HashSet<>(result);

    return new ArrayList<>(resultSet);
  }
}
