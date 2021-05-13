package thoughtworks;

import java.util.LinkedHashMap;

public class FindFirstRepeatedAndNonRepeatedCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String givenString = "JJavaConceptOfTheDay";
		solution(givenString);
	}

	static void solution(String givenString) {

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (Character c : givenString.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		
		char result = map.entrySet().stream()
		.filter((i) -> i.getValue()==1 )
		.findFirst()
		.get().getKey();
		
		System.out.println(result);
	}
}
