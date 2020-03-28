package ru.chudakov.otus.lesson1;

public final class OtusStringUtil {

    private OtusStringUtil() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public static char[] otusStringValue(OtusString string) {
        return string.getStringValue();
    }

    public static char[] otusStringSubstring(OtusString string, int beginIndex) {
        return new String(string.getStringValue())
                .substring(beginIndex)
                .toCharArray();
    }

    public static char[] otusStringSubstring(OtusString string, int beginIndex, int endIndex) {
        return new String(string.getStringValue())
                .substring(beginIndex, endIndex)
                .toCharArray();
    }
}
