package mocktest;
import java.util.Scanner;
public class UserDetails {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("What is your name? ");
	String name=sc.nextLine();
	System.out.println("How old are you? ");
	int age=sc.nextInt();
	
	System.out.println("Hello, "+name+" you will be "+(age+5)+" years old in 5 years" );
	sc.close();
}
}
