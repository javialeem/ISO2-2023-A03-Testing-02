package uclm.esi.iso2.ga03.equation;

public class Quadratic_Equation {

    private double a;
    private double b;
    private double c;

    public Quadratic_Equation(double a, double b, double c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
        if (!isLegalA()) {
            Main.ilegalAMessage();
        }
    }

    public boolean isLegalA() {
        return a != 0;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getSqrt() {
        double result = this.getB() * this.getB() - 4 * this.getA() * this.getC();
        if (!isLegalSqrt(result)) {
            Main.ilegalSqrtMessage();
            return Double.NaN;
        }
        return Math.sqrt(result);
    }

    public boolean isLegalSqrt(double result) {
        return result >= 0;
    }

    public double[] solution() {
        double result = this.getB() * this.getB() - 4 * this.getA() * this.getC();
        double sqrt= getSqrt();
        if (isLegalA() && isLegalSqrt(result)) {
            double[] x = new double[2];
            x[0] = (-this.getB() + sqrt) / (2 * this.getA());
            x[1] = (-this.getB() - sqrt) / (2 * this.getA());
            return x;
        } else {
            return new double[]{Double.NaN, Double.NaN};
        }
    }
}
