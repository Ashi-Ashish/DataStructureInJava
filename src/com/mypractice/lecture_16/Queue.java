package com.mypractice.lecture_16;

import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> data; //encapsulation

    public Queue() {
        this.data = new ArrayList<>();
    }

    public void insert(int value) {
        data.add(value);
    }

    public int remove() {
        return data.remove(data.size() - 1);
    }

    public int front() {
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
   /* public void display(){
        System.out.println(data);
    }*/
    public void display(){
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            builder.append(data.get(i));
            builder.append(", ");
        }
        builder.append("END");
        System.out.println(builder);
    }
}
