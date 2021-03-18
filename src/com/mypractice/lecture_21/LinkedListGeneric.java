package com.mypractice.lecture_21;

public class LinkedListGeneric<T extends Comparable<T>> {
    private Node head;


    public void insertFirst(T value) {
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


    public void insertLast(T value) {
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


    public void instert(T value, int index) {
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


    public T removeFirst() {
        if (head == null) {
            return null;
        }
        T str = head.value;
        head = head.next;
        return str;
    }


    public T removeLast() {
        if (head == null || head.next == null) {
            return removeFirst();
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        T value = temp.next.value;
        temp.next = null;
        return value;

    }


    public T remove(int index) {
        if (index == 1) {
            return removeFirst();
        }
        Node prev = head;
        for (int i = 1; i < index - 1; i++) {
            prev = prev.next;
        }
        T value = prev.next.value;

        prev.next = prev.next.next;

        return value;
    }


    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }


    public void bubble() {

        int size = size();

        for (int i = 0; i < size; i++) {
            Node temp = head;
            for (int j = 0; j < size - 1 - i; j++) {
                Node first = temp;
                Node second = temp.next;

                if (first.value.compareTo(second.value) > 0) {
                    T local = first.value;
                    first.value = second.value;
                    second.value = local;
                }
                temp = temp.next;
            }
        }
    }


    public T mid() {
        Node temp = head;
        Node mid = head;

        if (head == null) {
            return null;
        }
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next.next;
            mid = mid.next;
        }
        return mid.value;
    }


    public T kthfromLast(int n){
        Node front=head;
        Node back=head;


        for (int i = 0; i < n; i++) {
            front=front.next;
        }
        while (front!=null){
            front=front.next;
            back=back.next;
        }
        return back.value;
    }


    private class Node {
        private T value;
        private Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
        }
    }
}
