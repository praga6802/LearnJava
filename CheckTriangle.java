package classProblems;

public class CheckTriangle {
	public static void main(String[] args) {
		int a=10,b=8,c=9;
		if((a+b)>c && (b+c)>a && (a+c)>b) { //checks whether it is triangle or not
			if(a==b && b==c) { //Equilateral Triangle
				System.out.println("Equilateral Triangle");
			}
			else if(a==b && b==c && c==a) {
				System.out.println("Isoscles Triangle");
			}
			else {
				System.out.println("Scalene Triangle");
			}
		}
		else {
			System.out.println("It is not valid triangle");
		}
	}
}
