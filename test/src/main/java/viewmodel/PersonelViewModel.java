package viewmodel;

import org.dozer.Mapping;

public class PersonelViewModel extends BaseEntityViewModel<Long> {

	@Mapping("createdBy.zipcode")
	private Integer	userZipcode;

	@Mapping("createdBy.id")
	private Long	userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getUserZipcode() {
		return userZipcode;
	}

	public void setUserZipcode(Integer userZipcode) {
		this.userZipcode = userZipcode;
	}

	@Override
	public String toString() {
		return "PersonelViewModel [userId=" + userId + ", getId()=" + getId() + "]";
	}
}
