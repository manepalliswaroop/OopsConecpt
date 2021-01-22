package com.epam.onboarding.mentoring.java8;

public class TestCase {

    static Testable t =()-> System.out.println("smoke testing");

    public static void main(String[] args) {
        t.smoke();
    }
}
