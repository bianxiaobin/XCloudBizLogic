package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * App entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "app", catalog = "xcdb")
public class App implements java.io.Serializable {

	// Fields

	private Integer appId;
	private String appName;
	private String appIntroduce;
	private String appCompany;
	private Integer appTypeId;
	private String appCompatibility;
	private Integer appGroup;
	private Short appIspush;
	private Integer appLowestVercode;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public App() {
	}

	/** minimal constructor */
	public App(String appName, Integer appTypeId, Integer appGroup,
			Short appIspush, Integer appLowestVercode) {
		this.appName = appName;
		this.appTypeId = appTypeId;
		this.appGroup = appGroup;
		this.appIspush = appIspush;
		this.appLowestVercode = appLowestVercode;
	}

	/** full constructor */
	public App(String appName, String appIntroduce, String appCompany,
			Integer appTypeId, String appCompatibility, Integer appGroup,
			Short appIspush, Integer appLowestVercode, Timestamp dbCreatetime,
			Timestamp dbUpdatetime, Boolean dbDelete) {
		this.appName = appName;
		this.appIntroduce = appIntroduce;
		this.appCompany = appCompany;
		this.appTypeId = appTypeId;
		this.appCompatibility = appCompatibility;
		this.appGroup = appGroup;
		this.appIspush = appIspush;
		this.appLowestVercode = appLowestVercode;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}


	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "app_id", unique = true, nullable = false)
	public Integer getAppId() {
		return this.appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	@Column(name = "app_name", nullable = false, length = 50)
	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	@Column(name = "app_introduce", length = 500)
	public String getAppIntroduce() {
		return this.appIntroduce;
	}

	public void setAppIntroduce(String appIntroduce) {
		this.appIntroduce = appIntroduce;
	}

	@Column(name = "app_company", length = 50)
	public String getAppCompany() {
		return this.appCompany;
	}

	public void setAppCompany(String appCompany) {
		this.appCompany = appCompany;
	}

	@Column(name = "app_type_id", nullable = false)
	public Integer getAppTypeId() {
		return this.appTypeId;
	}

	public void setAppTypeId(Integer appTypeId) {
		this.appTypeId = appTypeId;
	}

	@Column(name = "app_compatibility", length = 500)
	public String getAppCompatibility() {
		return this.appCompatibility;
	}

	public void setAppCompatibility(String appCompatibility) {
		this.appCompatibility = appCompatibility;
	}

	@Column(name = "app_group", nullable = false)
	public Integer getAppGroup() {
		return this.appGroup;
	}

	public void setAppGroup(Integer appGroup) {
		this.appGroup = appGroup;
	}

	@Column(name = "app_ispush", nullable = false)
	public Short getAppIspush() {
		return this.appIspush;
	}

	public void setAppIspush(Short appIspush) {
		this.appIspush = appIspush;
	}

	@Column(name = "app_lowest_vercode", nullable = false)
	public Integer getAppLowestVercode() {
		return this.appLowestVercode;
	}

	public void setAppLowestVercode(Integer appLowestVercode) {
		this.appLowestVercode = appLowestVercode;
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
		return "App [appId=" + appId + ", appName=" + appName
				+ ", appIntroduce=" + appIntroduce + ", appCompany="
				+ appCompany + ", appTypeId=" + appTypeId
				+ ", appCompatibility=" + appCompatibility + ", appGroup="
				+ appGroup + ", appIspush=" + appIspush + ", appLowestVercode="
				+ appLowestVercode + ", dbCreatetime=" + dbCreatetime
				+ ", dbUpdatetime=" + dbUpdatetime + ", dbDelete=" + dbDelete
				+ "]";
	}

}