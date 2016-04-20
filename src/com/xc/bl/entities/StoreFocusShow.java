package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StoreFocusShow entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "store_focus_show", catalog = "xcdb")
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
	@Id
	@GeneratedValue
	@Column(name = "store_fs_id", unique = true, nullable = false)
	public Integer getStoreFsId() {
		return this.storeFsId;
	}

	public void setStoreFsId(Integer storeFsId) {
		this.storeFsId = storeFsId;
	}

	@Column(name = "store_fs_img", nullable = false, length = 100)
	public String getStoreFsImg() {
		return this.storeFsImg;
	}

	public void setStoreFsImg(String storeFsImg) {
		this.storeFsImg = storeFsImg;
	}

	@Column(name = "store_fs_type", nullable = false)
	public Short getStoreFsType() {
		return this.storeFsType;
	}

	public void setStoreFsType(Short storeFsType) {
		this.storeFsType = storeFsType;
	}

	@Column(name = "store_fs_data", nullable = false, length = 100)
	public String getStoreFsData() {
		return this.storeFsData;
	}

	public void setStoreFsData(String storeFsData) {
		this.storeFsData = storeFsData;
	}

	@Column(name = "store_fs_pos", nullable = false)
	public Short getStoreFsPos() {
		return this.storeFsPos;
	}

	public void setStoreFsPos(Short storeFsPos) {
		this.storeFsPos = storeFsPos;
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
	public Short getDbDelete() {
		return this.dbDelete;
	}

	public void setDbDelete(Short dbDelete) {
		this.dbDelete = dbDelete;
	}

}