package StringProgram;

public class RemoveAllWhiteSpace {
	public static void main(String[] args) {
		String input = "   hello wordk   ";
		input = input.trim();
		System.out.println(input);
		input = input.replaceAll("\\s+", " ");
		System.out.println(input);
		
	}

}
