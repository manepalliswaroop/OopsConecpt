package com.epam.onboarding.mentoring.designpattern.singleton;

public class StaticBlockInitialization {

    private StaticBlockInitialization() {

    }

    private static StaticBlockInitialization staticBlockInitialization;

    static {
        try {
            staticBlockInitialization = new StaticBlockInitialization();
        }
        catch (Exception e){

        }
    }

    public static StaticBlockInitialization getInstance(){
        return staticBlockInitialization;
    }
}
