package StringProgram;

import java.util.HashMap;

public class FrequencyOfCharaInString {
	
	public static void FrequencyOfCharaInStringHashMap() {
		String input ="Logeshkanna";
		HashMap<Character, Integer> frquencyMap = new HashMap<Character, Integer>();
		char arraychracter[]=input.toCharArray();
		
		for(char Character:arraychracter) {
			frquencyMap.put(Character, frquencyMap.getOrDefault(Character, 0)+1 );
			
		}
		for(char c:frquencyMap.keySet()) {
			System.out.println(c+" "+frquencyMap.get(c));
		}
		
	
	}
	public static void main(String[] args) {
		//FrequencyOfCharaInStringHashMap();
		FrequencyOfCharaInStringWithoutHashMap();
	}
	private static void FrequencyOfCharaInStringWithoutHashMap() {
		String input ="abcd@@@@abcdef";
		int freq[]=new int[256];
		char[] inputarray = input.toCharArray();
		for(char current : inputarray) {
			freq[current]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				System.out.println((char)i+" "+freq[i]);
			}
		}
		
		
	}
	
	
	
}
	