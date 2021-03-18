package com.mypractice.lecture_17;

public class Car {



    public int wheels=4;
    public int doors=4;

    public void start(){
        System.out.println("Starting like generic car.");

        dance();
    }
    public void stop(){
        System.out.println("Stopping like generic car.");
    }
    private void dance(){
        System.out.println("Dance");
    }
}
