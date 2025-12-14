package ArrayProgram;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		reverseArray();
		reverseArrayTwoPointer();
	}

	private static void reverseArray() {

		int a[] = { 30, 20, 10, 50 };
		int reverse[] = new int[a.length];
		int index = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			reverse[index] = a[i];
			index++;
		}
		for (int number : reverse) {
			System.out.println(number);
		}

	}

	public static void reverseArrayTwoPointer() {
		int a[] = { 70, 30, 40, 50, 60 };
		int left = 0;
		int right = a.length - 1;
		int temp;
		for (int number : a) {
			System.out.print(number + " ");
		}
		System.out.println("");

		while (right > left) {
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			right--;
			left++;

		}
		for (int number : a) {
			System.out.print(number + " ");
		}
	}

}
