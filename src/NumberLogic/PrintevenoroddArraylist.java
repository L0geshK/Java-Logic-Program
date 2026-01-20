package NumberLogic;

import java.util.ArrayList;

public class PrintevenoroddArraylist {
	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add("java");
		al.add(23);
		al.add(22);
		al.add(4);
		al.add(null);
		
		for(Object obj : al) {
			if(obj instanceof Integer) {
			   Integer i = (Integer)obj;
			   int val = i.intValue();
			   if(val%2==0) {
				   System.out.println("number is even :"+val);
			   }else {
				   System.out.println("number is odd :"+val);
			   }
			}
		}
		
	}

}
