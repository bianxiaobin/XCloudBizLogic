package com.xc.bl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserCarBind entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_car_bind", catalog = "xcdb")
public class UserCarBind implements java.io.Serializable {

	// Fields

	private Long ucbId;
	private Long userId;
	private Long carId;

	// Constructors

	/** default constructor */
	public UserCarBind() {
	}

	/** full constructor */
	public UserCarBind(Long userId, Long carId) {
		this.userId = userId;
		this.carId = carId;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "ucb_id", unique = true, nullable = false)
	public Long getUcbId() {
		return this.ucbId;
	}

	public void setUcbId(Long ucbId) {
		this.ucbId = ucbId;
	}

	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "car_id", nullable = false)
	public Long getCarId() {
		return this.carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

}