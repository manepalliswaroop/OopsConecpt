package com.epam.onboarding.mentoring.ootask1;

import java.util.Collections;

public class Apartment {

    public static void main(String[] args) {

    Home home = new Home();
    home.switchOn(new Fan(),2);
    home.switchOn(new Light(),3);
    home.switchOn(new Tv(),6);
    int totalUnits =home.getUnit();
    System.out.println("Total Units is "+totalUnits);
    Collections.sort(home.applianceList);
        for(Appliance a :home.applianceList){
            System.out.println(a.getUnit());
        }

    }
}
