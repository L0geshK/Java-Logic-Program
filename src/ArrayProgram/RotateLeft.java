package ArrayProgram;

import java.util.Arrays;

public class RotateLeft {
	public static void main(String[] args) {
		int a[]= {10,30,20,40,50};
		int k=2;
		k = k%a.length;
		a =reverse(a,0,k-1);// reverse first k eleemtn 
		System.out.println(Arrays.toString(a));
		
		a =reverse(a,k,a.length-1);//reverse the remaning element;
		System.out.println(Arrays.toString(a));
		a =reverse(a,0,a.length-1);//reverse the whole arrayu;
		System.out.println(Arrays.toString(a));
	}
	

	private static int[] reverse(int[] a, int i, int j) {
		int temp;
		while(i<j) {
			temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return a;
	}

}
