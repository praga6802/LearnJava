package classProblems;
import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks=sc.nextInt();
		char grade=' ';
		if(marks>=90) {
			grade='A';
		}
		else if(marks>=80) {
			grade='B';
		}
		else if(marks>=70) {
			grade='C';
		}
		else if(marks>=60) {
			grade='D';
		}
		else{
			grade='F';
		}
		System.out.println("Marks: "+marks);
		System.out.println("Grade: "+grade);
		sc.close();
	}
	
}
