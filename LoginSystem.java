package classProblems;
import java.util.Scanner;

public class LoginSystem {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String correctUsername="Praga123";
		String correctPassword="1234";
		
		System.out.println("Enter the username: ");
		String inputUsername=sc.nextLine();
		System.out.println("Enter the password: ");
		String inputPassword=sc.nextLine();
		
		if(inputUsername.equals(correctUsername)) {
			if(inputPassword.equals(correctPassword)) {
				System.out.println("Login Successful!");
			}
			else {
				System.out.println("Incorrect Password!");
			}
		}
		else {
			System.out.println("User Not Found!");
		}
		sc.close();
	}

}
