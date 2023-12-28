/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		// getting the size of the board.
		int size = Integer.parseInt(args[0]);

		// printing the board.
		for (int row = 0; row < size; row++) {
			// printing the current row.
			for (int column = 0; column < size; column++) {
				System.out.print(" * ");

			}
			// going to the next row.
			System.out.println();
		}

	}
}
