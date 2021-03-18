package com.mypractice.HackerBlock;

import java.util.Scanner;

public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();

        int row=0;
        int k=0;
        while(k<=2*n){
            int col=0;
            int l=0;
            while(l<=2*n){
                if(col<=row){
                    System.out.print(n-col+" ");
                }else{
                    System.out.print("  ");
                }
                if(l<n) {
                    col++;
                }else{
                    col--;
                }
                l++;
            }
            if(k<n) {
                row++;
            }else{
                row--;
            }
            k++;
            System.out.println();
        }
    }
}
