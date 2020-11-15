package implementation;

public class Divisible_Sum_Pairs {
//	You are given an array of  integers, , and a positive integer, . Find and print the number of  pairs where  and  +  is divisible by .
//	Function Description
//	Complete the divisibleSumPairs function in the editor below. It should return the integer count of pairs meeting the criteria.
//	divisibleSumPairs has the following parameter(s):
//	n: the integer length of array 
//	ar: an array of integers
//	k: the integer to divide the pair sum by

	// O(n^2)
//	static int divisibleSumPairs(int n, int k, int[] ar) {
//		if(k==0)throw new ArithmeticException();
//		int count = 0; // # of satisfactory pairs
//		for (int i = 0; i < ar.length - 1; i++) {
//			for (int j = i+1; j < ar.length; j++) {
//				int sum = ar[i] + ar[j];
//				if (sum % k == 0) {
//					count++;
//				}
//			}
//		}
//		return count;
//	}

	// O(n)
	// For every number in ar, find number mod k; the results are divided into
	// different buckets with the same value; for every new number, the number of
	// divisible pair it could make is equal to current number of numbers in the
	// complementary bucket
	static int divisibleSumPairs(int n, int k, int[] ar) {
		// create an array to store buckets of mod
		int[] buckets = new int[k];
		int count = 0;

		for (int i = 0; i < ar.length; i++) {
			int modNo = ar[i] % k;
			count += modNo == 0 ? buckets[0] : buckets[k - modNo]; // add number of corresponding complementary number,
																	// if
			// modNo==0 then the bucket number should be 0 (instead of
			// k)
			buckets[modNo]++; // add the new number to total number in bucket with the same mod value
		}
		return count;
	}


	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 6, 1, 2 };
		System.out.println(divisibleSumPairs(arr.length, 3, arr));

	}

}
