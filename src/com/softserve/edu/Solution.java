/**
 * <h1>Algorithmic Tasks Solution</h1>
 * <p>
 * 107: An integer number n is given, n>1.Get the largest integer k, at which 4 ^ k <n.
 * 
 * 108: An integer number n is given. Get the smallest number 2^r, which exceeds n, (2 ^ r> n).
 * 
 * 243: Given a natural number n. Is it possible to represent it as the sum of squares of two natural numbers?
 * a) If it possible - specify a pair of natural numbers x, y, such that n=x^2 + y^2;
 * b) If it possible - specify a pair of natural numbers x, y, such that n=x^2 + y^2 and x>=y;
 * <p>
 * 
 * @author Iryna Polihas
 * @version 1.0 27-07-2020
 */

package com.softserve.edu;

public class Solution {
	public static void main(String[] args) {
		InputOutput inp = InputOutput.readNatural();
		Task107 num1 = new Task107();
		Task108 num2 = new Task108();
		Task243 pair = new Task243();
		if (inp.getN() == 1) {
			//108
			InputOutput.writeArray(num2.findR(inp));
			//243a
			InputOutput.writeObjectList(pair.SumSquaresList1(inp));
			// 243b
			InputOutput.writeObjectList(pair.SumSquaresList2(inp));
		} else {
			// 107
			InputOutput.writeNumber(num1.findK(inp));
			// 108
			InputOutput.writeArray(num2.findR(inp));
			// 243a
			InputOutput.writeObjectList(pair.SumSquaresList1(inp));
			// 243b
			InputOutput.writeObjectList(pair.SumSquaresList2(inp));
		}
	}
}
