package exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Appliances {

	public int cost(int applianceCost,int noOfUnits) {
		return applianceCost*noOfUnits;
	}
	
	public void sortAppliances() {
		List<String> appliances = new ArrayList<String>();
		appliances.add("Light");
		appliances.add("Fan");
		appliances.add("Tv");	
		Collections.sort(appliances);
		
		Iterator<String> app= appliances.iterator();
		while(app.hasNext())
		{
			System.out.println(app.next());
		}
	}
}
