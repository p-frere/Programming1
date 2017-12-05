//User class stores info about users
public class User {
	
	private String username;
	private String userType;
	private String name;
	
	//constructor
	public User(String username, String userType) {
		this.username = username;
		this.userType = userType;
	}
	
	//Getters and Setters
	public String getUsername() {
		return username;
	}
	
	public String getUserType() {
		return userType;
	}
	public String getName() {
		return name;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
}
