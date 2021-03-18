package com.mypractice.lecture_19.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human mohit=new Human("Mohit",24);
        Human ajeet=new Human("Ajeet",30);
        Human rohit=new Human("Rohit",15);
        System.out.println(mohit.compareTo(ajeet));

        Human[] humans={mohit,rohit,ajeet};
        Arrays.sort(humans);

        System.out.println(Arrays.toString(humans));
    }
}
