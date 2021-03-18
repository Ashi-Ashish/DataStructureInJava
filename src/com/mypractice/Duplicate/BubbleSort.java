package com.mypractice.Duplicate;

import java.util.*;
public class BubbleSort {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        bubble(arr);
        display(arr);
    }
    public static void bubble(int [] arr){


        for (int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void display(int [] arr){
        for (int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);

        }
    }
}

