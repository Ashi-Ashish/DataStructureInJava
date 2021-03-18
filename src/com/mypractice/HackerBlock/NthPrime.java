package com.mypractice.HackerBlock;

import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i;
        int num = 1;
        int count = 0;

        while (count < n) {
            num = num + 1;
            i=2;
            while(i*i<=num){
                if (num % i == 0) {
                    break;
                }
                i++;
            }
            if (i*i> num) {
                count = count + 1;
            }
        }
        System.out.println(num);
    }
}