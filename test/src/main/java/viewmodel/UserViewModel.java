package viewmodel;

import org.dozer.Mapping;

public class UserViewModel extends BaseEntityViewModel<Long>  {

	private String username;
	private String password;
	
	@Mapping("zipcode")
	private Integer zip;
	
	
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
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "UserViewModel [id=" + super.getId() +",username=" + username + ", password=" + password + ", zip=" + zip + "]";
	}
	
	
}
