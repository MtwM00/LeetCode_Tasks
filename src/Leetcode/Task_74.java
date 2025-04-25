package Leetcode;

public class Task_74 {

    /**
     Task_74. Search a 2D Matrix

     You are given an m x n integer matrix matrix with the following two properties:

     Each row is sorted in non-decreasing order.
     The first integer of each row is greater than the last integer of the previous row.
     Given an integer target, return true if target is in matrix or false otherwise.

     You must write a solution in O(log(m * n)) time complexity.

     Constraints:
     m == matrix.length
     n == matrix[i].length
     1 <= m, n <= 100
     -104 <= matrix[i][j], target <= 104

     */

    public static void main (String[] args) {

        Task_74 task_74 = new Task_74();
        int[][] matrix = {{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}};

        int target = 16;


        System.out.println(matrix.length);
        System.out.println(task_74.searchMatrix(matrix, target));

    }

    public boolean searchMatrix2(int[][] matrix, int target) {

        int index = 0;

        for (int i = 1; i < matrix.length; i++) {
            if (target < matrix[i][0]) {
                break;
            }
            index++;
        }
        for (int i = 0; i < matrix[index].length; i++) {
            if (matrix[index][i] == target) {
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        int first = 0;
        int second = matrix.length - 1;
        int indexL = 0;
        int indexR = matrix[0].length - 1;

        while (first <= second) {

            if (matrix[first][0] <= target && matrix[first][matrix[0].length - 1] >= target) {
                while (indexL <= indexR)  {
                    if (matrix[first][indexL] == target || matrix[first][indexR] == target) return true;
                    indexL++;
                    indexR--;
                }
                return false;
            }
            if (matrix[second][0] <= target && matrix[second][matrix[0].length - 1] >= target) {
                while (indexL <= indexR)  {
                    if (matrix[second][indexL] == target || matrix[second][indexR] == target) return true;
                    indexL++;
                    indexR--;
                }
                return false;
            }
            first++;
            second--;
        }
        return false;
    }

    public boolean searchMatrix3(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bot = rows - 1;

        while (top <= bot) {
            int row = (top + bot) / 2;
            if (target > matrix[row][cols - 1]) {
                top = row + 1;
            } else if (target < matrix[row][0]) {
                bot = row - 1;
            } else {
                break;
            }
        }

        if (!(top <= bot)) return false;

        int row = (top + bot) / 2;
        int l = 0;
        int r = cols - 1;

        while (l <= r) {
            int middle = (l + r) / 2;
            if (target > matrix[row][middle]) {
                l = middle + 1;
            } else if (target < matrix[row][middle]) {
                r = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
