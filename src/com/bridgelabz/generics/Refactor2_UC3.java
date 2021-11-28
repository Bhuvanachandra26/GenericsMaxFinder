package com.bridgelabz.generics;

public class Refactor2_UC3<T> {

	T variable1;
	T variable2;
	T variable3;

	public Refactor2_UC3(T variable1, T variable2, T variable3) {
		super();
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable3 = variable3;
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	public <T extends Comparable<T>> void maximum() {

		int maxCheck = ((T) variable1).compareTo((T) variable2);
		if (maxCheck > 0) {
			maxCheck = ((T) variable1).compareTo((T) variable3);
			if (maxCheck > 0) {
				System.out.println("maximum of three integers is : " + variable1);
			} else
				System.out.println("maximum of three integers is : " + variable3);

		} else if (maxCheck < 0) {
			maxCheck = ((T) variable2).compareTo((T) variable3);
			if (maxCheck > 0) {
				System.out.println("maximum of three integers is : " + variable2);
			} else
				System.out.println("maximum of three integers is : " + variable3);
		}
	}

	public static void main(String[] args) {

		new Refactor2_UC3<>(20, 40, 30).maximum();
		new Refactor2_UC3<>(81.81, 25.99, 20.58).maximum();
		new Refactor2_UC3<>("Apple", "Banana", "govva").maximum();
	}
}