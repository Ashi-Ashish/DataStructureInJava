package com.mypractice.HackerBlock;

import java.util.Scanner;

public class Nqueens {
    private boolean arr[][];
    private int row=0;
    private int col=0;

    public Nqueens(int n) {
        this.arr = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=false;
            }
        }
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        Nqueens q=new Nqueens(n);


        q.nqueens(q.row,q.col);

    }

    public void nqueens(int row,int col){

        for ( row = 0; row < arr.length; row++) {
            for ( col = 0; col < arr[row].length; col++) {
                arr[row][col]=true;
                nqueens(row++,col++);

            }
        }


    }
}
