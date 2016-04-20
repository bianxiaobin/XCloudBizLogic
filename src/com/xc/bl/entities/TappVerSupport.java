package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TappVerSupport entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tapp_ver_support", catalog = "xcdb")
public class TappVerSupport implements java.io.Serializable {

	// Fields

	private Integer tvSupportId;
	private Integer tappPhoneId;
	private Integer tappCarId;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public TappVerSupport() {
	}

	/** minimal constructor */
	public TappVerSupport(Integer tappPhoneId, Integer tappCarId) {
		this.tappPhoneId = tappPhoneId;
		this.tappCarId = tappCarId;
	}

	/** full constructor */
	public TappVerSupport(Integer tappPhoneId, Integer tappCarId,
			Timestamp dbCreatetime, Timestamp dbUpdatetime, Boolean dbDelete) {
		this.tappPhoneId = tappPhoneId;
		this.tappCarId = tappCarId;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "tv_support_id", unique = true, nullable = false)
	public Integer getTvSupportId() {
		return this.tvSupportId;
	}

	public void setTvSupportId(Integer tvSupportId) {
		this.tvSupportId = tvSupportId;
	}

	@Column(name = "tapp_phone_id", nullable = false)
	public Integer getTappPhoneId() {
		return this.tappPhoneId;
	}

	public void setTappPhoneId(Integer tappPhoneId) {
		this.tappPhoneId = tappPhoneId;
	}

	@Column(name = "tapp_car_id", nullable = false)
	public Integer getTappCarId() {
		return this.tappCarId;
	}

	public void setTappCarId(Integer tappCarId) {
		this.tappCarId = tappCarId;
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