package ru.chudakov.otus.lesson2;

import java.util.Arrays;

class MatrixMultiplyResultSolver {

    private final int[][] a;
    private final int[][] b;
    private final int[][] result;

    public MatrixMultiplyResultSolver(final int[][] a, final int[][] b) {
        this.a = a;
        this.b = b;
        int resultMatrixX = a.length;
        int resultMatrixY = b[0].length;
        this.result = new int[resultMatrixX][resultMatrixY];
        for (int i = 0; i < result.length; i++) {
            Arrays.fill(result[i], Integer.MIN_VALUE);
        }
    }

    public synchronized ResultMatrixElementCounter getNestCounter() {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] == Integer.MIN_VALUE) {
                    result[i][j] = 0;
                    return new ResultMatrixElementCounter(i, j, a, b, result);
                }
            }
        }
        return null;
    }

    public int[][] getResult() {
        return result;
    }
}
