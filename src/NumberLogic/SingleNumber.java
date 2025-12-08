package NumberLogic;

public class SingleNumber {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,1,2,3};
		int result =singlenumberfromarray(a);
		System.out.println(result);
	}

	private static int singlenumberfromarray(int[] a) {
		int result =0;
		for(int num :a) {
			result = result ^ num;
		}
		return result;
		
		
	}

	
}
