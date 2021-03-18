package com.mypractice.lecture_18;

public class Stack {

    protected int[] data;
    private int top;

    private static final int DEFAULT_SIZE = 10;

    public Stack() {
        this.data = new int[DEFAULT_SIZE];
        this.top = -1;
    }


    public boolean push(int value) {

        if (isFull()) {
            return false;
        }
        this.data[++this.top] = value;
        return true;
    }


    public int pop() throws Exception {

        if (isEmpty()) {
            throw new Exception("Removing from empty stack");
        }
        return this.data[this.top--];
    }


    public int top() {
        return this.data[this.top];
    }


    public boolean isFull() {
        return top == data.length - 1;
    }


    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i <= top; i++) {
            builder.append(data[i]);
            if (i < top) {
                builder.append(", ");
            } else {
                builder.append("]");
            }
        }

        return builder.toString();
    }
}
