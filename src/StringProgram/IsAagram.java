package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class IsAagram {
	
	
	public static void main(String[] args) {
		isAnagram("logs","sgol");
		//isAnagram("logs","sgot");
		boolean result=isAnagramHashmap("ar***","***ar");
		System.out.println(result);
	}

	private static boolean isAnagramHashmap(String string, String string2) {
		 String a = string.replaceAll("\\s+", "").toLowerCase();
		 String b = string2.replaceAll("\\s+", "").toLowerCase();
		
		if(string.length()!=string2.length()) {
			 return false;
		     
		}
		 Map<Character, Integer> counts = new HashMap<>();
		 for(int i=0;i<a.length();i++) {
			 counts.put(a.charAt(i), counts.getOrDefault(a.charAt(i), 0)+1);
			 counts.put(b.charAt(i), counts.getOrDefault(b.charAt(i), 0)-1);
			 
		 }
		 for(int count :counts.values()) {
			 if(count!=0) {
				 return false;
			 }
		 }
		 return true;
		
	}

	private static void isAnagram(String string, String string2) {
		if(string.length()!=string2.length()) {
			System.out.println("is not anagram");
		}
		int[] countchar = new int[26];
		for(int i=0;i<string.length();i++) {
			countchar[string.charAt(i)-'a']++;
			countchar[string2.charAt(i)-'a']--;
			
			
		}
		for(int count :countchar) {
			if(count!=0) {
				System.out.println("is not anagram");
			}
		}
		System.out.println("is anagram");
		
	}
	

}
