package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * TappPhone entity. @author MyEclipse Persistence Tools
 */

public class TappPhone implements java.io.Serializable {

	// Fields

	private Integer tappPhoneId;
	private Integer tappPhoneVercode;
	private String tappPhoneVer;
	private String tappPhoneFilename;
	private Integer tappPhoneSize;
	private String tappPhoneContent;
	private Timestamp tappPhoneReleaseDatatime;
	private Short tappPhoneIsforcedupd;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public TappPhone() {
	}

	/** minimal constructor */
	public TappPhone(Integer tappPhoneVercode, String tappPhoneVer,
			String tappPhoneFilename, Integer tappPhoneSize,
			Timestamp tappPhoneReleaseDatatime, Short tappPhoneIsforcedupd) {
		this.tappPhoneVercode = tappPhoneVercode;
		this.tappPhoneVer = tappPhoneVer;
		this.tappPhoneFilename = tappPhoneFilename;
		this.tappPhoneSize = tappPhoneSize;
		this.tappPhoneReleaseDatatime = tappPhoneReleaseDatatime;
		this.tappPhoneIsforcedupd = tappPhoneIsforcedupd;
	}

	/** full constructor */
	public TappPhone(Integer tappPhoneVercode, String tappPhoneVer,
			String tappPhoneFilename, Integer tappPhoneSize,
			String tappPhoneContent, Timestamp tappPhoneReleaseDatatime,
			Short tappPhoneIsforcedupd, Timestamp dbCreatetime,
			Timestamp dbUpdatetime, Boolean dbDelete) {
		this.tappPhoneVercode = tappPhoneVercode;
		this.tappPhoneVer = tappPhoneVer;
		this.tappPhoneFilename = tappPhoneFilename;
		this.tappPhoneSize = tappPhoneSize;
		this.tappPhoneContent = tappPhoneContent;
		this.tappPhoneReleaseDatatime = tappPhoneReleaseDatatime;
		this.tappPhoneIsforcedupd = tappPhoneIsforcedupd;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors

	public Integer getTappPhoneId() {
		return this.tappPhoneId;
	}

	public void setTappPhoneId(Integer tappPhoneId) {
		this.tappPhoneId = tappPhoneId;
	}

	public Integer getTappPhoneVercode() {
		return this.tappPhoneVercode;
	}

	public void setTappPhoneVercode(Integer tappPhoneVercode) {
		this.tappPhoneVercode = tappPhoneVercode;
	}

	public String getTappPhoneVer() {
		return this.tappPhoneVer;
	}

	public void setTappPhoneVer(String tappPhoneVer) {
		this.tappPhoneVer = tappPhoneVer;
	}

	public String getTappPhoneFilename() {
		return this.tappPhoneFilename;
	}

	public void setTappPhoneFilename(String tappPhoneFilename) {
		this.tappPhoneFilename = tappPhoneFilename;
	}

	public Integer getTappPhoneSize() {
		return this.tappPhoneSize;
	}

	public void setTappPhoneSize(Integer tappPhoneSize) {
		this.tappPhoneSize = tappPhoneSize;
	}

	public String getTappPhoneContent() {
		return this.tappPhoneContent;
	}

	public void setTappPhoneContent(String tappPhoneContent) {
		this.tappPhoneContent = tappPhoneContent;
	}

	public Timestamp getTappPhoneReleaseDatatime() {
		return this.tappPhoneReleaseDatatime;
	}

	public void setTappPhoneReleaseDatatime(Timestamp tappPhoneReleaseDatatime) {
		this.tappPhoneReleaseDatatime = tappPhoneReleaseDatatime;
	}

	public Short getTappPhoneIsforcedupd() {
		return this.tappPhoneIsforcedupd;
	}

	public void setTappPhoneIsforcedupd(Short tappPhoneIsforcedupd) {
		this.tappPhoneIsforcedupd = tappPhoneIsforcedupd;
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