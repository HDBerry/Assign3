package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		
		Calculator testCalc = new Calculator();
		
		assertNotNull(testCalc);
	}

	@Test
	public void testGetTotal() {
		
		Calculator testCalc = new Calculator();
		testCalc.add (2);
		int nonNullValue = testCalc.getTotal();		
		assertNotNull (nonNullValue);
		
		assertEquals(2, testCalc.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator testCalc = new Calculator();
		testCalc.add(3);
		assertEquals(3, testCalc.getTotal());
		
		testCalc.add(100);		
		assertEquals(103, testCalc.getTotal());		
	}

	@Test
	public void testSubtract() {
		Calculator testCalc = new Calculator();
		testCalc.subtract(5);
		assertEquals(-5, testCalc.getTotal());
		
		testCalc.subtract(25);
		assertEquals(-30, testCalc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator testCalc = new Calculator();
		testCalc.add(1);
		testCalc.multiply(10);
		assertEquals(10, testCalc.getTotal());
		
		testCalc.multiply(-2);
		assertEquals(-20, testCalc.getTotal());	
	}

	@Test
	public void testDivide() {
		Calculator testCalc = new Calculator();
		testCalc.add(100);
		testCalc.divide(4);
		assertEquals(25, testCalc.getTotal());
		
		testCalc.divide(5);
		assertEquals(5, testCalc.getTotal());
		
		testCalc.divide(0);
		assertEquals(0, testCalc.getTotal()); // divide by zero check
	}

	/*@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}*/ 
	// voided to check other tests.

}
