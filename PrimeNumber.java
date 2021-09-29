package logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static int checkPrime(int number) {
		int i, m = 0, flag = 0;
		m = number / 2;
		if (number == 0 || number == 1) {
			System.out.println(number + " is not Prime Number");
		} 
		else {
		    for (i = 2; i <= m; i++) {
			       if (number % i == 0) {
					System.out.println(number + " is not Prime Number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(number + " is Prime Number");
			} // end of else
		}
		return flag;

	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int primeNumber = checkPrime(number);
		System.out.println((primeNumber));

	}

}
