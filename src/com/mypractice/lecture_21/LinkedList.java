package com.mypractice.lecture_21;

public class LinkedList {
    private Node head;


    public void insertFirst(String value) {
        Node node = new Node(value, head);
        head = node;
    }

    private Node tail() {

        if (head == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    public void insertLast(String value) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node node = new Node(value);
        tail.next = node;

    }

    public void instert(String value, int index) {
        if (index == 1) {
            insertFirst(value);
            return;
        }

        Node prev = head;
        for (int i = 1; i < index - 1; i++) {
            prev = prev.next;
        }
        Node node = new Node(value, prev.next);
        prev.next = node;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public String removeFirst() {
        if (head == null) {
            return null;
        }
        String str = head.value;
        head = head.next;
        return str;
    }

    public String removeLast() {
        if (head == null || head.next == null) {
            return removeFirst();
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        String value = temp.next.value;
        temp.next = null;
        return value;

    }

    public String remove(int index){
        if (index==1){
            return removeFirst();
        }
        Node prev=head;
        for (int i = 1; i < index-1; i++) {
            prev=prev.next;
        }
        String value=prev.next.value;

        prev.next=prev.next.next;

        return value;
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
