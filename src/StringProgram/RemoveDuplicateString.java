package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		palindron("aba");
		String s = "Java";
		StringBuilder sb = new StringBuilder();
		Set<Character>LinkedHastset = new LinkedHashSet<>();
		for(char c:s.toCharArray()) {
			if(LinkedHastset.add(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		
	}
	
	public static void palindron(String input) {
		StringBuilder sb = new StringBuilder(input);
		String Rverse= sb.reverse().toString();
		if(input.equals(Rverse)) {
			System.out.println("Its a palindrom");
		}else {
			System.out.println("IS not");
		}
	}

}
