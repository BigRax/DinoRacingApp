package app.objects;

public class User {

	private String UserName;
	
	public User(String s) {
		this.setUserName(s);
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
}
