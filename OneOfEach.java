
/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args) {
		/// declaring two booleans, representing having or not having a boy and a girl.
		Boolean b = false;
		Boolean g = false;

		// declaring a counter for the number of children.
		int count = 0;
		while (b == false || g == false) {
			// declare a random number either 0 or 1
			int rand = (int) (Math.random() * 2);
			if (rand == 0) {
				b = true;
			} else {
				g = true;
			}
			count++;
			System.out.println(count);

		}
		System.out.println("you made it... and you now have " + count + " children.");

	}
}
