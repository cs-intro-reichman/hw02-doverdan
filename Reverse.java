/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {

		String s = args[0];
		int Slength = s.length();

		for (int i = Slength - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		if (Slength % 2 == 0) {
			System.out.println();
			System.out.println("The middle character is " + s.charAt(Slength / 2 - 1));
		} else {
			System.out.println();
			System.out.println("The middle character is " + s.charAt(Slength / 2));
		}

	}
}
