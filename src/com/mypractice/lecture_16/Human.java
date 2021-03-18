package com.mypractice.lecture_16;

public class Human {
    public String name;
    public int age;
    public int money = 1000;

    public static int population = 0;

    public Human() {
        Human.population = population + 1;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.money=2000;
        Human.population = population + 1;
    }

    public void udhaar() {
        money = money - 100;
    }
}
