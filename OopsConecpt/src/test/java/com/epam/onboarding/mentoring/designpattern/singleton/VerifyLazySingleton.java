package com.epam.onboarding.mentoring.designpattern.singleton;

import com.epam.onboarding.mentoring.designpattern.singleton.LazyInitializationSingleton;

public class VerifyLazySingleton {

    public static void main(String[] args) {
        LazyInitializationSingleton test=   LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton test1=  LazyInitializationSingleton.getInstance();
            if(test1.equals(test))
                System.out.println("is equal");
            else
                System.out.println("not equal");
    }
}
