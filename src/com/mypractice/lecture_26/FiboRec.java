package com.mypractice.lecture_26;

public class FiboRec {
    public static void main(String[] args) {

        int n =6;
        Integer [] memory=new Integer[n+1];
        System.out.println(fibo(n,memory));
    }

    public static int fibo(int n,Integer[] memory){

        if (n<2){
            return n;
        }

        if (memory[n] != null){
            return memory[n];
        }

        memory[n]= fibo(n-1,memory)+fibo(n-2,memory);
        return memory[n];

    }
}
