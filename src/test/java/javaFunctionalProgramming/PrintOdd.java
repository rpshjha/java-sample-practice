package javaFunctionalProgramming;

import java.util.Arrays;

public class PrintOdd {

	public static void main(String[] args) {

		int[] arr = { 22, 3, 4, 2, 555, 6, 7, 43, 4, 6, 73, 2, 6, 7 };

		Arrays.stream(arr).filter(i -> i % 2 != 0).forEach(System.out::println);
	}

}
