package com.epam.onboarding.mentoring.coreJava;

import com.epam.onboarding.mentoring.corejava.Student;

import java.util.Objects;

public class TestHashCode {

    public static void main(String[] args) {

        Student student = new Student(1,"Ramesh","JNTU");
        Student student1 = new Student(1,"Ramesh","JNTU");
        if(student.equals(student1)){
            System.out.println("equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}
