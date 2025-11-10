package ArrayProgram;

public class MissingNumberInArray {
	public static void main(String[] args) {
		
		findMissingNumberInArray1();
		findMissingNumberInArray2();
		
		
	}

	 private static void findMissingNumberInArray1() {
	        int[] number = {1, 2, 4, 5, 6};

	        // Total numbers expected (since one is missing)
	        int totalCount = number.length + 1;

	        // Formula for sum of first n natural numbers
	        int expectedSum = (totalCount * (totalCount + 1)) / 2;
	        System.out.println("Expected Sum: " + expectedSum);

	        // Actual sum of array elements
	        int actualSum = 0;
	        for (int i = 0; i < number.length; i++) {
	            actualSum += number[i];
	        }
	        System.out.println("Actual Sum: " + actualSum);

	        // Difference gives missing number
	        int missingNumber = expectedSum - actualSum;
	        System.out.println("Missing Number is: " + missingNumber);
	    }
	 
	 public static void findMissingNumberInArray2() {
		 int[] number = {1, 2, 4, 5, 6};
		 int missingnumber=0;
		 for(int no :number) {
			 missingnumber=missingnumber^no;
		 }
		 for(int i=0;i<=number.length+1;i++) {
			 missingnumber=missingnumber^i;
		 }
		 System.out.println(missingnumber);
	 }
}
