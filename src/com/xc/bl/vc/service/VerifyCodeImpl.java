package com.xc.bl.vc.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.VerificationCode;
import com.xc.bl.pojo.VerificationCodeDAO;
import com.xc.bl.vc.dao.IVerifyCodeDao;
import com.xc.bl.vc.dao.VerifyCodeDaoImpl;


public class VerifyCodeImpl implements IVerifyCode {

	@Override
	public void addVc(VerificationCode vc) {
		// TODO Auto-generated method stub
		VerificationCodeDAO verificationCodeDao = new VerificationCodeDAO();
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			verificationCodeDao.save(vc);
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();
		}
	}

	@Override
	public VerificationCode getVcLastByPhone(long phoneNum) {
		IVerifyCodeDao iVcDao=new VerifyCodeDaoImpl();
		return iVcDao.getVcLastByPhone(phoneNum);
	}

	@Override
	public VerificationCode getVcFirstByPhoneVc(long phoneNum, String vc) {
		IVerifyCodeDao iVcDao=new VerifyCodeDaoImpl();
		return iVcDao.getVcFirstByPhoneVc(phoneNum, vc);
	}

}
