package ru.chudakov.otus.lesson1;

public class OtusString {
    private char[] stringValue;
    private int length;

    public OtusString() {
        stringValue = new char[]{};
        length = stringValue.length;
    }

    public OtusString(String stringLiteral) {
        stringValue = stringLiteral.toCharArray();
        length = stringValue.length;
    }

    public OtusString(char singleChar) {
        stringValue = new char[]{singleChar};
        length = stringValue.length;
    }

    public int getLength() {
        return length;
    }

    public char[] getStringValue() {
        return stringValue;
    }

    public void clean() {
        stringValue = new char[]{};
        length = stringValue.length;
    }
}
