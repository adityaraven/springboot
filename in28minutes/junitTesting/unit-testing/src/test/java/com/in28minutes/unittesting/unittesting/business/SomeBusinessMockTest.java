package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in28minutes.unittesting.unittesting.data.DataService;


@ExtendWith(MockitoExtension.class)
class SomeBusinessMockTest {
	
	
//	BusinessImpl buisnessBusinessImpl= new BusinessImpl();
	@InjectMocks
	BusinessImpl buisnessBusinessImpl;
	
	
//	DataService dataServiceMock = mock(DataService.class);

	@Mock
	DataService dataServiceMock;
	
	
//	@BeforeEach
//	public void before() {
//	buisnessBusinessImpl.setDataService(dataServiceMock);
//	}
	
	
	@Test
	public void calculateSumUisngDataService() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		
		int actualResult= buisnessBusinessImpl.calculateSumUisngDataService();
		
		assertEquals(6, actualResult);
	}

	@Test
	public void calculateSumUisngDataService_one() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1});
	
		int actualResult= buisnessBusinessImpl.calculateSumUisngDataService();
		
		assertEquals(1, actualResult);
	}
	
	
	@Test
	public void calculateSumUisngDataService_empty() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		
		int actualResult= buisnessBusinessImpl.calculateSumUisngDataService();
		
		assertEquals(0, actualResult);
	}
	
	
}
