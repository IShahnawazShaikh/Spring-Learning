package com.scaler.springcore.beans;

public class Student {
    public String firstName;

    public Course course;

    public Student(Course course,int val,String firstName){
       this.course=course;
        System.out.println("param-arg-Cons");
    }
    public Student(){
        System.out.println("No-arg-Cons");
    }



}
