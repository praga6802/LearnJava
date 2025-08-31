package mocktest;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email address: ");
		String email = sc.nextLine();
		
		String emailregex="^[a-z0-9.]+@[a-z]+\\.[a-z]{2,6}$";
		
		if(email.contains("@")) {
			if(email.matches(emailregex)) {
				System.out.println("Email match found");
			}
			else {
				System.out.println("Not match found");
			}
		}
		else {
			System.out.println("Email must contain @ symbol");
		}
		sc.close();
	}
}
