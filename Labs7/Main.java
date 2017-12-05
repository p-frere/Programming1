/**
 * Main class where Main method is called
 */
public class Main {
	public static void main(String[] args) {
		new Main();	
	}
	
	/**
	 * Method creates a test calculator
	 * checks if all methods are working and prints a message if true
	 */
	public Main() {
		TestCalculator testCalculator = new TestCalculator();
		//If all method are completed successfully:
		if (testCalculator.testParser() && testCalculator.testAdd() && testCalculator.testMultiplication()){
			System.out.println("\nCongratulations, your Calculator appears to be working.");
		}	
	}	
}
