package com.mypractice.lecture_9;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        int n = 10;
//        pd(n);
//        pi(n);
//        pdi(n);
        pdioddeven(n);
//        fact(n);
//        System.out.println(fact(n));
//        factBig(n);
//        System.out.println(factBig(n));
    }

    public static void pd(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        pd(n - 1);


    }

    public static void pi(int n) {
        if (n <= 0) {
            return;
        }
        pi(n - 1);
        System.out.println(n);

    }

    public static void pdi(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
    }

    public static void pdioddeven(int n) {
        if (n == 0) {
            return;
        }

        if (n % 2 == 1) {
            System.out.println(n);
        }
        pdioddeven(n-1);

        if (n%2 == 0){
            System.out.println(n);
        }
    }

    public static int fact(int n){

        if (n==0){
            return 1;
        }
        return n* fact(n-1);

    }

    public static BigInteger factBig(int n){

        if (n==0){
            return BigInteger.ONE;
        }

        BigInteger bign= new BigInteger(Integer.toString(n));

        return bign.multiply( factBig(n-1) );

    }
}
