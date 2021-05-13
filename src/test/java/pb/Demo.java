package pb;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	// input->{1,2,3,4,5,6}
	// output -> {2,3,1,4,5,6}

	public static List<Integer> shuffleIntArr(int[] arr) {

		int firstNo = arr[1];
		int secondNo = arr[2];
		int thirdNo = arr[0];

		List<Integer> tempList = new ArrayList<>();

		tempList.add(firstNo);
		tempList.add(secondNo);
		tempList.add(thirdNo);

		for (int i = 3; i < arr.length; i++) {

			tempList.add(arr[i]);
		}

		return tempList;
	}

	public static void main(String[] args) {
		System.out.println("Hello World");

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

		System.out.print(shuffleIntArr(arr));
	}

}
