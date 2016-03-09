package com.xc.bl.pojo;

/**
 * CarFactory entity. @author MyEclipse Persistence Tools
 */

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

	public Integer getCarFactoryId() {
		return this.carFactoryId;
	}

	public void setCarFactoryId(Integer carFactoryId) {
		this.carFactoryId = carFactoryId;
	}

	public String getCarFactoryName() {
		return this.carFactoryName;
	}

	public void setCarFactoryName(String carFactoryName) {
		this.carFactoryName = carFactoryName;
	}

	public Integer getCarBrandId() {
		return this.carBrandId;
	}

	public void setCarBrandId(Integer carBrandId) {
		this.carBrandId = carBrandId;
	}

}