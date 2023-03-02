package basicjava;

import java.util.ArrayList;

public class CCArrayList {
	
	public static int indexOfIgnoreCase(ArrayList<String> strs, String toFind) {
		int rVal = -1;
		for(int i = 0;i<strs.size()&& rVal < 0;i++) {
			if(strs.get(i).equalsIgnoreCase(toFind)) {
				rVal = i;
			}
		}
		return rVal;
	}
	
	public static void insert(ArrayList<Double> nums, double numToInsert, int insertAtIndex) {
		if(insertAtIndex<= nums.size()) {
			nums.add(insertAtIndex, numToInsert);
		}
	}

}
