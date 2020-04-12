package ru.chudakov.otus.lesson2;

class ResultMatrixElementCounter {

    private final int i;
    private final int j;
    private final int[][] a;
    private final int[][] b;
    private final int[][] result;

    public ResultMatrixElementCounter(int i, int j, int[][] a, int[][] b, int[][] result) {
        this.i = i;
        this.j = j;
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public void count() {
        int matrixElementTempResult = 0;
        for (int c = 0; c < a[i].length; c++) {
            matrixElementTempResult += a[i][c] * b[c][j];
        }
        result[i][j] = matrixElementTempResult;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
