package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void setZeroesTest() {
        Solution solution = new Solution();
        int[][] inputOne = new int[][] {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        int[][] outputOne = new int[][] {
                {0,0,0,0},
                {0,4,5,0},
                {0,3,1,0}
        };
        solution.setZeroes(inputOne);
        assertArrayEquals(outputOne, inputOne);

        int[][] inputTwo = new int[][] {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        int[][] outputTwo = new int[][] {
                {1,0,1},
                {0,0,0},
                {1,0,1}
        };
        solution.setZeroes(inputTwo);
        assertArrayEquals(inputTwo,outputTwo);
    }

}