package src;

import src.com.problemsolving.arraysandhashing.GroupAnagrams;
import src.com.problemsolving.arraysandhashing.ProductExceptSelf;
import src.com.problemsolving.arraysandhashing.TopKFrequentElement;
import src.com.problemsolving.arraysandhashing.ValidSudoku;

public class Main {
  public static void main(String[] args) {
    char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
    };
    ValidSudoku validSudoku = new ValidSudoku();
    var x = validSudoku.isValidSudoku(board);

    System.out.println(x);

  }
}
