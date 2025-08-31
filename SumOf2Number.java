package taskProblems;

import java.util.Scanner;
public class SumOf2Number {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter the number 2: ");
		int num2=sc.nextInt();
		System.out.println("Enter the number 3: ");
		int num3=sc.nextInt();
		int total=num1+num2;
		if(total==num3) {
			System.out.println("Yes, they are equal");
		}
		else {
			System.out.println("No, they are not equal");
		}
		sc.close();
	}
}
