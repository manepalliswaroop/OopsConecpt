package com.epam.onboarding.mentoring.coreJava;

import com.epam.onboarding.mentoring.corejava.PracticeAbstract;

public class TestAbstract extends PracticeAbstract {

    @Override
    public void walk() {
        System.out.println("walking");
    }

    public static void main(String[] args) {
        TestAbstract testAbstract= new TestAbstract();
        testAbstract.run();
        testAbstract.walk();
    }

}

