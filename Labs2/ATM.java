public class ATM {
	Toolbox myToolbox = new Toolbox();
	Integer balance = 0;
	
	public static void main(String[] args){

		ATM myATM = new ATM();
		//Begins new bank session
		myATM.go();
	}
	
	public void go() {	
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		//Loops until an exceptable value is input
		while (true) {
			Integer number = myToolbox.readIntegerFromCmd();
			if (isPosative(number)){
				System.out.println(number + " Accepted");
				balance = number;
				menu();
				break;
			} else {
				System.out.println("Please enter a positive number. Try agian");
				System.out.println("How much do you want in your account?");
			}	
		}			
	}	
	
	public void menu() {
		System.out.println("What do you want to do?");
		System.out.println("1 : Withdraw");
		System.out.println("2 : Deposit");
		System.out.println("3 : Inquire");
		System.out.println("4 : Quit");
		
		//Loops until an exceptable value is input
		while (true) {
			Integer choice = myToolbox.readIntegerFromCmd();
			if(choice.equals(1)){
				withdraw();
				break;
			}
			if(choice.equals(2)){
				deposit();
				break;
			}
			if(choice.equals(3)){
				inquire();
				break;
			}
			if(choice.equals(4)){
				quit();
				break;
			}
			else{
				System.out.println("Valid answer not entered, please try again");
				System.out.println();
			}
		}
	}
	
	//Removes given amount from balence 
	public void withdraw(){
		System.out.println("******************************************");
		System.out.println("               Withdrawal");
		System.out.println("******************************************");
		System.out.println("How much would you like to withdraw?");
		
		//Loops until an exceptable value is input
		while (true) {
			Integer amountRemoved = myToolbox.readIntegerFromCmd();
			
			if (isPosative(amountRemoved)){
				if (isPosative(balance - amountRemoved)){
					balance = balance - amountRemoved;
					System.out.println("Your balance is now "+ balance);
					System.out.println("---------------------------------------");
					break;
				} else {
					System.out.println("You do not have enough money in your account for that");
				}	
			} else {
				System.out.println("Please enter a positive number. Try agian");
			}	
		}
		menu();
		
	}
	
	//Adds given amount from balence
	public void deposit() {
		System.out.println("******************************************");
		System.out.println("                Deposit");
		System.out.println("******************************************");
		System.out.println("How much would you like to deposit?");
		
		//Loops until an exceptable value is input
		while (true) {
			Integer amountAdded = myToolbox.readIntegerFromCmd();	
			if (isPosative(amountAdded)){
				balance = balance + amountAdded;
				System.out.println("Your balance is now "+ balance);
				System.out.println("---------------------------------------");
				break;				
			} else {
				System.out.println("Please enter a positive number. Try agian");
			}	
		}		
		menu();		
	}
	
	//Prints balance
	public void inquire() {
		System.out.println("******************************************");
		System.out.println("          Your balance is "+ balance);
		System.out.println("******************************************");
		menu();
	}
	//Quits the program 
	public void quit() { 
		System.out.println("******************************************");
		System.out.println("                GoodBye!");
		System.out.println("******************************************");
		System.exit(0);
	}
	
	//Checks a number is positive or 0
	public boolean isPosative(int number) {
		if (number >= 0) {
			return true;
		} else {
			return false;		
		}
	}
}