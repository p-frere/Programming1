//Provides a test harness for the Class calculator
public class TestCalculator {

	private Calculator cal = new Calculator();

	/**
	 * Reduces a strings syntax calls the correct calculation method or
	 * throws error if there is incorrect syntax
	 */
	public boolean testParser() {

		// variable to flag if the test has failed at all
		boolean working = true;

		// test case if adding is working
		if (cal.x("12 + 5") != 17) {
			System.out.println("[FAIL] Basic parsing fails to add");
			working = false;
		} else {
			System.out.println("[ OK ] Parser adds correctly");
		}

		// test case if multiplication is working
		if (cal.x("12 x 5") != 60) {
			System.out.println("[FAIL] Basic parsing fails to multiply");
			working = false;
		} else {
			System.out.println("[ OK ] Parser multiplies correctly");
		}

		// test case for incorrect syntax
		if (cal.x("12 [ 3") != null) {
			System.out.println("[FAIL] Parser does not return null for operators which are not supported");
			working = false;
		} else {
			System.out.println("[ OK ] Parser returns null for operators which are not supported");
		}

		// if the whole test succeeds working is still as true
		return working;

	}

	/**
	 * tests the calculators ability to add
	 */
	public boolean testAdd() {
		Double posativeNumber = 3.0;
		Double negativeNumber = -3.0;
		
		// variable to flag if the test has failed at all
		boolean working = true;

		//adds a positive number
		if (cal.x + posativeNumber != cal.x(posativeNumber)) {
			System.out.println("[FAIL] Calculator adds incorrectly");
			working = false;
		} else {
			System.out.println("[OK] Calculator can add positive numbers");
		}
		
		//adds a negative number
		if (cal.x + negativeNumber != cal.x(negativeNumber)) {
			System.out.println("[FAIL] Calculator adds with negative numbers incorrectly");
			working = false;
		} else {
			System.out.println("[OK] Calculator can add a negative number");
		}
		// if the whole test succeeds working is still as true
		return working;
	}
	
	/**
	 * tests the calculators ability to multiply
	 */
	public boolean testMultiplication() {

		double posativeNumber = 3.0;
		double negativeNumber = -3.0;
		
		// variable to flag if the test has failed at all
		boolean working = true;
		
		//Multiples a positive number
		if (cal.x * posativeNumber != cal.x(posativeNumber)) {
			System.out.println("[FAIL] Calculator multiplies incorrectly");
			working = false;
		} else {
			System.out.println("[OK] Calculator can multiply positive numbers");
		}
		
		//Multiples a negative number
		if (cal.x * negativeNumber != cal.x(negativeNumber)) {
			System.out.println("[FAIL] Calculator multiplies by negative incorrectly");
			working = false;
		} else {
			System.out.println("[OK] Calculator can multiply a negative number");
		}
		// if the whole test succeeds working is still as true
		return working;
	}

}
