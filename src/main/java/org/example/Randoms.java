package org.example;

import org.jetbrains.annotations.NotNull;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Random random = new Random();

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.ints(min, (max + 1))
                        .findFirst()
                        .getAsInt();
            }
        };
    }

}
