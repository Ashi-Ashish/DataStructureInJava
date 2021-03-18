package com.mypractice.revise;

import java.util.Scanner;

public class spirat {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int m = s.nextInt();
            int n = s.nextInt();

            int [][] arr = new int [m][n];

            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++){
                    arr[i][j] = s.nextInt();
                }
            }

            spiral(arr,m,n);
        }

        public static void spiral(int [][] arr, int m, int n){

            int top = 0;
            int left = 0;
            int bottom = m-1;
            int right = n-1;

            while ( top <= bottom && left <= right){


                for (int r = top; r <= bottom; r++) {
                    System.out.print(arr[r][left] + ", ");

                }
                left++;

                for (int c = left; c <= right && top <= bottom; c++) {
                    System.out.print(arr[bottom][c] + ", ");

                }
                bottom--;

                for (int r = bottom; r >= top && left <= right; r--) {
                    System.out.print(arr[r][right] + ", ");

                }
                right--;

                for (int c = right; c >= left && top <= bottom; c--) {
                    System.out.print(arr[top][c] + ", ");

                }
                top++;

            }
            System.out.println("END");
        }
    }


