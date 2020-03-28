package ru.chudakov.otus.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtusStackTest {

    @Test
    void stackTest () {
        OtusString otusString1 = new OtusString("testValue1");
        OtusString otusString2 = new OtusString("testValue2");
        OtusString otusString3 = new OtusString("testValue3");

        OtusStack<OtusString> otusStack = new OtusStack<OtusString>();
        otusStack.push(otusString1);
        otusStack.push(otusString2);
        otusStack.push(otusString3);

        OtusString peekString = otusStack.peek();
        assertEquals(3, otusStack.size());
        assertEquals(otusString3, peekString);

        OtusString pollString = otusStack.poll();
        assertEquals(2, otusStack.size());
        assertEquals(otusString3, pollString);
    }

}