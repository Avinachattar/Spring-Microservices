package com.zensar;

public class CombinedResult {
	
	private User user;
	private Department departrment;
	public User getUser() {
		return user;
	}
	public void setUser(User user2) {
		this.user = user2;
	}
	public Department getDepartrment() {
		return departrment;
	}
	public void setDepartrment(Department object) {
		this.departrment = object;
	}
	public CombinedResult() {
		super();
	}
	public CombinedResult(User user, Department departrment) {
		super();
		this.user = user;
		this.departrment = departrment;
	}
	@Override
	public String toString() {
		return "RestTemplate [user=" + user + ", departrment=" + departrment + "]";
	}
	
	

}
