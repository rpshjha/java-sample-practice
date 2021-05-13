package javaProblemsInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStringUnlessQuotes {

	static String[] token(String s) {

		String[] temp = s.split(" ");
		
		List<String> result = new ArrayList<>();
		StringBuilder sb = null;
		boolean flag = false;

		for (int i = 0; i < temp.length; i++) {

			if (flag && temp[i].charAt(temp[i].length() - 1) != '"') {
				sb.append(temp[i]);
				sb.append(" ");
			}

			if ((temp[i].charAt(0) == '"') && (temp[i].charAt(temp[i].length() - 1) != '"')) {
				sb = new StringBuilder();
				sb.append(temp[i]);
				sb.append(" ");
				flag = true;
			}

			if ((temp[i].charAt(0) == '"') && (temp[i].charAt(temp[i].length() - 1) == '"')) {
				result.add(temp[i]);
			}

			if (flag && temp[i].charAt(temp[i].length() - 1) == '"') {
				sb.append(temp[i]);
				result.add(sb.toString());
				flag = false;
			}

			if (!flag && (temp[i].charAt(0) != '"') && (temp[i].charAt(temp[i].length() - 1) != '"')) {
				result.add(temp[i]);
			}

		}

		return result.toArray(new String[result.size()]);
	}

	public static void main(String[] args) {

		String s = "xyz abc mnp \"asdfs dfaa hshshw\" asd \"fdas\" asdhddd";

		for (String temp : token(s)) {
			System.out.println(temp);
		}
	}

}
