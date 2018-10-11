import java.util.Scanner;

public class GCLab5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String again = null;
		do {
			System.out.println("Give me a number between 1 and 10 and I'll calculate its factorial: ");
			String num = scnr.next();

			while (isNumber(num) == false) {
				System.out.println("That's not a number. Try again: ");
				num = scnr.next();
			}

			while (withinRange(num) == false) {
				System.out.println("That number is not within the permitted range. Try again: ");
				num = scnr.next();
			}
			
			long fact = Integer.parseInt(num);
			System.out.println("The factorial of " + num + " is " + factorial(fact));
			System.out.println("Continue? (y/n)");
			again = scnr.next();
		} while (again.equalsIgnoreCase("y"));

		System.out.println("Goodbye.");

	}

	public static long factorial(long num) {

		if (num == 1) {
			return 1;
		} else {
			
			return num * factorial(num - 1);
		}
	}

	public static boolean isNumber(String str) {

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			boolean charIsDigit;
			charIsDigit = Character.isDigit(currentChar);
			if (charIsDigit == false) {
				return false;
			}

		}
		return true;
	}

	public static boolean withinRange(String str) {
		if ((Integer.parseInt(str) > 0) && (Integer.parseInt(str) <= 10)) {
			return true;
		}
		return false;
	}
}