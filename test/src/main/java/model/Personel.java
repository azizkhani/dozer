package model;

public class Personel extends BaseEntity<Long>{
	
	private User createdBy;

	
	public Personel() {
		super();
	}

	public Personel(User createdBy) {
		super();
		this.createdBy = createdBy;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Personel [createdBy=" + createdBy.toString() + ", getId()=" + getId() + "]";
	}
	
}
