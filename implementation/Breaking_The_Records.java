package implementation;

import java.util.HashMap;

public class Breaking_The_Records {
//	Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.
//
//	For example, assume her scores for the season are represented in the array . Scores are in the same order as the games played. She would tabulate her results as follows:
//
//	                                 Count
//	Game  Score  Minimum  Maximum   Min Max
//	 0      12     12       12       0   0
//	 1      24     12       24       0   1
//	 2      10     10       24       1   1
//	 3      24     10       24       1   1
//	Given the scores for a season, find and print the number of times Maria breaks her records for most and least points scored during the season.

	static int[] breakingRecords(int[] scores) {
		int max = scores[0];
		int min = scores[0];
		int countmax = 0; // #times break highest record
		int countmin = 0; // #times break lowest record
		for (int i : scores) {
			if (i < min) {// break lowest record
				min = i;
				countmin++;
				System.out.println("min " + i);
			} else if (i > max) {// break highest record
				max = i;
				countmax++;
			}
		}
		int[] result = new int[2];
		result[0] = countmax;
		result[1] = countmin;
		System.out.println(countmax + " " + countmin);
		return result;

	}

	public static void main(String args[]) {
		int[] scores = { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
		breakingRecords(scores);

	}
}
