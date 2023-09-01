package codes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st Number: ");
		int n1 = input.nextInt();
		
		System.out.print("Enter the Operator(eg. + - * / %): ");
		String operator = input.next();
		
		System.out.print("Enter the 2nd Number: ");
		int n2 = input.nextInt();
		int result = 0;
		switch(operator) {
		case "+":
			result = n1 + n2;
			System.out.println("Sum of "+n1+"+"+n2+" is = "+result);
			break;
		case "-":
			result = n1 - n2;
			System.out.println("Substraction of "+n1+"-"+n2+" is = "+result);
			break;
		case "*":
			result = n1 * n2;
			System.out.println("Multiplecation of "+n1+"*"+n2+" is = "+result);
			break;
		case "/":
			if(n2!=0) {
			result = n1 / n2;
			System.out.println("Division of "+n1+"/"+n2+" is = "+result);
			}
			else {
				System.out.println("Division of "+n1+"/"+n2+" is = ∞");
			}
			break;
		case "%":
			result = n1 % n2;
			System.out.println("Modulation of "+n1+"%"+n2+" is = "+result);
			break;
		
		default:
			System.out.println("Please enter a valid Operator!");
			break;
		}
		

	}

}
