package NumberLogic;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static void main(String[] args) {
		
		String input = "V";
		
		Map<Character,Integer>map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V',5);
		map.put('X', 10);
		int result =0;
		int previousvalue =0;
		for(int i =input.length()-1;i>=0;i--) {
			char currentchar = input.charAt(i);
			int currentvalue = map.get(currentchar);
			if(currentvalue>=previousvalue) {
				result=result+currentvalue;
			}else {
				result=result-currentvalue;
			}
			previousvalue=currentvalue;
			
		}
		System.out.println(result);
		
		
		
	}

}
