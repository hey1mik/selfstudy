package com.hey1.controller;

public class SortTest {

	public static void main(String[] args) {
		int[] arr = new int[] {2,3,6,5,4,1};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
	}
	
	static void printArr(int[] arr) {
		System.out.print("[");
		
		for(int i : arr) {
			System.out.print(i + ",");
		}
		
		System.out.println("]");
	}
	
	static void sortArr(int[] arr) {
		for(int i = arr.length-1 ; i >0 ; i--) {
			for(int j = 0; j < arr.length-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

}
