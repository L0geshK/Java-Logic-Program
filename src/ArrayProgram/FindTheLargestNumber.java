package ArrayProgram;

public class FindTheLargestNumber {
	public static void main(String[] args) {
		LargestNumberinArray();
		SecondLargestInArray();
		thiredLargestinArray();
	}

	public  static void thiredLargestinArray() {
		int[] input = {10,2,40,5,55};
		int firstlarge=Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int ThirdLargest = Integer.MIN_VALUE;
		for (int no : input) {
			if (no > firstlarge) {
				ThirdLargest = secondLargest;
				secondLargest = firstlarge;
				firstlarge = no;
			} else if (no > secondLargest && no != firstlarge) {
				secondLargest = no;

			} else if (no > ThirdLargest && no < secondLargest) {
				ThirdLargest = no;
			}

		}
		System.out.println(firstlarge);
		System.out.println(secondLargest);
		System.out.println(ThirdLargest);
		
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
		int largest = Integer.MIN_VALUE, secondlargest = Integer.MIN_VALUE;
		for (int no : input) {
			if (no > largest) {
				
				secondlargest = largest;
				largest = no;
			} else if (no > secondlargest && no != largest) {
				secondlargest = no;

			} 
		}
		System.out.println(largest);
		System.out.println(secondlargest);
		
	}

}
