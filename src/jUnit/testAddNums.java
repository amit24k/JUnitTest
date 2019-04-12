package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNums {

	@Test
	public void test() {
		JUnitTesting junit=new JUnitTesting();
		int result=junit.addNums(2, 5);
		assertEquals(7, result);
	}

}
