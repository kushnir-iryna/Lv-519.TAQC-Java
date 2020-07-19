package com.softserve.edu;

import java.util.ArrayList;
import java.util.List;

public class Task243 {

	public List<String> generateList1(int n) {
		List<String> pairValue = new ArrayList<String>();
		for (int x = 1; x * x < n; x++) {
			double y = Math.sqrt(n - x * x);
			if ((y == Math.round(y))) {
				pairValue.add("(" + x + "; " + (int) y + ")");
			}
		}
		return pairValue;
	}

	public List<String> generateList2(int n) {
		List<String> pairValue = new ArrayList<String>();
		for (int x = 1; x * x < n; x++) {
			double y = Math.sqrt(n - x * x);
			if ((y == Math.round(y)) && (x >= y)) {
				pairValue.add("(" + x + "; " + (int) y + ")");
			}
		}
		return pairValue;
	}

	public List<String> SumSquaresList1(InputOutput inp) {
		return generateList1(inp.getN());
	}

	public List<String> SumSquaresList2(InputOutput inp) {
		return generateList2(inp.getN());
	}

}
