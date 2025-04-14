package classProblems;
import java.util.Scanner;
public class LeapYearOrNot{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean isLeapYear=true;
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		if(year % 4==0) {
			if(year % 100 != 0) {
				if(year % 400==0) {
					isLeapYear=true;
				}
			}
			else {
				isLeapYear=false;
			}
		}
		else {
			isLeapYear=false;
		}
		
		if(isLeapYear) {
			System.out.println(year+" is leap year");
		}
		else {
			System.out.println(year+" is not leap year");
		}
		sc.close();
	}

}
