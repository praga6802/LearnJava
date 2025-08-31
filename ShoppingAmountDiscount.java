package taskProblems;

import java.util.Scanner;

public class ShoppingAmountDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Shopping Amount: ");
		double shoppingAmount = sc.nextDouble();
		double discount = 0.0;
		if (shoppingAmount > 5000) {
			discount = shoppingAmount * 0.2; // 1000.2
			shoppingAmount = shoppingAmount - discount; //
			// System.out.println("Final Price: "+shoppingAmount);
		} else if (shoppingAmount >= 3000 && shoppingAmount <= 5000) {
			discount = shoppingAmount * 0.1;
			shoppingAmount = shoppingAmount - discount;
			// System.out.println("Final Price: "+shoppingAmount);
		} else if (shoppingAmount >= 1000 && shoppingAmount < 3000) {
			discount = shoppingAmount * 0.05;
			shoppingAmount = shoppingAmount - discount;
			// System.out.println("Final Price: "+shoppingAmount);
		} else {
			shoppingAmount = shoppingAmount - discount;
		}
		System.out.println("Final Price: " + shoppingAmount);

		sc.close();
	}
}
