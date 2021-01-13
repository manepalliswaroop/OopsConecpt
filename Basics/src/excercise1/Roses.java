package excercise1;

public class Roses extends Flowers{
	
	private int roseCost=1;


	public int getRoseCost() {
		System.out.println("Each Rose Cost is "+roseCost);
		return roseCost;
	}
	
	public int totalRosesCost(int NoOfRoeses) {
		int rosesCost = 0;
		rosesCost=cost(getRoseCost(),NoOfRoeses);
		return rosesCost;
	}

}
