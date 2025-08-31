package taskProblems;
import java.util.Scanner;

public class OddEvenDivisible {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		if(number % 2!=0) {
			if(number %3==0) {
				System.out.println("Yes, the "+number+" is divisible by 3");
			}
			else {
				System.out.println("No, the "+number+" is not divisible by 3");
			}
		}
		else{
			if(number % 8 == 0) {
				System.out.println("Yes, the "+number+" is divisible by 8");
			}
			else {
				System.out.println("No, the "+number+" is not divisible by 8");
			}
		}
		sc.close();
	}
}
