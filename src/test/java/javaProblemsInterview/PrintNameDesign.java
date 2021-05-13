package javaProblemsInterview;

import java.util.Arrays;

public class PrintNameDesign {
	public static void main(String[] args) {
		String[] arr = { "Binay", "Priyanka", "Rupesh", "Pihu" };
		createPattern(arr);
	}

	static void createPattern(String[] str) {

		int noOfRows = str.length + 2;
		int noOfCols = Arrays.asList(str).stream().map(String::length).max(Integer::compareTo).get() + 2;

		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfCols; j++) {

				if (i == 0 || j == 0 || i == noOfRows - 1 || j == noOfCols - 1)
					System.out.print("*");
				else
					try {
						System.out.print(str[i - 1].toCharArray()[j - 1]);
					} catch (ArrayIndexOutOfBoundsException ignore) {
						System.out.print(" ");
					}
			}
			System.out.println("");
		}
	}

}
