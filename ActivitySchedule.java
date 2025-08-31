package taskProblems;

import java.util.Scanner;

public class ActivitySchedule {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		switch (number) {
		case 1:
			System.out.println("Attend Java class");
			break;
		case 2:
			System.out.println("Work on Mini Project");
			break;

		case 3:
			System.out.println("Complete Assignments");
			break;

		case 4:
			System.out.println("Team Discussion");
			break;

		case 5:
			System.out.println("Coding practice");
			break;

		case 6:
			System.out.println("Attend Webinar");
			break;

		case 7:
			System.out.println("Rest Day");
			break;

		default:
			System.out.println("Invalid Day Number");

			sc.close();
		}
	}

}
