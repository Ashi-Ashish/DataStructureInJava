package com.mypractice.HackerBlock;

import java.util.Scanner;

public class DeepakPrime2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int t=s.nextInt();

        for (int i = 0; i < t; i++) {
            int m=s.nextInt();
            int n=s.nextInt();
            prime(m,n);
        }
    }

    public static void prime(int m, int n){


        for (int num = m; num <= n; num++) {

            int i;
            for (i = 2; i*i <=num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i*i>num){
                System.out.println(num);
            }
        }
    }
}
