package com.mypractice.HackerBlock;

import java.util.Scanner;

public class MirrorStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        int k=0;
        int row=0;
        while (k<n){
            int col=0;
            while(col<n-row-1){
                System.out.print("  \t");
                col++;
            }
            col=0;
            while(col<2*row+1){
                System.out.print("* \t");
                col++;
            }
            if (k<n/2){
                row++;
            }else if(k>=n/2) {
                row--;
            }
            k++;
            System.out.println();


        }
    }
}
