package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TappPhone entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tapp_phone", catalog = "xcdb", uniqueConstraints = {
		@UniqueConstraint(columnNames = "tapp_phone_vercode"),
		@UniqueConstraint(columnNames = "tapp_phone_ver") })
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
	@Id
	@GeneratedValue
	@Column(name = "tapp_phone_id", unique = true, nullable = false)
	public Integer getTappPhoneId() {
		return this.tappPhoneId;
	}

	public void setTappPhoneId(Integer tappPhoneId) {
		this.tappPhoneId = tappPhoneId;
	}

	@Column(name = "tapp_phone_vercode", unique = true, nullable = false)
	public Integer getTappPhoneVercode() {
		return this.tappPhoneVercode;
	}

	public void setTappPhoneVercode(Integer tappPhoneVercode) {
		this.tappPhoneVercode = tappPhoneVercode;
	}

	@Column(name = "tapp_phone_ver", unique = true, nullable = false, length = 20)
	public String getTappPhoneVer() {
		return this.tappPhoneVer;
	}

	public void setTappPhoneVer(String tappPhoneVer) {
		this.tappPhoneVer = tappPhoneVer;
	}

	@Column(name = "tapp_phone_filename", nullable = false, length = 50)
	public String getTappPhoneFilename() {
		return this.tappPhoneFilename;
	}

	public void setTappPhoneFilename(String tappPhoneFilename) {
		this.tappPhoneFilename = tappPhoneFilename;
	}

	@Column(name = "tapp_phone_size", nullable = false)
	public Integer getTappPhoneSize() {
		return this.tappPhoneSize;
	}

	public void setTappPhoneSize(Integer tappPhoneSize) {
		this.tappPhoneSize = tappPhoneSize;
	}

	@Column(name = "tapp_phone_content", length = 500)
	public String getTappPhoneContent() {
		return this.tappPhoneContent;
	}

	public void setTappPhoneContent(String tappPhoneContent) {
		this.tappPhoneContent = tappPhoneContent;
	}

	@Column(name = "tapp_phone_release_datatime", nullable = false, length = 19)
	public Timestamp getTappPhoneReleaseDatatime() {
		return this.tappPhoneReleaseDatatime;
	}

	public void setTappPhoneReleaseDatatime(Timestamp tappPhoneReleaseDatatime) {
		this.tappPhoneReleaseDatatime = tappPhoneReleaseDatatime;
	}

	@Column(name = "tapp_phone_isforcedupd", nullable = false)
	public Short getTappPhoneIsforcedupd() {
		return this.tappPhoneIsforcedupd;
	}

	public void setTappPhoneIsforcedupd(Short tappPhoneIsforcedupd) {
		this.tappPhoneIsforcedupd = tappPhoneIsforcedupd;
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