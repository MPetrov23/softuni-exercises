package JavaAdvanced.Advanced.Generics.Lab.Jar;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> deq;

    public Jar() {
        this.deq = new ArrayDeque<>();
    }
    public void add (T element) {
        this.deq.push(element);
    }
    public T remove() {
        return this.deq.pop();
    }
}