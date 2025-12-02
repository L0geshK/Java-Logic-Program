	package StringProgram;
	
	import java.util.HashMap;
import java.util.LinkedHashMap;
	
	public class ReplaceDuplicate {
		public static void main(String[] args) {
			String result = replaceDuplicate("Logeshkannna");
			System.out.println(result);
		}
	
		private static String replaceDuplicate(String input) {
			input = input.toLowerCase();
			StringBuilder result = new StringBuilder();
			 LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
			for (char Character : input.toCharArray()) {
				map.put(Character, map.getOrDefault(Character, 0) + 1);
			}
			for (char c :input.toCharArray()) {
				if (map.get(c) == 1) {
					result.append(c);
				} else if ((map.get(c) == 2)) {
					result.append('@');
				} else {
					result.append('#');
				}
			}
	
			return result.toString();
		}
	}
