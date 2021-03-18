package com.mypractice.Nagarro;

public class Rotate2DArray {
    public static void main(String[] args) {
        int[][] arr = { {1, 1, 1, 1 ,1},
                        {2, 2, 2, 2, 2},
                        {3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4},
                        {5, 5, 5, 5, 5} };



        rotate(arr);
    }

    private static void rotate(int[][] arr) {



        int t = 0;
        int b = arr.length-1;
        int l = 0;
        int r = arr[0].length-1;
        for (int i = 0; i < arr.length / 2 ; i++) {

            int j = l;
            while ( j < r ){

                int temp = arr[b-j][l];
                arr[b-j][l] = arr[b][r-j];
                arr[b][r-j] = arr[t+j][r];
                arr[t+j][r] = arr[t][l+j];
                arr[t][l+j] = temp;
                j++;
            }

            t++;
            b--;
            l++;
            r--;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }


}
