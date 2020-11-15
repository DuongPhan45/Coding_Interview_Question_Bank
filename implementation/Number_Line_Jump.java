package implementation;
// Easy

//You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
//
//The first kangaroo starts at location  and moves at a rate of  meters per jump.
//The second kangaroo starts at location  and moves at a rate of  meters per jump.
//You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.
//
//For example, kangaroo  starts at  with a jump distance  and kangaroo  starts at  with a jump distance of . After one jump, they are both at , (, ), so our answer is YES.
//
//Function Description
//
//Complete the function kangaroo in the editor below. It should return YES if they reach the same position at the same time, or NO if they don't.
//
//kangaroo has the following parameter(s):
//
//x1, v1: integers, starting position and jump distance for kangaroo 1
//x2, v2: integers, starting position and jump distance for kangaroo 2
//Time complexity O(1), Space complexity O(1)

public class Number_Line_Jump {

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {
		// Kangaroos wont meet if they start at different point and have same velocity
		if (x1 != x2 && v1 == v2)
			return "NO";
		// Check if there is a case where a kangoroo is always ahead of the another
		// (starts a a greater or same point and has higher velocity)
		if ((x1 - x2) * (v1 - v2) > 0)
			return "NO";
		else {// if the initial distance difference is a multiple of the velocity than the two
				// kangaroos will meet
			if ((x1 - x2) % (v1 - v2) == 0)
				return "YES";
			else {
				return "NO";
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(kangaroo(43, 2, 70, 2));
	}

}
