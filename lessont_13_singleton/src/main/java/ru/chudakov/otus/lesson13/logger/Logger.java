package ru.chudakov.otus.lesson13.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public final class Logger implements ILogger {

    private static volatile ILogger instance;

    private final FileWriter fileWriter;

    private Logger() {
        URL logFileUrl = Thread
                .currentThread()
                .getContextClassLoader()
                .getResource("log.txt");
        File logFile = new File(logFileUrl.getFile());
        try {
            this.fileWriter = new FileWriter(logFile);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static ILogger getInstance() {
        ILogger result = instance;
        if (result == null) {
            synchronized (Logger.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Logger();
                }
            }
        }
        return result;
    }

    @Override
    public void log(String logInfo) {
        String threadName = Thread.currentThread().getName();
        String logString = threadName + ":" + logInfo;
        writeToFile(logString);
    }

    private synchronized void writeToFile(String logString) {
        try {
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(logString);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
