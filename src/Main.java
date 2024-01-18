package src;

import src.com.problemsolving.arraysandhashing.GroupAnagrams;
import src.com.problemsolving.arraysandhashing.ProductExceptSelf;
import src.com.problemsolving.arraysandhashing.TopKFrequentElement;

public class Main {
  public static void main(String[] args) {
    ProductExceptSelf productExceptSelf = new ProductExceptSelf();
    var x = productExceptSelf.productExceptSelf(new int[]{-1,1,0,-3,3});
    for (var sub : x
    ) {
      System.out.println(sub);
    }
  }
}
