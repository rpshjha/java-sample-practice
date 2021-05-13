package java_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

	private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

	static int[] longestUniformSubstring(String input) {
		int longestStart = -1;
		int longestLength = 0;

		// todo: implement the longestUniformSubstring logic
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		boolean flag = false;

		for (int i = 1; i < input.length(); i++) {

			if (!flag) {
				longestStart = i - 1;
			}
			if (input.charAt(i - 1) == input.charAt(i)) {
				flag = true;
				++longestLength;
			}

			if (input.charAt(i - 1) != input.charAt(i)) {
				flag = false;

				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(longestStart);
				temp.add(longestLength);
				list.add(temp);
				longestLength = 1;

			}

			if (i == input.length() - 1) {
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(longestStart);
				temp.add(longestLength);
				list.add(temp);
			}

		}

		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < list.get(i).size(); j++) {
				int temp = list.get(i).get(j);
				if (temp > max) {
					max = temp;
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).get(1) == max) {
				longestStart = list.get(i).get(0);
				longestLength = list.get(i).get(1);
			}

		}

//		System.out.println(longestStart + " " + longestLength);

		return new int[] { longestStart, longestLength };
	}

	public static void main(String[] args) {
		testCases.put("", new int[] { -1, 0 });
		testCases.put("10000111", new int[] { 1, 4 });
		testCases.put("aabbbbbCdAA", new int[] { 2, 5 });
		// todo: implement more tests, please
		// feel free to make testing more elegant

		boolean pass = true;
		for (Map.Entry<String, int[]> testCase : testCases.entrySet()) {
			int[] result = longestUniformSubstring(testCase.getKey());
			pass = pass && (Arrays.equals(result, testCase.getValue()));
		}
		if (pass) {
			System.out.println("All tests pass!");
		} else {
			System.out.println("At least one failure! :( ");
		}
	}
}
