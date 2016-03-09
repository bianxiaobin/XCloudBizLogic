package com.xc.bl.pojo;

/**
 * CarGrade entity. @author MyEclipse Persistence Tools
 */

public class CarGrade implements java.io.Serializable {

	// Fields

	private Integer carGradeId;
	private String carGradeName;
	private Integer carGradeYear;
	private String carGradeEmissions;
	private Integer carModelId;
	private String carGradeSi;

	// Constructors

	/** default constructor */
	public CarGrade() {
	}

	/** full constructor */
	public CarGrade(String carGradeName, Integer carGradeYear,
			String carGradeEmissions, Integer carModelId, String carGradeSi) {
		this.carGradeName = carGradeName;
		this.carGradeYear = carGradeYear;
		this.carGradeEmissions = carGradeEmissions;
		this.carModelId = carModelId;
		this.carGradeSi = carGradeSi;
	}

	// Property accessors

	public Integer getCarGradeId() {
		return this.carGradeId;
	}

	public void setCarGradeId(Integer carGradeId) {
		this.carGradeId = carGradeId;
	}

	public String getCarGradeName() {
		return this.carGradeName;
	}

	public void setCarGradeName(String carGradeName) {
		this.carGradeName = carGradeName;
	}

	public Integer getCarGradeYear() {
		return this.carGradeYear;
	}

	public void setCarGradeYear(Integer carGradeYear) {
		this.carGradeYear = carGradeYear;
	}

	public String getCarGradeEmissions() {
		return this.carGradeEmissions;
	}

	public void setCarGradeEmissions(String carGradeEmissions) {
		this.carGradeEmissions = carGradeEmissions;
	}

	public Integer getCarModelId() {
		return this.carModelId;
	}

	public void setCarModelId(Integer carModelId) {
		this.carModelId = carModelId;
	}

	public String getCarGradeSi() {
		return this.carGradeSi;
	}

	public void setCarGradeSi(String carGradeSi) {
		this.carGradeSi = carGradeSi;
	}

}