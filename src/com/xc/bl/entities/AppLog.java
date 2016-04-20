package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AppLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "app_log", catalog = "xcdb")
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
	@Id
	@GeneratedValue
	@Column(name = "app_log_id", unique = true, nullable = false)
	public Long getAppLogId() {
		return this.appLogId;
	}

	public void setAppLogId(Long appLogId) {
		this.appLogId = appLogId;
	}

	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "app_upd_id", nullable = false)
	public Long getAppUpdId() {
		return this.appUpdId;
	}

	public void setAppUpdId(Long appUpdId) {
		this.appUpdId = appUpdId;
	}

	@Column(name = "app_log_opt", nullable = false)
	public Boolean getAppLogOpt() {
		return this.appLogOpt;
	}

	public void setAppLogOpt(Boolean appLogOpt) {
		this.appLogOpt = appLogOpt;
	}

	@Column(name = "app_log_opt_datatime", nullable = false, length = 19)
	public Timestamp getAppLogOptDatatime() {
		return this.appLogOptDatatime;
	}

	public void setAppLogOptDatatime(Timestamp appLogOptDatatime) {
		this.appLogOptDatatime = appLogOptDatatime;
	}

	@Column(name = "db_createtime", nullable = false, length = 19)
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