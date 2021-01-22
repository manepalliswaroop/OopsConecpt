package com.epam.onboarding.mentoring.designpattern.singleton;

import com.epam.onboarding.mentoring.designpattern.singleton.EagerInitializedSingleton;

public class VerifyEagerSingleton {

    public static void main(String[] args) {
     EagerInitializedSingleton test=   EagerInitializedSingleton.getInstance();
     EagerInitializedSingleton test1=   EagerInitializedSingleton.getInstance();
     if(test.equals(test1)){
         System.out.println("is equal");
     }
     else
         System.out.println("not equal");
    }
}
