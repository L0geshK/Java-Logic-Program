package StringProgram;

public class EYInterviewQuestions {
	public static void main(String[] args) {
		
		firstquestioninString();
		secondquestion();
		

	}

	public static void secondquestion() {
		
		
	}

	private static void firstquestioninString() {

		String input = "L@gesh14 k@a##a08"; // output=lgesh kaa 13

		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c) || c == ' ') {
				sb.append(c);
			} else if (Character.isDigit(c)) {
				sum = sum + Character.getNumericValue(c);

			}
		}
		System.out.println(sb + "-" + sum);

	}
}
