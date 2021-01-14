package com.epam.onboarding.mentoring.ootask1;

import java.util.*;

public class Home {

    private int unit=0;
    List<Appliance> applianceList = new ArrayList<>();

    public void switchOn(Appliance appliance, int noOfAppliance){
        for (int i=0;i<noOfAppliance;i++){
            switchOn(appliance);
        }
    }

    public void switchOn(Appliance appliance){
        applianceList.add(appliance);
    }

    public int getUnit(){
        for (Appliance app: applianceList) {
            unit=unit+ app.getUnit();
        }
        return unit;
    }
}
