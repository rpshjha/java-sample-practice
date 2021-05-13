package java_programs;

import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		StringBuilder result = new StringBuilder();

		for (int i = 0;; i++) {
			if (result.length() < n) {
				try {
					result.append(s.charAt(i));
				} catch (StringIndexOutOfBoundsException e) {
					i = -1;
				}
			} else
				break;
		}

		return result.chars() // string stream
				.filter((ch) -> ch == 'a').count();
	}

	static long repeatedString1(String s, long n) throws IOException {
		StringBuilder result = new StringBuilder();

		StringReader reader = new StringReader(s);
		
		while (result.length() < n) {
			reader.read(s.toCharArray());
//			result.append(s);
//			result += s;
		}

		result.append(reader);
		result.setLength((int) n);
		
		return result.chars() // string stream
				.filter((ch) -> ch == 'a').count();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

//		System.out.println(repeatedString("aba", 100000000l));
		System.out.println(repeatedString1("aba", 1000000000000l));
	}

}
