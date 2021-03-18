package com.mypractice.lecture_2;


public class Inverse {
    public static void main(String[] args) {

        int num=12;
        int x=inverse(num);
        System.out.println(x);

    }

    public static int power(int x, int n) {

        int result = 1;

        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }

    public static int inverse(int num){
        int res=0;

        while(num>0){
            int val = num%10;
            num=num/10;

            res=res+val*power(10,val-1);

        }
        return res;
    }
}