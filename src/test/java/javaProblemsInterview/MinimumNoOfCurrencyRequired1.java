package javaProblemsInterview;

public class MinimumNoOfCurrencyRequired1 {

	public static void main(String[] args) {

		getMinimumNoOfDenomination(47);
	}

	private static void getMinimumNoOfDenomination(int currency) {

		int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] counter = new int[notes.length];

		for (int i = 0; i < notes.length; i++) {
			if (currency >= notes[i]) {
				counter[i] = currency / notes[i];
				currency -= (notes[i] * counter[i]);
			}
		}

		for (int i = 0; i < counter.length; i++) {
			if (counter[i]!=0) {
				System.out.print(notes[i] + " rupee note\t=> " + counter[i] + "\n");
			}
		}

	}

}
