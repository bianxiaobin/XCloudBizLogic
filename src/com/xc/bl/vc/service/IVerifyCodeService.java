package com.xc.bl.vc.service;

import java.util.Calendar;

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
	
	/**
	 * 更新验证码信息
	 * @param vc
	 */
	public void updVc(VerificationCode vc);
	
	/**
	 * 获得指定时间范围发送总条数
	 * @param begin
	 * @param end
	 * @return
	 */
	public long getCountByDate(Calendar begin,Calendar end);
	
	
	/**
	 * 获得指定时间范围手机号发送的总条数
	 * @param phoneNum
	 * @param begin
	 * @param end
	 * @return
	 */
	public long getSendCount(long phoneNum,Calendar begin,Calendar end);
	
	
}
