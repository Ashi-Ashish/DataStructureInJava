package com.mypractice.lecture_20;

import java.util.Arrays;

public class HumanClient {
    public static void main(String[] args) {
        Human mohit = new Human("mohit", 40);
        Human sumit = new Human("sumit", 25);
        Human rahul = new Human("rahul", 20);
        Human raghav = new Human("raghav", 30);

        Human[] humans = {mohit, sumit, raghav, rahul};

        Arrays.sort(humans, (h1, h2) -> {
            return -h1.getName().compareTo(h2.getName());
        });

        for (int i = 0; i < humans.length; i++) {
            System.out.print(humans[i].getName()+"\t"+ humans[i].getAge());
            System.out.println();
        }

    }
}
