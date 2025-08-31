package classProblems;
import java.util.Scanner;
public class Largest2Number {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int number1= sc.nextInt();
		System.out.println("Enter the number 2: ");
		int number2= sc.nextInt();	
		
		if(number1 == number2) {
			System.out.println(number1+" and "+number2+" are equal");
		}
		else {
			if(number1 >number2) {
				System.out.println(number1+" is greater");
			}
			else{
				System.out.println(number2+" is greater");
			}
		}
		sc.close();
	}
}
