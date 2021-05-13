package javaProblemsInterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicate {

	public static void main(String[] args) {

		String givenInput = "RupeshKumarRup";

		printDuplicate(givenInput);
		System.out.println();
		printDuplicateThroughFunctionalProgramming(givenInput);
	}

	private static Character printDuplicateThroughFunctionalProgramming(String givenInput) {

		return givenInput.chars()      //string stream
	             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lowercase & then to Character object
	             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
	             .entrySet().stream()
	             .filter(entry -> entry.getValue() == 1L)
	             .map(entry -> entry.getKey())
	             
	             .findFirst()
	             .get();
	}
					

	private static void printDuplicate(String givenInput) {

		Map<Character, Integer> map = new HashMap<>();

		for (char temp : givenInput.toCharArray()) {

			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);
		}

		map.forEach((k, v) -> {
			if (v > 1) {
				System.out.print(k + "=" + v + " ");
			}
		});
	}

}
