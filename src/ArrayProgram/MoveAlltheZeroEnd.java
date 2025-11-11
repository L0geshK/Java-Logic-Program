package ArrayProgram;

public class MoveAlltheZeroEnd {
	public static void main(String[] args) {
		moveAllTheZeroAtTheEnd();
	}

	private static void moveAllTheZeroAtTheEnd() {
		int a[]= {10,0,3,0,0,9};
		int putnonzervale=0;
		int temp;
		for(int number:a) {
			System.out.print(number+" ");
		}
		System.out.println("");
		for(int current=0;current<a.length;current++) {
			if(a[current]!=0) {
				temp=a[putnonzervale];
				a[putnonzervale]=a[current];
				a[current]=temp;
				putnonzervale++;
			}
		}
		for(int number:a) {
			System.out.print(number+" ");
		}
		
	}
	
	

}
