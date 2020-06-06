package ru.chudakov.otus.lesson13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {

    @Test
    void log() {
        Logger logger = Logger.getInstance();
        logger.log("test message 1");
        logger.log("test message 2");
        logger.log("test message 3");
        assert true;
    }



}