package ru.chudakov.otus.lesson1;

import java.util.LinkedList;
import java.util.Queue;

public class OtusStack <T extends OtusString> {

    private final LinkedList<OtusString> stack;

    public OtusStack() {
        this.stack = new LinkedList<OtusString>();
    }

    public boolean add(OtusString string) {
        return stack.add(string);
    }

    public boolean offer(OtusString string) {
        return stack.offer(string);
    }

    public OtusString remove() {
        return stack.remove();
    }

    public OtusString poll() {
        return stack.poll();
    }

    public OtusString peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

}
