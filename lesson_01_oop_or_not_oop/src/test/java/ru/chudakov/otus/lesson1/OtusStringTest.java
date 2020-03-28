package ru.chudakov.otus.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtusStringTest {

    @Test
    void getLength() {
        OtusString otusString = new OtusString("testLength");
        assertEquals(10, otusString.getLength());
    }

    @Test
    void getStringValue() {
        OtusString otusString = new OtusString("testValue");
        assertEquals("testValue", new String(otusString.getStringValue()));
    }

    @Test
    void clean() {
        OtusString otusString = new OtusString("testValue");
        otusString.clean();
        assertEquals(0 , otusString.getLength());
    }
}