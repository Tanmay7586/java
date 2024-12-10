package Arrays;

import java.util.Arrays;

public class _23MatrixSearch {
    public static int[] searchElement(int[][] matrix, int target) {
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns
        int row = 0, col = m - 1;

        // Traverse the matrix starting from the top-right corner
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col}; // Return the indices of the target
            } else if (matrix[row][col] < target) {
                row++; // Move down to the next row
            } else {
                col--; // Move left to the previous column
            }
        }
        return new int[]{-1, -1}; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int[] result = searchElement(matrix, 8);
        if (result[0] == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println(Arrays.toString(searchElement(matrix, 8)));
        }
    }
}
