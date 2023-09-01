package codes;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		
		int n = input.nextInt();
		if(n>0) {
			System.out.println(n+" is a Positive number.");
		}
		else {
			System.out.println(n+" is a Negative number.");
		}

	}

}
