package com.mypractice.lecture_27;

public class Fibo {
    public static void main(String[] args) {

        int n = 5;
        Integer[] memory = new Integer[n + 1];
        System.out.println(fiboDP(n, memory));
    }

    public static int fiboDP(int n, Integer[] memory) {
        if (n < 2) {
            return n;
        }
        if (memory[n]!=null) {
            return memory[n];
        }

            memory[n] = fiboDP(n - 1, memory) + fiboDP(n - 2, memory);

        return memory[n];
    }

    public static int fiboItrDP(int n){
        int memory[]=new int[n+1];
        for (int i = 0; i <= n; i++) {


            if (n < 2) {
                memory[n] =n;
            }else {
                memory[i]=memory[i-1]+memory[i-2];
            }
        }
        return memory[n];
    }
}
