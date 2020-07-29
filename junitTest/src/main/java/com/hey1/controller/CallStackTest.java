package com.hey1.controller;

public class CallStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 메서드가 시작되었음");
		firstMethod();
		System.out.println("메인메서드가 끝났음");
	}
	
	public static void firstMethod() {
		System.out.println("첫번째 메서드가 시작되었음");
		secondMethod();
		System.out.println("첫번째 메서드가 끝났음");
	}
	
	public static void secondMethod() {
		System.out.println("두번째 메서드가 시작되었음");
		System.out.println("두번째 메서드가 끝났음");
	}

}
