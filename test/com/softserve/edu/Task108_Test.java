package com.softserve.edu;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class Task108_Test {
	private static Task108 task2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task2 = new Task108();
	}

	@Test
	public void test1() {
		int[] expected = { 4, 2 };
		int[] actual;
		actual = task2.findArr(2);
		Assert.assertArrayEquals("Error", expected, actual);
	}
	@Test
	public void test2() {
		int[] expected = { 4, 2 };
		int[] actual;
        actual = task2.findM(new InputOutput(2));
        Assert.assertArrayEquals("Error", expected, actual);
    }
}
