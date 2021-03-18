package com.mypractice.lecture_21;

public class ClientLinkedList {
    public static void main(String[] args) {

        LinkedListGeneric<Integer> list=new LinkedListGeneric<>();
        list.insertFirst(5);
        list.display();
        list.insertFirst(6);
        list.insertFirst(7);
        list.display();
        list.insertLast(4);
        list.insertLast(3);
//        list.instert(4,3);
        list.display();
//        list.remove(4);
//        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        System.out.println(list.size());
//        list.bubble();
        list.display();
        System.out.println(list.kthfromLast(1));
    }
}
