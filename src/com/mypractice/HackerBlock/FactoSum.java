package com.mypractice.HackerBlock;

import java.math.BigInteger;
import java.util.Scanner;

public class FactoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        BigInteger result = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            BigInteger facto = new BigInteger("1");

            for (int j = arr[i]; j > 0; j--) {
                facto = facto.multiply(BigInteger.valueOf(j));
            }
            result = result.add(facto);
        }
        System.out.println(result.mod(BigInteger.valueOf(107)));
    }
}
