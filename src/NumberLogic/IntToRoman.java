package NumberLogic;

public class IntToRoman {
	public static void main(String[] args) {
		
		int Number =43;
		String[] symbol = {"X","V","I"};
		int[] value = {10,5,1};
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<value.length;i++) {
			while(Number>=value[i]) {
				Number = Number -value[i];
				sb.append(symbol[i]);
				
			}
		}
		System.out.println(sb.toString());
		
		
		
	}

}
