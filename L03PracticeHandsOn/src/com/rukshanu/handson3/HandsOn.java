package com.rukshanu.handson3;

public class HandsOn {

	public static void main(String[] args) {
		// Define an integer array of size 5 with all elements initialized to the value 0.
		int[] intArray = new int[5];

		// Using a for loop and the ReadInputInt() static method of the StudentHelper class,
		// read in (as input) the 5 integer values and store them into the array.
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(String.format("Enter a number, index[%s]:", i));
			intArray[i] = StudentHelper.ReadInputInt();
		}
		// Print the contents of the array to the console using a for loop to iterate over the elements of the array.
		System.out.println("Contents of the array:");
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(String.format("Index[%s]: %s", i, intArray[i]));
		}
		// Print the contents of the array in the reverse order.
		System.out.println("Array contents reversed:");
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(String.format("[%s]: %s", i, intArray[(intArray.length - 1 ) - i]));
		}
		// Print the values of the array where the index is odd.
		System.out.println("Odd index items:");
		for(int i = 1; i < intArray.length; i++) {
			if(i % 2 != 0) {System.out.println(String.format("Index[%s]: %s", i, intArray[i]));
		}
		}
	}

}
