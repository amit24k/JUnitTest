package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitTesting junit=new JUnitTesting();
		String result=junit.addStrings("bennett", "university");
		assertEquals("bennettuniversity", result);
	}

}
