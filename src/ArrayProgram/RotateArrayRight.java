package ArrayProgram;

import java.util.Arrays;

public class RotateArrayRight {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
			int n=3;
			
			int left =0;
			int right = a.length-1;
			 a = Revese(a, 0, a.length - 1);
			 
			 System.out.println(Arrays.toString(a));

		        // Step 2: Reverse first n elements
		        a = Revese(a, 0, n - 1);
		        System.out.println(Arrays.toString(a));

		        // Step 3: Reverse remaining elements
		        a = Revese(a, n, a.length - 1);
		        System.out.println(Arrays.toString(a));
			


			
	}

	private static int[] Revese(int[] a, int left, int right) {
		
		int temp;
		while(left<right) {
			temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		
		return a;
	}

	

}
