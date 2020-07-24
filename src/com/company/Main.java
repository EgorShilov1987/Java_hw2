package com.company;

public class Main {

	public static void main(String[] args) {
//		int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = arr[i] == 0 ? 1 : 0; // требуется обьяснение!!! 0?1:0
//			System.out.println(arr[i]);
//		}
//
//		int[] arr = new int[8];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i * 3;
//			System.out.println(arr[i]);
//			}
//		int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i]<6){
//				arr[i] *=2;
//				System.out.println(arr[i]);
//			}
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			arr[i][arr.length - 1 - i] = 1;
			arr[i][i] = 1;
			System.out.println(arr[i][i]);
		}
		}
	}
