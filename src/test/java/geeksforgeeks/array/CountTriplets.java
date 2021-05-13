package geeksforgeeks.array;

public class CountTriplets {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 5, 3, 2 };

		System.out.println(countTriplet(arr, arr.length));
	}

	static boolean checkIfElemPres(int arr[], int toBeChecked) {
		for (int element : arr) {
			if (element == toBeChecked) {
				return true;
			}
		}
		return false;
	}

	static int countTriplet(int arr[], int n) {

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (i != j) {
					int sum = arr[i] + arr[j];
					if (checkIfElemPres(arr, sum))
						count++;
				}

			}
		}

		return count;
	}
}
