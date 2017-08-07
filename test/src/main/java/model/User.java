package model;

public class User extends BaseEntity<Integer> {

	private String username;
	private String password;
	private Integer zipcode;
	
	
	public User() {
		super();
	}

	public User(Integer id,String username, String password, Integer zipcode) {
		super();
		super.setId(id);
		this.username = username;
		this.password = password;
		this.zipcode = zipcode;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "User [id=" + super.getId() + ",username=" + username +", password=" + password + ", zipcode=" + zipcode + "]";
	}
	
}
