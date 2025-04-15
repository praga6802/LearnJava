package taskProblems;
import java.util.Scanner;

public class RechargeAmount {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the recharge amount: ");
		double rechargeAmount=sc.nextDouble();
		double bonusAmount=0.0;
		double balance=0.0;
		
		if(rechargeAmount>=50 && rechargeAmount<=99) {
			bonusAmount=5;
			balance=bonusAmount+rechargeAmount;
		}
		else if(rechargeAmount>=100 && rechargeAmount<=199) {
			bonusAmount=10;
			balance=bonusAmount+rechargeAmount;
			
		}
		else if(rechargeAmount>=200) {
			bonusAmount=25;
			balance=bonusAmount+rechargeAmount;
			
		}
		else if(rechargeAmount<50) {
			bonusAmount=0;
			balance=bonusAmount+rechargeAmount;
		}
		
		System.out.println("Original Recharged Amount: "+rechargeAmount);
		System.out.println("Bonus Amount: "+bonusAmount);
		System.out.println("Total Balance Amount: "+balance);
		sc.close();
	}
}
