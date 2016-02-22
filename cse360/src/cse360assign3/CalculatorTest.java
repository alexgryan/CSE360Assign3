package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	
	@Test
	public void testCalculator() 
	{
		Calculator test = new Calculator();
		assertNotNull(test); //tests to see if Calculator object is created
	}

	@Test
	public void testGetTotal() 
	{
		Calculator test = new Calculator();
		assertEquals(0, test.getTotal()); //tests to see if default total is zero
	}

	@Test
	public void testAdd() 
	{
		Calculator test = new Calculator();
		test.add(5);
		assertEquals(5, test.getTotal()); //tests to see if total = 0 + 5
	}

	@Test
	public void testSubtract() 
	{
		Calculator test = new Calculator();
		test.subtract(5);
		assertEquals(-5, test.getTotal()); //tests to see if total = 0 - 5
	}

	@Test
	public void testMultiply() 
	{
		Calculator test = new Calculator();
		test.add(2);
		test.multiply(5);
		assertEquals(10, test.getTotal()); //tests to see if total = 2 * 5
	}

	@Test
	public void testDivide() 
	{
		Calculator test = new Calculator();
		test.divide(0);
		assertEquals(0, test.getTotal()); //tests to see if dividing by zero makes total zero
		test.add(6);
		test.divide(3);
		assertEquals(2, test.getTotal()); // tests to see if total = 6 / 3
	}

	@Test
	public void testGetHistory() 
	{
		Calculator test = new Calculator();
		assertEquals("0", test.getHistory()); //tests to see if default history string is 0
		test.add(2);
		assertEquals("0 + 2", test.getHistory()); //tests to see if history string is 0 + 2
		test.subtract(3);
		assertEquals("0 + 2 - 3", test.getHistory()); //tests to see if history string is 0 + 2 - 3
		test.multiply(4);
		assertEquals("0 + 2 - 3 * 4", test.getHistory()); //tests to see if history string is 0 + 2 - 3 * 4
		test.divide(0);
		assertEquals("0 + 2 - 3 * 4 / 0", test.getHistory()); //tests to see if history string is 0 + 2 - 3 * 4 / 0
		test.divide(5);
		assertEquals("0 + 2 - 3 * 4 / 0 / 5", test.getHistory()); //tests to see if history string is 0 + 2 - 3 * 4 / 0 / 5
	}

}
