package ArrayProgram;

public class SumOfArray {
	public static void main(String[] args) {
		sumofArray1();
		sumofArray2();

}

	private static void sumofArray2() {
		int number[]= {2,4,6,8};
		int somOfArray=0;
		for(int no:number) {
			
			somOfArray=somOfArray+no;
	}
		System.out.println("Sum Of array:"+somOfArray);
	}

	private static void sumofArray1() {
		// TODO Auto-generated method stub
		int number[]= {2,4,6,8};
		int somOfArray=0;
		for(int i=0;i<number.length;i++) {
			somOfArray=somOfArray+number[i];
			
		}
		System.out.println("Sum Of array:"+somOfArray);
	}
		
	}
