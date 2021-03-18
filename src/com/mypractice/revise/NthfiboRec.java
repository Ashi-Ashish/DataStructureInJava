package com.mypractice.revise;
import java.util.*;
public class NthfiboRec {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int [] m = new int[n+1];
        System.out.println(fibo(n,m));
    }

    public static int fibo(int n, int[] m){
        if (n <= 1){
            return n;
        }
        if (m[n] != 0){
            return m[n];
        }

        m[n-1] = fibo(n-1,m);
        m[n-2] = fibo(n-2,m);
        m[n] = m[n-1] + m[n-2];

        return m[n];
    }
}