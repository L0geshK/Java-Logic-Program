package StringProgram;

public class ReplaceVowel {
	public static boolean isVowel(char character) {
		if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u' || character=='A' || character=='E'|| character=='I'||character=='O'||character=='U') {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		String input = "Logesh";
		StringBuilder sb = new StringBuilder();
		char[] inputarray = input.toCharArray();
		for(char c:inputarray) {
			if(isVowel(c)) {
				sb.append("x");
			}else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		
	}

}
