package StringProgram;

public class FindLongestandShortestinString {
	public static void main(String[] args) {
		
		String input ="monkey d luffy";
		String[] words = input.split(" ");
		String shortestword =words[0];
		String longestword = words[0];
		for(String word:words) {
			System.out.println(word);
			if(word.length() <shortestword.length()) {
				shortestword=word;
			}
			if(word.length() >longestword.length()) {
				longestword=word;
			}
			
		}
		System.out.println("Longest word from the input String: "+longestword);
		System.out.println("Shortest word from the input String: "+shortestword);
	}

}
