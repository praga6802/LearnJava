package classProblems;
import java.util.Scanner;
public class EmployeeBonus {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the years of experience: ");
		int exp=sc.nextInt();
		
		if(exp>5) {
			System.out.println("Enter the salary: ");
			double salary=sc.nextDouble();
			double bonus=0.0;
			if(salary<50000) {
				bonus= salary * 0.10;
				System.out.println("Bonus="+bonus);
				System.out.println("Salary="+(salary+bonus));
			}
			else if(salary>=50000) {
				bonus= salary * 0.05;
				System.out.println("Bonus="+bonus);
				System.out.println("Salary="+(salary+bonus));
			}
		}
		else {
			System.out.println("Not eligible for salary bonus..");
		}
		sc.close();
	}
}
