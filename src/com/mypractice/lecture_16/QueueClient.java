package com.mypractice.lecture_16;

public class QueueClient {
    public static void main(String[] args) {
        Queue queue=new Queue();

        queue.insert(3);
        queue.insert(4);
        queue.insert(9);
        queue.insert(7);
        queue.display();
        queue.remove();
        queue.display();
        queue.remove();
        queue.display();
    }
}
