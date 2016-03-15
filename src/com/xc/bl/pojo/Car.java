package com.xc.bl.pojo;

/**
 * Car entity. @author MyEclipse Persistence Tools
 */

public class Car implements java.io.Serializable {

	// Fields

	private Long carId;
	private Integer carGradeId;
	private String carApName;
	private String carApPwd;
	private String carUuid;
	private Short carBindState;

	// Constructors

	/** default constructor */
	public Car() {
	}

	/** minimal constructor */
	public Car(Integer carGradeId, Short carBindState) {
		this.carGradeId = carGradeId;
		this.carBindState = carBindState;
	}

	/** full constructor */
	public Car(Integer carGradeId, String carApName, String carApPwd,
			String carUuid, Short carBindState) {
		this.carGradeId = carGradeId;
		this.carApName = carApName;
		this.carApPwd = carApPwd;
		this.carUuid = carUuid;
		this.carBindState = carBindState;
	}

	// Property accessors

	public Long getCarId() {
		return this.carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public Integer getCarGradeId() {
		return this.carGradeId;
	}

	public void setCarGradeId(Integer carGradeId) {
		this.carGradeId = carGradeId;
	}

	public String getCarApName() {
		return this.carApName;
	}

	public void setCarApName(String carApName) {
		this.carApName = carApName;
	}

	public String getCarApPwd() {
		return this.carApPwd;
	}

	public void setCarApPwd(String carApPwd) {
		this.carApPwd = carApPwd;
	}

	public String getCarUuid() {
		return this.carUuid;
	}

	public void setCarUuid(String carUuid) {
		this.carUuid = carUuid;
	}

	public Short getCarBindState() {
		return this.carBindState;
	}

	public void setCarBindState(Short carBindState) {
		this.carBindState = carBindState;
	}

}