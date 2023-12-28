/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		// declaring new variables
		int Base = 0;
		int NewRand = 0;

		// generating random numbers and printing them as long as they are in a
		// non-decreasing order.
		while (Base <= NewRand) {
			NewRand = (int) (Math.random() * 10);
			if (NewRand >= Base) {
				System.out.println(NewRand);
				Base = NewRand;
			}
		}
	}
}
