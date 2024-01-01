/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 * a number is said to be perfect if it equals the sum of all its divisors
 * except for the number itself.
 */
public class Perfect {
	public static void main(String[] args) {
		// getting a number and declaring a variable for the sum.
		int num = Integer.parseInt(args[0]);
		int sum = 0;

		// checking if the number is perfect and creating a line for the answer.
		String Ans = num + "is a perfect number since " + num + " = 1";
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
				Ans += "+" + i + " ";
			}
		}

		// if the number is perfect, print the answer. else, notify that it's not.
		if (sum == num) {
			System.out.println(Ans);
		} else {
			System.out.println(num + " is not a perfect number");
		}
	}
}
