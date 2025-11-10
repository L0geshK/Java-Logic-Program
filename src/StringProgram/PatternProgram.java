package StringProgram;

public class PatternProgram {
	public static void main(String[] args) {
		pattern1();
		pattern();
		hallowPattern();
	}

	
	
	public static void pattern() {
		int num=6;
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println("");
		}
	}
	public static void pattern1() {
		int num=6;
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print((char) ('a'+col-1));
			}
			System.out.println("");
		}
	}
	public static void hallowPattern() {
		int num=6;
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=row;col++) {
				if(col==1 || col==row||row==num) {
					System.out.print((char) ('a'+col-1));
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
}
