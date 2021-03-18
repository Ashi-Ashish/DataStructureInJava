package com.mypractice.lecture_5;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        /*String line = s.nextLine();
        print(line);*/
//        String line = "hello";
        String line ="arora";
//        System.out.println(line.substring(1,2));
//        substring(line);
//        System.out.println(line.indexOf('h',0));
//        System.out.println(line.startsWith("o",1));

        System.out.println(pallin(line));
    }

    public static void print(String line){

        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
    public static void substring(String line){
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <= line.length(); j++) {
                System.out.println(line.substring(i,j));
            }
        }
    }

    public static boolean pallin(String line){
        line= line.toLowerCase();

        for (int i = 0; i < line.length()/2; i++) {
            if(line.charAt(i) != line.charAt(line.length()-1-i)){
                return false;
            }
        }
    return true;
    }
}
