package com.epam.onboarding.mentoring.designpattern.singleton;

public class BillPlugSingleton {
    private BillPlugSingleton(){

    }

    private static class SingletonHelper{
        private static final BillPlugSingleton billPlugSingleton = new BillPlugSingleton();
    }

    public static BillPlugSingleton getInstance(){
        return SingletonHelper.billPlugSingleton;
    }
}
