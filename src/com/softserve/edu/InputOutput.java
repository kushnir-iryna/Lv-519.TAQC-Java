package com.softserve.edu;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputOutput {
	private int n;

	public InputOutput(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public static InputOutput readNatural() {
		Scanner scanner = new Scanner(System.in);
		int num = 1;
		while (num < 2) {
			System.out.print("Enter a natural  number n = ");
			try {
				num = scanner.nextInt();
			} catch (InputMismatchException a) {
				System.out.print("That’s not an integer number. Try again. ");
			}
		}
		scanner.close();
		return new InputOutput(num);
	}

	public static void writeNumber(int num) {
		System.out.println("4^k<n k = " + num);
	}

	public static void writeArray(int[] arr) {
		System.out.println("2^r>n 2^r=" + arr[0] + ", " + "r=" + arr[1]);
	}

	public static void writeList(List<String> list) {
		if (list.isEmpty()) {
			System.out.println("There is no pair of natural numbers x, y, such that n=x^2+y^2");
		} else {
			System.out.println("x^2+y^2=n res = " + list);
		}
	}

}
