package taskProblems;
import java.util.Scanner;

public class CalculateBusFare {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if(age<5) {
			System.out.println("Free Ride");
		}
		else if(age>=5 && age<=18) {
			System.out.println("Child Fare: ₹10");
		}
		else if(age>18 && age<=60) {
			System.out.println("Adult Fare: ₹20");
		}
		else{
			System.out.println("Senior Citizen Fare: ₹15");
		}
		sc.close();
	}

}
