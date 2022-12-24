package com.array;

public class SortTheElementInArray {

	public static void main(String[] args) {
		int arr[] = { 2, 6, 1, 7, 3 };
		int temp;
		System.out.println("Before sort the element");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { //2>6 2>1
					temp = arr[i];
					arr[i] = arr[j]; 
					arr[j] = temp;    //2,6,1,7,3  

				}
			}
		}
		System.out.println("After  sort the element");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
