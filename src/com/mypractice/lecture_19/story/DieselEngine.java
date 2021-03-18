package com.mypractice.lecture_19.story;

public class DieselEngine implements Engine{


    @Override
    public void start() {
        System.out.println("start on DieselEngine");
    }

    @Override
    public void stop() {
        System.out.println("stop on DieselEngine");
    }
}
