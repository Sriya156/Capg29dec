package com.cg.Lab31;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PositiveStringTest {

	private PositiveString pos;
	@Before
	public void setup() 
	{
		pos = new PositiveString();
	}
	
	@Test
	public void test_PositiveString_GivenString_ShouldReurnAsString() 
	{
    
	String str="Bee";
	boolean result=  pos.isPositiveString(str);
	  assertEquals(true, result);
	}
	
	@Test
	public void test_PositiveString_GivenCamelCaseString_ShouldReurnAsString() 
	{
    
	String str="BdHpxY";
	boolean result=  pos.isPositiveString(str);
	  assertEquals(true, result);
	}
	@Test
	public void test_PositiveString_GivenWrongOrderString_ShouldReurnAsString() 
	{
    
	String str="lpues";
	boolean result=  pos.isPositiveString(str);
	  assertEquals(false, result);
	}
	@Test
	public void test_PositiveString_GivenSameString_ShouldReurnAsString() 
	{
    
	String str="bbbccc";
	boolean result=  pos.isPositiveString(str);
	  assertEquals(true, result);
	}
	
	  
}
