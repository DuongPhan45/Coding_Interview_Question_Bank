package implementation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sub_array_Division {
//	Given a chocolate bar, two children, Lily and Ron, are determining how to share it. Each of the squares has an integer on it.
//
//	Lily decides to share a contiguous segment of the bar selected such that:
//
//	The length of the segment matches Ron's birth month, and,
//	The sum of the integers on the squares is equal to his birth day.
//	You must determine how many ways she can divide the chocolate.
//
//	Consider the chocolate bar as an array of squares, . She wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . In this case, there are two segments meeting her criteria:  and .

	static int birthday(List<Integer> s, int d, int m) {

		int sum = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }

        // assumption m > 0
        for (int i = 0; i < s.size() - m+1; i++) {
            if (sum == d) {

                count++;
            }
          if(i+m<s.size())  sum = sum - s.get(i) + s.get(i + m );
//            System.out.println(sum);

        }
//        System.out.println(count);
        return count;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1, 2, 1, 3, 2 };
		List<Integer> a = Arrays.asList(arr);
		birthday(a, 3, 2);
	}

}
