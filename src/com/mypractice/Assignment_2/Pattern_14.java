package com.mypractice.Assignment_2;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int l=0;

        int row = 0;

        while(l<2*n-1){

            int col=0;
            while(col<n-row-1){
                System.out.print("  ");
                col++;
            }
            col=0;
            int k= row +1;
            while (col<2*row+1){

                System.out.print(k+" ");
                if(col<row){
                    k++;
                }else{
                    k--;
                }
                col++;
            }
            System.out.println();
            l++;
            if(l<n){
                row++;
            }else{
                row--;
            }

        }
    }
}
