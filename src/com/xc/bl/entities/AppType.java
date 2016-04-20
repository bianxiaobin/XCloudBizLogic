package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AppType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "app_type", catalog = "xcdb")
public class AppType implements java.io.Serializable {

	// Fields

	private Integer appTypeId;
	private String appTypeName;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public AppType() {
	}

	/** minimal constructor */
	public AppType(String appTypeName) {
		this.appTypeName = appTypeName;
	}

	/** full constructor */
	public AppType(String appTypeName, Timestamp dbCreatetime,
			Timestamp dbUpdatetime, Boolean dbDelete) {
		this.appTypeName = appTypeName;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "app_type_id", unique = true, nullable = false)
	public Integer getAppTypeId() {
		return this.appTypeId;
	}

	public void setAppTypeId(Integer appTypeId) {
		this.appTypeId = appTypeId;
	}

	@Column(name = "app_type_name", nullable = false, length = 50)
	public String getAppTypeName() {
		return this.appTypeName;
	}

	public void setAppTypeName(String appTypeName) {
		this.appTypeName = appTypeName;
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