package calcPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAddition() 
	{
		assertEquals(8, CalcMain.calculator(4, 4, "ADD"), 0.0);
		assertEquals(-5, CalcMain.calculator(-10, 5, "add"), 0.0);
	}
	
	@Test
	public void testMultiplication() 
	{
		assertEquals(16, CalcMain.calculator(4, 4, "multiply"), 0.0);
		assertEquals(-50,CalcMain.calculator(-10, 5, "mulTIply"), 0.0);
		assertEquals(50, CalcMain.calculator(-10, -5, "multiply"), 0.0);
	}
	
	@Test
	public void testSubtraction() 
	{
		assertEquals(0, CalcMain.calculator(4, 4, "subtract"), 0.0);
		assertEquals(-15, CalcMain.calculator(-10, 5, "subtract"), 0.0);
		assertEquals(25, CalcMain.calculator(20, -5, "subtract"), 0.0);
	}
	
	@Test
	public void testDivision() 
	{
		assertEquals(0, CalcMain.calculator(4, 0, "divide"), 0.0);
		assertEquals(5, CalcMain.calculator(25, 5, "DIVide"), 0.0);
		assertEquals(-15, CalcMain.calculator(75, -5, "divide"), 0.0);
	}

}
