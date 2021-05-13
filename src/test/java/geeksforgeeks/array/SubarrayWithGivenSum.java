package geeksforgeeks.array;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {

		int[] arr = new int[] { 135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192,
				5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123,
				134 };

		System.out.println(SubarrayWithGivenSum.subarraySum(arr, 42, 468));
	}

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		ArrayList<Integer> list = new ArrayList<>();
		// Your code here

		try {
			for (int i = 0; i < arr.length; i++) {
				long results = arr[i];
				for (int j = i + 1; j <= arr.length; j++) {

					if (results == s) {
						list = new ArrayList<>();
						list.add(i + 1);
						list.add(j);
						return list;
					} else if (results > s)
						break;
					results += arr[j];
				}
			}
		} catch (ArrayIndexOutOfBoundsException ignore) {
		}
		if(list.isEmpty()) {
			list.add(-1);
			return list;
		}
		return list;
		// 95 104 12 123 134
	}
}
