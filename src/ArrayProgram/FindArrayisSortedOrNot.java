package ArrayProgram;

public class FindArrayisSortedOrNot {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1 };
	toChecksortedArryaasc(arr);
//		toChecksortedArryDesc(arr);
		//isSorted(arr);

	}

	private static boolean isSorted(int[] arr) {
		boolean isAscending = true;
		boolean isDescending = true;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				isAscending = false;
			}
			if (arr[i] > arr[i - 1]) {
				isDescending = false;
			}
		}

		if (isAscending) {
			System.out.println("Array is sorted in ASCENDING order");
		} else if (isDescending) {
			System.out.println("Array is sorted in DESCENDING order");
		}

		return isAscending || isDescending;
	}

	private static boolean toChecksortedArryDesc(int[] arr) {
		boolean isDescending = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				isDescending = false;
			}

		}
		if (isDescending) {
			System.out.println("Array is sorted in ASCENDING order");
		}
		return true;
	}

	private static boolean toChecksortedArryaasc(int[] arr) {
		boolean isAscending = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				isAscending = false;
			}

		}
		if (isAscending) {
			System.out.println("Array is sorted in ASCENDING order");
		}
		return true;

	}

}
