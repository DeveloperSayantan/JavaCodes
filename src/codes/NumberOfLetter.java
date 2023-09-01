package codes;

import java.util.Scanner;

public class NumberOfLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.next();
		int count = 0;
		char [] c = name.toCharArray();
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
			if(c[i]=='a'|| c[i]=='A') {
			count++;	
			}

		}

		System.out.println();
		System.out.println("Total "+count+" number of 'a'/'A' letter in your name.");

	}

}
