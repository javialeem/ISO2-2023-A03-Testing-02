package uclm.esi.iso2.ga03.equation;

import java.util.Scanner;

public class Main {
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("The structure of the equation will be the following one: A*X^2 +B*X+C\n");
		askValues();
	}

	public static boolean askValues() {
		double a, b, c;
		System.out.print("Introduce the values for a: ");
		a = getValues();
		System.out.print("Introduce the values for b: ");
		b = getValues();
		System.out.print("Introduce the values for c: ");
		c = getValues();
		createEquation(a, b, c);
		return true;
	}

	private static double getValues() {
		double x = 0;
		try {
			 x = sc.nextDouble();
		} catch (IllegalArgumentException e) {
			System.out.println("The value of the variable must be of type double");
		}
		return x;
	}

	public static boolean createEquation(double a, double b, double c) {
		Quadratic_Equation qe = new Quadratic_Equation(a, b, c);
		getSolution(qe);
		return true;
	}

	public static boolean getSolution(Quadratic_Equation qe) {
		double[] x = qe.solution();
		if (x[0] == x[1])
			System.out.println("\nThe unique solution is: x= " + x[0] + " ");
		else
			System.out.println("\nThe first value for x is: " + x[0] + "\nThe second value for x is: " + x[1]);
		return true;
	}
	public static void ilegalAMessage() {
		System.out.println("Error: 'a' cannot have a value of 0");
	}
	public static void ilegalSqrtMessage() {
		System.out.println("Error: The square root cannot be negative");
	}
	
}
