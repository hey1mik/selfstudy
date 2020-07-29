package com.hey1.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Assert;
import org.junit.Test;

public class CellphoneMmsSenderTest {
	
	/*
	 * @Test public void testSend() throws Exception { // Given - Test Data final
	 * String message = "테스트 문자 메시지입니다냐옹";
	 * 
	 * // Given - Mock Object 생성 CellPhoneServiceMock cellPhoneServiceMock = new
	 * CellPhoneServiceMock();
	 * 
	 * //Gvien - 생성자를 이용하여 Mock Object 주입 CellphoneMmsSender cellphoneMmsSender =
	 * new CellphoneMmsSender(cellPhoneServiceMock);
	 * 
	 * //When - 문자 메시지 전송 cellphoneMmsSender.send(message);
	 * 
	 * Assert.assertTrue(cellPhoneServiceMock.isSendMMSCalled());
	 * Assert.assertEquals(message, cellPhoneServiceMock.getSendMsg()); }
	 */
	
	
	@Test
	public void testSend() throws Exception {
		//Given - Test Data
		final String message = "테스트 문자 메시지 입니다.";
		
		//Given - Mockito를 사용하여 Mock Object 생성
		CellPhoneService mockCellPhoneService = mock(CellPhoneService.class);
		
		//Given - 생성자를 이용하여 Mock Object 주입
		CellphoneMmsSender cellphoneMmsSender = new CellphoneMmsSender(mockCellPhoneService);
		
		//When - 문자메시지 전송
		cellphoneMmsSender.send(message);
		
		//Then - 행위 검증 : CellPhoneService.sendMMS를 수정했는지 여부
		verify(mockCellPhoneService).sendMMS(message);
		
		
		
	}
	
}
