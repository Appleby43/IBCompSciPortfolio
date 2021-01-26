package sortAlg;

import java.util.ArrayList;
import java.util.List;

public class DescendingNumberFinder {
	public void find(List<Integer> input){
		List<Integer> retVal = new ArrayList<>();

		for (Integer integer : input) {
			if(integer < 1000 && integer > 99){
				int ones = integer % 10;
				int tens = (integer % 100) / 10;
				int hunds = integer / 100;

				if(ones > tens && tens > hunds){
					retVal.add(integer);
				}
			}
		}

		if(retVal.isEmpty()){
			System.out.println("No such numbers");
		} else {
			for (Integer i : retVal) {
				System.out.println(i);
			}
		}
	}
}
