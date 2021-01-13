package exercise2;

public class PowerCompustion extends Appliances{

	Fan fan= new Fan();
	Light light =new Light();
	Tv tv=new Tv();
	
	public int CalculatePowerCompustion(int NoOfFanUnits,int NoOfLightUnits,int NoOfTvUnits) {
		int totalPowerCompustion=0;
		totalPowerCompustion=fan.calucationFanCompution(NoOfFanUnits)+light.calucationLightCompution(NoOfLightUnits)+tv.calucationTVCompution(NoOfTvUnits);
		return totalPowerCompustion;
	}
	
	public static void main(String[] args) {
		PowerCompustion PowerCompustion = new PowerCompustion();
		Appliances Appliances = new Appliances();
		
		int totalPowerCompustion=PowerCompustion.CalculatePowerCompustion(5, 6, 5);
		System.out.println("Total Power Compustion is "+totalPowerCompustion);
		System.out.println("----Sorting Appliances---");
		Appliances.sortAppliances();
	}

}
