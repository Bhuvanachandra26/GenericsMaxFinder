package com.bridgelabz.generics;

public class IntDoubleMax {
	
	public static void maximumInteger(Integer []intArr) {
		
		int maxCheck = intArr[0].compareTo(intArr[1]);
		if(maxCheck>0) {
			maxCheck=intArr[0].compareTo(intArr[2]);
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[0]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
			
		}else if(maxCheck<0) {
			maxCheck=intArr[1].compareTo(intArr[2]); 
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[1]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
		}
		
	}
	
	public static void maximumDouble(Double []intArr) {
		
		int maxCheck = intArr[0].compareTo(intArr[1]);
		if(maxCheck>0) {
			maxCheck=intArr[0].compareTo(intArr[2]);
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[0]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
			
		}else if(maxCheck<0) {
			maxCheck=intArr[1].compareTo(intArr[2]); 
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[1]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
		}
	}
	
	public static void main(String[] args) {
		
		Integer intArray[] = {20,30,40};
		Double doubleArray[] = {46.36,76.98,43.76};
		maximumInteger(intArray);
		maximumDouble(doubleArray);
	}
}