package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add("Logesh");
		al.add(23);
		al.add(55);
		System.out.println(al);
		al.add(3,"Kanna");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		al.set(0, "logesh");
		System.out.println(al);
		
	}

}
