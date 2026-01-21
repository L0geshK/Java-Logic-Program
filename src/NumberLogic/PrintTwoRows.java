package NumberLogic;

public class PrintTwoRows {
	public static void main(String[] args) {
		for (int row = 1; row <= 2; row++) {
			for (int num = 1; num <= 4; num++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
