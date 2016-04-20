package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_log", catalog = "xcdb")
public class UserLog implements java.io.Serializable {

	// Fields

	private Long userLogId;
	private Long userId;
	private Timestamp userLogLogintime;

	// Constructors

	/** default constructor */
	public UserLog() {
	}

	/** full constructor */
	public UserLog(Long userId, Timestamp userLogLogintime) {
		this.userId = userId;
		this.userLogLogintime = userLogLogintime;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "user_log_id", unique = true, nullable = false)
	public Long getUserLogId() {
		return this.userLogId;
	}

	public void setUserLogId(Long userLogId) {
		this.userLogId = userLogId;
	}

	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "user_log_logintime", nullable = false, length = 19)
	public Timestamp getUserLogLogintime() {
		return this.userLogLogintime;
	}

	public void setUserLogLogintime(Timestamp userLogLogintime) {
		this.userLogLogintime = userLogLogintime;
	}

}