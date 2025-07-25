package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class ArraysortTesting {

	@Test
	void test() {
		JUnitTesting_Q1 jt=new JUnitTesting_Q1();
		int[] input= {8,7,9,5,3,1,2};
		int[] expected= {1,2,3,5,7,8,9};
		int[] output=jt.sortValues(expected);
		assertArrayEquals(expected,output);
	}

}
