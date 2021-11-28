package com.bridgelabz.generics;

public class Refactor_UC3 {

	public static <T extends Comparable<T>> void maximum(T[] arr) {

		int maxCheck = arr[0].compareTo(arr[1]);
		if (maxCheck > 0) {
			maxCheck = arr[0].compareTo(arr[2]);
			if (maxCheck > 0) {
				System.out.println("maximum of three integers is : " + arr[0]);
			} else
				System.out.println("maximum of three integers is : " + arr[2]);

		} else if (maxCheck < 0) {
			maxCheck = arr[1].compareTo(arr[2]);
			if (maxCheck > 0) {
				System.out.println("maximum of three integers is : " + arr[1]);
			} else
				System.out.println("maximum of three integers is : " + arr[2]);
		}
	}

	public static void main(String[] args) {

		Integer intArray[] = { 20, 22, 21 };
		Double doubleArray[] = { 46.36,76.98,43.76 };
		String stringArray[] = { "Apple", "Mango", "Banana" };
		maximum(intArray);
		maximum(doubleArray);
		maximum(stringArray);
	}
}