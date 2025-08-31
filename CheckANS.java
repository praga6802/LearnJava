package classProblems;
import java.util.Scanner;

public class CheckANS {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character: ");
		char character=sc.next().charAt(0);
		String type=" ";
		if((character >='A' && character <='Z')|| (character >='a' && character <='z')) {
			type="Alphabets";
		}
		else if((character >='0' && character <='9')) {
			type="Numbers";
		}
		else {
			type="Special Characters";
		}
		System.out.println("The given type is "+type);
		sc.close();
	}
}
