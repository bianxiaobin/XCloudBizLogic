package com.xc.bl.pojo;

/**
 * UserCarBind entity. @author MyEclipse Persistence Tools
 */

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

	public Long getUcbId() {
		return this.ucbId;
	}

	public void setUcbId(Long ucbId) {
		this.ucbId = ucbId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCarId() {
		return this.carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

}