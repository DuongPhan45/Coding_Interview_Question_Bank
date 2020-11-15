package string;

public class CamelCase {
//	Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:
//
//		It is a concatenation of one or more words consisting of English letters.
//		All letters in the first word are lowercase.
//		For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
//		Given , print the number of words in  on a new line.
//
//		For example, . There are  words in the string.
//
//		Function Description
//
//		Complete the camelcase function in the editor below. It must return the integer number of words in the input string.
//
//		camelcase has the following parameter(s):
//
//		s: the string to analyze
//		Input Format
//
//		A single line containing string .

	static int camelcase(String s) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				count++;
		}
		return count;

	}

	//Other suggestion 
//	String arr[]= s.split("[A-Z]"); 
//	System.out.println(arr.length);
	
	public static void main(String[] args) {
		System.out.println(camelcase("saveChangesInTheEditor"));
	}

}
