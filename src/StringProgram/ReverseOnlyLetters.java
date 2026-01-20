package StringProgram;

public class ReverseOnlyLetters {
	public static void main(String[] args) {
		String input ="1abcd2";
		char[] inputarray =input.toCharArray();
		int left=0;
		int right = input.length()-1;
		char temp =0;
		while(left<right) {
			if(!Character.isLetter(inputarray[left])) {
				left++;
			}else if(!Character.isLetter(inputarray[right])) {
				right--;
			}else {
				temp=inputarray[left];
				inputarray[left]=	inputarray[right];
				inputarray[right]= temp;
				left++;
				right--;
			}
		}
		System.out.println(new String(inputarray));
	}

}
