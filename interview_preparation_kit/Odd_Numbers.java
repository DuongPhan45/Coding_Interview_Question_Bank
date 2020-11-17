package interview_preparation_kit;

import java.util.ArrayList;
import java.util.List;

public class Odd_Numbers {
	public static List<Integer> oddNumbers(int l, int r) {
		// Write your code here
		List<Integer> li = new ArrayList();
		if (l % 2 == 1) {
			for (int i = l; i <= r; i += 2) {
				li.add((Integer) i);
			}
		} else {
			for (int i = l + 1; i <= r; i += 2) {
				li.add((Integer) i);
			}
		}
		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
