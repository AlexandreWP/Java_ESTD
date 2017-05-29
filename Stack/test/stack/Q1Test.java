package stack;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void invertTest() {
		Q1 q1 = new Q1();
		
		int[] n = {1,2,3};
		int[] result = q1.invert(n);
		int[] expected = {3,2,1};
		
		Assert.assertArrayEquals(result, expected);
		
	}

}