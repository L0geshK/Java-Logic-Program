package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RevcerseString {
	public static void main(String[] args) {
		reverseStringTwoPoiner();
		reverseStringVowels();
		revomeDuplicateString();
		

	}

	public  static void revomeDuplicateString() {
		String input = "Kanna";
		Set<Character>set = new LinkedHashSet<Character>();
		for(char  s : input.toCharArray()) {
			set.add(s);
		}
		StringBuilder sb =new StringBuilder();
		for(char s:set) {
			sb.append(s);
		}
		System.out.println(sb.toString());
		
	}

	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static void reverseStringVowels() {
		String input = "Logesh"; // aeiou
		char[] c = input.toCharArray();
		int left = 0;
		int right = input.length() - 1;
		while (left < right) {
			while (left < right && !isVowel(c[left])) {
				left++;
			}
			while (left < right && !isVowel(c[right])) {
				right--;

			}
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			left++;
			right--;

		}
		System.out.println(new String(c));

	}

	public static void reverseStringTwoPoiner() {
		String input = "lohgesh";
		char[] c = input.toCharArray();
		int left = 0;
		int right = input.length() - 1;
		while (left < right) {
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			left++;
			right--;
		}
		System.out.println(new String(c));
	}

}
