package interview_preparation_kit;

import java.util.HashMap;

public class Sales_By_Match {
//	Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//
//	For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
//
//	Function Description
//
//	Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
//
//	sockMerchant has the following parameter(s):
//
//	n: the number of socks in the pile
//	ar: the colors of each sock

	static int sockMerchant(int n, int[] ar) {
		int count = 0;// #pairs of socks
		HashMap<Integer, Integer> sockSet = new HashMap();// create a hashmap to store socks and their numbers
// Time O(n), Space O(n)
		for (int i : ar) {
			if (!sockSet.containsKey((Integer) i))
				sockSet.put((Integer) i, 1);// if a sock is in the set, increase its number
			else {
				sockSet.put((Integer) i, sockSet.get((Integer) i) + 1);// else initiate its number to 1
			}
		}
		for (int j : sockSet.values())
			count += (int) (j / 2); // find #pair for each type of sock

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println(sockMerchant(9, ar));

	}

}
