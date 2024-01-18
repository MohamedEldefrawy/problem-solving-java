package src;

import src.com.problemsolving.arraysandhashing.GroupAnagrams;
import src.com.problemsolving.arraysandhashing.TopKFrequentElement;

public class Main {
  public static void main(String[] args) {
    TopKFrequentElement topKFrequentElement = new TopKFrequentElement();
    var x = topKFrequentElement.topKFrequentBucketSort(new int[]{1,1,1,2,2,3},2);
    for (var sub : x
    ) {
      System.out.println(sub);
    }
  }
}
