package interview_preparation_kit;

import java.util.List;

public class BillDivision {
//	Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.
//
//	For example, assume the bill has the following prices: . Anna declines to eat item  which costs . If Brian calculates the bill correctly, Anna will pay . If he includes the cost of , he will calculate . In the second case, he should refund  to Anna.
//
//	Function Description
//
//	Complete the bonAppetit function in the editor below. It should print Bon Appetit if the bill is fairly split. Otherwise, it should print the integer amount of money that Brian owes Anna.
//
//	bonAppetit has the following parameter(s):
//
//	bill: an array of integers representing the cost of each item ordered
//	k: an integer representing the zero-based index of the item Anna doesn't eat
//	b: the amount of money that Anna contributed to the bill
	
	static void bonAppetit(List<Integer> bill, int k, int b) {

		int change = 0;
		for (int i = 0; i < bill.size(); i++) {
			change += bill.get(i);
		}
		change -= bill.get(k);
		change /=2;
		if (change == b)
			System.out.println("Bon Appetit");
		else {
			System.out.println(b-change);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
