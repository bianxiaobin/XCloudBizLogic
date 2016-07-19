package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserGpsLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_gps_log", catalog = "xcdb")
public class UserGpsLog implements java.io.Serializable {

	// Fields

	private Long uglId;
	private Long userId;
	private String uglLatlon;
	private Timestamp uglDatetime;

	// Constructors

	/** default constructor */
	public UserGpsLog() {
	}

	/** minimal constructor */
	public UserGpsLog(Long userId, String uglLatlon) {
		this.userId = userId;
		this.uglLatlon = uglLatlon;
	}

	/** full constructor */
	public UserGpsLog(Long userId, String uglLatlon, Timestamp uglDatetime) {
		this.userId = userId;
		this.uglLatlon = uglLatlon;
		this.uglDatetime = uglDatetime;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "ugl_id", unique = true, nullable = false)
	public Long getUglId() {
		return this.uglId;
	}

	public void setUglId(Long uglId) {
		this.uglId = uglId;
	}

	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "ugl_latlon", nullable = false, length = 50)
	public String getUglLatlon() {
		return this.uglLatlon;
	}

	public void setUglLatlon(String uglLatlon) {
		this.uglLatlon = uglLatlon;
	}

	@Column(name = "ugl_datetime", length = 19)
	public Timestamp getUglDatetime() {
		return this.uglDatetime;
	}

	public void setUglDatetime(Timestamp uglDatetime) {
		this.uglDatetime = uglDatetime;
	}

}