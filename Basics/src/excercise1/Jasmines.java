package excercise1;

public class Jasmines extends Flowers{
	
	private int jasmineCost=2;

	
	public int getJasmineCost() {
		System.out.println("Each Jasmine Cost is "+jasmineCost);
		return jasmineCost;
	}

	public int totalJasminesCost(int NoOfJasmines) {
		int jasminesCost = 0;
		jasminesCost=cost(getJasmineCost(),NoOfJasmines);
		return jasminesCost;
	}
	

}
