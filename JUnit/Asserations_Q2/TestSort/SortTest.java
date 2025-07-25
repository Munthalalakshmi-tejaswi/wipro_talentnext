package TestSort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortTest {

	@Test
	void test() {
		JUnitTesting jt=new JUnitTesting();
		int[] input= {8,7,4,6,3,2,1,9};
		int[] outpu=jt.valSort(input);
		int[] expected= {1,2,3,4,6,7,8,9};
		assertArrayEquals("Not sorted",expected,outpu);
	}

}
