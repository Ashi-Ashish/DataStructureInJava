package com.mypractice.Assignment_2;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        int k=0;
        int row=0;
        while (k<2*n-1){
            int col=0;
            while(col<n-row-1){
                System.out.print("  ");
                col++;
            }
            col=0;
            while(col<2*row+1){
                System.out.print("* ");
                col++;
            }
            if (k<n-1){
                row++;
            }else if(k>=n-1) {
                row--;
            }
            k++;
            System.out.println();


        }
    }
}
