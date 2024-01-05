package src.com.problemsolving.arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicates {
  public boolean containsDuplicate(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int number : nums
    ) {
      if (!map.containsKey(number)) {map.put(number, 1);} else {return true;}
    }
    return false;
  }
}
