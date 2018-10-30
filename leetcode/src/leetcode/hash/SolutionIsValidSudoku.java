package leetcode.hash;

import java.util.HashSet;
import java.util.Set;

public class SolutionIsValidSudoku {


    public static void main(String[] args) {

        char character[][] = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        boolean b = isValidSudoku(character);
        System.err.println(b);
    }
    public static boolean isValidSudoku(char[][] board) {


        Set<Character> row = new HashSet<>();
        Set<Character> column = new HashSet<>();
        Set<Character> area = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            row.clear();
            column.clear();

            for (int j = 0; j < 9; j++) {

                if (i % 3 == 0 && j % 3 == 0) {
                    area.clear();
                    for (int r = i; r < i + 3; r++) {
                        for (int m = j; m < j + 3; m++) {
                            if (board[r][m] != '.') {
                                if (area.contains(board[r][m])) {
                                    return false;
                                }
                                area.add(board[r][m]);
                            }
                        }
                    }
                }


                if (board[i][j] != '.') {
                    if (row.contains(board[i][j])) {
                        return false;
                    }
                    row.add(board[i][j]);
                }
                if (board[j][i] != '.') {
                    if (column.contains(board[j][i])) {
                        return false;
                    }
                    column.add(board[j][i]);
                }
            }
        }

        return true;
    }
}
