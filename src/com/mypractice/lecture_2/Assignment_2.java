package com.mypractice.lecture_2;

import java.util.Scanner;

public class Assignment_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int val = binToDec(x);
        System.out.println(val);
        int y = anyToDec(x, 2);
        System.out.println(y);
        int z = decToBin(val);
        System.out.println(z);


    }

    public static int binToDec(int bin) {

        int dec = 0;
        int r;
        int place = 1;

        while (bin > 0) {

            r = bin % 10;
            bin = bin / 10;
            dec = dec + r * place;
            place = place * 2;

        }
        return dec;
    }

    public static int anyToDec(int any, int base) {

        int dec = 0;
        int r;
        int place = 1;

        while (any > 0) {

            r = any % 10;
            any = any / 10;
            dec = dec + r * place;
            place = place * base;

        }
        return dec;
    }

    public static int decToBin(int dec) {

        int bin = 0;
        int r;
        int place = 1;

        while (dec > 0) {

            r = dec % 2;
            dec = dec / 2;
            bin = bin + r * place;
            place = place * 10;

        }
        return bin;
    }

    public static int decToAny(int dec, int base) {

        int any = 0;
        int r;
        int place = 1;

        while (dec > 0) {

            r = dec % base;
            dec = dec / base;
            any = any + r * place;
            place = place * 10;

        }
        return any;
    }

    public static int any2any(int value, int source, int target) {

        int deci = anyToDec(value, source);

        int result = decToAny(deci, target);

        return result;
    }
}
