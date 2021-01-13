package exercise2;

public class Fan extends Appliances{
	private int FanCompustion=1;

	public int getFanCompustion() {
		System.out.println("Fan Compustion cost of each unit is "+FanCompustion);
		return FanCompustion;
	}

	public int calucationFanCompution(int noOfUnits) {
		return cost(noOfUnits,getFanCompustion()); 
	}

}
