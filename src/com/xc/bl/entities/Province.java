package com.xc.bl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Province entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "province", catalog = "xcdb", uniqueConstraints = @UniqueConstraint(columnNames = "province_name"))
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
	@Id
	@GeneratedValue
	@Column(name = "province_id", unique = true, nullable = false)
	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	@Column(name = "province_name", unique = true, nullable = false, length = 50)
	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	@Column(name = "province_show_name", nullable = false, length = 50)
	public String getProvinceShowName() {
		return this.provinceShowName;
	}

	public void setProvinceShowName(String provinceShowName) {
		this.provinceShowName = provinceShowName;
	}

}