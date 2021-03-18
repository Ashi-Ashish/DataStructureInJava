package com.mypractice.lecture_17;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();
        car.stop();


        System.out.println(car.wheels);
        System.out.println(car.doors);

        Maruti maruti=new Maruti();
        maruti.start();
        maruti.stop();

        System.out.println(maruti.wheels);
        System.out.println(maruti.doors);

        Car my_car=new Maruti();

        my_car.start();
        my_car.stop();
        int s=sum("ashish",1,2,3,45,7);
    }

    public static int sum(String name, int... nums){
        return 0;
    }
}
