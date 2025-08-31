package taskProblems;
import java.util.Scanner;

public class Greatest3Number {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2= sc.nextInt();
		System.out.println("Enter number 3: ");
		int num3= sc.nextInt();
		int greaterNum=0;
		if(num1> num2 && num1 > num3) {
			greaterNum=num1;
		}
		else if(num2>num3) {
			greaterNum=num2;
		}
		else {
			greaterNum=num3;
		}
		System.out.println("The Greatest Number is "+greaterNum);
		sc.close();
	}

}
