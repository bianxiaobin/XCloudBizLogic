package com.xc.bl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CarGrade entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "car_grade", catalog = "xcdb")
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
	@Id
	@GeneratedValue
	@Column(name = "car_grade_id", unique = true, nullable = false)
	public Integer getCarGradeId() {
		return this.carGradeId;
	}

	public void setCarGradeId(Integer carGradeId) {
		this.carGradeId = carGradeId;
	}

	@Column(name = "car_grade_name", nullable = false, length = 50)
	public String getCarGradeName() {
		return this.carGradeName;
	}

	public void setCarGradeName(String carGradeName) {
		this.carGradeName = carGradeName;
	}

	@Column(name = "car_grade_year", nullable = false)
	public Integer getCarGradeYear() {
		return this.carGradeYear;
	}

	public void setCarGradeYear(Integer carGradeYear) {
		this.carGradeYear = carGradeYear;
	}

	@Column(name = "car_grade_emissions", nullable = false, length = 20)
	public String getCarGradeEmissions() {
		return this.carGradeEmissions;
	}

	public void setCarGradeEmissions(String carGradeEmissions) {
		this.carGradeEmissions = carGradeEmissions;
	}

	@Column(name = "car_model_id", nullable = false)
	public Integer getCarModelId() {
		return this.carModelId;
	}

	public void setCarModelId(Integer carModelId) {
		this.carModelId = carModelId;
	}

	@Column(name = "car_grade_si", nullable = false, length = 100)
	public String getCarGradeSi() {
		return this.carGradeSi;
	}

	public void setCarGradeSi(String carGradeSi) {
		this.carGradeSi = carGradeSi;
	}

	@Override
	public String toString() {
		return "CarGrade [carGradeId=" + carGradeId + ", carGradeName="
				+ carGradeName + ", carGradeYear=" + carGradeYear
				+ ", carGradeEmissions=" + carGradeEmissions + ", carModelId="
				+ carModelId + ", carGradeSi=" + carGradeSi + "]";
	}

	
}