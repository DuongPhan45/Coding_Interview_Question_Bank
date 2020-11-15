package string;

public class StrongPassword {
//	Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:
//
//		Its length is at least .
//		It contains at least one digit.
//		It contains at least one lowercase English character.
//		It contains at least one uppercase English character.
//		It contains at least one special character. The special characters are: !@#$%^&*()-+
//		She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

	static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		int count = 0; // count the number of digits to add
		int MIN_LENGTH = 6;
		boolean upperCase = false;
		boolean lowerCase = false;
		boolean digit = false;
		boolean specialChar = false;
		for (int i = 0; i < n; i++) {
			if (Character.isUpperCase(password.charAt(i)))
				upperCase = true;
			else if (Character.isLowerCase(password.charAt(i)))
				lowerCase = true;
			else if (Character.isDigit(password.charAt(i)))
				digit = true;
			else {
				specialChar = true;
			}
		}
		count = upperCase ? count : count + 1;
		count = lowerCase ? count : count + 1;
		count = digit ? count : count + 1;
		count = specialChar ? count : count + 1;
		// if # char type needed < # char to add to reach min length -> count =
		// minlength - n
		count = count < MIN_LENGTH - n ? MIN_LENGTH - n : count;
		return count;
	}

	public static void main(String[] args) {
		System.out.println(minimumNumber(11, "#HackerRank"));
	}

}
