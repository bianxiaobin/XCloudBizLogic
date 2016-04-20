package com.xc.bl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CarFactory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "car_factory", catalog = "xcdb")
public class CarFactory implements java.io.Serializable {

	// Fields

	private Integer carFactoryId;
	private String carFactoryName;
	private Integer carBrandId;

	// Constructors

	/** default constructor */
	public CarFactory() {
	}

	/** full constructor */
	public CarFactory(String carFactoryName, Integer carBrandId) {
		this.carFactoryName = carFactoryName;
		this.carBrandId = carBrandId;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "car_factory_id", unique = true, nullable = false)
	public Integer getCarFactoryId() {
		return this.carFactoryId;
	}

	public void setCarFactoryId(Integer carFactoryId) {
		this.carFactoryId = carFactoryId;
	}

	@Column(name = "car_factory_name", nullable = false, length = 50)
	public String getCarFactoryName() {
		return this.carFactoryName;
	}

	public void setCarFactoryName(String carFactoryName) {
		this.carFactoryName = carFactoryName;
	}

	@Column(name = "car_brand_id", nullable = false)
	public Integer getCarBrandId() {
		return this.carBrandId;
	}

	public void setCarBrandId(Integer carBrandId) {
		this.carBrandId = carBrandId;
	}

}