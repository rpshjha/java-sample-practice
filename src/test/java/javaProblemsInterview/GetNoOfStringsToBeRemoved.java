package javaProblemsInterview;

import java.util.HashMap;

public class GetNoOfStringsToBeRemoved {

	public static void main(String[] args) {

		String s = "asbshhjdhajdhkgaaabbbbcccccchdhdhhdjsdjsd";
		solution(s);
	}

	static void solution(String s) {

		HashMap<Character, Integer> countOccurance = new HashMap<>();


		for (Character c : s.toCharArray())
			if (countOccurance.containsKey(c))
				countOccurance.put(c, countOccurance.get(c) + 1);
			else
				countOccurance.put(c, 1);

//		countOccurance.forEach((k, v) -> System.out.print(k + " " + v + "\n"));

		System.out.println("++++=========**********++++=========**********");
		
		countOccurance.entrySet().stream().filter((x) -> x.getValue() % 2 != 0)
				.forEach(x -> System.out.print(x.getKey() + " "));
		
	}

}
