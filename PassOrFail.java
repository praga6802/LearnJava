package taskProblems;

import java.util.Scanner;

public class PassOrFail {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the student mark:");
		int mark=sc.nextInt();
		if(mark >=40) {
			System.out.println("Student passed the exam");
		}
		else {
			System.out.println("Student Failed");
		}
		sc.close();
	}
}
