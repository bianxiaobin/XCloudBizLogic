package com.xc.bl.pojo;

/**
 * CarBrand entity. @author MyEclipse Persistence Tools
 */

public class CarBrand implements java.io.Serializable {

	// Fields

	private Integer carBrandId;
	private String carBrandName;
	private Short carBrandIshot;
	private String carBrandNameLetter;
	private String carBrandLogo;

	// Constructors

	/** default constructor */
	public CarBrand() {
	}

	/** full constructor */
	public CarBrand(String carBrandName, Short carBrandIshot,
			String carBrandNameLetter, String carBrandLogo) {
		this.carBrandName = carBrandName;
		this.carBrandIshot = carBrandIshot;
		this.carBrandNameLetter = carBrandNameLetter;
		this.carBrandLogo = carBrandLogo;
	}

	// Property accessors

	public Integer getCarBrandId() {
		return this.carBrandId;
	}

	public void setCarBrandId(Integer carBrandId) {
		this.carBrandId = carBrandId;
	}

	public String getCarBrandName() {
		return this.carBrandName;
	}

	public void setCarBrandName(String carBrandName) {
		this.carBrandName = carBrandName;
	}

	public Short getCarBrandIshot() {
		return this.carBrandIshot;
	}

	public void setCarBrandIshot(Short carBrandIshot) {
		this.carBrandIshot = carBrandIshot;
	}

	public String getCarBrandNameLetter() {
		return this.carBrandNameLetter;
	}

	public void setCarBrandNameLetter(String carBrandNameLetter) {
		this.carBrandNameLetter = carBrandNameLetter;
	}

	public String getCarBrandLogo() {
		return this.carBrandLogo;
	}

	public void setCarBrandLogo(String carBrandLogo) {
		this.carBrandLogo = carBrandLogo;
	}

}