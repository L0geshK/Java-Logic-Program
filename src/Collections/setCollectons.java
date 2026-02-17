package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setCollectons {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("logesh");
		hs.add("Kanna");
		hs.add("lllalala");
		
		System.out.println(hs);
		
		Iterator<String>inters=hs.iterator();
		while(inters.hasNext()) {
			System.out.println(inters.next());
		}
		
		Set<String> list = new HashSet<String>();
	
		list.addAll(Arrays.asList("logesh","kannna","jdjdjjjd"));
		
		Set<Integer> ints = new HashSet<Integer>();
		ints.addAll(Arrays.asList(1,2,4));
		
		
	}

}
