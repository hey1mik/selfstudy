package com.hey1.controller;

public class CallStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �޼��尡 ���۵Ǿ���");
		firstMethod();
		System.out.println("���θ޼��尡 ������");
	}
	
	public static void firstMethod() {
		System.out.println("ù��° �޼��尡 ���۵Ǿ���");
		secondMethod();
		System.out.println("ù��° �޼��尡 ������");
	}
	
	public static void secondMethod() {
		System.out.println("�ι�° �޼��尡 ���۵Ǿ���");
		System.out.println("�ι�° �޼��尡 ������");
	}

}
