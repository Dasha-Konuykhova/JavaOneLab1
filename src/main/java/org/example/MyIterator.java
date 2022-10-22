package org.example;
import java.util.Iterator;

/**
 * Template iterator
 */
public class MyIterator <T> implements Iterator {
    private T[] values;
    private int index = 0;

    MyIterator(T[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
}
