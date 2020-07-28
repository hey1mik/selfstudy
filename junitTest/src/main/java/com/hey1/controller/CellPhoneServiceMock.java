package com.hey1.controller;

public class CellPhoneServiceMock extends CellPhoneService {
	private boolean isSendMMSCalled = false;
	private String sendMsg = "";
	
	@Override
	public void sendMMS(String msg) {
		isSendMMSCalled = true;
		sendMsg = msg;
	}
	
	public boolean isSendMMSCalled(){return isSendMMSCalled;}
	public String getSendMsg(){return sendMsg;}

}
