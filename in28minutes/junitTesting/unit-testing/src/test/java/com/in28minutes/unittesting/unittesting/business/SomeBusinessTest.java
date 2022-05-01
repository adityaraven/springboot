package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	public void calculateSum_basic() {
		BusinessImpl buisnessBusinessImpl= new BusinessImpl();
		int actualResult= buisnessBusinessImpl.calculateSum(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSum_empty() {
		BusinessImpl buisnessBusinessImpl= new BusinessImpl();
		int actualResult= buisnessBusinessImpl.calculateSum(new int[] {});
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	
}
