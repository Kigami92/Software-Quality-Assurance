package quiz2;

import junit.framework.TestCase;

public class CalcTest extends TestCase {

	public void testIsPrime() {
		assertTrue(Calc.isPrime(1));
		assertTrue(Calc.isPrime(2));
		assertTrue(Calc.isPrime(3));
		assertFalse(Calc.isPrime(4));
		assertTrue(Calc.isPrime(5));
		assertFalse(Calc.isPrime(9));
		assertFalse(Calc.isPrime(25));
		assertTrue(Calc.isPrime(83));
		assertTrue(Calc.isPrime(131071));
		
	}

	public void testIsMersennePrime() {
		assertFalse(Calc.isMersennePrime(2));
		assertTrue(Calc.isMersennePrime(3));
		assertTrue(Calc.isMersennePrime(31));
		assertTrue(Calc.isMersennePrime(127));
		assertTrue(Calc.isMersennePrime(8191));
		assertTrue(Calc.isMersennePrime(131071));
		assertFalse(Calc.isMersennePrime(37));
		assertFalse(Calc.isMersennePrime(423));
		assertFalse(Calc.isMersennePrime(-3));
	}

}
