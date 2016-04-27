package com.xc.bl.vc.service.impl;

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

}