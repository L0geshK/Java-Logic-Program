package ArrayProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int num1[]= {1,2,3,2};
		int num2[]= {4,5,6,2,3};
		Set<Integer>set1 = new HashSet<Integer>();
		Set<Integer>result = new HashSet<Integer>();
		for(int no : num1) {
			set1.add(no);
		}
		System.out.println(set1);
		
		for(int no2 : num2) {
			if(set1.contains(no2)) {
				result.add(no2);
			}
		}
	  int array[] = new int[result.size()];
	  int index=0;
	  for(int val: result) {
		  array[index] = val;
		  index++;
		  
	  }
	  System.out.println(Arrays.toString(array));
	  Integer[] arr = result.toArray(new Integer[0]);
	  System.out.println(Arrays.toString(arr));
	  
//	  Set<String> set = new HashSet<>();
//	  set.add("Java");
//	  set.add("Python");
//	  set.add("C++");
//
////	  String[] array1 = set.toArray(new String[0]);
////	  System.out.println(Arrays.toString(array1));
	}

}
