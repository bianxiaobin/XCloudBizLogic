package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * App entity. @author MyEclipse Persistence Tools
 */

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

	public Integer getAppId() {
		return this.appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppIntroduce() {
		return this.appIntroduce;
	}

	public void setAppIntroduce(String appIntroduce) {
		this.appIntroduce = appIntroduce;
	}

	public String getAppCompany() {
		return this.appCompany;
	}

	public void setAppCompany(String appCompany) {
		this.appCompany = appCompany;
	}

	public Integer getAppTypeId() {
		return this.appTypeId;
	}

	public void setAppTypeId(Integer appTypeId) {
		this.appTypeId = appTypeId;
	}

	public String getAppCompatibility() {
		return this.appCompatibility;
	}

	public void setAppCompatibility(String appCompatibility) {
		this.appCompatibility = appCompatibility;
	}

	public Integer getAppGroup() {
		return this.appGroup;
	}

	public void setAppGroup(Integer appGroup) {
		this.appGroup = appGroup;
	}

	public Short getAppIspush() {
		return this.appIspush;
	}

	public void setAppIspush(Short appIspush) {
		this.appIspush = appIspush;
	}

	public Integer getAppLowestVercode() {
		return this.appLowestVercode;
	}

	public void setAppLowestVercode(Integer appLowestVercode) {
		this.appLowestVercode = appLowestVercode;
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