package com.softserve.edu;

public class Task107 {

	public int findNumber(int n) {
		// Задано ціле число m>1. Отримати найбільше ціле k, при якому 4^k<n.
		// Розв’язок 4^k<n => ln(4^k)<ln(n) => k<ln(n)/ln(2);
		// p=4^k
		int k, p;
		k = 0;
		p = 1;
		while (p < n) {
			p = p * 4;
			k++;
		}
		return k - 1;
	}

	public int findK(InputOutput inp) {
		return findNumber(inp.getN());
	}
}
