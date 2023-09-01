package codes;

import java.util.Scanner;

public class TableOfANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Digit: ");
		int digit = input.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(digit+"*"+i+" = "+(i*digit));
		}

	}

}
