package com.hey1.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Assert;
import org.junit.Test;

public class CellphoneMmsSenderTest {
	
	/*
	 * @Test public void testSend() throws Exception { // Given - Test Data final
	 * String message = "�׽�Ʈ ���� �޽����ԴϴٳĿ�";
	 * 
	 * // Given - Mock Object ���� CellPhoneServiceMock cellPhoneServiceMock = new
	 * CellPhoneServiceMock();
	 * 
	 * //Gvien - �����ڸ� �̿��Ͽ� Mock Object ���� CellphoneMmsSender cellphoneMmsSender =
	 * new CellphoneMmsSender(cellPhoneServiceMock);
	 * 
	 * //When - ���� �޽��� ���� cellphoneMmsSender.send(message);
	 * 
	 * Assert.assertTrue(cellPhoneServiceMock.isSendMMSCalled());
	 * Assert.assertEquals(message, cellPhoneServiceMock.getSendMsg()); }
	 */
	
	
	@Test
	public void testSend() throws Exception {
		//Given - Test Data
		final String message = "�׽�Ʈ ���� �޽��� �Դϴ�.";
		
		//Given - Mockito�� ����Ͽ� Mock Object ����
		CellPhoneService mockCellPhoneService = mock(CellPhoneService.class);
		
		//Given - �����ڸ� �̿��Ͽ� Mock Object ����
		CellphoneMmsSender cellphoneMmsSender = new CellphoneMmsSender(mockCellPhoneService);
		
		//When - ���ڸ޽��� ����
		cellphoneMmsSender.send(message);
		
		//Then - ���� ���� : CellPhoneService.sendMMS�� �����ߴ��� ����
		verify(mockCellPhoneService).sendMMS(message);
		
		
		
	}
	
}
