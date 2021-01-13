package exercise2;

public class Light extends Appliances{
	private int LightCompustion=2;

	public int getLightCompustion() {
		System.out.println("Light Compustion cost of each unit is "+LightCompustion);
		return LightCompustion;
	}
	
	public int calucationLightCompution(int noOfUnits) {
		return cost(noOfUnits,getLightCompustion()); 
	}

}
