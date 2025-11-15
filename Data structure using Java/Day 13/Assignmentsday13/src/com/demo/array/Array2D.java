package com.demo.array;

import com.demo.test.*;

public class Array2D {

	public void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void reverseRow(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int start = 0;
			int end = arr.length - 1;

			while (start < end) {
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;

				start++;
				end--;
			}
		}
		System.out.println("\n reverse array : ");
	}

	private int findOddMax(int[] arr) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
		}return max;
	}
	
	public void printMaxOdd(int[][] arr) {
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int ans = findOddMax(arr[i]);
			temp[i] = ans;
			System.out.println(temp[i]);
		}
	}
	
	
	private int findAvg(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = arr[i] + sum;
		}
		int avg = sum/arr.length;
		return avg;
	}
	
	private int[] findColAvg(int[][] arr) {
		int[] temp = new int[arr[0].length];
		for(int i=0;i<arr.length)
		
		return temp;
	}
}
