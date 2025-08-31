package taskProblems;
import java.util.Scanner;
public class WeekDays {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the week number");
		int weekNo=sc.nextInt();
		String result=switch(weekNo) {
			case 0 -> "Sunday";
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> "Invalid Week Number";
		};
		System.out.println("Day: "+result);
		sc.close();
	}
}
