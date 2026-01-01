package StringProgram;

public class StringToggle {
	public static void main(String[] args) {
		String input = "Hello World";
		StringBuilder sb = new StringBuilder();
		
		char[] dataarrya= input.toCharArray();
		for(char c: dataarrya) {
			if(Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			}else if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}else {
				sb.append(c);
			}
			
		}
		System.out.println("og sting:"+input);
		System.out.println("toggle sting:"+sb.toString());
		
	}

}
