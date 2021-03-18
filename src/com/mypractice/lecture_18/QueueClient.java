package com.mypractice.lecture_18;

public class QueueClient {

    public static void main(String[] args) throws IndexOutOfBoundsException{
        Queue queue=new DynamicQueue();

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        System.out.println(queue.remove());
        queue.insert(4);
        queue.insert(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        System.out.println(queue.remove());
        queue.insert(6);
        queue.insert(7);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        System.out.println(queue.remove());
        queue.insert(8);


        try {
            System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.remove());


        }catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(queue.toString());
    }
}
