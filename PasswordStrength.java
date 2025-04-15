package taskProblems;
import java.util.Scanner;
public class PasswordStrength {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the password: ");
		String password=sc.nextLine();
		int passLength=password.length();
		int charCount=0;
		
		boolean hasUpper=password.matches(".*[A-Z].*");
		boolean hasLower=password.matches(".*[a-z].*");
		boolean hasDigit=password.matches(".*[0-9].*");
		boolean hasSpecial=password.matches(".*[^a-z A-Z 0-9].*");
		
		if(hasUpper) charCount+=1;
		if(hasLower) charCount+=1;
		if(hasDigit) charCount+=1;
		if(hasSpecial) charCount+=1;
		
		
		if(passLength>=12 && charCount==4) System.out.println("Very Strong");
		else if(passLength>=10 && charCount==3)System.out.println("Strong");
		else if(passLength>=8 && charCount==2) System.out.println("Moderate");
		else System.out.println("Weak");
		
		sc.close();
	}
}
