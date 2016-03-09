package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * VerificationCode entity. @author MyEclipse Persistence Tools
 */

public class VerificationCode implements java.io.Serializable {

	// Fields

	private Long vcId;
	private Long vcPhone;
	private String vcValue;
	private Timestamp vcSendDatetime;

	// Constructors

	/** default constructor */
	public VerificationCode() {
	}

	/** full constructor */
	public VerificationCode(Long vcPhone, String vcValue,
			Timestamp vcSendDatetime) {
		this.vcPhone = vcPhone;
		this.vcValue = vcValue;
		this.vcSendDatetime = vcSendDatetime;
	}

	// Property accessors

	public Long getVcId() {
		return this.vcId;
	}

	public void setVcId(Long vcId) {
		this.vcId = vcId;
	}

	public Long getVcPhone() {
		return this.vcPhone;
	}

	public void setVcPhone(Long vcPhone) {
		this.vcPhone = vcPhone;
	}

	public String getVcValue() {
		return this.vcValue;
	}

	public void setVcValue(String vcValue) {
		this.vcValue = vcValue;
	}

	public Timestamp getVcSendDatetime() {
		return this.vcSendDatetime;
	}

	public void setVcSendDatetime(Timestamp vcSendDatetime) {
		this.vcSendDatetime = vcSendDatetime;
	}

}