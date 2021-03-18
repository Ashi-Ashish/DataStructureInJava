package com.mypractice.lecture_19.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println(queue);

        queue.remove();

        System.out.println(queue);
    }
}
