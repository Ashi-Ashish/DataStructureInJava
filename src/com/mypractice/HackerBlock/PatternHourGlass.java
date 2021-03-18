package com.mypractice.HackerBlock;

import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();

        int k=0;
        int row=0;
        while (k<=2*n){
            int col=0;
            int l=0;
            while (l<=2*n){
                if(col<row){
                    System.out.print("  ");
                }else{
                    System.out.print(n-col+" ");
                }
                if(l<n){
                    col++;
                }else{
                    col--;
                }
                l++;
            }
            System.out.println();
            if(k<n){
                row++;
            }else{
                row--;
            }
            k++;
        }
    }
}
