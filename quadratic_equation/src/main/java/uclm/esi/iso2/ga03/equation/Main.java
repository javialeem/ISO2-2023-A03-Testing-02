package uclm.esi.iso2.ga03.equation;
import java.util.Scanner;
public class Main {
	final static Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
		System.out.println("The structure of the equation will be the following one: A*X^2 +B*X+C");
		System.out.println("Introduce the values for a,b and c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		Quadratic_Equation qe = new Quadratic_Equation(a,b,c);
		double [] x = qe.solution(a, b, c);
		if(x[0]==x[1]) 
			System.out.println("The unique solution is: x= " + x[0] + " ");
		else
			System.out.println("The first value for x is: " + x[0] + "\nThe second value for x is: " + x[1]);
	
	}
}
