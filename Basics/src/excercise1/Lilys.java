package excercise1;

public class Lilys extends Flowers{
	
	private int lilyCost=3;

	public int getLilyCost() {
		System.out.println("Each Lily Cost is "+lilyCost);
		return lilyCost;
	}

	public int LilysCost(int NoOfLilys) {
		int lilysCost = 0;
		lilysCost=cost(getLilyCost(),NoOfLilys);
		return lilysCost;
	}
}
