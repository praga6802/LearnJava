package taskProblems;
import java.util.Scanner;
public class DivisibleBy3And5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		if(num % 11==0 && num % 5==0) {
			System.out.println(num+" is divisible both by 11 and 5");
		}
		else {
			System.out.println(num+" is not divisible both by 11 and 5");
		}
		sc.close();
	}
}
