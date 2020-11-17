package interview_preparation_kit;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubString {
	public static String maxSubstring(String s) {
		// Write your code here
		// initialize a max char
		char max = 'a';
		// Have an array to store all the index of max char
		List<Integer> ind = new ArrayList<Integer>();
		// Store the index of current max char element
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= max) {
				max = s.charAt(i);
				ind.add(i);
			}
		}
		
		String maxS = "";
		// Create max sub String from the index to the end and check if it is greater
		// than the current maxS
		for (int i = 0; i < ind.size(); i++) {
			String temp = s.substring(ind.get(i), s.length());
			if (temp.compareTo(maxS) > 0) {
				maxS = temp;
			}
		}

		return maxS;
	}

	public static void main(String[] args) {
System.out.println(maxSubstring("aaa"));
	}

}
