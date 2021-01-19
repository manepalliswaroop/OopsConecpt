package com.epam.onboarding.mentoring.ootask1;

public class Light implements Appliance {

    private int unit=1;
    @Override
    public int getUnit() {
        return unit;
    }

    @Override
    public int compareTo(Appliance o) {
        if(this.getUnit()<o.getUnit())
            return -1;
        else
            return 1;
    }
}
