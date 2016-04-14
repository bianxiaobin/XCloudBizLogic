package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * StoreFocusShow entity. @author MyEclipse Persistence Tools
 */

public class StoreFocusShow implements java.io.Serializable {

	// Fields

	private Integer storeFsId;
	private String storeFsImg;
	private Short storeFsType;
	private String storeFsData;
	private Short storeFsPos;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Short dbDelete;

	// Constructors

	/** default constructor */
	public StoreFocusShow() {
	}

	/** minimal constructor */
	public StoreFocusShow(String storeFsImg, Short storeFsType,
			String storeFsData, Short storeFsPos, Timestamp dbCreatetime) {
		this.storeFsImg = storeFsImg;
		this.storeFsType = storeFsType;
		this.storeFsData = storeFsData;
		this.storeFsPos = storeFsPos;
		this.dbCreatetime = dbCreatetime;
	}

	/** full constructor */
	public StoreFocusShow(String storeFsImg, Short storeFsType,
			String storeFsData, Short storeFsPos, Timestamp dbCreatetime,
			Timestamp dbUpdatetime, Short dbDelete) {
		this.storeFsImg = storeFsImg;
		this.storeFsType = storeFsType;
		this.storeFsData = storeFsData;
		this.storeFsPos = storeFsPos;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors

	public Integer getStoreFsId() {
		return this.storeFsId;
	}

	public void setStoreFsId(Integer storeFsId) {
		this.storeFsId = storeFsId;
	}

	public String getStoreFsImg() {
		return this.storeFsImg;
	}

	public void setStoreFsImg(String storeFsImg) {
		this.storeFsImg = storeFsImg;
	}

	public Short getStoreFsType() {
		return this.storeFsType;
	}

	public void setStoreFsType(Short storeFsType) {
		this.storeFsType = storeFsType;
	}

	public String getStoreFsData() {
		return this.storeFsData;
	}

	public void setStoreFsData(String storeFsData) {
		this.storeFsData = storeFsData;
	}

	public Short getStoreFsPos() {
		return this.storeFsPos;
	}

	public void setStoreFsPos(Short storeFsPos) {
		this.storeFsPos = storeFsPos;
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

	public Short getDbDelete() {
		return this.dbDelete;
	}

	public void setDbDelete(Short dbDelete) {
		this.dbDelete = dbDelete;
	}

}