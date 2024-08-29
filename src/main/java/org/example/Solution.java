package org.example;

public class Solution {
    public void setZeroes(int[][] matrix) {
        //create 2 flags for the first row and column to indicate if they contain the value 0
        boolean col = false;
        boolean row = false;

        //check if the first column has 0
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                col = true;
            }
        }

        //check if the first row has 0
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                row = true;
            }
        }


        //find indexes that have the value 0
        //modify the front of the row/column if the value of the current index is 0
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //modify all values at the current row/column if the value of the front
        //of the row/column is 0
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        //modify the first row of the matrix if the row flag is true
        if (row) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        //modify the first column of the amtrix if the column flag is true
        if (col) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
