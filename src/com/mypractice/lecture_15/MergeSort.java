package com.mypractice.lecture_15;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length<=1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] first = Arrays.copyOfRange(arr, 0, mid);
        int[] second = Arrays.copyOfRange(arr,mid, arr.length);

        first =mergeSort(first);
        second= mergeSort(second);

        return merge(first, second);
    }

    public static int[] merge(int[] first, int[] second) {

        int k = 0;
        int i = 0;
        int j = 0;
        int arr[] = new int[first.length + second.length];
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                arr[k] = first[i];
                i++;
                k++;
            } else {
                arr[k] = second[j];
                j++;
                k++;
            }
        }

        while (j < second.length) {
            arr[k] = second[j];
            j++;
            k++;
        }

        while (i < first.length) {
            arr[k] = first[i];
            i++;
            k++;
        }

        return arr;
    }
}
