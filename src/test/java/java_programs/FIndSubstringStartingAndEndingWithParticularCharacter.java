package java_programs;

import java.util.ArrayList;
import java.util.List;

public class FIndSubstringStartingAndEndingWithParticularCharacter {

	public static void main(String[] args) {
		String givenString = "adjdjjdasjjsjsasjjjdjadjjandnnddjajjddjjdjjaj";
		char firstChar = 'a';
		char lastChar = 'j';
		
		seggregateCharacters(givenString, firstChar, lastChar);
	}

	private static void seggregateCharacters(String givenString, char firstChar, char lastChar) {
		List<StringBuilder> result = new ArrayList<>();
		StringBuilder tempResult = new StringBuilder();
		boolean flag = false;
		
		for (char temp : givenString.toCharArray()) {

			if (temp == firstChar && !flag) {
				flag = true;
				tempResult = new StringBuilder();
			}
			if (temp == lastChar && flag) {
				flag = false;
				tempResult.append(temp);
				result.add(tempResult);
			}
			if (flag) {
				tempResult.append(temp);
			}

		}

		System.out.println(result);
	}

}
