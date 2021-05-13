package geeksforgeeks.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParanthesisChecker {

	// function to check if brackets are balanced
	static boolean areBracketsBalanced(String x) {
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack = new ArrayDeque<>();

		// Traversing the Expression
		for (int i = 0; i < x.length(); i++) {
			char temp = x.charAt(i);

			if (temp == '(' || temp == '[' || temp == '{') {
				// Push the element in the stack
				stack.push(temp);
				continue;
			}

			// IF current current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
 			if (stack.isEmpty())
				return false;
			char check;
			switch (temp) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (stack.isEmpty());
	}

	// Driver code
	public static void main(String[] args) {
		String expr = "([{}])";

		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
