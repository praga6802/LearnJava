package taskProblems;

import java.util.Scanner;

public class PANValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your PAN number: ");
		String panNumber = sc.nextLine();
		if(panNumber.length()==10) {
			if (panNumber.matches("[A-Z]{5}\\d{4}[A-Z]{1}")) {
				System.out.println("Valid PAN Number");
			} 
			else {
				System.out.println("Invalid PAN Number");
			}
		}
		else {
			System.out.println("Invalid PAN number length");	
		}
		sc.close();
}
}
