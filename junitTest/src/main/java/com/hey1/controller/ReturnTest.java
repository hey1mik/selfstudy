package com.hey1.controller;

public class ReturnTest {

	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3,5,result2);
		System.out.println(result2[0]);
		
		int[] arr = {1, 2, 3};
		
		for(int ori : arr) {
			System.out.print(ori);
		};
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a+ b; // �Ű������� �Ѱܹ��� �迭�� �������� ����
		
	}
	
	
	/*
	 * �ش� ������ ��ȯ ���� �ִ� �޼��带 ��ȯ���� ���� �޼���� �ٲٴ� ����� �ο��ش�.
	 * �ռ� ��� ������ �Ű������� Ȱ���ϸ� ��ȯ���� ��� �޼����� �������� ��� �� �� �ִ�.
	 * �޼���� �� �ϳ��� ������ ��ȯ �� �� ������ �̰��� �����ϸ� ���� ���� ���� ��ȯ�޴� �Ͱ� ���� ȿ���� ���� �� �ִ�. 
	 */

}


