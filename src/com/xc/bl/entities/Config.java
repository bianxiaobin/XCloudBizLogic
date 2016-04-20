package com.xc.bl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Config entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "config", catalog = "xcdb", uniqueConstraints = @UniqueConstraint(columnNames = "cfg_name"))
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
	@Id
	@GeneratedValue
	@Column(name = "config_id", unique = true, nullable = false)
	public Integer getConfigId() {
		return this.configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}

	@Column(name = "cfg_name", unique = true, nullable = false, length = 50)
	public String getCfgName() {
		return this.cfgName;
	}

	public void setCfgName(String cfgName) {
		this.cfgName = cfgName;
	}

	@Column(name = "cfg_value", length = 500)
	public String getCfgValue() {
		return this.cfgValue;
	}

	public void setCfgValue(String cfgValue) {
		this.cfgValue = cfgValue;
	}

}