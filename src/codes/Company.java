package codes;

import java.util.Scanner;


class Details {
	int id;
	String companyName;
	String designation;
	String employeeName;
}

public class Company {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Details d1 = new Details();
		System.out.print("Enter Id: ");
		d1.id = sc.nextInt();

		System.out.print("Enter Company Name: ");
		d1.companyName = sc.next();

		System.out.print("Enter Designation: ");
		d1.designation = sc.next();

		System.out.print("Enter Employee Name: ");
		d1.employeeName = sc.next();

		System.out.println("Id: " + d1.id);
		System.out.println("Company Name: " + d1.companyName);
		System.out.println("Designation: " + d1.designation);
		System.out.println("Employee Name: " + d1.employeeName);
		
		// *******************************************************
		
		Details d2 = new Details();
		System.out.print("Enter Id: ");
		d2.id = sc.nextInt();

		System.out.print("Enter Company Name: ");
		d2.companyName = sc.next();

		System.out.print("Enter Desiignation: ");
		d2.designation = sc.next();

		System.out.print("Enter Employee Name: ");
		d2.employeeName = sc.next();

		System.out.println("Id: " + d2.id);
		System.out.println("Company Name: " + d2.companyName);
		System.out.println("Designation: " + d2.designation);
		System.out.println("Employee Name: " + d2.employeeName);

		// **************************************************
		Details d3 = new Details();
		System.out.print("Enter Id: ");
		d3.id = sc.nextInt();

		System.out.print("Enter Company Name: ");
		d3.companyName = sc.next();

		System.out.print("Enter Desiignation: ");
		d3.designation = sc.next();

		System.out.print("Enter Employee Name: ");
		d3.employeeName = sc.next();

		System.out.println("Id: " + d3.id);
		System.out.println("Company Name: " + d3.companyName);
		System.out.println("Designation: " + d3.designation);
		System.out.println("Employee Name: " + d3.employeeName);
	}

}
