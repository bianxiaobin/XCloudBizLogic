package com.xc.bl.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DrivingReport entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "driving_report", catalog = "xcdb")
public class DrivingReport implements java.io.Serializable {

	// Fields

	private Long drId;
	private Long userId;
	private Integer drTotalMileage;
	private Integer drRotateSpeed;
	private Integer drSpeed;
	private Float drFuel;
	private Integer drWaterTemperature;
	private Integer drSuddenStop;
	private String drErrcode;
	private String drTirePressure;
	private String drGpsLatlon;
	private Date drDate;

	// Constructors

	/** default constructor */
	public DrivingReport() {
	}

	/** minimal constructor */
	public DrivingReport(Long userId, Date drDate) {
		this.userId = userId;
		this.drDate = drDate;
	}

	/** full constructor */
	public DrivingReport(Long userId, Integer drTotalMileage,
			Integer drRotateSpeed, Integer drSpeed, Float drFuel,
			Integer drWaterTemperature, Integer drSuddenStop, String drErrcode,
			String drTirePressure, String drGpsLatlon, Date drDate) {
		this.userId = userId;
		this.drTotalMileage = drTotalMileage;
		this.drRotateSpeed = drRotateSpeed;
		this.drSpeed = drSpeed;
		this.drFuel = drFuel;
		this.drWaterTemperature = drWaterTemperature;
		this.drSuddenStop = drSuddenStop;
		this.drErrcode = drErrcode;
		this.drTirePressure = drTirePressure;
		this.drGpsLatlon = drGpsLatlon;
		this.drDate = drDate;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "dr_id", unique = true, nullable = false)
	public Long getDrId() {
		return this.drId;
	}

	public void setDrId(Long drId) {
		this.drId = drId;
	}

	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "dr_total_mileage")
	public Integer getDrTotalMileage() {
		return this.drTotalMileage;
	}

	public void setDrTotalMileage(Integer drTotalMileage) {
		this.drTotalMileage = drTotalMileage;
	}

	@Column(name = "dr_rotate_speed")
	public Integer getDrRotateSpeed() {
		return this.drRotateSpeed;
	}

	public void setDrRotateSpeed(Integer drRotateSpeed) {
		this.drRotateSpeed = drRotateSpeed;
	}

	@Column(name = "dr_speed")
	public Integer getDrSpeed() {
		return this.drSpeed;
	}

	public void setDrSpeed(Integer drSpeed) {
		this.drSpeed = drSpeed;
	}

	@Column(name = "dr_fuel", precision = 12, scale = 0)
	public Float getDrFuel() {
		return this.drFuel;
	}

	public void setDrFuel(Float drFuel) {
		this.drFuel = drFuel;
	}

	@Column(name = "dr_water_temperature")
	public Integer getDrWaterTemperature() {
		return this.drWaterTemperature;
	}

	public void setDrWaterTemperature(Integer drWaterTemperature) {
		this.drWaterTemperature = drWaterTemperature;
	}

	@Column(name = "dr_sudden_stop")
	public Integer getDrSuddenStop() {
		return this.drSuddenStop;
	}

	public void setDrSuddenStop(Integer drSuddenStop) {
		this.drSuddenStop = drSuddenStop;
	}

	@Column(name = "dr_errcode", length = 50)
	public String getDrErrcode() {
		return this.drErrcode;
	}

	public void setDrErrcode(String drErrcode) {
		this.drErrcode = drErrcode;
	}

	@Column(name = "dr_tire_pressure", length = 20)
	public String getDrTirePressure() {
		return this.drTirePressure;
	}

	public void setDrTirePressure(String drTirePressure) {
		this.drTirePressure = drTirePressure;
	}

	@Column(name = "dr_gps_latlon", length = 50)
	public String getDrGpsLatlon() {
		return this.drGpsLatlon;
	}

	public void setDrGpsLatlon(String drGpsLatlon) {
		this.drGpsLatlon = drGpsLatlon;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dr_date", nullable = false, length = 10)
	public Date getDrDate() {
		return this.drDate;
	}

	public void setDrDate(Date drDate) {
		this.drDate = drDate;
	}

}