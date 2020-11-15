package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:
//
//	The elements of the first array are all factors of the integer being considered
//	The integer being considered is a factor of all elements of the second array
//	These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.
//
//	Function Description
//
//	Complete the getTotalX function in the editor below. It should return the number of integers that are betwen the sets.
//
//	getTotalX has the following parameter(s):
//
//	a: an array of integers
//	b: an array of integers

public class Between_Two_Sets {

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Find max and min values of each array
		Integer maxa = Collections.max(a);
		Integer mina = Collections.min(a);
		Integer minb = Collections.min(b);

		int count = 0;// Number of integers that satisfy both conditions

// 1st condition
		List<Integer> cd = new ArrayList<Integer>(); // list of all common divisor
		// Find the least common divisor of array 1
		Integer lcd = maxa;
		int multiple = 2;
		while (lcd % mina != 0)
			lcd *= mina;
		// check if all element in array a is factor of lcd
		int candidate = lcd;
		while (candidate <= minb) {
			boolean allFactor = true;
			for (Integer i : a) {
				if (candidate % i != 0)
					allFactor = false;
			}
			if (allFactor == true)
				cd.add(candidate);
System.out.println(candidate);
			candidate= lcd *multiple;
			multiple++;
		}
		

//2nd condition
		// for every element in ar2, compare to lcd, if cannot devide for lcd and lcdis
		// smaller than min then increase ldc
		for (int cand : cd) {
			boolean allDivisor = true;
			for (Integer i : b) {
				if (i % cand != 0) {
					allDivisor = false;
					break;
				}
			}
			if (allDivisor == true)
				count++; // if the current lcd is factor of all array b
		}
		return count;
	}

	public static void main(String[] args) {
		Integer[] arra = { 3, 4 };
		Integer[] arrb = { 24,48};
		List<Integer> a = Arrays.asList(arra);
		List<Integer> b = Arrays.asList(arrb);
		System.out.println(getTotalX(a, b));

	}

}
