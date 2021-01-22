package com.epam.onboarding.mentoring.designpattern.singleton;

import com.epam.onboarding.mentoring.designpattern.singleton.ThreadSafeSingleton;

public class VerifyThreadSafe {

    public static void main(String[] args) {
        ThreadSafeSingleton test=   ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton test1=  ThreadSafeSingleton.getInstance();
        if(test1.equals(test))
            System.out.println("is equal");
        else
            System.out.println("not equal");
    }
}
