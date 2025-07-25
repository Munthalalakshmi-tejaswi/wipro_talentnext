package TestSort;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestCheckPresence {

	@Test
	void test() {
		JUnitTesting jt=new JUnitTesting();
		int[] input= {6,5,2,4,3,1};
		int[] expected= {1,2,3,4,5,6};
		int[] output=jt.valSort(input);
		assertTrue(Arrays.equals(expected,output));
		
	}

}
