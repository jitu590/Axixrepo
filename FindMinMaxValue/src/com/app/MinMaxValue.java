package com.app;

public class MinMaxValue {

	public static void main(String[] args) {
		int[] input = { 6, 9, 12};

		minValue(input);
		maxValue(input);
	}

	public static void minValue(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]-1< min) {
				min = arr[i];
			}
		}
		System.out.println("min value:" + min);

	}

	public static void maxValue(int[] arr) {
		int max=arr[0];
		for(int j=1;j<arr.length;j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
		}
		System.out.println("max value:"+max);

	}
}
