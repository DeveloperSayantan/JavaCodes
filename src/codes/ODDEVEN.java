package codes;

import java.util.Scanner;

public class ODDEVEN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		while(true) {

		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("The number is Even.");
		}
		
		else{
			System.out.println("The number is Odd.");
		}
		System.out.println();
		System.out.println("Do you want to continue with other numbers! Y/N");
		String s1 = sc.next();
		if(s1.equals("n")) {
			System.out.println("Loop Ended!");
		break;
		}
		
		}

	}
}
