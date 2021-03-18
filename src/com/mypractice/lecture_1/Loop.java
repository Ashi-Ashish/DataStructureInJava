package com.mypractice.lecture_1;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /*int i =1;

         while (i <= 10){
            System.out.println("Welcome to My Practice "+ i);
            i = i+1;
        }*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while (row <=n){

            int col = 1;

            while (col <= row){
                System.out.print("*");
                col = col + 1;
            }
            System.out.println("");
            row = row +1;

        }


    }
}