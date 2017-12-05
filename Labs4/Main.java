import java.util.Iterator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("---------------Part 1-------------------");
		
		Main app = new Main();
		int multiple = app.getInput();
		
		//times the input by 1 - 20, printing the answer
		System.out.println("\nmutiples up to 20:");
		for (int i = 1; i <= 20; i++) {
			System.out.print(multiple * i+", ");
		}
		
		//adds consecutive numbers until it reaches 500
		int total = 0;		//holds total
		int count = 1;		//counts how many successive ints needed
		while (total < 500) {
			total = total + count;
			count++;
		}
		System.out.println();
		System.out.println("It takes "+ count + " successive integers to add to make a total over 500\n");
			
		System.out.println("---------------Part 2-------------------");
		
		//Creates a list of users, fills the list and prints
		UserGroup users = new UserGroup();
		users.addSampleData();
		System.out.println("\nList of Users:");
		users.printUsernames();
		
		//creates a lists of admins by cycling through users
		UserGroup administrators = new UserGroup();
		Iterator<User> iterator = users.getUserIterator();
		
		//Cycles through iterator
		while(iterator.hasNext()) {
			User user = iterator.next();
			if (user.getUserType() == "admin") {
				administrators.add(user);
			}
		}
		
		System.out.println("\nList of Admins:");
		administrators.printUsernames();
		
		//changes the last userType of admins to user		
		User lastAdmin = administrators.getUserList().get(administrators.getUserList().size()-1);
		lastAdmin.setUserType("user");
		
		//Prints updated lists
		System.out.println("\nUpdated List of all users:");
		users.printUsernames();
		System.out.println("\nUpdated List of all admins:");
		administrators.printUsernames();
	}
	
	//Gets input from user
	public int getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = sc.nextInt();
		sc.close();
		return input;
		
	}

}

/*------ Challenge Question --------
 * 
 * Changing the user type of one of the admins means there is inconsistency in the administrators class
 * as there is now a user in this.
 * 
 * I would fix this by adding some validation to the admin list so users would be removed if they're 
 * user type changed
 */
