package ArrayProgram;

import java.util.HashSet;
import java.util.Set;

public class UniqueelementinArray {
	public static void main(String[] args) {
		withcollectionSet();
		withoutCollection();
		
		
	}

	public  static void withoutCollection() {
		
		int a[]= {10,20,20,30};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
				
			}
		}
		
		
	}

	public static void withcollectionSet() {
	 int a[]= {20,20,30,40};
	  Set<Integer> seenset = new HashSet<Integer>();
	  for(int no:a) {
		  if(!seenset.add(no)) {
			  seenset.remove(no);
		  }
	  }
	  System.out.println(seenset);
	 
	}

}
