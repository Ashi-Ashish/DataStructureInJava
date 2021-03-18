package com.mypractice.lecture_9;

public class PowRec {
    public static void main(String[] args) {

        int x=4;
        int pow=10;
//        System.out.println(power(x,pow));
        System.out.println(fibo(4));
    }

    public static int power(int x,int pow){

        if(pow==0){
            return 1;
        }
        if (x==0){
            return 0;
        }

        return x*power(x,pow-1);
    }

    public static int fibo(int n){

        if(n<2){
            return n;
        }
        return fibo(n-1)+ fibo(n-2);
    }
}
