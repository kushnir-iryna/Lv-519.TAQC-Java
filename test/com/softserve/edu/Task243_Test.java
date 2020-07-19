package com.softserve.edu;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Task243_Test {
	private static Task243 task3;

	@BeforeClass
	public static void setUpBeforeClass() {
		task3 = new Task243();
	}

	@Test
	public void test1() {

		List<String> expected = new ArrayList<String>();
		expected.add("(2; 1)");
		List<String> actual = task3.generateList2(5);
		Assert.assertTrue(expected.equals(actual));
	//	Assert.assertEquals(expected, actual);
	}

	@Test
	public void test2() {

		List<String> expected = new ArrayList<String>();
		List<String> actual = task3.generateList2(3);
		Assert.assertTrue(expected.equals(actual));
	}

	
	@Test
	public void test3() {

		List<String> expected = new ArrayList<String>();
		expected.add("(1; 2)");
		expected.add("(2; 1)");
		List<String> actual = task3.generateList1(5);
		Assert.assertTrue(expected.equals(actual));
	}

	@Test
	public void test4() {

		List<String> expected = new ArrayList<String>();
		List<String> actual = task3.generateList1(14);
		Assert.assertTrue(expected.equals(actual));
	}

	@Test
	public void test5() {
		List<String> expected = new ArrayList<String>();
		List<String> actual = task3.SumSquaresList1((new InputOutput(7)));
		Assert.assertTrue(expected.equals(actual));
	}

	@Test
	public void test6() {
		List<String> expected = new ArrayList<String>();
		expected.add("(2; 1)");
		List<String> actual = task3.SumSquaresList2((new InputOutput(5)));
		Assert.assertTrue(expected.equals(actual));
	}

}
