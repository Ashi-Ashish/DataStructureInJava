package com.mypractice.HackerBlock;

import java.util.Scanner;

public class RecLexoOrder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        lexo(n,1);
    }

    public static void lexo(int n,int num) {
        if(num>n){
            return;
        }
        for ( int j = num*10+1; j <=num*10+9; j++) {
            if (j<n){
                System.out.println(num);
            }
            for (int i = 0; i < 10; i++) {
                if (j>=n) {
                    return;
                }

                lexo(n,(j*10)+i);
            }


        }
    }
}
