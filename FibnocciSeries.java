package logicalprograms;

import java.util.Scanner;

public class FibnocciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number  ");
		int number = scanner.nextInt();
		int number1 = 0;
		int number2 = 1;
        System.out.print(number1 + " " + number2);// printing 0 and 1
		for (int i = 2; i <= number; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			int number3 = number1 + number2;
			System.out.println(" " + number3);
			number1 = number2;
			number2 = number3;
		}
	}
}