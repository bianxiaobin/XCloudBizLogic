package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * TappVerSupport entity. @author MyEclipse Persistence Tools
 */

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

	public Integer getTvSupportId() {
		return this.tvSupportId;
	}

	public void setTvSupportId(Integer tvSupportId) {
		this.tvSupportId = tvSupportId;
	}

	public Integer getTappPhoneId() {
		return this.tappPhoneId;
	}

	public void setTappPhoneId(Integer tappPhoneId) {
		this.tappPhoneId = tappPhoneId;
	}

	public Integer getTappCarId() {
		return this.tappCarId;
	}

	public void setTappCarId(Integer tappCarId) {
		this.tappCarId = tappCarId;
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