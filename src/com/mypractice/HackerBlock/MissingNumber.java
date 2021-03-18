package com.mypractice.HackerBlock;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n-1];

        for (int i = 0; i < n-1; i++) {
            arr[i] = s.nextInt();
        }
        int i;
        for (i = 0; i < n-1; i++) {
            if(arr[i]!=i+1){
                break;
            }
        }
        System.out.println(i+1);
    }
}
