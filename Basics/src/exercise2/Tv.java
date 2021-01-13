package exercise2;

public class Tv extends Appliances{
	private int TvCompustion=3;

	public int getTvCompustion() {
		System.out.println("TV Compustion cost of each unit is "+TvCompustion);
		return TvCompustion;
	}
	
	public int calucationTVCompution(int noOfUnits) {
		return cost(noOfUnits,getTvCompustion()); 
	}
}
