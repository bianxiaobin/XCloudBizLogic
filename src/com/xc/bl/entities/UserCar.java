package com.xc.bl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserCar entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_car", catalog = "xcdb")
public class UserCar implements java.io.Serializable {

	// Fields

	private Long ucId;
	private Long userId;
	private Integer carGradeId;

	// Constructors

	/** default constructor */
	public UserCar() {
	}

	/** full constructor */
	public UserCar(Long userId, Integer carGradeId) {
		this.userId = userId;
		this.carGradeId = carGradeId;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "uc_id", unique = true, nullable = false)
	public Long getUcId() {
		return this.ucId;
	}

	public void setUcId(Long ucId) {
		this.ucId = ucId;
	}

	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "car_grade_id", nullable = false)
	public Integer getCarGradeId() {
		return this.carGradeId;
	}

	public void setCarGradeId(Integer carGradeId) {
		this.carGradeId = carGradeId;
	}

}