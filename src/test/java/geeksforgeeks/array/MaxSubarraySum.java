package geeksforgeeks.array;

public class MaxSubarraySum {

	public static void main(String[] args) {

		MaxSubarraySum max = new MaxSubarraySum();

//		int[] arr = new int[] { 1, 2, 3, -2, 5 };
		int[] arr = new int[] { -1, -2, -3, -4 };
		int n = arr.length;
		int result = max.maxSubarraySum(arr, n);

		System.out.println(result);
	}

	int maxSubarraySum(int arr[], int n) {

		// Your code here

		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < n; i++) {
			max_ending_here += arr[i];

			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;

			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;

	}

}
