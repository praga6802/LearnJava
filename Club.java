package classProblems;
import java.util.Scanner;
public class Club {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Can enter into club..");
			if(age>=21) {
				System.out.println("You can also take drink");
			}
			else {
				System.out.println("You cannot able to drink");
			}
		}
		else {
			System.out.println("Cannot enter into the club");
		}
		sc.close();
	}
}
