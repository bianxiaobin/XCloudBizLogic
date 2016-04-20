package com.xc.bl.vc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.VerificationCode;
import com.xc.bl.utils.SpringUtils;
import com.xc.bl.vc.dao.IVerifyCodeDao;
import com.xc.bl.vc.service.IVerifyCodeService;


@Service("verifyCodeService")
public class VerifyCodeServiceImpl implements IVerifyCodeService {

//	@Autowired
//	private IBaseDAO<VerificationCode> baseDAO;
	
	@Autowired
	private IVerifyCodeDao verifyCodeDao;
	
	@Override
	public void addVc(VerificationCode vc) {

		verifyCodeDao.addVc(vc);
//		baseDAO.save(vc);
		
//		VerificationCodeDAO verificationCodeDao = new VerificationCodeDAO();
//		Session session = HibernateSessionFactory.getSession();
//		Transaction tx = session.getTransaction();
//		try {
//			tx.begin();
//			verificationCodeDao.save(vc);
//			tx.commit();
//		} catch (Exception ex) {
//			tx.rollback();
//		} finally {
//			session.close();
//		}
	}

	@Override
	public VerificationCode getVcLastByPhone(long phoneNum) {
		
		return verifyCodeDao.getVcLastByPhone(phoneNum);
		
//		IVerifyCodeDao iVcDao=SpringUtils.getBean("verifyCodeDao");
//		return iVcDao.getVcLastByPhone(phoneNum);
		
//		IVerifyCodeDao iVcDao=new VerifyCodeDaoImpl();
//		return iVcDao.getVcLastByPhone(phoneNum);
	}

	@Override
	public VerificationCode getVcFirstByPhoneVc(long phoneNum, String vc) {
		
		return verifyCodeDao.getVcFirstByPhoneVc(phoneNum, vc);
		
//		IVerifyCodeDao iVcDao=SpringUtils.getBean("verifyCodeDao");
//		return iVcDao.getVcFirstByPhoneVc(phoneNum, vc);
		
//		IVerifyCodeDao iVcDao=new VerifyCodeDaoImpl();
//		return iVcDao.getVcFirstByPhoneVc(phoneNum, vc);
	}

}
