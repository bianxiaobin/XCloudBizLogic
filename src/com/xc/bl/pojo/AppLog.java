package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * AppLog entity. @author MyEclipse Persistence Tools
 */

public class AppLog implements java.io.Serializable {

	// Fields

	private Long appLogId;
	private Long userId;
	private Long appUpdId;
	private Boolean appLogOpt;
	private Timestamp appLogOptDatatime;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public AppLog() {
	}

	/** minimal constructor */
	public AppLog(Long userId, Long appUpdId, Boolean appLogOpt,
			Timestamp appLogOptDatatime, Timestamp dbCreatetime) {
		this.userId = userId;
		this.appUpdId = appUpdId;
		this.appLogOpt = appLogOpt;
		this.appLogOptDatatime = appLogOptDatatime;
		this.dbCreatetime = dbCreatetime;
	}

	/** full constructor */
	public AppLog(Long userId, Long appUpdId, Boolean appLogOpt,
			Timestamp appLogOptDatatime, Timestamp dbCreatetime,
			Timestamp dbUpdatetime, Boolean dbDelete) {
		this.userId = userId;
		this.appUpdId = appUpdId;
		this.appLogOpt = appLogOpt;
		this.appLogOptDatatime = appLogOptDatatime;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors

	public Long getAppLogId() {
		return this.appLogId;
	}

	public void setAppLogId(Long appLogId) {
		this.appLogId = appLogId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getAppUpdId() {
		return this.appUpdId;
	}

	public void setAppUpdId(Long appUpdId) {
		this.appUpdId = appUpdId;
	}

	public Boolean getAppLogOpt() {
		return this.appLogOpt;
	}

	public void setAppLogOpt(Boolean appLogOpt) {
		this.appLogOpt = appLogOpt;
	}

	public Timestamp getAppLogOptDatatime() {
		return this.appLogOptDatatime;
	}

	public void setAppLogOptDatatime(Timestamp appLogOptDatatime) {
		this.appLogOptDatatime = appLogOptDatatime;
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