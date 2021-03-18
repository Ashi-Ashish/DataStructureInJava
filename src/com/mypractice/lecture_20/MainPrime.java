package com.mypractice.lecture_20;

import java.util.ArrayList;

public class MainPrime {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            PrimeThread t=new PrimeThread(list,i);
            t.start();
        }
    }
}
