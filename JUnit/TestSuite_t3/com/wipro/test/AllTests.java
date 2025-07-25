package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ ArraysortTesting.class, Presencechar.class, TestStringConcat.class })
public class AllTests {
	public void testConcat() {
    JUnitTesting_Q1 jt=new JUnitTesting_Q1();
    assertEquals("wipro next",jt.Concat("wipro", "next"));
    int[] input= {6,4,5,3,1,2};
    int[] expected= {1,2,3,4,5,6};
    int[] output=jt.sortValues(input);
    assertArrayEquals(expected,output);
    assertTrue("Not valid",jt.checkPresence("Tejaswi", "i"));
	}
	
}
