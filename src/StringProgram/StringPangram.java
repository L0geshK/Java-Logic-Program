package StringProgram;

import java.util.HashSet;

public class StringPangram {
	
	public static void main(String[] args) {
		String input ="The quick Brown fox Jumps Over the azy Dog";
		input = input.toLowerCase();
		System.out.println(input);
		 boolean  result =checkPangramsoluction2(input);
		 if(result) {
			 System.out.println("This is Pangram");
		 }else {
			 System.out.println("Is not Panfram!!!!");
		 }
		
	}
	
	///Solution 1:
	public static boolean checkPangram(String input) {
		if(input.length()<26) {
			return false;
		}
		for(char i ='a';i<'z';i++) {
			if(input.indexOf(i)<0) {
				return false;
			}
		}
		return true;
	}
	
	///Solution:2:
	public static boolean checkPangramsoluction2(String input) {
		HashSet<Character> characterset = new HashSet<>();
		
		char inputarry[]=input.toLowerCase().toCharArray();
		for(char c:inputarry) {
			if(Character.isLetter(c)) {
				characterset.add(c);
			}
		}
		if(characterset.size()==26) {
			return true;
		}
		return false;
	}

}
