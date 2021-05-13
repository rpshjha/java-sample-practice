package sapient;

import java.util.HashMap;
import java.util.Map;

public class GLProblems {

	public static void main(String[] args) {
		String s1 = "Count Number of words in a string using hashmap";

		String s2 = "GlobalLogic";

		GLProblems problems = new GLProblems();
//		System.out.println(count.countNofWords(s1));
		System.out.println(problems.reverseAString(s2));
		problems.printStarPattern();

	}

	void printStarPattern() {

		int row = 5;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j <= row; j++) {
				if (j >= (row - i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

	void printStarPattern(int row) {

		for (int i = 0; i < row; i++) {

			for (int j = (row - i); j > 1; j--)
				System.out.print(" ");

			for (int j = 0; j <= i; j++)
				System.out.print("*");

			System.out.println();
		}

	}

	String reverseAString(String s2) {

		String result = "";

		for (int i = s2.length() - 1; i >= 0; i--) {

			result += s2.charAt(i);
		}
		return result;

	}

	StringBuilder reverseAStringWithLib(String s2) {

		return new StringBuilder(s2).reverse();
	}

	int countNofWords(String s1) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String temp : s1.split("\\s+")) {

			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);
		}

		return map.size();

	}

}
