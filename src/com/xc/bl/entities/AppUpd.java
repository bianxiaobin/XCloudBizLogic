package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AppUpd entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "app_upd", catalog = "xcdb")
public class AppUpd implements java.io.Serializable {

	// Fields

	private Long appUpdId;
	private Integer appId;
	private String appUpdReadme;
	private Integer appUpdVercode;
	private String appUpdVersion;
	private Timestamp appUpdDatatime;
	private Long appUpdSize;
	private String appUpdPackageName;
	private String appUpdPkgSpace;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public AppUpd() {
	}

	/** minimal constructor */
	public AppUpd(Integer appId, Integer appUpdVercode, String appUpdVersion,
			Timestamp appUpdDatatime, Long appUpdSize,
			String appUpdPackageName, String appUpdPkgSpace) {
		this.appId = appId;
		this.appUpdVercode = appUpdVercode;
		this.appUpdVersion = appUpdVersion;
		this.appUpdDatatime = appUpdDatatime;
		this.appUpdSize = appUpdSize;
		this.appUpdPackageName = appUpdPackageName;
		this.appUpdPkgSpace = appUpdPkgSpace;
	}

	/** full constructor */
	public AppUpd(Integer appId, String appUpdReadme, Integer appUpdVercode,
			String appUpdVersion, Timestamp appUpdDatatime, Long appUpdSize,
			String appUpdPackageName, String appUpdPkgSpace,
			Timestamp dbCreatetime, Timestamp dbUpdatetime, Boolean dbDelete) {
		this.appId = appId;
		this.appUpdReadme = appUpdReadme;
		this.appUpdVercode = appUpdVercode;
		this.appUpdVersion = appUpdVersion;
		this.appUpdDatatime = appUpdDatatime;
		this.appUpdSize = appUpdSize;
		this.appUpdPackageName = appUpdPackageName;
		this.appUpdPkgSpace = appUpdPkgSpace;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "app_upd_id", unique = true, nullable = false)
	public Long getAppUpdId() {
		return this.appUpdId;
	}

	public void setAppUpdId(Long appUpdId) {
		this.appUpdId = appUpdId;
	}

	@Column(name = "app_id", nullable = false)
	public Integer getAppId() {
		return this.appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	@Column(name = "app_upd_readme", length = 500)
	public String getAppUpdReadme() {
		return this.appUpdReadme;
	}

	public void setAppUpdReadme(String appUpdReadme) {
		this.appUpdReadme = appUpdReadme;
	}

	@Column(name = "app_upd_vercode", nullable = false)
	public Integer getAppUpdVercode() {
		return this.appUpdVercode;
	}

	public void setAppUpdVercode(Integer appUpdVercode) {
		this.appUpdVercode = appUpdVercode;
	}

	@Column(name = "app_upd_version", nullable = false, length = 20)
	public String getAppUpdVersion() {
		return this.appUpdVersion;
	}

	public void setAppUpdVersion(String appUpdVersion) {
		this.appUpdVersion = appUpdVersion;
	}

	@Column(name = "app_upd_datatime", nullable = false, length = 19)
	public Timestamp getAppUpdDatatime() {
		return this.appUpdDatatime;
	}

	public void setAppUpdDatatime(Timestamp appUpdDatatime) {
		this.appUpdDatatime = appUpdDatatime;
	}

	@Column(name = "app_upd_size", nullable = false)
	public Long getAppUpdSize() {
		return this.appUpdSize;
	}

	public void setAppUpdSize(Long appUpdSize) {
		this.appUpdSize = appUpdSize;
	}

	@Column(name = "app_upd_package_name", nullable = false, length = 50)
	public String getAppUpdPackageName() {
		return this.appUpdPackageName;
	}

	public void setAppUpdPackageName(String appUpdPackageName) {
		this.appUpdPackageName = appUpdPackageName;
	}

	@Column(name = "app_upd_pkg_space", nullable = false, length = 50)
	public String getAppUpdPkgSpace() {
		return this.appUpdPkgSpace;
	}

	public void setAppUpdPkgSpace(String appUpdPkgSpace) {
		this.appUpdPkgSpace = appUpdPkgSpace;
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

	@Override
	public String toString() {
		return "AppUpd [appUpdId=" + appUpdId + ", appId=" + appId
				+ ", appUpdReadme=" + appUpdReadme + ", appUpdVercode="
				+ appUpdVercode + ", appUpdVersion=" + appUpdVersion
				+ ", appUpdDatatime=" + appUpdDatatime + ", appUpdSize="
				+ appUpdSize + ", appUpdPackageName=" + appUpdPackageName
				+ ", appUpdPkgSpace=" + appUpdPkgSpace + ", dbCreatetime="
				+ dbCreatetime + ", dbUpdatetime=" + dbUpdatetime
				+ ", dbDelete=" + dbDelete + "]";
	}

}