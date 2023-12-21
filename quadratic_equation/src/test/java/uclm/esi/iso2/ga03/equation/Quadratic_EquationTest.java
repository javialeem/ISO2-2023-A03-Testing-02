package uclm.esi.iso2.ga03.equation;

import static org.junit.Assert.*;
import org.junit.Test;

public class Quadratic_EquationTest {

    @Test
    public void testIsLegalA() {
        Quadratic_Equation legalA = new Quadratic_Equation(1, 2, 1);
        Quadratic_Equation illegalA = new Quadratic_Equation(0, 2, 1);
        assertTrue(legalA.isLegalA());
        assertFalse(illegalA.isLegalA());
    }

    @Test
    public void testIsLegalSqrt() {
        Quadratic_Equation validSqrt = new Quadratic_Equation(1, 2, 1);
        Quadratic_Equation invalidSqrt = new Quadratic_Equation(8, 2, 10);
        assertTrue(validSqrt.isLegalSqrt(validSqrt.getB() * validSqrt.getB() - 4 * validSqrt.getA() * validSqrt.getC()));
        assertFalse(invalidSqrt.isLegalSqrt(invalidSqrt.getB() * invalidSqrt.getB() - 4 * invalidSqrt.getA() * invalidSqrt.getC()));
    }

    @Test
    public void testGetSqrt() {
        Quadratic_Equation validEquation = new Quadratic_Equation(1, -3, 2);
        assertEquals(1.0, validEquation.getSqrt(), 0.001);

        Quadratic_Equation invalidEquation = new Quadratic_Equation(1, 1, 1);
        assertEquals(Double.NaN, invalidEquation.getSqrt(), 0.001);
    }

    @Test
    public void testSolution() {
        Quadratic_Equation validEquation = new Quadratic_Equation(1, -3, 2);
        double[] expectedSolution = {2.0, 1.0};
        assertArrayEquals(expectedSolution, validEquation.solution(), 0.001);

        Quadratic_Equation invalidEquation = new Quadratic_Equation(1, 1, 1);
        double[] nanSolution = {Double.NaN, Double.NaN};
        assertArrayEquals(nanSolution, invalidEquation.solution(), 0.001);
    }
}

