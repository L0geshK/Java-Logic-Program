package StringProgram;

public class StringReplacement {
	public static void main(String[] args) {
		ReplaceoneChar();
		ReplaceoneCharwithmultipletime();

		
	}

	public  static void ReplaceoneCharwithmultipletime() {
		String input="tomorrow";
		StringBuilder sb = new StringBuilder();
		for(char c: input.toCharArray()) {
			if(c=='o' || c=='O') {
				sb.append('@');
			}else {
				sb.append(c);
			}
		}
		System.out.println("Input String "+input);
		System.out.println("Output String "+sb.toString());
		
	}

	public  static void ReplaceoneChar() {
		String input="tomorrow";
		int count=0;
		StringBuilder sb = new StringBuilder();
		for(char c: input.toCharArray()) {
			if(c=='o' || c=='O') {
				count++;
				sb.append("@".repeat(count));
			}else {
				sb.append(c);
			}
		}
		System.out.println("Input String "+input);
		System.out.println("Output String "+sb.toString());
		
	}
	
}
