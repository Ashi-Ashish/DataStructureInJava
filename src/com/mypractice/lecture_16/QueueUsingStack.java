package com.mypractice.lecture_16;

public class QueueUsingStack {
    private Stack data;

    public QueueUsingStack(){
        data=new Stack();
    }
    public void insert(int value){
        data.push(value);
    }
    public int remove(){
        Stack temp=new Stack();

        while (!data.isEmpty()){
            temp.push(data.pop());
        }
        int v=temp.pop();
        while (!temp.isEmpty()){
            data.push(temp.pop());
        }
        return v;
    }
    /*public int front(){

    }*/
    public boolean isEmpty(){
        return this.data.isEmpty();

    }
}
