package cse360assign3;

/** Class performs various arithmetic operations (+ - * /) on values given
 * It can also return the history of those calculations
 * 
 * @author Alexander Ryan for CSE360 02/22/2016
 *
 */

public class Calculator
{

	private int total;
	private String history; //Created to keep record of history
	
	/**
	 * Creates a new Calculator object and sets total to 0
	 * and sets history string to 0 
	 * 
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = Integer.toString(0); //Default total of zero because no calculations have been performed
	}
	
	/** 
	 * getTotal-gives the current total
	 * 
	 * @return current total value
	 */
	public int getTotal () 
	{
		return this.total;
	}
	
	/**
	 * add-performs addition with the total and value
	 * 
	 * @param value to be added
	 */
	public void add (int value) 
	{
		total = total + value;
		this.history = this.history + " + " + Integer.toString(value);
	}
	
	/**
	 * subtract-performs subtraction with the total and value
	 * 
	 * @param value to be subtracted
	 */
	public void subtract (int value) 
	{
		total = total - value;
		this.history = this.history + " - " + Integer.toString(value);
	}
	
	/**
	 * multiply-performs multiplication with the total and value
	 * 
	 * @param value to be multiplied
	 */
	public void multiply (int value) 
	{
		total = total * value;
		this.history = this.history + " * " + Integer.toString(value);
	}
	
	/**
	 * divide-performs division with the total and value
	 * 
	 * @param value to be divided
	 */
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
			this.history = this.history + " / " + Integer.toString(value);
		}
		
		else
		{
			total = total / value;
			this.history = this.history + " / " + Integer.toString(value);
		}
	}
	
	/** 
	 * getHistory-return previous calculations from the previous inputs.
	 * 
	 * @return previous total value in String form
	 */
	public String getHistory () 
	{
		return this.history;
	}
}