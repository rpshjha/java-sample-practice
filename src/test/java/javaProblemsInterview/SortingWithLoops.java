package javaProblemsInterview;

public class SortingWithLoops {

	public static void main(String[] args) {

		int[] arr = { 1, 24, 3, 5, 22, 424, 56, 32, 1, 5, 78, 9, 36, 8, 4, 2, 5, 7889, 9, 3 };

		sortWithLoops(arr);
	}

	private static void sortWithLoops(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] < arr[i + 1]) {
				
				arr[i] = arr[i] + arr[i + 1];
				arr[i + 1] = arr[i] - arr[i + 1];
				arr[i] = arr[i] - arr[i + 1];

				i = -1;
			}
		}

		for (int i : arr)
			System.out.println(i);
	}

}
