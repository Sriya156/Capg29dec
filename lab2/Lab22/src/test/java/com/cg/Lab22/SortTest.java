package com.cg.Lab22;

import static org.junit.Assert.*;

import org.junit.Test;
	public class SortTest
	{
		Sort object = new Sort();
		String [] input = {"milk","soda","cookie","coke"};

		@Test
		public void TestSortStrings_GivenNoInput_ShouldReturnNoInputException() {
		String [] input = {};
		try {
		String [] result = object.sortStrings(input);
		assertEquals(0, result);
		} catch (Exception e) {
		String expected= "NoInputException";
		assertEquals(expected,e.getMessage());
		}

		}

		@Test
		public void TestSortStrings_Given1StringAsInput_ShouldReturn1StringInUpperCase() {
		String [] input = {"cookie"};
		try {
		String [] result = object.sortStrings(input);
		assertEquals("COOKIE", result[0]);
		}  catch (Exception e) 
		{
		e.printStackTrace();
		}
		}

	}

