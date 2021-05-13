package sapient;

import java.sql.Time;

public class JavaProblems {

	static {
		System.out.println("inside static block \t" + new Time(System.currentTimeMillis()));
	}

	public JavaProblems() {

		System.out.println("inside default constructor \t\t" + new Time(System.currentTimeMillis()));
	}

	public static void main(String[] args) {

		JavaProblems solution = new JavaProblems();
		JavaProblems solution2 = new JavaProblems();

//		solution.solution();
		solution.solution("Rupesh");

	}

	static void solution() {
		System.out.println("inside solution method");
	}

	void solution(String parameter) {
		System.out.println("inside solution method \n parameter value " + parameter);
	}

}
