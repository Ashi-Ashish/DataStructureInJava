package com.mypractice.lecture_20.linkedlist;

public class LinkedList {
    private Node head;


    public void insertFirst(String value) {
        Node node = new Node(value, head);
        head = node;
    }

    public void insertLast(String value) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node(value);
        temp.next = node;
    }

    public void insert(String value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        Node node = new Node(value, prev.next);
        prev.next = node;
    }

    public String removeFirst(){
        if (head==null){
            return null;
        }
        String value=head.value;
        head=head.next;
        return value;
    }
    public String removeLast(){
        Node temp=head;
        if (head==null||head.next==null){
            return removeFirst();
        }
        Node prev=head;
        while (temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        String value=temp.value;
        return value;
    }

    public String remove(int index){
        if (index==1){
            removeFirst();
        }
        Node prev=head;
        Node temp=head;

        for (int j = 1; j < index; j++) {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        return temp.value;
    }


    public int findIndex(String target){
        int count=1;
        Node temp=head;
        while (temp.next!=null){
            if (temp.value==target){
                return count;
            }
            temp=temp.next;
            count++;
        }
        return -1;
    }



    public String mid(){
        Node temp=head;
        Node mid=head;
        if (head==null){
            return null;
        }
        while (temp.next!=null&&temp.next.next!=null){
            temp=temp.next.next;
            mid=mid.next;
        }
        return mid.value;
    }

    public boolean find(String target){
        Node temp=head;
        while (temp.next!=null){
            if (temp.value==target){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    private class Node {
        private String value;
        private Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(String value) {
            this.value = value;
        }
    }
}