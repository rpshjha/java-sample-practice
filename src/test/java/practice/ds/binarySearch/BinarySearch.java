package practice.ds.binarySearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();

		int[] arr = { 0, 2, 4, 8, 334, 553, 666, 993 };
		int searchEl = 2;
		System.out.println(bs.search(arr, searchEl));

	}

	int search(int[] arr, int searchEl) {

		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {

			int m = (l + r) / 2;

			if (searchEl > arr[m]) {
				l = m + 1;
			} else if (searchEl < arr[m]) {
				r = m + 1;
			} else {
				return arr[m];
			}
		}
		return -1;
	}

}
