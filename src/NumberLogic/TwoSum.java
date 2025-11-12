package NumberLogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
	public static void main(String[] args) {
		int a[]= {0,9,7,2,55,13};
		int target=9;
		 int[] result=checkTwosum(a,target);
		 System.out.println(result[0]+" ,"+result[1]);
		 
		 List<int[]> result2 = checkAllTwoSum(a, target);
	        
	        if (result2.isEmpty()) {
	            System.out.println("No pairs found.");
	        } else {
	            System.out.println("Pairs whose sum = " + target + ":");
	            for (int[] pair : result2) {
	                System.out.println("(" + pair[0] + ", " + pair[1] + ")");
	            }
	        }
		
	}

	private static List<int[]> checkAllTwoSum(int[] a, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> resultList = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int complement = target - a[i];
            
            if (map.containsKey(complement)) {
                // Store the pair of values (not indices)
                resultList.add(new int[]{complement, a[i]});
            }
            
            // Store the current value and its index
            map.put(a[i], i);
        }
        return resultList;
    }
		
	

	private static int[] checkTwosum(int[] a, int target) {
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			int complement = target-a[i];
			if(map.containsKey(complement)) {
				int result[]= {map.get(complement),i};
				return result;
			}
			map.put(a[i], i);
		}
		return null;
	}

	
}
