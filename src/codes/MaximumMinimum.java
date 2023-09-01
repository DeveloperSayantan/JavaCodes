package codes;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumMinimum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] numbers = new int [5];
		System.out.println("Enter 5 numbers: ");
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		//Using Sort function.
		Arrays.sort(numbers);
		int Max = numbers[0], Min = numbers[4];
		
		//Using Loop.
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>Max) {
				Max = numbers[i];
			}
			
			if(numbers[i]<Min) {
				Min = numbers[i];
			}
		}

		System.out.println("Maximum is: "+Max);
		System.out.println("Minimum is: "+Min);

	}

}
