package com.mypractice.lecture_17.ds;

public class CustomArrayList {

    private int[] values;

    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        values = new int[DEFAULT_SIZE];
    }

    public void add(int v) {
        ensureCapacity();
        values[size] = v;
        size++;

    }

    private void ensureCapacity() {
        if (size < values.length) {
            return;
        } else {
            resize();
        }
    }

    private void resize() {
        int[] temp = new int[size * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = values[i];
        }

        values = temp;
    }

    public int get(int index) {
        return values[index];
    }

    public void set(int index, int v) {
        values[index] = v;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) {
            builder.append(values[i]);
            if (i < size - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
