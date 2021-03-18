package com.mypractice.Nagarro;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1, 1, 1},
                        {2, 2, 2},
                        {3, 3, 3},
                        {4, 4, 4},
                        {5, 5, 5} };

        spiral(arr);
    }

    private static void spiral(int[][] arr) {


        int t = 0;
        int b = arr.length-1;
        int l = 0;
        int r = arr[0].length-1;

        while ( t<= b && l <= r){

            for (int i = t; i <= b; i++) {
                System.out.print(arr[i][l]+" ");
            }
            l++;

            for (int i = l; i <= r && t <= b; i++) {
                System.out.print(arr[b][i]+" ");
            }
            b--;

            for (int i = b; i >= t && l <= r; i--) {
                System.out.print(arr[i][r]+" ");
            }
            r--;

            for (int i = r; i >= l && t <= r; i--) {
                System.out.print(arr[t][i]+" ");
            }
            t++;

        }

    }
}
