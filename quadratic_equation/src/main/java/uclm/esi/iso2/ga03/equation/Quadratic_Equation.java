package uclm.esi.iso2.ga03.equation;
public class Quadratic_Equation {
	
	private double a;
	private double b;
	private double c;
	
	
	public Quadratic_Equation(double a, double b, double c) {
		super();
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}
	
	
	public double getA() {
		return a;
	}




	public void setA(double a) {
		this.a = a;
		if(a==0) {
			throw new IllegalArgumentException("a cannot get value 0");
		}
	}




	public double getB() {
		return b;
	}




	public void setB(double b) {
		this.b = b;
	}




	public double getC() {
		return c;
	}




	public void setC(double c) {
		this.c = c;
	}


	private double getSqrt(double a , double b, double  c) {
		double result = b*b - 4*a*c;
		if(result < 0) {
			throw new IllegalArgumentException("\nThe square root cannot be negative");
		}
		return result;
		
	}

	public double [] solution (double a , double b, double  c) {
		double x [] = new double [2];
		x[0] = (-b + Math.sqrt(getSqrt(a,b,c))) /(2*a);
		x[1] = (-b - Math.sqrt(getSqrt(a,b,c))) /(2*a);
		return x;
		
	}
	
	
	
}
