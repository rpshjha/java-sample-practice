package tes;

public class Demo {

	public static void main(String[] args) {

		String s = "rupesh*123jha";

		Demo d = new Demo();
		System.out.println(d.reverseAString(s));
	}

	String reverseAString(String s) {

		String result = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			char temp = s.charAt(i);
			if (Character.isLetter(temp))
				result += s.charAt(i);
			else if (Character.isDigit(temp)) {
				result += "@";
			}
			else
				result += "\\";
		}
		return result;

	}

}
