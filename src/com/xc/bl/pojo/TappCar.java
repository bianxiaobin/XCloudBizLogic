package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * TappCar entity. @author MyEclipse Persistence Tools
 */

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

	public Integer getTappCarId() {
		return this.tappCarId;
	}

	public void setTappCarId(Integer tappCarId) {
		this.tappCarId = tappCarId;
	}

	public Integer getTappCarVercode() {
		return this.tappCarVercode;
	}

	public void setTappCarVercode(Integer tappCarVercode) {
		this.tappCarVercode = tappCarVercode;
	}

	public String getTappCarVer() {
		return this.tappCarVer;
	}

	public void setTappCarVer(String tappCarVer) {
		this.tappCarVer = tappCarVer;
	}

	public String getTappCarFilename() {
		return this.tappCarFilename;
	}

	public void setTappCarFilename(String tappCarFilename) {
		this.tappCarFilename = tappCarFilename;
	}

	public Integer getTappCarSize() {
		return this.tappCarSize;
	}

	public void setTappCarSize(Integer tappCarSize) {
		this.tappCarSize = tappCarSize;
	}

	public String getTappCarContent() {
		return this.tappCarContent;
	}

	public void setTappCarContent(String tappCarContent) {
		this.tappCarContent = tappCarContent;
	}

	public Timestamp getTappCarReleaseDatatime() {
		return this.tappCarReleaseDatatime;
	}

	public void setTappCarReleaseDatatime(Timestamp tappCarReleaseDatatime) {
		this.tappCarReleaseDatatime = tappCarReleaseDatatime;
	}

	public Short getTappCarIsforcedupd() {
		return this.tappCarIsforcedupd;
	}

	public void setTappCarIsforcedupd(Short tappCarIsforcedupd) {
		this.tappCarIsforcedupd = tappCarIsforcedupd;
	}

	public Timestamp getDbCreatetime() {
		return this.dbCreatetime;
	}

	public void setDbCreatetime(Timestamp dbCreatetime) {
		this.dbCreatetime = dbCreatetime;
	}

	public Timestamp getDbUpdatetime() {
		return this.dbUpdatetime;
	}

	public void setDbUpdatetime(Timestamp dbUpdatetime) {
		this.dbUpdatetime = dbUpdatetime;
	}

	public Boolean getDbDelete() {
		return this.dbDelete;
	}

	public void setDbDelete(Boolean dbDelete) {
		this.dbDelete = dbDelete;
	}

}