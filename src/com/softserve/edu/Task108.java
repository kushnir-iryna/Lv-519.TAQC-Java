package com.softserve.edu;

public class Task108 {
	//Задано натуральное число n. Отримати найменше число вигляду 2^r, що перевершує n,(2^r>n).
	// Розв’язок 2^r>n => ln(2^r)>ln(n) => r>ln(n)/ln(2); n>0 => r>0 => 2^r>1
	public int[] findArr(Integer n) {
		int result, power;
		power = 1;
		result = 2;
		int arr[] = new int[2];
		while (result <= n) {
			result = result * 2;
			power++;
			arr[0] = result;
			arr[1] = power;
		}
		return arr;
	}

	public int[] findM(InputOutput inp) {
		return findArr(inp.getN());
	}
}
