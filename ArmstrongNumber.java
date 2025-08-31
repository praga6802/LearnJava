package taskProblems;
import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a 3 digit number: ");
	int number=sc.nextInt();
	
	int digit1=number/100;
	int digit2=(number/10)%10;
	int digit3=number%10;
	
	int sumOfNumber=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
	
	if(sumOfNumber==number) {
		System.out.println(number +" is an armstrong number");
	}
	else {
		System.out.println(number+" is not armstrong number");
	}
	sc.close();
}
}
