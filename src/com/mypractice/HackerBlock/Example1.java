package com.mypractice.HackerBlock;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int [] arr={1,0,0,8,0,5,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                int j=i;
                while (arr[j]==0){
                    j++;
                    if (j==arr.length){
                        System.out.println(Arrays.toString(arr));
                        return;
                    }
                }

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

            }
        }

    }
}
