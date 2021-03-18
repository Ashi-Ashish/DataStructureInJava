package com.mypractice.lecture_28;

public class EggDrop {
    public static void main(String[] args) {

    }


    public static int eggDrop(int egg, int floor){
        if (floor==0){
            return 0;
        }
        if (egg==1){
            return floor;
        }

        int min=floor;

        for (int f = 1; f <=floor ; f++) {
            int toota=eggDrop(egg-1,f-1);
            int sabut=eggDrop(egg,floor-1);

            int max=1+Math.max(toota,sabut);
            if (max<min){
                min=max;
            }
        }
        return min;
    }
}