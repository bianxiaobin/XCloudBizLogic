package com.xc.bl.pojo;

/**
 * Config entity. @author MyEclipse Persistence Tools
 */

public class Config implements java.io.Serializable {

	// Fields

	private Integer configId;
	private String cfgName;
	private String cfgValue;

	// Constructors

	/** default constructor */
	public Config() {
	}

	/** minimal constructor */
	public Config(String cfgName) {
		this.cfgName = cfgName;
	}

	/** full constructor */
	public Config(String cfgName, String cfgValue) {
		this.cfgName = cfgName;
		this.cfgValue = cfgValue;
	}

	// Property accessors

	public Integer getConfigId() {
		return this.configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}

	public String getCfgName() {
		return this.cfgName;
	}

	public void setCfgName(String cfgName) {
		this.cfgName = cfgName;
	}

	public String getCfgValue() {
		return this.cfgValue;
	}

	public void setCfgValue(String cfgValue) {
		this.cfgValue = cfgValue;
	}

}