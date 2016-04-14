package com.xc.bl.pojo;

/**
 * Province entity. @author MyEclipse Persistence Tools
 */

public class Province implements java.io.Serializable {

	// Fields

	private Integer provinceId;
	private String provinceName;
	private String provinceShowName;

	// Constructors

	/** default constructor */
	public Province() {
	}

	/** full constructor */
	public Province(String provinceName, String provinceShowName) {
		this.provinceName = provinceName;
		this.provinceShowName = provinceShowName;
	}

	// Property accessors

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceShowName() {
		return this.provinceShowName;
	}

	public void setProvinceShowName(String provinceShowName) {
		this.provinceShowName = provinceShowName;
	}

}