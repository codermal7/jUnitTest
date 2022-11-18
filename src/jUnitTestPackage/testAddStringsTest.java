package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStringsTest {

	@Test
	void test() {
		jUnitFunctions myObj1 = new jUnitFunctions();
		String result1 = myObj1.AddStrings("Anuj","Pandey");
		String result2 = myObj1.AddStrings("Kumar","ABCD");

		assertEquals("AnujPandey",result1);
		assertEquals("KumarABCD",result2);

	}
}
