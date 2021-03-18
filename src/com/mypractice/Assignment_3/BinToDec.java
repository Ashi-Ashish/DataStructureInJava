package com.mypractice.Assignment_3;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int bin= s.nextInt();

        int dec=0;
        int r;
        int i=0;
        while(bin>0){
            r=bin%10;
            bin=bin/10;
            dec=(r* power(i))+dec;
            i++;
        }
        System.out.println(dec);
    }

    public static int power(int a){

        int x=1;
        for (int i = 0; i < a; i++) {
            x=x*2;
        }
        return x;
    }
}
