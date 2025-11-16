package StringProgram;

import java.util.Arrays;

public class StringManipulation {
	public static void main(String[] args) {
		
		StringReverse();
		
		StringReverseword();
		
		SplitString();
		SplitString1();
		
		
		
		

		String input = "12abc34xyz56lmn10";
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				sb.append(c);
			} else {
				if (sb.length() > 0) {
					sum = sum + Integer.parseInt(sb.toString());
					sb.setLength(0);
				}

			}
		}
		if (sb.length() > 0) { // for the case where the number are at the end!!!
			sum = sum + Integer.parseInt(sb.toString());

		}
		System.out.println(sum);

	}
	public  static  void SplitString() {
		String s ="abc-2019-logesh";
		String arr[]=s.split("-");
		System.out.println("["+arr[0]+"]");
		System.out.println("["+arr[1]+"]");
		System.out.println("["+arr[2]+"]");
	}
	public static void SplitString1() {
		String s = "abc-cde-2019";
		Arrays.stream(s.split("-")).forEach(a->System.out.println("["+a+"]"));
	}

	
	//outout -= "v annak hegoL" reverse each character in the using String Builder;
	public static void StringReverse() {
		String s = "Logeh kanna v";
		StringBuilder sb = new StringBuilder(s);
		String reverse=sb.reverse().toString();
		System.out.println(reverse);
	}
	//outout -= "v kanna logesh" reverse each word  in the string using String Builder
	public static void StringReverseword() {
		String s = "Logeh kanna v";
		
		String[] word = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = word.length-1;i>=0;i--) {
			sb.append(word[i]).append(" ");
		}
		System.out.println(sb.toString());
	}
}
 