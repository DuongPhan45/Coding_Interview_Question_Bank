package interview_preparation_kit;

import java.util.ArrayList;
import java.util.List;

public class Encircular {
	public static List<String> doesCircleExist(List<String> commands) {
		// Write your code here
		List<String> result = new ArrayList<String>();
		for (String command : commands) {
			result.add(checkCircle(command));
		}
		return result;

	}

	public static String checkCircle(String command) {
		int x = 0; // the initial x coordinate of the robot
		int y = 0; // initial y coordinate
		int dir = 0; // initial direction of the robot is North (assume forward=0, right=1, backward=2, left=3)

		for (int i = 0; i < command.length(); i++) {

			char s = command.charAt(i);
			if (s == 'L')
				dir = (dir - 1 + 4) % 4;// turn the direction to left

			else if (s == 'R')
				dir = (dir + 1) % 4; // turn the direction to right

			else if (s == 'G') {// move forward based on direction
				if (dir == 0)
					y++; // move forward
				else if (dir == 1)
					x++;//move right
				else if (dir == 2)
					y--;//move backward
				else {
					x--;//move left
				}
			}
			// there is a circle if the robot return to coordinate 0,0 or when the direction
			// is not forward (it will return to initial point after several loops)
		}
		if (x == 0 && y == 0 || dir != 0)
			return "YES";
		return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> commands = new ArrayList<String>();
		commands.add("GGGGR");
		commands.add("L");
		List<String> result = doesCircleExist(commands);
		for (String s : result)
			System.out.println(s);
	}
}
