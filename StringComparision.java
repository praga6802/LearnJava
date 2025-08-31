package mocktest;

import java.util.Scanner;

public class StringComparision {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String 1: ");
		String s1= sc.nextLine();
		System.out.println("Enter the String 2: ");
		String s2= sc.nextLine();
		
		if(s1.equals(s2)) {
			System.out.println("The Strings are equal");
		}
		else {
			System.out.println("The Strings are not equal");
		}
		sc.close();
	}
}
