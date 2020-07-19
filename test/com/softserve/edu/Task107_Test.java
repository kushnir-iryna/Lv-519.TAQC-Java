package com.softserve.edu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Task107_Test {
	// 4^k<n.
	// p=4^k
	private static Task107 task1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task1 = new Task107();
	}

	@Test
	public void testAdd1() {
		int expected;
		int actual;
		expected = 1;
		actual = task1.findNumber(5);
		Assert.assertEquals("Error", expected, actual);
	}

	@Test
	public void testAdd2() {
		int expected;
		int actual;
		expected = 1;
		actual = task1.findK(new InputOutput(5));
		Assert.assertEquals("Error", expected, actual);
	}
}
