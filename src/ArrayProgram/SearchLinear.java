package ArrayProgram;

public class SearchLinear {
	public static void main(String[] args) {
		
		LinearSearch();
		LinearSearch2();
	}

	private static void LinearSearch() {
		int[]a= {10,20,30,40,50};
		
		int key =30;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==key) {
				System.out.println("Element found:"+i);
			}
		}
		
		
	}
	private static void LinearSearch2() {
		int[]a= {10,20,30,40,50};
		
		int key =30;
		boolean isnumberpresent = false;
		for(int number:a) {
			if(number ==key) {
				isnumberpresent=true;
				System.out.println("Element  found");
				break;
			}else {
				System.out.println("Element not found");
			}
		
		}
		
		
	}

}
