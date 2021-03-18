package com.mypractice.lecture_9;

public class PatternRec {
    public static void main(String[] args) {
        patternDec(4,0);
        System.out.println();
        patternIn(3,0);

    }

    public static void patternIn(int row, int col){
        if (row==0){
            return;
        }
        if (row==col){
            System.out.println();
            patternIn(row-1,0);
            return;
        }
        System.out.print("* ");
        patternIn(row,col+1);
    }

    public static void patternDec(int row, int col){
        if (row==0){
            return;
        }
        if (row==col){

            patternDec(row-1,0);
            System.out.println();
            return;
        }

        patternDec(row,col+1);
        System.out.print("* ");
    }
}
