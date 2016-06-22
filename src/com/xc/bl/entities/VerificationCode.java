package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VerificationCode entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "verification_code", catalog = "xcdb")
public class VerificationCode implements java.io.Serializable {

	// Fields

	private Long vcId;
	private Long vcPhone;
	private String vcValue;
	private String vcSendResult;
	private Timestamp vcSendDatetime;

	// Constructors

	/** default constructor */
	public VerificationCode() {
	}

	/** minimal constructor */
	public VerificationCode(Long vcPhone, String vcValue,
			Timestamp vcSendDatetime) {
		this.vcPhone = vcPhone;
		this.vcValue = vcValue;
		this.vcSendDatetime = vcSendDatetime;
	}

	/** full constructor */
	public VerificationCode(Long vcPhone, String vcValue, String vcSendResult,
			Timestamp vcSendDatetime) {
		this.vcPhone = vcPhone;
		this.vcValue = vcValue;
		this.vcSendResult = vcSendResult;
		this.vcSendDatetime = vcSendDatetime;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "vc_id", unique = true, nullable = false)
	public Long getVcId() {
		return this.vcId;
	}

	public void setVcId(Long vcId) {
		this.vcId = vcId;
	}

	@Column(name = "vc_phone", nullable = false)
	public Long getVcPhone() {
		return this.vcPhone;
	}

	public void setVcPhone(Long vcPhone) {
		this.vcPhone = vcPhone;
	}

	@Column(name = "vc_value", nullable = false, length = 10)
	public String getVcValue() {
		return this.vcValue;
	}

	public void setVcValue(String vcValue) {
		this.vcValue = vcValue;
	}

	@Column(name = "vc_send_result", length = 200)
	public String getVcSendResult() {
		return this.vcSendResult;
	}

	public void setVcSendResult(String vcSendResult) {
		this.vcSendResult = vcSendResult;
	}

	@Column(name = "vc_send_datetime", nullable = false, length = 19)
	public Timestamp getVcSendDatetime() {
		return this.vcSendDatetime;
	}

	public void setVcSendDatetime(Timestamp vcSendDatetime) {
		this.vcSendDatetime = vcSendDatetime;
	}

	@Override
	public String toString() {
		return "VerificationCode [vcId=" + vcId + ", vcPhone=" + vcPhone
				+ ", vcValue=" + vcValue + ", vcSendResult=" + vcSendResult
				+ ", vcSendDatetime=" + vcSendDatetime + "]";
	}

}