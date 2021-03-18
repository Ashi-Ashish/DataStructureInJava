package com.mypractice.lecture_18;

public class DynamicQueue extends Queue {

    @Override
    public boolean insert(int value) {
        if (isFull()) {
            int temp[] = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(i+front)%data.length];
            }
            front=0;
            end=data.length;
            data = temp;
        }
        return super.insert(value);
    }
}
