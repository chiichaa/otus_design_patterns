package ru.chudakov.otus.lesson13;

import org.junit.jupiter.api.Test;
import ru.chudakov.otus.lesson13.logger.ILogger;
import ru.chudakov.otus.lesson13.logger.Logger;

class LoggerTest {

    @Test
    void log() {
        ILogger ILogger = Logger.getInstance();
        ILogger.log("test message 1");
        ILogger.log("test message 2");
        ILogger.log("test message 3");
        assert true;
    }



}