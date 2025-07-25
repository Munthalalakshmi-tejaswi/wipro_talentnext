package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStringConcat {

	@Test
	void test() {
		JUnitTesting_Q1 tes=new JUnitTesting_Q1();
		String output=tes.Concat("wipro", "talent");
		assertEquals("wipro talent",output);
	}

}
