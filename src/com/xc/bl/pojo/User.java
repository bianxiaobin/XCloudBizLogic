package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Long userId;
	private Long userPhone;
	private String userSid;
	private Timestamp userDatetimeAccessLast;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Long userPhone, Timestamp userDatetimeAccessLast) {
		this.userPhone = userPhone;
		this.userDatetimeAccessLast = userDatetimeAccessLast;
	}

	/** full constructor */
	public User(Long userPhone, String userSid, Timestamp userDatetimeAccessLast) {
		this.userPhone = userPhone;
		this.userSid = userSid;
		this.userDatetimeAccessLast = userDatetimeAccessLast;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(Long userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserSid() {
		return this.userSid;
	}

	public void setUserSid(String userSid) {
		this.userSid = userSid;
	}

	public Timestamp getUserDatetimeAccessLast() {
		return this.userDatetimeAccessLast;
	}

	public void setUserDatetimeAccessLast(Timestamp userDatetimeAccessLast) {
		this.userDatetimeAccessLast = userDatetimeAccessLast;
	}

}