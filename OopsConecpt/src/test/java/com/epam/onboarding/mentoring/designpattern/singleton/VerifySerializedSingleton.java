package com.epam.onboarding.mentoring.designpattern.singleton;

import com.epam.onboarding.mentoring.designpattern.singleton.SerializedSingleton;

public class VerifySerializedSingleton {

    public static void main(String[] args) {
        SerializedSingleton test = SerializedSingleton.getInstance();
        SerializedSingleton test1 = SerializedSingleton.getInstance();
        if(test1.equals(test))
            System.out.println("is equal");
        else
            System.out.println("not equal");
    }
}
