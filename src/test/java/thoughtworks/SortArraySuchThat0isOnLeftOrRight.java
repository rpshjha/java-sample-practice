package thoughtworks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArraySuchThat0isOnLeftOrRight {

	public static void main(String[] args) {
		int[] arr = { 12, 1, 2, 3, 0, 0, 82, 2, 3, 40, 0, 2, 1, 3, 0, 4, 5, 0, 4, 3, 5, 5, -9, 8, 55, -4564, 0 };
		printArr(solution(arr));
	}

	static int[] solution(int[] arr) {

		int[] result = new int[arr.length];
		List<Integer> list = removeZeroAndSort(arr);

		long noOfZero = countZero(arr);

		for (int i = 0; i < arr.length; i++) {
			if (i < noOfZero) {
				result[i] = 0;
			} else {
				result[i] = list.get(i - ((int) noOfZero));
			}
		}

		return result;
	}

	static long countZero(int[] arr) {
		return Arrays.stream(arr).filter(i -> i == 0).count();
	}

	static List<Integer> removeZeroAndSort(int[] arr) {
		return Arrays.stream(arr).filter(i -> i != 0).sorted().boxed().collect(Collectors.toList());
	}

	static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
