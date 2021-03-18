package com.mypractice.HackerBlock;


import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        reverse(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static int[] reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int t=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
        }
        return arr;
    }
}
