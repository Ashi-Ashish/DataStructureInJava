package com.mypractice.lecture_19.story;

public class Car {
    private BoshMusic music;
    private Engine engine;
    private ABS brake;

    public Car(){
        this.music=new BoshMusic();
        this.engine=new PetrolEngine();
        this.brake=new ABS();
    }

    public Car(Engine engine){
        this.music=new BoshMusic();
        this.engine=engine;
        this.brake=new ABS();

    }

    public void driftLeft(){
        this.brake.apply();
    }
    public void start(){
        this.engine.start();
    }

    public void stop(){
        this.brake.apply();
        this.engine.stop();
    }
    public void upgradeEngine(Engine engine){
        this.engine=engine;
    }
}