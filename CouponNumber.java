package logicalprograms;

import java.util.Scanner;

public class CouponNumber {
	// return a random coupon between 0 and n-1
	public static int coupon(int n) {
		return (int) (Math.random() * n);
	}

	public static void main(String[] args) {
		System.out.println("Enter a card Number to Draw: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean[] collect = new boolean[number];// collect[i] = true if card type i already collected
		int count = 0;
		int notSame = 0;
		// for number of cards you collect before obtaining one of each of the n types
		while (notSame < number) {
			int card = coupon(number);
			count++;
			if (!collect[card]) {
				notSame++;
				collect[card] = true;
			}
		}
		System.out.println("Total Random Numbers needed: " + count);

	}

}
