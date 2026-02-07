package Collections;

import java.util.HashMap;
import java.util.Map;

public class EPAMInterviewQuestion {
	public static void main(String[] args) {
		String []s = {"Logesh:80","kanna:50","Logesh:70","kanna:90","lk:90"};
		//we need print the name and average mark of the name
		
		Map<String,Integer>totalmark =new HashMap<String, Integer>();
		Map<String,Integer>count =new HashMap<String, Integer>();
		for(String parts1:s) {
			String[] part = parts1.split(":");
			String name = part[0];
			int mark = Integer.parseInt(part[1]);
			totalmark.put(name, totalmark.getOrDefault(name, 0)+mark);
			count.put(name, count.getOrDefault(name, 0)+1);
		}
		for(String name:totalmark.keySet()) {
			double avg = (double)totalmark.get(name)/count.get(name);
			System.out.println(name+":"+avg);
			
		}
	}

}
