package com.mypractice.lecture_20.linkedlist;

public class ClientLinkedList {
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.insertFirst("mohit");
        list.display();
        list.insertLast("mohini");
        list.insertLast("amit");
        list.insertLast("neha");
        list.display();
        list.insert("richa",2);
        list.insert("richa",5);
        list.display();
        list.removeFirst();
        list.display();
        System.out.println(list.mid());
        list.remove(2);
        System.out.println(list.findIndex("neha"));
        System.out.println(list.mid());
        list.display();
    }
}
