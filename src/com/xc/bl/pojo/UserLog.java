package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * UserLog entity. @author MyEclipse Persistence Tools
 */

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

	public Long getUserLogId() {
		return this.userLogId;
	}

	public void setUserLogId(Long userLogId) {
		this.userLogId = userLogId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Timestamp getUserLogLogintime() {
		return this.userLogLogintime;
	}

	public void setUserLogLogintime(Timestamp userLogLogintime) {
		this.userLogLogintime = userLogLogintime;
	}

}