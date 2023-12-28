/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get one command-line argument: an int value
 * that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main(String[] args) {
		int numFamilies = Integer.parseInt(args[0]);
		double ExpTotal = 0;
		double ExpAvg = 0;
		int child2 = 0;
		int child3 = 0;
		int child4Plus = 0;

		for (int i = 0; i < numFamilies; i++) {
			boolean b = false;
			boolean g = false;
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
			if (count == 2) {
				child2++;
			} else {
				if (count == 3) {
					child3++;
				} else {
					child4Plus++;
				}
			}

			ExpTotal += count;
		}
		ExpAvg = ExpTotal / numFamilies;

		String max = "";
		if ((child2 > child3) && (child2 > child4Plus)) {
			max = "the most common number of children is 2";
		} else {
			if (child3 > child4Plus) {
				max = "the most common number of children is 3";
			} else {
				max = "the most common number of children is 4 or more";
			}
		}
		System.out.println("Average: " + ExpAvg + " children to get at least one of each gender");
		System.out.println("Number of families with 2 children: " + child2);
		System.out.println("Number of families with 3 children: " + child3);
		System.out.println("Number of families with 4 or more children: " + child4Plus);
		System.out.println(max);

	}
}
