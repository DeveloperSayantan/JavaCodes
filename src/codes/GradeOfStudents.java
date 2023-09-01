package codes;

import java.util.Scanner;

//find total and % and depending upon % grade of students.

public class GradeOfStudents {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your 1st Number out of 50: ");
		int sub1  = input.nextInt();
		System.out.print("Enter your 2nd Number out of 50: ");
		int sub2  = input.nextInt();
		System.out.print("Enter your 3rd Number out of 50: ");
		int sub3  = input.nextInt();
		
		int sum = sub1 + sub2 + sub3;
		int percentage = (sum/3)*2;
		
		if(percentage >= 90) {
			System.out.println("Your Grade is A, Your Percentage is "+percentage+"%");
		}
		else if(percentage >= 80) {
			System.out.println("Your Grade is B, Your Percentage is "+percentage+"%");
		}
		else if (percentage >=70){
			System.out.println("Your Grade is C, Your Percentage is "+percentage+"%");
		}
		else {
			System.out.println("Sorry! Your are fail, Your Percentage is "+percentage+"%");
		}

	}

}
