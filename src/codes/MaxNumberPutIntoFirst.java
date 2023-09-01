package codes;

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class MaxNumberPutIntoFirst {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int [] number = new int[5];
		for(int i=0; i<number.length; i++) {
			number[i] = input.nextInt();
		}
		//int max = number[0];
		int max = 0;
		for(int i=1; i<number.length; i++) {
			if(number[i]>number[0]) {
				
				if(number[i]>number[max]) {
					max = i;
				}
			}
		}
		int temp = number[0];
		number[0] = number[max];
		number[max] = temp;
		
		System.out.println("After Swap Max number with the Zero position:");
		for(int n: number) {
			System.out.print(n+" ");
		}

	}

}
