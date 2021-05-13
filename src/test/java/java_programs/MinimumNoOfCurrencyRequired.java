package java_programs;

import java.util.Arrays;

public class MinimumNoOfCurrencyRequired {

	public static void main(String[] args) {

		System.out.println(getMinimumNoOfDenomination(7685));
	}

	private static int getMinimumNoOfDenomination(int amount) {
		int[] notes = new int[] { 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
		int[] noteCounter = new int[notes.length];
		int result = 0;

		for (int i = 0; i < notes.length; i++) {
			if (amount >= notes[i]) { // 13>10 //3>1
				noteCounter[i] = amount / notes[i]; // 13/10=1 //3/1=1
				amount = amount - noteCounter[i] * notes[i]; // 13 = 13-(1 * 10)= 3 //3-1=2
			}
		}

		Arrays.stream(noteCounter)
				.filter(i -> i != 0)
				.forEach(i -> System.out.print(
						notes[i]+ " => " + i + "\t"));

		for (int counter : noteCounter)
			if (counter != 0)
				result += counter;

		return result;
	}

}
