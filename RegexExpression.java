package regexexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExpression {

	static boolean validate(String pattern, String text) {

		return Pattern.compile(pattern).matcher(text).matches();
	}

	public static void main(String[] args) {

		String pattern = "^[a-zA-Z0-9]+[@]{1}+[a-zA-Z]+[.]{1}[a-z]{2,3}$";

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter email ID: ");

		String email = scanner.next();

		boolean isValid = validate(pattern, email);

		if (isValid) {
			System.out.println("This is valid Email ID .");
		} else {
			System.out.println("Not a valid ID");
		}
	}

}
