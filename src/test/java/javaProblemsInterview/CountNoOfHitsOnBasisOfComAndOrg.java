package javaProblemsInterview;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountNoOfHitsOnBasisOfComAndOrg {

	public static void main(String[] args) {

		String[] arr = {
				"google.com", "50", 
				"mail.google.com", "35", 
				"yahoo.com", "22", 
				"mail.yahoo.com", "15",
				"wiki.org", "25", 
				"info.wiki.org", "20" 
				};
		
		CountNoOfHitsOnBasisOfComAndOrg count = new CountNoOfHitsOnBasisOfComAndOrg();
		count.countHits(arr, "com", "org");
	}

	/**
	 * 
	 * @param arr
	 * @param domain1
	 * @param domain2
	 */
	void countHits(String[] arr, String domain1, String domain2) {

		HashMap<String, Integer> map = new HashMap<>();

		int i = 0;
		while (i < arr.length) {
			map.put(arr[i], Integer.parseInt(arr[i + 1]));
			i = i + 2;
		}

		int com = 0;
		int org = 0;

		for (Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getKey().contains(domain1))
				com += entry.getValue();

			if (entry.getKey().contains(domain2))
				org += entry.getValue();

		}

		System.out.println(domain1 + "=" + com);
		map.entrySet()
					.stream()
					.filter(x -> x.getKey().contains(domain1))
					.forEach(System.out::println);
		
		System.out.println(domain2 + "=" + org);
		map.entrySet()
					.stream()
					.filter(x -> x.getKey().contains(domain2))
					.forEach(System.out::println);
	}
}
