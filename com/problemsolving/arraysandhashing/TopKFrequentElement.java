package com.problemsolving.arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class TopKFrequentElement {
  public int[] topKFrequent(int[] nums, int k) {
    List<Integer> sortedKeys = new ArrayList<>();
    int[] result = new int[k];
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    map.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))
        .forEach((integer, integer2) -> sortedKeys.add(integer));
    for (int i = 0; i<k;i++)
    {
      result[i] = sortedKeys.get(i);
    }
    return result;
  }

  public int[] topKFrequentBucketSort(int[] nums, int k) {
    List<Integer>[] bucket = new ArrayList[nums.length + 1];
    int[] result = new int[k];
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    map.keySet().forEach(key -> {
      int freq = map.get(key);
      if (Objects.isNull(bucket[freq])) {
        bucket[freq] = new ArrayList<>();
      }
      bucket[freq].add(key);
    });
    int index = 0;

    for (int i = nums.length; i >= 0; i--)
      if (bucket[i] != null)
        for (int val : bucket[i]){
          result[index++] = val;
          if(index == k)
            return result;
        }
     return result;
  }
}
