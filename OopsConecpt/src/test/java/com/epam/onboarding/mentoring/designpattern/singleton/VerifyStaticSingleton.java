package com.epam.onboarding.mentoring.designpattern.singleton;

import com.epam.onboarding.mentoring.designpattern.singleton.StaticBlockInitialization;

public class VerifyStaticSingleton {

    public static void main(String[] args) {
        StaticBlockInitialization test=   StaticBlockInitialization.getInstance();
        StaticBlockInitialization test1=   StaticBlockInitialization.getInstance();
        if(test1.equals(test))
            System.out.println("is equal");
        else
            System.out.println("not equal");
    }

}
