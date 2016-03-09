package com.xc.bl.pojo;

/**
 * CarModel entity. @author MyEclipse Persistence Tools
 */

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

	public Integer getCarModelId() {
		return this.carModelId;
	}

	public void setCarModelId(Integer carModelId) {
		this.carModelId = carModelId;
	}

	public String getCarModelName() {
		return this.carModelName;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	public Integer getCarFactoryId() {
		return this.carFactoryId;
	}

	public void setCarFactoryId(Integer carFactoryId) {
		this.carFactoryId = carFactoryId;
	}

	public String getCarModelSi() {
		return this.carModelSi;
	}

	public void setCarModelSi(String carModelSi) {
		this.carModelSi = carModelSi;
	}

}