package ru.chudakov.otus.lesson13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixMultiplier {

    public static int[][] multiply(int[][] a, int[][] b) {
        MatrixMultiplyResultSolver matrixMultiplyResultSolver = new MatrixMultiplyResultSolver(a, b);

        List<ThreadCounter> counters = Stream.of(new ThreadCounter(matrixMultiplyResultSolver)
                , new ThreadCounter(matrixMultiplyResultSolver)
                , new ThreadCounter(matrixMultiplyResultSolver))
                .collect(Collectors.toList());


        counters.forEach(Thread::start);

        counters.forEach(threadCounter -> {
            try {
                threadCounter.join();
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
        });
        return matrixMultiplyResultSolver.getResult();
    }
}

class ThreadCounter extends Thread {

    private final Logger logger = Logger.getInstance();

    private final MatrixMultiplyResultSolver solver;

    ThreadCounter(MatrixMultiplyResultSolver solver) {
        this.solver = solver;
    }

    @Override
    public void run() {
        ResultMatrixElementCounter counter = null;

        do {
            counter = solver.getNestCounter();

            if (counter != null) {
                logger.log("start count element[" + counter.getI() + "][" + counter.getJ() + "]");
                counter.count();
                logger.log("end count element[" + counter.getI() + "][" + counter.getJ() + "]");
            }
        } while (counter != null);

        this.interrupt();
    }
}