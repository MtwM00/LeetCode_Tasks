package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Task_36 {

    /**
    Task 36. Valid sudoku.
    Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

        Each row must contain the digits 1-9 without repetition.
        Each column must contain the digits 1-9 without repetition.
        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

    Note:
        A Sudoku board (partially filled) could be valid but is not necessarily solvable.
        Only the filled cells need to be validated according to the mentioned rules.

    Constraints:
    board.length == 9
    board[i].length == 9
    board[i][j] is a digit 1-9 or '.'.
    */

    public static void main(String[] args) {


        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};
        Task_36 main = new Task_36();
        boolean isValid = main.isValidSudoku(board);
        System.out.println(isValid);


//        int[][] boardInt = new int[9][9];
//
//
//        for (int i = 0; i < board.length; i++){
//
//            for (int j = 0; j < board[i].length; j++){
//
//                if(board[i][j] != '.'){
//                    boardInt[i][j] = board[i][j] - '0';
//                }else {
//                    boardInt[i][j] = board[i][j] - board[i][j];
//                }
//            }
//        };





//        for (int[] x : boardInt) {
//            for (int y : x){
//                System.out.print(y + " ");
//            }
//            System.out.println();
//        }





    }

    public boolean isValidSudoku(char[][] board) {

        List<Character> checkList = new ArrayList<>();
        int bLength = board.length;

        // check row
        for (char[] row : board) {
            for (char val : row) {
                if (val != '.'){
                    if(checkList.contains(val)){
                        return false;
                    }else {
                        checkList.add(val);
                    }
                }
            }
            checkList.clear();
        }

        // check column
        for (int i = 0; i < bLength; i++){
            for (int j = 0; j < bLength; j++){
                if (board[j][i] != '.'){
                    if(checkList.contains(board[j][i])){
                        return false;
                    }else {
                        checkList.add(board[j][i]);
                    }
                }
            }
            checkList.clear();
        }

        // check square
        for (int indexC = 0; indexC < 9; indexC += 3) {
            for (int index = 0; index < 9; index += 3) {

                for (int r = 0 + index; r < 3 + index; r++) {
                    for (int c = 0 + indexC; c < 3 + indexC; c++) {
                        if (board[r][c] != '.'){
                            if(checkList.contains(board[r][c])){
                                return false;
                            }else {
                                checkList.add(board[r][c]);
                            }
                        }
                    }
                }
                checkList.clear();
            }
        }


        return true;
    }

}
