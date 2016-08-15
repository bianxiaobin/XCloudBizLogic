package com.xc.bl.vc.service.impl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.VerificationCode;
import com.xc.bl.vc.dao.IVerifyCodeDao;
import com.xc.bl.vc.service.IVerifyCodeService;

@Service("verifyCodeService")
public class VerifyCodeServiceImpl implements IVerifyCodeService {

	@Autowired
	private IVerifyCodeDao verifyCodeDao;

	@Override
	public void addVc(VerificationCode vc) {

		verifyCodeDao.addVc(vc);

	}

	@Override
	public VerificationCode getVcLastByPhone(long phoneNum) {

		return verifyCodeDao.getVcLastByPhone(phoneNum);

	}

	@Override
	public VerificationCode getVcFirstByPhoneVc(long phoneNum, String vc) {

		return verifyCodeDao.getVcFirstByPhoneVc(phoneNum, vc);

	}

	@Override
	public void updVc(VerificationCode vc) {
		verifyCodeDao.updVc(vc);
	}

	@Override
	public long getCountByDate(Calendar begin, Calendar end) {
		return verifyCodeDao.getCountByDate(begin, end);
	}

	@Override
	public long getSendCount(long phoneNum, Calendar begin, Calendar end) {
		return verifyCodeDao.getSendCount(phoneNum, begin, end);
	}

}
