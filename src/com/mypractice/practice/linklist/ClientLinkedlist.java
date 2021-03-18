package com.mypractice.practice.linklist;

public class ClientLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list1=new LinkedList();

        list1.insertLast(1);
        list1.insertLast(44);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertLast(44);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertLast(20);
        System.out.println(list1.findIndex(1));
        list1.display();
        list1.bubble();
        list1.display();
        System.out.println(list1.kthfromlast(1));

        LinkedList<Integer> list2=new LinkedList<>();
        list2=list1.createCopy();

        list1.insertFirst(8);
        list2.insertFirst(9);
        list1.insertLast(20);



        list1.display();
        list2.display();

        System.out.println(list1.common(list2));
    }
}
