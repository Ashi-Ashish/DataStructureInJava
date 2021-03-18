package com.mypractice.HackerBlock;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int row=0;
        while(row<n){
            int col=0;
            while(col<=row){
                System.out.print("*");
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
