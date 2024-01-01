/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		// getting the size of the board.
		int size = Integer.parseInt(args[0]);

		// printing the board.
		for (int row = 1; row < size; row++) {
			// printing the current row.
			if (row % 2 == 0) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				if (row < col) {
					System.out.print("* ");
				} else {
					System.out.print("*");
				}
			}
			if (row % 2 == 1) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
