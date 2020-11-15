package interview_preparation_kit;

public class Counting_Valley {
//	An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, for every step it was noted if it was an uphill, , or a downhill,  step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms:
//
//		A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
//		A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
//		Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
//
//		Example
//
//		 
//
//		The hiker first enters a valley  units deep. Then they climb out and up onto a mountain  units high. Finally, the hiker returns to sea level and ends the hike.
//
//		Function Description
//
//		Complete the countingValleys function in the editor below.
//
//		countingValleys has the following parameter(s):
//
//		int steps: the number of steps on the hike
//		string path: a string describing the path
//		Returns
//
//		int: the number of valleys traversed
	public static int countingValleys(int steps, String path) {
		int valley = 0; // count #valleys
		int height = 0;// current height compared to sea level
		// the existence of a valley is marked when the hiker make a change from
		// negative to 0 of height
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'D')
				height--;
			else {
				if (height == -1)
					valley++;
				height++;
			}
		}
		return valley;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countingValleys(8, "DUDDDUUDUU"));
	}

}
