package com.mypractice.lecture_20;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            Thread t=new ThreadSample("Thread "+i,5);
            t.start();
        }
    }
}