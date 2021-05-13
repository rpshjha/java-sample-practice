package simpllr;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	String removeAlternate(String input) {

		String result = "";
		Map<Character, Integer> map = new HashMap();
		for (Character temp : input.toLowerCase().toCharArray()) {
			if (map.containsKey(temp)) {

				if (map.get(temp) % 2 != 0) {

					map.put(temp, map.get(temp) + 1);
				} else {
					result += String.valueOf(temp);
					map.put(temp, map.get(temp) + 1);
				}
			} else {

				map.put(temp, 1);
				result += String.valueOf(temp);
			}

		}
		return result;
	}

	public static void main(String[] args) {
		String ob = "Good Morning Prateek Goel";

		// God MorniPatek Gel
		Demo d = new Demo();
		System.out.println(d.removeAlternate(ob));
	}

}
