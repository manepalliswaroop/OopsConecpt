package excercise1;

public class Bouquet {

	Roses rose = new Roses();
	Jasmines Jasmine = new Jasmines();
	Lilys Lily = new Lilys();

	public int CalucalteFlowersCost(int NoOfRoses, int NoOfJasmine, int NoOfLilys) {
		int totalCost;
		totalCost = rose.totalRosesCost(NoOfRoses) + Jasmine.totalJasminesCost(NoOfJasmine)
				+ Lily.LilysCost(NoOfLilys);
		return totalCost;
	}

	public static void main(String[] args) {
		Bouquet Bouquet = new Bouquet();
		int TotalCost = Bouquet.CalucalteFlowersCost(3, 5, 10);
		System.out.println("Total Bouquet Cost is " + TotalCost);
	}

}
