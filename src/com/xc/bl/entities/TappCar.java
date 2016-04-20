package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TappCar entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tapp_car", catalog = "xcdb")
public class TappCar implements java.io.Serializable {

	// Fields

	private Integer tappCarId;
	private Integer tappCarVercode;
	private String tappCarVer;
	private String tappCarFilename;
	private Integer tappCarSize;
	private String tappCarContent;
	private Timestamp tappCarReleaseDatatime;
	private Short tappCarIsforcedupd;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public TappCar() {
	}

	/** minimal constructor */
	public TappCar(Integer tappCarVercode, String tappCarVer,
			String tappCarFilename, Integer tappCarSize,
			Timestamp tappCarReleaseDatatime, Short tappCarIsforcedupd) {
		this.tappCarVercode = tappCarVercode;
		this.tappCarVer = tappCarVer;
		this.tappCarFilename = tappCarFilename;
		this.tappCarSize = tappCarSize;
		this.tappCarReleaseDatatime = tappCarReleaseDatatime;
		this.tappCarIsforcedupd = tappCarIsforcedupd;
	}

	/** full constructor */
	public TappCar(Integer tappCarVercode, String tappCarVer,
			String tappCarFilename, Integer tappCarSize, String tappCarContent,
			Timestamp tappCarReleaseDatatime, Short tappCarIsforcedupd,
			Timestamp dbCreatetime, Timestamp dbUpdatetime, Boolean dbDelete) {
		this.tappCarVercode = tappCarVercode;
		this.tappCarVer = tappCarVer;
		this.tappCarFilename = tappCarFilename;
		this.tappCarSize = tappCarSize;
		this.tappCarContent = tappCarContent;
		this.tappCarReleaseDatatime = tappCarReleaseDatatime;
		this.tappCarIsforcedupd = tappCarIsforcedupd;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "tapp_car_id", unique = true, nullable = false)
	public Integer getTappCarId() {
		return this.tappCarId;
	}

	public void setTappCarId(Integer tappCarId) {
		this.tappCarId = tappCarId;
	}

	@Column(name = "tapp_car_vercode", nullable = false)
	public Integer getTappCarVercode() {
		return this.tappCarVercode;
	}

	public void setTappCarVercode(Integer tappCarVercode) {
		this.tappCarVercode = tappCarVercode;
	}

	@Column(name = "tapp_car_ver", nullable = false, length = 20)
	public String getTappCarVer() {
		return this.tappCarVer;
	}

	public void setTappCarVer(String tappCarVer) {
		this.tappCarVer = tappCarVer;
	}

	@Column(name = "tapp_car_filename", nullable = false, length = 20)
	public String getTappCarFilename() {
		return this.tappCarFilename;
	}

	public void setTappCarFilename(String tappCarFilename) {
		this.tappCarFilename = tappCarFilename;
	}

	@Column(name = "tapp_car_size", nullable = false)
	public Integer getTappCarSize() {
		return this.tappCarSize;
	}

	public void setTappCarSize(Integer tappCarSize) {
		this.tappCarSize = tappCarSize;
	}

	@Column(name = "tapp_car_content", length = 500)
	public String getTappCarContent() {
		return this.tappCarContent;
	}

	public void setTappCarContent(String tappCarContent) {
		this.tappCarContent = tappCarContent;
	}

	@Column(name = "tapp_car_release_datatime", nullable = false, length = 19)
	public Timestamp getTappCarReleaseDatatime() {
		return this.tappCarReleaseDatatime;
	}

	public void setTappCarReleaseDatatime(Timestamp tappCarReleaseDatatime) {
		this.tappCarReleaseDatatime = tappCarReleaseDatatime;
	}

	@Column(name = "tapp_car_isforcedupd", nullable = false)
	public Short getTappCarIsforcedupd() {
		return this.tappCarIsforcedupd;
	}

	public void setTappCarIsforcedupd(Short tappCarIsforcedupd) {
		this.tappCarIsforcedupd = tappCarIsforcedupd;
	}

	@Column(name = "db_createtime", length = 19)
	public Timestamp getDbCreatetime() {
		return this.dbCreatetime;
	}

	public void setDbCreatetime(Timestamp dbCreatetime) {
		this.dbCreatetime = dbCreatetime;
	}

	@Column(name = "db_updatetime", length = 19)
	public Timestamp getDbUpdatetime() {
		return this.dbUpdatetime;
	}

	public void setDbUpdatetime(Timestamp dbUpdatetime) {
		this.dbUpdatetime = dbUpdatetime;
	}

	@Column(name = "db_delete")
	public Boolean getDbDelete() {
		return this.dbDelete;
	}

	public void setDbDelete(Boolean dbDelete) {
		this.dbDelete = dbDelete;
	}

}