package com.mypractice.lecture_19.school;

public class MathTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Teach like a math Teacher");
    }

    @Override
    public void study() {
        System.out.println("Study like a math Teacher");
    }
}
