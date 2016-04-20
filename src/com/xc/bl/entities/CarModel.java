package com.xc.bl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CarModel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "car_model", catalog = "xcdb")
public class CarModel implements java.io.Serializable {

	// Fields

	private Integer carModelId;
	private String carModelName;
	private Integer carFactoryId;
	private String carModelSi;

	// Constructors

	/** default constructor */
	public CarModel() {
	}

	/** full constructor */
	public CarModel(String carModelName, Integer carFactoryId, String carModelSi) {
		this.carModelName = carModelName;
		this.carFactoryId = carFactoryId;
		this.carModelSi = carModelSi;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "car_model_id", unique = true, nullable = false)
	public Integer getCarModelId() {
		return this.carModelId;
	}

	public void setCarModelId(Integer carModelId) {
		this.carModelId = carModelId;
	}

	@Column(name = "car_model_name", nullable = false, length = 50)
	public String getCarModelName() {
		return this.carModelName;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	@Column(name = "car_factory_id", nullable = false)
	public Integer getCarFactoryId() {
		return this.carFactoryId;
	}

	public void setCarFactoryId(Integer carFactoryId) {
		this.carFactoryId = carFactoryId;
	}

	@Column(name = "car_model_si", nullable = false, length = 100)
	public String getCarModelSi() {
		return this.carModelSi;
	}

	public void setCarModelSi(String carModelSi) {
		this.carModelSi = carModelSi;
	}

}