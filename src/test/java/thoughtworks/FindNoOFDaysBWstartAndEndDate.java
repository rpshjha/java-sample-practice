package thoughtworks;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class FindNoOFDaysBWstartAndEndDate {

	public static void main(String[] args) {

		LocalDate dateBefore = LocalDate.of(1933, Month.FEBRUARY, 23);
		LocalDate dateAfter = LocalDate.of(2018, Month.DECEMBER, 10);
		long noOfDays = solutionWithInbuiltLib(dateBefore, dateAfter);
		System.out.println("ans from inbuilt library is \t:" + noOfDays);

		int[] dt1 = { 23, 2, 1933 };
		int[] dt2 = { 10, 12, 2018 };
		System.out.println("ans from mysolution is \t\t:" + solution(dt1, dt2));
	}

	static long solution(int[] dt1, int[] dt2) {

		int day = dt1[0];
		int month = dt1[1];
		int year = dt1[2];

		int dayexp = 0;
		int monthexp = 0;
		int yearexp = 0;

		long daysCount = 0;

		if (dt2[2] >= dt1[2]) {

			daysCount = getNoOfDays(month, dt1[2]) - day;
			month++;

			do {
				while (month < 12) {
					daysCount += getNoOfDays(month, year);
					month++;
				}
				year++;
				month = 1;
			} while (dt2[2] > year);

			daysCount += dt2[0];

			yearexp = (int) (daysCount / 365);
			monthexp = (int) ((daysCount - (yearexp * 365)) / 30);
			dayexp = (int) (daysCount - (yearexp * 365) - (monthexp * 30));
		}

//		System.out.println("\n\t" + yearexp + " years " + monthexp + " months " + dayexp + " days\n");

		return daysCount;
	}

	private static long solutionWithInbuiltLib(LocalDate dateBefore, LocalDate dateAfter) {
		return ChronoUnit.DAYS.between(dateBefore, dateAfter);
	}

	/**
	 * 
	 * @param monthIndex
	 * @param year
	 * @return {@link Integer}
	 */
	private static int getNoOfDays(int monthIndex, int year) {
		int noOfDays = 0;

		switch (monthIndex) {
		case 1:
			noOfDays = 31;
			break;
		case 2:
			if (isLeapYear(year))
				noOfDays = 29;
			else
				noOfDays = 28;
			break;
		case 3:
			noOfDays = 31;
			break;
		case 4:
			noOfDays = 30;
			break;
		case 5:
			noOfDays = 31;
			break;
		case 6:
			noOfDays = 30;
			break;
		case 7:
			noOfDays = 31;
			break;
		case 8:
			noOfDays = 31;
			break;
		case 9:
			noOfDays = 30;
			break;
		case 10:
			noOfDays = 31;
			break;
		case 11:
			noOfDays = 30;
			break;
		case 12:
			noOfDays = 31;
			break;

		default:
			System.out.println("invalid");
			break;
		}
		return noOfDays;
	}

	static boolean isLeapYear(int month) {

		if (month % 4 == 0) {
			if (month % 400 == 0)
				return true;
			else if (month % 100 == 0)
				return false;
		} else {
			return false;
		}
		return false;
	}

}
