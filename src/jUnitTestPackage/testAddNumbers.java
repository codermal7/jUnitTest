package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitFunctions myObj1 = new jUnitFunctions();
		int result1 = myObj1.AddNumbers(10,100);
		int result2 = myObj1.AddNumbers(-1,10);
		int result3 = myObj1.AddNumbers(0,1);
		assertEquals(110,result1);
		assertEquals(9,result2);
		assertEquals(1,result3);
	}

}