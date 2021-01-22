package com.epam.onboarding.mentoring.designpattern.singleton;

public class LazyInitializationSingleton {

    private LazyInitializationSingleton(){
    }

    private static LazyInitializationSingleton lazyInitializationSingleton;

    public static LazyInitializationSingleton getInstance(){
        if(lazyInitializationSingleton==null) {
            lazyInitializationSingleton= new LazyInitializationSingleton();
        }
        return lazyInitializationSingleton;
    }

}
