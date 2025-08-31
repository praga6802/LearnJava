package classProblems;
import java.util.Scanner;

public class Smallest3Number {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2= sc.nextInt();
		System.out.println("Enter number 3: ");
		int num3= sc.nextInt();
		int smallerNum=0;
		if(num1< num2 && num1 < num3) {
			smallerNum=num1;
		}
		else if(num2<num3) {
			smallerNum=num2;
		}
		else {
			smallerNum=num3;
		}
		System.out.println("The Smallest Number is "+smallerNum);
		sc.close();
	}

}
