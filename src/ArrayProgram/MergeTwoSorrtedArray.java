package ArrayProgram;

import java.util.Arrays;

public class MergeTwoSorrtedArray {
	public static void main(String[] args) {
		int a1[]= {1,2,4};
		int a2[]= {3,5};
		int a3[]= new int [a1.length+a2.length];
		int p1=0,p2=0,p3=0;
		while(p1<a1.length && p2<a2.length) {
			if(a1[p1]<a2[p2]) {
				a3[p3]=a1[p1];
				p1++;
				p3++;
			}else {
				a3[p3]=a2[p2];
				p2++;
				p3++;
			}
			
		}
		while(p1<a1.length) {
			a3[p3]=a1[p1];
			p3++;
			p1++;
			
		}
		while(p2<a2.length) {
			a3[p3]=a2[p2];
			p2++;
			p3++;
			
		}
		System.out.println(Arrays.toString(a3));
		
		
		
	}

}
