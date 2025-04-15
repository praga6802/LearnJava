package taskProblems;
import java.util.Scanner;
public class LoyaltyCardPayment {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double amount=sc.nextDouble();
		System.out.println("You have loyalty card or not?");
		String isLoyaltyCard=sc.next();
		double discount=0.0;
		
		if(amount>5000) {
			if(isLoyaltyCard.equals("Yes")||isLoyaltyCard.equals("yes")) {
				discount=amount*0.2;
				amount=amount-discount;
			}
			else {
				discount=amount*0.1;
				amount=amount-discount;
			}
		}
		else if(amount<=5000 && amount>=2000) {
			if(isLoyaltyCard.equals("Yes")||isLoyaltyCard.equals("yes")) {
				discount=amount*0.1;
				amount=amount-discount;
			}
			else {
				discount=amount*0.05;
				amount=amount-discount;
			}
		}
		else if(amount<2000) {
			System.out.println("No discount is applied regardless of loyalty status");
		}
		System.out.println("Total Amount: "+amount);
		sc.close();
	}
}
