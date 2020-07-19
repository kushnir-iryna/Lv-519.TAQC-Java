package com.softserve.edu;

public class Solution {

	public static void main(String[] args) {
		InputOutput inp2 = InputOutput.readNatural();
		Task107 num1 = new Task107();
		Task108 num2 = new Task108();
		Task243 pair = new Task243();
		InputOutput.writeNumber(num1.findK(inp2));//107 
		InputOutput.writeArray(num2.findM(inp2));///108 
		InputOutput.writeList(pair.SumSquaresList1(inp2));//243a
		InputOutput.writeList(pair.SumSquaresList2(inp2));//243b
	}
}
