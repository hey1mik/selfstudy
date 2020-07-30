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
		result[0] = a+ b; // 매개변수로 넘겨받은 배열에 연산결과를 저장
		
	}
	
	
	/*
	 * 해당 예제는 만환 값이 있는 메서드를 반환값이 없는 메서드로 바꾸는 방법을 부여준다.
	 * 앞서 배운 참조형 매개변수를 활용하면 반환값이 없어도 메서드의 실행결과를 얻어 올 수 있다.
	 * 메서드는 단 하나의 값만을 반환 할 수 있지만 이것을 응용하면 여러 개의 값을 반환받는 것과 같은 효과를 얻을 수 있다. 
	 */

}


