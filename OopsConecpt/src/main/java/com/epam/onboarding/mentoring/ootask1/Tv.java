package com.epam.onboarding.mentoring.ootask1;

public class Tv implements Appliance {
	private int unit=3;

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
