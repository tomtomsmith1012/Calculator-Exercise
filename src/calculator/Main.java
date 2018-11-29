package calculator;

public class Main {
	
	public static void main(String[] args) {
		int int1 = 10; double d1 = int1;
		int int2 = 10; double d2 = int2;
		int int3 = 100; double d3 = int3;
		
		String a = multiply(int1, int2, int3);
		String b = add(int1, int2, int3);
		String c = subtract(int1, int2, int3);
		String d = divide(d1, d2, d3);
		
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
	}

	public static String add(int int1, int int2, int int3) {
		String i = "";
		if (int1 + int2 == int3) {
			i = int1 + " + " + int2 + " = " + int3;
		}
		if (int1 + int3 == int2) {
			i = int1 + " + " + int3 + " = " + int2;
		}
		if (int2 + int3 == int1) {
			i = int2 + " + " + int3 + " = " + int1;
		}
		return i;
	}

	public static String subtract(int int1, int int2, int int3) {
		String i = "";
		if (int1 - int2 == int3) {
			i = int1 + " - " + int2 + " = " + int3;
		}
		if (int1 - int3 == int2) {
			i = int1 + " - " + int3 + " = " + int2;
		}
		if (int2 - int3 == int1) {
			i = int2 + " - " + int3 + " = " + int1;
		}
		return i;
	}

	public static String divide(double int1, double int2, double int3) {
		String i = "";
		double d1 = int1;
		double d2 = int2;
		double d3 = int3;
		
		if (d1 / d2 == d3) {
			i = d1 + " / " + d2 + " = " + d3;
		}
		if (d1 / d3 == d2) {
			i = d1 + " / " + d3 + " = " + d2;
		}
		if (d2 / d3 == d1) {
			i = d2 + " / " + d3 + " = " + d1;
		}
		if (d3 / d2 == d1) {
			i = d3 + " / " + d2 + " = " + d1;
		}
		
		return i;
	}

	public static String multiply(int int1, int int2, int int3) {

		String i = "";

		if (int1 * int2 == int3) {
			i = int1 + " * " + int2 + " = " + int3;
		}
		if (int1 * int3 == int2) {
			i = int1 + " * " + int3 + " = " + int2;

		}
		if (int2 * int3 == int1) {
			i = int2 + " * " + int3 + " = " + int1;

		}
		return i;
	}

}
