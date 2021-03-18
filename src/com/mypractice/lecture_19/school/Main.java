package com.mypractice.lecture_19.school;

public class Main extends MathTeacher{
    public static void main(String[] args) {

        Teacher t=new MathTeacher();

        t.study();
        t.teach();

        TA ta=new CBTA();

        ta.play();
        ta.teach();
        ta.study();
        ta.nacho();
        ((CBTA) ta).ghumo();
    }
}
