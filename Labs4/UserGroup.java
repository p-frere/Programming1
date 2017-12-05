import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup {
	//Creates list of all users
	private ArrayList<User> userList = new ArrayList<User>();
	
	//adds new user to a list
	public void add(User user) {
		getUserList().add(user);
	}
	
	//Populates the list
	public void addSampleData() {
		getUserList().add(new User("sd5","user"));
		getUserList().add(new User("gf7","admin"));
		getUserList().add(new User("ah5","editor"));
		getUserList().add(new User("sd1","user"));
		getUserList().add(new User("er8","admin"));
		getUserList().add(new User("kj9","editor"));
		getUserList().add(new User("pf1","user"));
		getUserList().add(new User("fg0","admin"));
		getUserList().add(new User("js6","editor"));
		getUserList().add(new User("py3","user"));
	}
	
	//return the user object in specified place in the list
	public User getUser(int choice) { 
		return getUserList().get(choice-1); //Adjusts for base 0, eg 3rd user is at position 2
	}
	
	//prints all usernames and userTypes in list
	public void printUsernames() {
		for (User user : getUserList()) {
			System.out.println(user.getUsername() + " " + user.getUserType());		
		}
	}
	
	//Removes first user in list
	public void removeFirstUser() {
		getUserList().remove(0);
	}
	
	//Removes Last user in list
	public void removeLastUser() {
		getUserList().remove(getUserList().size()-1);
	}
	
	//Removes user by username. Searches through list using iterator
	public void removeUser(String username) {	
		Iterator<User> iterator = getUserList().iterator();
		
		while(iterator.hasNext()) {
			User user = iterator.next();
			if (user.getUsername() == username) {
				getUserList().remove(user);
				break;
			}
		}
	}
	
	//returns iterator of the list
	public Iterator<User> getUserIterator() {	
		Iterator<User> iterator = getUserList().iterator();
		return iterator;
	}
	
	
	//getter for user list
	public ArrayList<User> getUserList() {
		return userList;
	}

}