package database;
/**
 * Class that represents a user.
 * @author andre
 *
 */
public class User {

	public int id;
	public String username;
	public String password;
	public String role;
	
	//Constructor
	public User(int i,String usernm, String pass, String role) {
		id=i;
		username = usernm;
		password = pass;
		this.role = role;
	}
}
