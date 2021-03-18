package com.mypractice.lecture_26;

public class Maze {
    public static void main(String[] args) {

        int row=10;
        int col=10;

        Integer[][] memory=new Integer[row+1][col+1];
        System.out.println(maze(row,col,memory));
    }

    public static int maze(int row, int col, Integer[][] memory) {
        if (row == 1 || col == 1) {
            return 1;
        }
        if (memory[row][col] != null) {
            return memory[row][col];
        }

        int sum = maze(row - 1, col, memory) + maze(row, col - 1, memory);
        memory[row][col] = sum;
        return sum;
    }
}
