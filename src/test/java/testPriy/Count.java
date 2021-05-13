package testPriy;

import java.util.HashMap;

public class Count {

	public static void main(String[] args) {
		String s1 = "aaaabbaaabbbaabbaabb";

//		aaaabbaaabbbaabbaabb
//		aaaa-1
//		bb-3
//		aaa-1

		countConsecutive(s1);
	}

	static void countConsecutive(String s) {
		
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			String substring = String.valueOf(s.charAt(i));

			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {

				i++;
				substring += String.valueOf(s.charAt(i));
			}

			if (map.containsKey(substring))
				map.put(substring, map.get(substring) + 1);
			else
				map.put(substring, 1);

			substring = null;

		}

		System.out.println(map);
	}
}
