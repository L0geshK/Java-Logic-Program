package StringProgram;

public class Charactersofthewords {
	public static void main(String[] args) {
		String input ="this is fun";
		String[] words=input.split(" ");
		String result="";
		for(String word:words) {
			char charactor[]=word.toCharArray();
			int left =0;
			int right = word.length()-1;
			while(left<right) {
				char temp = charactor[left];
				charactor[left]=charactor[right];
				charactor[right]=temp;
				left++;
				right--;
			}
			result=result+new String(charactor)+" ";
		}
		
		System.out.println(result);
		
	}

}
