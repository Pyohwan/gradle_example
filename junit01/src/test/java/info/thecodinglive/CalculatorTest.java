package info.thecodinglive;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	private Calculator calc;

	@Before
	public void setup() throws Exception {
		calc = new Calculator("hi junit");
	}

	@Test
	public void verifySetup() {
		assertNotNull(calc);
		System.out.println(calc.msg);
	}

	@Test
	public void testSum() {
		assertEquals(777, calc.sum(666, 111));
	}

	@Test
	public void testStaticSum() {
		assertEquals(777, Calculator.staticSum(666, 111));
	}
}
