package com.hey1.controller;

import java.util.ArrayList;
import java.util.List;

public class TestListSize {

	public static void main(String[] args) {

		List<String> sampleList = new ArrayList<String>();
		
		sampleList.add("추가1");
		sampleList.add("추가2");
		
		System.out.println(sampleList.size());
	}

}
