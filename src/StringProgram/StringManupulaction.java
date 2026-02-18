package StringProgram;

public class StringManupulaction {
    public static void main(String[] args) {
    	
    	
    	

    	//we need to add "-" after the same number repert twise
        String input = "8995277";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++) {

            int current = Character.getNumericValue(input.charAt(i));
            int next = Character.getNumericValue(input.charAt(i + 1));

            result.append(current);

            // condition: both odd and same
            if (current % 2 != 0 && next % 2 != 0 && current == next) {
                result.append("-");
            }
        }

        // append last digit
        result.append(input.charAt(input.length() - 1));

        System.out.println(result);
    }
}
