package geeksforgeeks.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeWithoutExtraSpace {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 3, 5, 7 };
		int[] arr2 = new int[] { 0, 2, 6, 8, 9 };
		int n = arr1.length;
		int m = arr2.length;

		merge(arr1, arr2, n, m);
	}

	public static void merge(int arr1[], int arr2[], int n, int m) {
		// code here

		List<Integer> temp = new ArrayList<>();
		for (int i : arr1)
			temp.add(i);
		for (int i : arr2)
			temp.add(i);

		Collections.sort(temp);

		for (int i = 0; i < n; i++) {
			arr1[i] = temp.get(i);
		}
		for (int i = 0; i < m; i++) {
			arr2[i] = temp.get(i+ n);
		}

	}

}
