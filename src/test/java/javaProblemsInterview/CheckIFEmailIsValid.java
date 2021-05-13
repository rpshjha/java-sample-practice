package javaProblemsInterview;

import java.util.regex.Pattern;

public class CheckIFEmailIsValid {

	public static void main(String[] args) {

		CheckIFEmailIsValid email = new CheckIFEmailIsValid();

		String emailId = ".@gmail.com";

		System.out.println(email.verifyEmailFormat(emailId));
	}

	private boolean verifyEmailFormat(String emailId) {

		String regex = "[A-Za-z0-9+_.-]+@(.+)$";
		return Pattern.matches(regex, emailId);
	}

}
