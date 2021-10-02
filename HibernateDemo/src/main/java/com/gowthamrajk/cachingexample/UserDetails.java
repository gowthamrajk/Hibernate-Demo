package com.gowthamrajk.cachingexample;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class UserDetails {
	
	@Id
	@Column(name = "userid")
	private int userId;
	
	@Column(name = "username")
	private String userName;
	
	private String email;
	private long mobile;
	
	public UserDetails() { }
	
	public UserDetails(int userId, String userName, String email, long mobile) {
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.mobile = mobile;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}
}
