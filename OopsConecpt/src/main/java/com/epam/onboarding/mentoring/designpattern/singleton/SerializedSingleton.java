package com.epam.onboarding.mentoring.designpattern.singleton;

public class SerializedSingleton {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton serializedSingleton = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.serializedSingleton;
    }
}
