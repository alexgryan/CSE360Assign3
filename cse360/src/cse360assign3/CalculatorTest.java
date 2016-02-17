package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	@Test
	public void testCalculator() 
	{
		Calculator test = new Calculator();
		assertNotNull(test);
	}

	@Test
	public void testGetTotal() 
	{
		Calculator test = new Calculator();
		assertEquals(0, test.getTotal());
	}

	@Test
	public void testAdd() 
	{
		Calculator test = new Calculator();
		assertEquals(0, test.getTotal());
		test.add(5);
		assertEquals(5, test.getTotal());
	}

	@Test
	public void testSubtract() 
	{
		Calculator test = new Calculator();
		assertEquals(0, test.getTotal());
		test.subtract(5);
		assertEquals(-5, test.getTotal());
	}

	@Test
	public void testMultiply() 
	{
		Calculator test = new Calculator();
		test.add(2);
		test.multiply(5);
		assertEquals(10, test.getTotal());
	}

	@Test
	public void testDivide() 
	{
		Calculator test = new Calculator();
		test.divide(0);
		assertEquals(0, test.getTotal());
		test.add(6);
		test.divide(3);
		assertEquals(2, test.getTotal());
	}

	@Test
	public void testGetHistory() 
	{
		Calculator test = new Calculator();
		assertEquals("", test.getHistory());
	}

}
