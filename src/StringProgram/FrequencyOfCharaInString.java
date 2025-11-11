package StringProgram;

import java.util.HashMap;

public class FrequencyOfCharaInString {
	public static void main(String[] args) {
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

}
