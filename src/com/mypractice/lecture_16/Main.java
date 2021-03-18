package com.mypractice.lecture_16;

public class Main {
    public static void main(String[] args) {
        Human dua = new Human("dua", 22);
//        dua.name="dua";
//        dua.age = 18;
        System.out.println(dua.age);
        System.out.println(dua.name);
        System.out.println(dua.money);

        for (int i = 0; i < 40; i++) {
            dua.udhaar();
        }

        System.out.println(dua.money);

        System.out.println(Human.population);

        Human ab = new Human();

        System.out.println(Human.population);
    }
}
