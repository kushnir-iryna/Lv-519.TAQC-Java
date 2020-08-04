package com.softserve.edu;

/**
 * An integer number n is given. Get the smallest number 2^k, which exceeds n,
 * (2 ^ k> n).
 */
public class Task108 {
	/**
	 * @param n number from console
	 * @return power and result of 2^k
	 */
	public int[] findArr(Integer n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		// p=2^k
		int p, k;
		k = 0;
		p = 1;
		int arr[] = new int[2];
		while (p <= n) {
			p = p * 2;
			k++;
			arr[0] = p;
			arr[1] = k;
		}
		return arr;
	}

	public int[] findR(InputOutput inp) {
		return findArr(inp.getN());
	}

}
