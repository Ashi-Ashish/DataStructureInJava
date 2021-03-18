package com.mypractice.lecture_27;

public class Maze {
    public static void main(String[] args) {

    }

    public static int mazeDP(int row, int col, Integer[][] memory) {
        if (row == 1 || col == 1) {
            return 1;
        }

        if (memory[row][col] != null) {
            return memory[row][col];
        }
        int sum = mazeDP(row - 1, col, memory) + mazeDP(row, col - 1, memory);

        memory[row][col] = sum;
        return sum;
    }


    public static int mazeItrDP(int row, int col){
        int[][] memory=new int[row+1][col+1];


        for (int r = 0; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                if (r==1||c==1){
                    memory[row][col]=1;
                }else {
                    memory[r][c]=memory[r-1][c]+memory[r][c-1];
                }
            }
        }
        return memory[row][col];
    }
}
