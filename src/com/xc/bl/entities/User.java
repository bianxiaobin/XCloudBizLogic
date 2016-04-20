package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "xcdb", uniqueConstraints = @UniqueConstraint(columnNames = "user_phone"))
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
	@Id
	@GeneratedValue
	@Column(name = "user_id", unique = true, nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "user_phone", unique = true, nullable = false)
	public Long getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(Long userPhone) {
		this.userPhone = userPhone;
	}

	@Column(name = "user_sid", length = 20)
	public String getUserSid() {
		return this.userSid;
	}

	public void setUserSid(String userSid) {
		this.userSid = userSid;
	}

	@Column(name = "user_datetime_access_last", nullable = false, length = 19)
	public Timestamp getUserDatetimeAccessLast() {
		return this.userDatetimeAccessLast;
	}

	public void setUserDatetimeAccessLast(Timestamp userDatetimeAccessLast) {
		this.userDatetimeAccessLast = userDatetimeAccessLast;
	}

}