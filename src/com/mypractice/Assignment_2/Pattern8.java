package com.mypractice.Assignment_2;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int col;
        int row=1;
        while (row<=n){
            col=1;
            while (col<=row){
                if(col== 1 || col==row){
                    System.out.print(row+" ");
                }else{
                    System.out.print("0 ");
                }

                col++;
            }
            row++;
            System.out.println();
        }
    }
}
