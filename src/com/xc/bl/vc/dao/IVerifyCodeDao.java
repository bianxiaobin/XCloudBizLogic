package com.xc.bl.vc.dao;

import com.xc.bl.pojo.VerificationCode;

public interface IVerifyCodeDao {
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