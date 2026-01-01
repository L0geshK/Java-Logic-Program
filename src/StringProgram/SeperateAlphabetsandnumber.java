package StringProgram;

public class SeperateAlphabetsandnumber {
	public static void main(String[] args) {
		
		String input = "Logesh1408K";
		StringBuilder Alphabet = new StringBuilder();
		StringBuilder number = new StringBuilder();
		char[] inputarry = input.toCharArray();
		for(char c : inputarry) {
			if(Character.isAlphabetic(c)) {
				Alphabet.append(c);
			}else if(Character.isDigit(c)) {
				number.append(c);
			}
		}
		System.out.println(Alphabet);
		System.out.println(number);
		
		
	}

}
