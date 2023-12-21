package uclm.esi.iso2.ga03.equation;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import static org.junit.Assert.*;

public class MainTest {
	private ByteArrayInputStream testIn;

    @Before
    public void setUp() {
        String input = "1\n-3\n2\n"; 
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void testAskValues() {
    	assertTrue( Main.askValues());
    	
    }
    @Test
    public void testgetSolution() {
    	Quadratic_Equation qe = new Quadratic_Equation(1,-3,2);
    	assertTrue(Main.getSolution(qe));
    }

    @Test
    public void testCreateEquation() {
        assertTrue(Main.createEquation(2, 3, 1));
        
    }
}
