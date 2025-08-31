package classProblems;
import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number= sc.nextInt();
		
		if(number >0) {
			System.out.println(number+" is positive number");
		}
		else if(number<0) {
			System.out.println(number+" is negative number");
		}
		else if(number==0) {
			System.out.println("Zero");
		}
		sc.close();
	}
}
