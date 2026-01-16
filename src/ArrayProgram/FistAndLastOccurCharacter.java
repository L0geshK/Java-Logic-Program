package ArrayProgram;

public class FistAndLastOccurCharacter {
	
	 public static void FistAndLastOccurusingfun(){
		 String input ="Kanna";
		 char ch='0';
		 int firstindex=input.indexOf(ch);
		 int lastindex = input.lastIndexOf(ch);
		 
		 if(firstindex<0 && firstindex==-1) {
				System.out.println("Element index not found");
			}else {
				System.out.println(firstindex);
			}
			
			System.out.println(lastindex);
		
	}
	
	public static void main(String[] args) {
		// to find the fist and last char of 'O'
		FistAndLastOccurusingfun();
		
		String input ="Logeshkanna";
		int firstindex=-1;
		int secondindex=-1;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)=='a') {
				firstindex=index;
				break;
			}
		}
		for(int index=input.length()-1;index>=0;index--) {
			if(input.charAt(index)=='a') {
				secondindex=index;
				break;
			}
		}
		if(firstindex<0 && firstindex==-1) {
			System.out.println("Element index not found");
		}else {
			System.out.println(firstindex);
		}
		
		System.out.println(secondindex);
		
	}

}
