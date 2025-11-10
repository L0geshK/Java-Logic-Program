package StringProgram;

public class CountLengthofString {

	public static void main(String[] args) {
		countofsting();
		//without using .length() method
		String input ="hello world";
		char[] inputchar = input.toCharArray();
		int count=0;
		for(char c:inputchar) {
			count++;
		}
		System.out.println(count);
	}
	
	
	//Second Method:
	public static void countofsting() {
		String input ="Logeshlkanna v";
		int count=0;
		
		while(true) {
			try {
				input.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println(count);
				break;
			}
		}
	}
}
