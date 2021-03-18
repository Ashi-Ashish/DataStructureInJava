package com.mypractice.practice.linklist;

public class LinkedList<T extends Comparable<T>> {
    private Node head;


    public void insertFirst(T value) {
        Node node = new Node(value, head);
        head = node;
    }


    public void insertLast(T value) {
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


    public void insertIndex(T value, int index) {
        if (index == 1) {
            insertFirst(value);
            return;
        }
        Node temp = head;
        Node prev = head;
        for (int i = 1; i < index - 1; i++) {
            prev = temp;
        }
        Node node = new Node(value, prev.next);
        prev.next = node;
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
        while (temp.next != null) {
            temp = temp.next;
        }
        T str = temp.value;
        temp.next = null;
        return str;
    }


    public T removeIndex(int index) {
        if (index == 1) {
            removeFirst();
        }
        Node temp = head;
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }
        T str = temp.value;
        temp.next = temp.next.next;
        return str;
    }


    public int findIndex(T value) {
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if (temp.value == value) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }


    public T mid() {
        if (head == null) {
            return null;
        }
        Node first = head;
        Node mid = head;
        while (first.next != null && first.next.next != null) {
            first = first.next.next;
            mid = mid.next;
        }

        return mid.value;
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
        System.out.println(size);
        Node temp = head;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size - i - 1; j++) {
                if (temp.value.compareTo(temp.next.value) > 0) {
                    T local = temp.value;
                    temp.value = temp.next.value;
                    temp.next.value = local;
                }
                temp = temp.next;
            }
            temp = head;
        }
    }


    public T kthfromlast(int n){
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


    public LinkedList<T> createCopy(){

        LinkedList<T> list=new LinkedList<>();
        list.head=this.head;

        return list;
    }


    public T common(LinkedList<T> list2){

        int size1=this.size();
        int size2=list2.size();

        int diff=Math.abs(size1-size2);

        Node first=this.head;
        Node second=list2.head;

        for (int i = 0; i < diff; i++) {
            if (size1>size2){
                first= first.next;
            }else{
                second=second.next;
            }
        }

        while (first.next!=null && second.next!=null){
            if (first.value==second.value){
                return first.value;
            }

            first=first.next;
            second=second.next;
        }

        return null;
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
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
