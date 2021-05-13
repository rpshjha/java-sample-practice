package thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class SplitStringUnlessQuotes {

	

	private static String[] tokenizedString(String S) {

		String[] temp = S.split(" ");

		List<String> result = new ArrayList<>();
		StringBuilder sb = null;
		boolean flag = false;

		for (int i = 0; i < temp.length; i++) {

			if (flag && temp[i].charAt(temp[i].length() - 1) != '"') {

				if (i == temp.length - 1) {
					sb.append(temp[i]);
					sb.append("\"");
					result.add(sb.toString());

					break;
				} else {
					sb.append(temp[i]);
					sb.append(" ");
				}
			}

			else if ((temp[i].charAt(0) == '"') && (temp[i].charAt(temp[i].length() - 1) != '"')) {
				sb = new StringBuilder();
				sb.append(temp[i]);
				sb.append(" ");
				flag = true;
			}

			else if ((temp[i].charAt(0) == '"') && (temp[i].charAt(temp[i].length() - 1) == '"')) {
				result.add(temp[i]);
			}

			else if (flag && temp[i].charAt(temp[i].length() - 1) == '"') {

				sb.append(temp[i]);
				result.add(sb.toString());
				flag = false;

			}

			else if (!flag && (temp[i].charAt(0) != '"') && (temp[i].charAt(temp[i].length() - 1) != '"')) {
				result.add(temp[i]);
			}

		}

		return result.toArray(new String[result.size()]);
	}

	public static void main(String[] args) {

		String samplegivenString = "xyz abc mnp \"asdf dfaa asdf\" asd \"fdas asdsdafF";

//		String samplegivenString = "xyz abc mnp asdf dfaa asdf asd fdas asdsdafF";

		for (String temp : tokenizedString(samplegivenString)) {
			System.out.println(temp);
		}
	}

}
