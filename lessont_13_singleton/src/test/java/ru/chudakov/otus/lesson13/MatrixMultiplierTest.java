package ru.chudakov.otus.lesson13;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixMultiplierTest {

    @Test
    void multiply1() {
        int[][] a = new int[][]{
                {1, 0, 2, -1},
                {-2, 0, -4, 2},
                {1, 0, 2, -1},
                {3, 0, 6, -3}
        };

        int[][] b = new int[][]{
                {2, 1, 3, -1},
                {-4, -2, -6, 2},
                {2, 1, 3, -1},
                {6, 3, 9, -3}
        };

        int[][] result = MatrixMultiplier.multiply(a, b);

        for (int[] row : result) {
            for (int value : row) {
                assertEquals(0, value);
            }
        }
    }

    @Test
    void multiply2() {
        int[][] a = new int[][]{
                {7, 12, 4},
                {3, 19, 19},
                {8, 41, 1},
                {234, 7, 0}
        };

        int[][] b = new int[][]{
                {13, 4, 0, 3},
                {2, 13, 90, 1},
                {42, 45, 13, 13}
        };

        int[][] result = MatrixMultiplier.multiply(a, b);
        StringBuilder resultString = new StringBuilder();
        for (int[] ints : result) {
            resultString.append(Arrays.toString(ints)).append(" ");
        }
        assertEquals("[283, 364, 1132, 85] [875, 1114, 1957, 275] [228, 610, 3703, 78] [3056, 1027, 630, 709] ", resultString.toString());
    }
}