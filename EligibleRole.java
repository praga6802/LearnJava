package classProblems;

import java.util.Scanner;

public class EligibleRole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your years of Experience: ");
		int exp = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your qualification: (UG/PG/DIPLOMA):");
		String qualification = sc.next().toUpperCase();

		if (qualification.equals("UG") && age >= 21 && exp >= 2) {
			System.out.println("Junior Developer");
		} else if (qualification.equals("PG") && age >= 23 && exp >= 3) {
			System.out.println("Senior Developer");
		} else if (qualification.equals("DIPLOMA") && age >= 20 && exp >= 1) {
			System.out.println("Internship");
		} else {
			System.out.println("You are not eligible for any role");
		}

		sc.close();
	}
}
