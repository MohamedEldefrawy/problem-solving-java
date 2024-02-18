package src.com.problemsolving.arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValid(board, i, 0, i, 8)) // Check each row
                return false;
            if (!isValid(board, 0, i, 8, i)) // Check each column
                return false;
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValid(board, i, j, i + 2, j + 2)) // Check each sub-box
                    return false;
            }
        }

        return true;
    }

    private boolean isValid(char[][] board, int startRow, int startCol, int endRow, int endCol) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                if (board[i][j] != '.') {
                    if (map.containsKey(board[i][j]))
                        return false;
                    else
                        map.put(board[i][j], 1);
                }
            }
        }
        return true;
    }
}
