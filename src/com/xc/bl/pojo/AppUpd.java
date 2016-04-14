package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * AppUpd entity. @author MyEclipse Persistence Tools
 */

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

	public Long getAppUpdId() {
		return this.appUpdId;
	}

	public void setAppUpdId(Long appUpdId) {
		this.appUpdId = appUpdId;
	}

	public Integer getAppId() {
		return this.appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getAppUpdReadme() {
		return this.appUpdReadme;
	}

	public void setAppUpdReadme(String appUpdReadme) {
		this.appUpdReadme = appUpdReadme;
	}

	public Integer getAppUpdVercode() {
		return this.appUpdVercode;
	}

	public void setAppUpdVercode(Integer appUpdVercode) {
		this.appUpdVercode = appUpdVercode;
	}

	public String getAppUpdVersion() {
		return this.appUpdVersion;
	}

	public void setAppUpdVersion(String appUpdVersion) {
		this.appUpdVersion = appUpdVersion;
	}

	public Timestamp getAppUpdDatatime() {
		return this.appUpdDatatime;
	}

	public void setAppUpdDatatime(Timestamp appUpdDatatime) {
		this.appUpdDatatime = appUpdDatatime;
	}

	public Long getAppUpdSize() {
		return this.appUpdSize;
	}

	public void setAppUpdSize(Long appUpdSize) {
		this.appUpdSize = appUpdSize;
	}

	public String getAppUpdPackageName() {
		return this.appUpdPackageName;
	}

	public void setAppUpdPackageName(String appUpdPackageName) {
		this.appUpdPackageName = appUpdPackageName;
	}

	public String getAppUpdPkgSpace() {
		return this.appUpdPkgSpace;
	}

	public void setAppUpdPkgSpace(String appUpdPkgSpace) {
		this.appUpdPkgSpace = appUpdPkgSpace;
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