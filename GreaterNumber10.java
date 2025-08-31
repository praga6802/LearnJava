package taskProblems;

import java.util.Scanner;

public class GreaterNumber10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		if(number >10) {
			System.out.println(number+" is greater than 10");
		}
		else if(number==10) {
			System.out.println(number+" is equal to 10");
		}
		else {
			System.out.println(number+" is not greater than 10");
		}
		sc.close();
	}
}