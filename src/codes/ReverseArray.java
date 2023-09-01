package codes;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] number = new int[5];
		System.out.println("Enter the 5 numbers: ");
		for(int i=0; i<number.length; i++) {
			number[i] = input.nextInt();
		}
		System.out.println("Reverse of the Array is: ");
		for(int i = number.length-1; i>=0; i--) {
			System.out.println(number[i]);
		}

	}

}
