package codes;

import java.util.Scanner;

public class CircleRadious {

	static float pi = 3.14f;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radious: ");
		double r = sc.nextDouble();

		// Calculate the area of the Circle.
		double area = pi * (r * r);

		// Calculate the circumference of the Circle.
		double circumference = 2 * pi * r;

		System.out.println("Circle area is: " + area);
		System.out.println("Circle circumference is: " + circumference);

	}

}
