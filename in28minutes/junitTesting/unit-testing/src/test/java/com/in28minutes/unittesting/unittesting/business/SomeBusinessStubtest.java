package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.in28minutes.unittesting.unittesting.data.DataService;

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[] {1,2,3};
	}
	
}

class SomeBusinessStubtest {

	@Test
	public void calculateSumUisngDataService() {
		BusinessImpl buisnessBusinessImpl= new BusinessImpl();
		buisnessBusinessImpl.setDataService(new DataServiceStub());
		int actualResult= buisnessBusinessImpl.calculateSumUisngDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSumUisngDataService_one() {
		BusinessImpl buisnessBusinessImpl= new BusinessImpl();
		int actualResult= buisnessBusinessImpl.calculateSumUisngDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	
	@Test
	public void calculateSumUisngDataService_empty() {
		BusinessImpl buisnessBusinessImpl= new BusinessImpl();
		int actualResult= buisnessBusinessImpl.calculateSumUisngDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	
}
