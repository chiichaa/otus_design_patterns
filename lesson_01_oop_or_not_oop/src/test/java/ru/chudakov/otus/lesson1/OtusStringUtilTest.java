package ru.chudakov.otus.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtusStringUtilTest {

    @Test
    void otusStringValue() {
        OtusString otusString = new OtusString("testValue");
        assertEquals(otusString.getStringValue(), OtusStringUtil.otusStringValue(otusString));
    }

    @Test
    void otusStringSubstring() {
        OtusString otusString = new OtusString("testValue");
        assertEquals("Value", new String(OtusStringUtil.otusStringSubstring(otusString, 4)));
    }

    @Test
    void testOtusStringSubstring() {
        OtusString otusString = new OtusString("testValue");
        assertEquals("test", new String(OtusStringUtil.otusStringSubstring(otusString, 0, 4)));
    }
}