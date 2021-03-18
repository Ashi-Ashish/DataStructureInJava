package com.mypractice.lecture_19.story;

public class PetrolEngine implements Engine{


    @Override
    public void start() {
        System.out.println("start on PetrolEngine");
    }

    @Override
    public void stop() {
        System.out.println("stop on PetrolEngine");
    }
}
