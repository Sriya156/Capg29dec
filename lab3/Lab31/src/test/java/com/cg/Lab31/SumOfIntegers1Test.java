package com.cg.Lab31;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SumOfIntegers1Test
{
	private SumOfIntegers1 sum;
	@Before
	public void setup() 
	{
		sum = new SumOfIntegers1();
	}

	@Test
	public void test_SumOfIntegers_GivenEmpty_ShouldReurn0AsInteger() 
	{
    String str="";
	int result=  sum.SumOfIntegers(str);
	  assertEquals(0, result);
	  
	}
	
	@Test
	public void test_SumOfIntegers_Given1Integer_ShouldReurn1AsInteger() {
	    String str="10";
		int result=  sum.SumOfIntegers(str);
		  assertEquals(10, result);
		  
		}
	@Test
	public void test_SumOfIntegers_Given4Integers_ShouldReurnAsInteger() {
	    String str="10 8 9 3";
		int result=  sum.SumOfIntegers(str);
		  assertEquals(30, result);
		  
		}
	
}