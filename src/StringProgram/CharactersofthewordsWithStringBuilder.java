package StringProgram;

public class CharactersofthewordsWithStringBuilder {
	public static void main(String[] args) {
		
		String input = "this is fun";
		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word:words) {
			StringBuilder reverse = new StringBuilder(word);
			result.append(reverse.reverse().append(" "));
			
		}
		System.out.println(result);
	}

}
