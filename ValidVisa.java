package mocktest;
import java.util.Scanner;
public class ValidVisa {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a age: ");
		int age=sc.nextInt();
		boolean isValidVisa=true;
		
		if(age>=18 && isValidVisa) {
			if(age >= 60) {
	             System.out.println("Can enter with special permission");
	         }
		}
		else {
			isValidVisa=false;
		}
		
		if(isValidVisa) {
			System.out.println("Can Enter a country");
		}
		else {
			System.out.println("Cannot enter a country");
		}
		
		
		
	sc.close();		
	}

}
