package classProblems;

import java.util.Scanner;

public class EligibleRole2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your skill: ");
		String skill = sc.next().toLowerCase();

		switch (skill) {
		case "java":
			System.out.println("Back End Developer");
			break;
		case "python":
			System.out.println("Back End Developer");
			break;
		case "html":
			System.out.println("Back End Developer");
			break;
		default:
			System.out.println("You are not eligible for any role");
		}
		sc.close();
	}
}
