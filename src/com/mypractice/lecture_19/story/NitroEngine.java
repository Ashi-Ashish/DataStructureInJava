package com.mypractice.lecture_19.story;

public class NitroEngine implements Engine{


    @Override
    public void start() {
        System.out.println("start on NitroEngine");
    }

    @Override
    public void stop() {
        System.out.println("stop on NitroEngine");
    }
}
