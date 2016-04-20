package com.xc.bl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * CarBrand entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "car_brand", catalog = "xcdb", uniqueConstraints = @UniqueConstraint(columnNames = "car_brand_name"))
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
	@Id
	@GeneratedValue
	@Column(name = "car_brand_id", unique = true, nullable = false)
	public Integer getCarBrandId() {
		return this.carBrandId;
	}

	public void setCarBrandId(Integer carBrandId) {
		this.carBrandId = carBrandId;
	}

	@Column(name = "car_brand_name", unique = true, nullable = false, length = 50)
	public String getCarBrandName() {
		return this.carBrandName;
	}

	public void setCarBrandName(String carBrandName) {
		this.carBrandName = carBrandName;
	}

	@Column(name = "car_brand_ishot", nullable = false)
	public Short getCarBrandIshot() {
		return this.carBrandIshot;
	}

	public void setCarBrandIshot(Short carBrandIshot) {
		this.carBrandIshot = carBrandIshot;
	}

	@Column(name = "car_brand_name_letter", nullable = false, length = 1)
	public String getCarBrandNameLetter() {
		return this.carBrandNameLetter;
	}

	public void setCarBrandNameLetter(String carBrandNameLetter) {
		this.carBrandNameLetter = carBrandNameLetter;
	}

	@Column(name = "car_brand_logo", nullable = false, length = 100)
	public String getCarBrandLogo() {
		return this.carBrandLogo;
	}

	public void setCarBrandLogo(String carBrandLogo) {
		this.carBrandLogo = carBrandLogo;
	}

	@Override
	public String toString() {
		return "CarBrand [carBrandId=" + carBrandId + ", carBrandName="
				+ carBrandName + ", carBrandIshot=" + carBrandIshot
				+ ", carBrandNameLetter=" + carBrandNameLetter
				+ ", carBrandLogo=" + carBrandLogo + "]";
	}

	
}