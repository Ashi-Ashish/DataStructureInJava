package com.mypractice.lecture_20;

public class ThreadSample extends Thread{


    public ThreadSample(String name, int priority){
        this.setPriority(priority);
        this.setName(name);
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(this.getName() + " is running "+ i);
                Thread.sleep(1);
            }
        }catch (Exception e){

        }
    }
}