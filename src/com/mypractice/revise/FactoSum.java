package com.mypractice.revise;

import java.math.BigInteger;
import java.util.*;
public class FactoSum {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        BigInteger sum = new BigInteger("0");

        for (int i = 0; i < n; i++){
            BigInteger x = s.nextBigInteger();
            sum = facto(x).add(sum);
        }
        BigInteger m = BigInteger.valueOf(107);
        BigInteger ans = sum.mod(m);
        System.out.println(ans);
    }

    public static BigInteger facto(BigInteger num){
        if (num.intValue() < 2){
                return BigInteger.ONE;
        }
        BigInteger fact = new BigInteger("1");

        while (num.intValue() > 0){

            fact = fact.multiply(num);
            num = num.subtract(BigInteger.ONE);

        }
        return fact;
    }
}