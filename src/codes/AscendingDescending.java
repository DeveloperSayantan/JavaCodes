package codes;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingDescending {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int [] number = new int[5];
		for(int i=0; i<number.length; i++) {
			number[i] = input.nextInt();
		}
		Arrays.sort(number);
		
		System.out.println("Ascending Order:");
		for(int n1: number) {
			System.out.print(n1+" ");
		}System.out.println();
		System.out.println("Descending Order:");
		for(int i=number.length-1; i>=0; i--) {
			System.out.print(number[i]+" ");
		}
		

	}

}
