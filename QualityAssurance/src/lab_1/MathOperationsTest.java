package lab_1;

import junit.framework.TestCase;

public class MathOperationsTest extends TestCase {
	MathOperations m = new MathOperations();
	int x = 2;
	int y = 3;
	public void testAdd() {
		assertEquals(5, m.add(x,y));
	}

	public void testMultiply() {
		assertEquals(6, m.multiply(x, y));
	}

}
