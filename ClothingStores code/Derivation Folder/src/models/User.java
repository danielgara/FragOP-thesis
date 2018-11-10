package models;

public class User {
	private int id;
	private String name;
	private String type;
	private String user;
	private String pass;
	
	public User(int id, String name, String type, String user, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.user = user;
		this.pass = pass;
	}

	public User(String name, String type, String user, String pass) {
		super();
		this.name = name;
		this.type = type;
		this.user = user;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
