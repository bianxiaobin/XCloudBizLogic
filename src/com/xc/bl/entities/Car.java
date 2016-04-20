package com.xc.bl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Car entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "car", catalog = "xcdb")
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
	@Id
	@GeneratedValue
	@Column(name = "car_id", unique = true, nullable = false)
	public Long getCarId() {
		return this.carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	@Column(name = "car_grade_id", nullable = false)
	public Integer getCarGradeId() {
		return this.carGradeId;
	}

	public void setCarGradeId(Integer carGradeId) {
		this.carGradeId = carGradeId;
	}

	@Column(name = "car_ap_name", length = 50)
	public String getCarApName() {
		return this.carApName;
	}

	public void setCarApName(String carApName) {
		this.carApName = carApName;
	}

	@Column(name = "car_ap_pwd", length = 50)
	public String getCarApPwd() {
		return this.carApPwd;
	}

	public void setCarApPwd(String carApPwd) {
		this.carApPwd = carApPwd;
	}

	@Column(name = "car_uuid", length = 100)
	public String getCarUuid() {
		return this.carUuid;
	}

	public void setCarUuid(String carUuid) {
		this.carUuid = carUuid;
	}

	@Column(name = "car_bind_state", nullable = false)
	public Short getCarBindState() {
		return this.carBindState;
	}

	public void setCarBindState(Short carBindState) {
		this.carBindState = carBindState;
	}

}