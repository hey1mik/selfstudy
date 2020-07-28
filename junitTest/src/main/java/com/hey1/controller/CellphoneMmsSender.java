package com.hey1.controller;

public class CellphoneMmsSender {
	private CellPhoneService CellPhoneService;
	
	public CellphoneMmsSender(CellPhoneService cellPhoneService) {
		this.CellPhoneService = cellPhoneService;
	}
	
	public void send(String msg) {
		CellPhoneService.sendMMS(msg);
	}
}
