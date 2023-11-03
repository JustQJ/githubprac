package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result = main.add(1, 1);
		int rr = main.add(3,-1);
		assertEquals(2, result);
	}
	@Test
	void test1() {
		Main main = new Main();
		// int result = main.add(1, 1);
		int rr = main.add(3,-1);
		assertEquals(2, rr);
	}

}
