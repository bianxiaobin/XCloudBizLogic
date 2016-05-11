package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TappPhoneIos entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tapp_phone_ios", catalog = "xcdb", uniqueConstraints = {
		@UniqueConstraint(columnNames = "tpi_vercode"),
		@UniqueConstraint(columnNames = "tpi_ver") })
public class TappPhoneIos implements java.io.Serializable {

	// Fields

	private Integer tpiId;
	private Integer tpiVercode;
	private String tpiVer;
	private String tpiAppstoreUrl;
	private String tpiContent;
	private Timestamp tpiDatatime;
	private Short tpiIsforcedupd;

	// Constructors

	/** default constructor */
	public TappPhoneIos() {
	}

	/** minimal constructor */
	public TappPhoneIos(Integer tpiVercode, String tpiVer,
			String tpiAppstoreUrl, Timestamp tpiDatatime, Short tpiIsforcedupd) {
		this.tpiVercode = tpiVercode;
		this.tpiVer = tpiVer;
		this.tpiAppstoreUrl = tpiAppstoreUrl;
		this.tpiDatatime = tpiDatatime;
		this.tpiIsforcedupd = tpiIsforcedupd;
	}

	/** full constructor */
	public TappPhoneIos(Integer tpiVercode, String tpiVer,
			String tpiAppstoreUrl, String tpiContent, Timestamp tpiDatatime,
			Short tpiIsforcedupd) {
		this.tpiVercode = tpiVercode;
		this.tpiVer = tpiVer;
		this.tpiAppstoreUrl = tpiAppstoreUrl;
		this.tpiContent = tpiContent;
		this.tpiDatatime = tpiDatatime;
		this.tpiIsforcedupd = tpiIsforcedupd;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "tpi_id", unique = true, nullable = false)
	public Integer getTpiId() {
		return this.tpiId;
	}

	public void setTpiId(Integer tpiId) {
		this.tpiId = tpiId;
	}

	@Column(name = "tpi_vercode", unique = true, nullable = false)
	public Integer getTpiVercode() {
		return this.tpiVercode;
	}

	public void setTpiVercode(Integer tpiVercode) {
		this.tpiVercode = tpiVercode;
	}

	@Column(name = "tpi_ver", unique = true, nullable = false, length = 20)
	public String getTpiVer() {
		return this.tpiVer;
	}

	public void setTpiVer(String tpiVer) {
		this.tpiVer = tpiVer;
	}

	@Column(name = "tpi_appstore_url", nullable = false, length = 50)
	public String getTpiAppstoreUrl() {
		return this.tpiAppstoreUrl;
	}

	public void setTpiAppstoreUrl(String tpiAppstoreUrl) {
		this.tpiAppstoreUrl = tpiAppstoreUrl;
	}

	@Column(name = "tpi_content", length = 500)
	public String getTpiContent() {
		return this.tpiContent;
	}

	public void setTpiContent(String tpiContent) {
		this.tpiContent = tpiContent;
	}

	@Column(name = "tpi_datatime", nullable = false, length = 19)
	public Timestamp getTpiDatatime() {
		return this.tpiDatatime;
	}

	public void setTpiDatatime(Timestamp tpiDatatime) {
		this.tpiDatatime = tpiDatatime;
	}

	@Column(name = "tpi_isforcedupd", nullable = false)
	public Short getTpiIsforcedupd() {
		return this.tpiIsforcedupd;
	}

	public void setTpiIsforcedupd(Short tpiIsforcedupd) {
		this.tpiIsforcedupd = tpiIsforcedupd;
	}

}