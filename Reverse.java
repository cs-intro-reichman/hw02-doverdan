/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		//// Put your code here
		String s = args[0];
		int Slength = s.length();
		for (int i = Slength - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
