package com.xc.bl.vc.service;

import com.xc.bl.entities.VerificationCode;

public interface IVerifyCodeService {
	/***
	 * 添加短信验证码发送信息
	 * @param vc
	 */
	public void addVc(VerificationCode vc);
	
	/**
	 * 获得用户最后发送的验证码
	 * @param phoneNum
	 * @return
	 */
	public VerificationCode getVcLastByPhone(long phoneNum);
	
	/**
	 * 获得用户发送指定验证码的最早发送时间
	 * @param phoneNum
	 * @param minute
	 * @return
	 */
	public VerificationCode getVcFirstByPhoneVc(long phoneNum,String vc);
}
