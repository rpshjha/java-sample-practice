package thoughtworks;

public class ReverseAndAddANumberUntillPalindrom {

	public static void main(String[] args) {

		long givenNo = 7325;

		System.out.println("ans is " + solution(givenNo));
	}

	/**
	 * 
	 * @param givenNo
	 * @return {@link Long}
	 */
	private static long solution(long givenNo) {

		long noToBeChecked = givenNo + reverseANumber(givenNo);

		while (true) {
			if (isPalindrome(noToBeChecked)) {
				return noToBeChecked;
			}
			noToBeChecked = noToBeChecked + reverseANumber(noToBeChecked);
		}

	}

	private static long reverseANumber(long givenNo) {
		long temp = givenNo;
		long reversedNo = 0;
		while (temp > 0) {
			reversedNo = reversedNo * 10 + (temp % 10);
			temp /= 10;
		}
		return reversedNo;
	}

	private static boolean isPalindrome(long givenNo) {
		long reversedNo = reverseANumber(givenNo);

		if (reversedNo == givenNo)
			return true;
		return false;
	}

}
