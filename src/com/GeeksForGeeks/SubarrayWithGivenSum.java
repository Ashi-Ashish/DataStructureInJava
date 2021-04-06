package com.GeeksForGeeks;

import java.util.ArrayList;
import java.util.Scanner;

class SubArrayWithGivenSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subArraySum(m, n, s);
            for (int ii = 0; ii < res.size(); ii++) {
                System.out.println(res.toArray()[ii]);
            }
        }
    }
}

class Solution{
    public ArrayList<Integer> subArraySum(int[] arr, int n, int s){
        ArrayList<Integer> arrList = new ArrayList<>();
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == s) {
                    arrList.add(i+1);
                    arrList.add(j+1);
                    return arrList;
                }
            }
        }

        arrList.add(-1);
        return arrList;
    }
}
