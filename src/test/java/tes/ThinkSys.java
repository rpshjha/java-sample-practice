package tes;

import java.util.LinkedList;
import java.util.List;

public class ThinkSys {

	/*
	 * 
	 * 
	 * Ip- "my name is shruti" Op-"it urhs si emanym"
	 * 
	 */

	public static void main(String[] args) {

		String input = "my name is shruti";

		System.out.println(printOutput(input));
		
		String a = "https://control.api.coxautoinc-np.com/openapi-contents?openApiId=da7634b7-70b1-4cd3-b67e-e0eff6b052b2&allowValidationState=Valid";
		
		System.out.println(a.split("=")[1]);
		
		System.out.println(a.substring(a.indexOf("=") + 1, a.indexOf("&")));

	}

	static String printOutput(String input) {

		List<Character> result = new LinkedList();

		for (int i = input.length() - 1; i >= 0; i--) {

			if (!Character.isSpaceChar(input.charAt(i)))
				result.add(input.charAt(i));

		}

		for (int i = 0; i < input.length(); i++) {

			if (Character.isSpaceChar(input.charAt(i)))
				result.add(i, ' ');

		}

		String output = "";

		for (char temp : result) {
			output += String.valueOf(temp);
		}
		return output;
	}

}
