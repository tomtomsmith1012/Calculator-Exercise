package calculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	@Test
	public void testMultiply() {
		int int1 = 3;
		int int2 = 5;
		int int3 = 15;
		assertEquals(int1 +" * " + int2 + " = " + int3, calculator.Main.multiply(int1, int2, int3));
	}
	@Test
	public void testMultiply248() {
		int int1 = 2;
		int int2 = 4;
		int int3 = 8;
		assertEquals(int1 +" * " + int2 + " = " + int3, calculator.Main.multiply(int1, int2, int3));
	}
	@Test
	public void testMultiply26Twelve() {
		int int1 = 2;
		int int2 = 6;
		int int3 = 12;
		assertEquals(int1 +" * " + int2 + " = " + int3, calculator.Main.multiply(int1, int2, int3));
	}

	@Test
	public void testAdd() {
		int int1 = 3;
		int int2 = 5;
		int int3 = 15;
		assertEquals("", calculator.Main.add(int1, int2, int3));
	}
	@Test
	public void testAdd248() {
		int int1 = 2;
		int int2 = 4;
		int int3 = 8;
		assertEquals("", calculator.Main.add(int1, int2, int3));
	}
	@Test
	public void testAdd26Twelve() {
		int int1 = 2;
		int int2 = 6;
		int int3 = 12;
		assertEquals("", calculator.Main.add(int1, int2, int3));
	}
	

	@Test
	public void testSubtract() {
		int int1 = 3;
		int int2 = 5;
		int int3 = 15;
		assertEquals("", calculator.Main.subtract(int1, int2, int3));
	}
	@Test
	public void testSubtract248() {
		int int1 = 2;
		int int2 = 4;
		int int3 = 8;
		assertEquals("", calculator.Main.subtract(int1, int2, int3));
	}
	@Test
	public void testSubtract26Twelve() {
		int int1 = 2;
		int int2 = 6;
		int int3 = 12;
		assertEquals("", calculator.Main.subtract(int1, int2, int3));
	}
	
	@Test
	public void testDivide() {
		double int1 = 3;
		double int2 = 5;
		double int3 = 15;
		assertEquals(int3 + " / " + int2 + " = " + int1, calculator.Main.divide(int1, int2, int3));
	}

	@Test
	public void testDivide248() {
		double int1 = 2;
		double int2 = 4;
		double int3 = 8;
		assertEquals(int3 + " / " + int2 + " = " + int1, calculator.Main.divide(int1, int2, int3));
	}
	@Test
	public void testDivide26Twelve() {
		double int1 = 2;
		double int2 = 6;
		double int3 = 12;
		assertEquals(int3 + " / " + int2 + " = " + int1, calculator.Main.divide(int1, int2, int3));
	}
}
