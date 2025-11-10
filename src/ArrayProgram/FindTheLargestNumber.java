package ArrayProgram;

public class FindTheLargestNumber {
	public static void main(String[] args) {
		LargestNumberinArray();
		SecondLargestInArray();
	}

	private static void LargestNumberinArray() {
		int[] input = { 10, 20, 40, 50, 20, 90 };
		int largest = input[0];
		for (int no : input) {
			if (no > largest) {
				largest = no;
			}
		}
		System.out.println("Largest number in Array:" + largest);
	}

	private static void SecondLargestInArray() {
		int[] input = { 10, 20, 40, 50, 20, 90 };
		int largest = Integer.MIN_VALUE, secondlargest = Integer.MIN_VALUE, thirdlargest = Integer.MIN_VALUE;
		for (int no : input) {
			if (no > largest) {
				thirdlargest = secondlargest;
				secondlargest = largest;
				largest = no;
			} else if (no > secondlargest && no != largest) {
				secondlargest = no;

			} else if (no > thirdlargest && no < secondlargest) {
				thirdlargest = no;
			}

		}
		System.out.println(largest);
		System.out.println(secondlargest);
		System.out.println(thirdlargest);
	}

}
