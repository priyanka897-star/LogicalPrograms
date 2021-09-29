package logicalprograms;

import java.util.Scanner;

public class FindPerfectNumber {

	// function that checks if the given number is perfect or not
	public static int isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				// calculates the sum of factors
				sum = sum + i;
			}
		}

		return sum;
	}
   public static void main(String args[]) {
		int number, s;
		Scanner scanner  = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = scanner.nextInt();
		// calling the function
		s = isPerfect(number);
		if (s == number)  {
			System.out.println(number +" "+ "is Perfect Number");
		} else {
			System.out.println(number +" " + "is not a Perfect Number");
		}
	}
}
