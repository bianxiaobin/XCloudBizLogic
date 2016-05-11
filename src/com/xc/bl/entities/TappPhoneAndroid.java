package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TappPhoneAndroid entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tapp_phone_android", catalog = "xcdb", uniqueConstraints = {
		@UniqueConstraint(columnNames = "tpa_vercode"),
		@UniqueConstraint(columnNames = "tpa_ver") })
public class TappPhoneAndroid implements java.io.Serializable {

	// Fields

	private Integer tpaId;
	private Integer tpaVercode;
	private String tpaVer;
	private String tpaFilename;
	private Integer tpaSize;
	private String tpaContent;
	private String tpaPkgname;
	private Timestamp tpaDatatime;
	private Short tpaIsforcedupd;

	// Constructors

	/** default constructor */
	public TappPhoneAndroid() {
	}

	/** minimal constructor */
	public TappPhoneAndroid(Integer tpaVercode, String tpaVer,
			String tpaFilename, Integer tpaSize, String tpaPkgname,
			Timestamp tpaDatatime, Short tpaIsforcedupd) {
		this.tpaVercode = tpaVercode;
		this.tpaVer = tpaVer;
		this.tpaFilename = tpaFilename;
		this.tpaSize = tpaSize;
		this.tpaPkgname = tpaPkgname;
		this.tpaDatatime = tpaDatatime;
		this.tpaIsforcedupd = tpaIsforcedupd;
	}

	/** full constructor */
	public TappPhoneAndroid(Integer tpaVercode, String tpaVer,
			String tpaFilename, Integer tpaSize, String tpaContent,
			String tpaPkgname, Timestamp tpaDatatime, Short tpaIsforcedupd) {
		this.tpaVercode = tpaVercode;
		this.tpaVer = tpaVer;
		this.tpaFilename = tpaFilename;
		this.tpaSize = tpaSize;
		this.tpaContent = tpaContent;
		this.tpaPkgname = tpaPkgname;
		this.tpaDatatime = tpaDatatime;
		this.tpaIsforcedupd = tpaIsforcedupd;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "tpa_id", unique = true, nullable = false)
	public Integer getTpaId() {
		return this.tpaId;
	}

	public void setTpaId(Integer tpaId) {
		this.tpaId = tpaId;
	}

	@Column(name = "tpa_vercode", unique = true, nullable = false)
	public Integer getTpaVercode() {
		return this.tpaVercode;
	}

	public void setTpaVercode(Integer tpaVercode) {
		this.tpaVercode = tpaVercode;
	}

	@Column(name = "tpa_ver", unique = true, nullable = false, length = 20)
	public String getTpaVer() {
		return this.tpaVer;
	}

	public void setTpaVer(String tpaVer) {
		this.tpaVer = tpaVer;
	}

	@Column(name = "tpa_filename", nullable = false, length = 50)
	public String getTpaFilename() {
		return this.tpaFilename;
	}

	public void setTpaFilename(String tpaFilename) {
		this.tpaFilename = tpaFilename;
	}

	@Column(name = "tpa_size", nullable = false)
	public Integer getTpaSize() {
		return this.tpaSize;
	}

	public void setTpaSize(Integer tpaSize) {
		this.tpaSize = tpaSize;
	}

	@Column(name = "tpa_content", length = 500)
	public String getTpaContent() {
		return this.tpaContent;
	}

	public void setTpaContent(String tpaContent) {
		this.tpaContent = tpaContent;
	}

	@Column(name = "tpa_pkgname", nullable = false, length = 50)
	public String getTpaPkgname() {
		return this.tpaPkgname;
	}

	public void setTpaPkgname(String tpaPkgname) {
		this.tpaPkgname = tpaPkgname;
	}

	@Column(name = "tpa_datatime", nullable = false, length = 19)
	public Timestamp getTpaDatatime() {
		return this.tpaDatatime;
	}

	public void setTpaDatatime(Timestamp tpaDatatime) {
		this.tpaDatatime = tpaDatatime;
	}

	@Column(name = "tpa_isforcedupd", nullable = false)
	public Short getTpaIsforcedupd() {
		return this.tpaIsforcedupd;
	}

	public void setTpaIsforcedupd(Short tpaIsforcedupd) {
		this.tpaIsforcedupd = tpaIsforcedupd;
	}

}