package com.mypractice.lecture_14;

import java.util.Scanner;

public class NQ {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[][] arr = new boolean[n][n];

        display(arr , 0);
    }

    public static int NQueen(boolean[][] board, int row){
        if( row == board.length){
            return 1;
        }
        int sum = 0;

        for (int col = 0; col < board.length; col++) {
            if(safe(board, row , col)){
                board[row][col] = true;
                sum +=NQueen(board , row +1);
                board[row][col] = false;
            }
        }
        return sum;
    }

    public static void display(boolean[][] board, int row){
        if( row == board.length){
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if(board[i][j]) {
                        System.out.print("Q" + " ");
                    }
                    else{
                        System.out.print("*" + " ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return ;
        }

        for (int i = 0; i < board.length; i++) {
            if(safe(board, row , i)){
                board[row][i] = true;
                display(board , row +1);
                board[row][i] = false;
            }
        }
    }

    public static boolean safe(boolean[][] board , int row, int col){
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
        int i = row - 1;
        for (int j = col-1;j >=0 && i >=0; j--) {
            if(board[i--][j]){
                return false;
            }
        }
        i = row - 1;

        for (int j = col+1; j < board.length && i >=0; j++) {
            if(board[i--][j]){
                return false;
            }
        }

        return true;
    }
}
