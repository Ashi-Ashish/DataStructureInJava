package com.mypractice.lecture_20;

import java.util.ArrayList;

public class PrimeThread extends Thread {

    private ArrayList<Integer> list;
    private int num;

    public PrimeThread(ArrayList<Integer> list, int num) {
        this.list=list;
        this.num=num;
    }
    @Override
    public void run(){
        if (isPrime(num)){
            System.out.println(num);
        }
    }

    public boolean isPrime(int num){
        if (num<2){
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}