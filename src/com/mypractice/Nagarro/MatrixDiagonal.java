package com.mypractice.Nagarro;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] arr = { {11, 1, 1, 1 ,11},
                        {2, 22, 2, 22, 2},
                        {3, 3, 33, 3, 3},
                        {4, 44, 4, 44, 4},
                        {55, 5, 5, 5, 55} };

        dia(arr);
    }

    private static void dia(int[][] arr) {


        int i = 0;
        int j = 0;
        int row = 5;
        int col = 5;

        while (i < row && j < col){
            System.out.print(arr[i][j] + " ");
            i++;
            j++;
        }
        System.out.println();
        i = 0;
        j = col - 1;

        while (i < row && j >= 0){
            System.out.print(arr[i][j] + " ");
            i++;
            j--;
        }
    }
}
