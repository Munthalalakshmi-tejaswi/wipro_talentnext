package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Presencechar {

	@Test
	void test() {
		JUnitTesting_Q1 st=new JUnitTesting_Q1();
		boolean output=st.checkPresence("Tejaswi","a");
		assertTrue(output,"Not found");
	}

}
