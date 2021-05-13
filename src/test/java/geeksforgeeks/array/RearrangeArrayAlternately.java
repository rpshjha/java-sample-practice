package geeksforgeeks.array;

public class RearrangeArrayAlternately {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;

		rearrange(arr, n);
	}

	public static void rearrange(int arr[], int n) {

		// Your code here

		int[] temp = new int[n];
		int start = 0;
		int end = n - 1;
		for (int i = 0; i < n; i++) {

			if ((i + 2) % 2 == 0) {
				temp[i] = arr[end];
				end--;

			} else {
				temp[i] = arr[start];
				start++;
			}

		}

		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];

		}

	}
}
