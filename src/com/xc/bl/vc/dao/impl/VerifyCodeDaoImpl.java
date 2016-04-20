package com.xc.bl.vc.dao.impl;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.VerificationCode;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.utils.CommonUtils;
import com.xc.bl.vc.dao.IVerifyCodeDao;

@Repository("verifyCodeDao")
public class VerifyCodeDaoImpl implements IVerifyCodeDao {
	
	public static Logger logger=Logger.getLogger(VerifyCodeDaoImpl.class);
	
	@Autowired
	private IBaseDAO<VerificationCode> baseDAO;
	
	@Override
	public VerificationCode getVcLastByPhone(long phoneNum) {
		String hql = "from VerificationCode where vcPhone=:vcPhone order by vcId desc ";
		
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("vcPhone", phoneNum);
		return baseDAO.get(hql, param);
		
//		Session session = HibernateSessionFactory.getSession();
//		Query query = session.createQuery(hql);
//		query.setLong("vcPhone", phoneNum);
//		query.setMaxResults(1);
//		List<VerificationCode> vc_list = query.list();
//		if (vc_list == null || vc_list.isEmpty()) {
//			return null;
//		}
//		return vc_list.get(0);
	}

	@Override
	public VerificationCode getVcFirstByPhoneVc(long phoneNum, String vc) {
		String hql="from VerificationCode where vcPhone=:vcPhone and "
				+ "vcValue=:vcValue and vcSendDatetime>:vcSendDatetime order by vcId asc limit 1";
		
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("vcPhone", phoneNum);
		param.put("vcValue", vc);
		Calendar cal=Calendar.getInstance();
		cal.setTime(CommonUtils.getTimestampNow());
		cal.add(Calendar.HOUR, -2);
		param.put("vcSendDatetime", cal.getTime());
		
		return baseDAO.get(hql, param);
		
		
//		Session session=HibernateSessionFactory.getSession();
//		Query query=session.createQuery(hql);
//		query.setLong("vcPhone", phoneNum);
//		query.setString("vcValue", vc);
//		Calendar cal=Calendar.getInstance();
//		cal.setTime(CommonUtils.getTimestampNow());
//		cal.add(Calendar.HOUR, -2);
//		query.setTimestamp("vcSendDatetime", cal.getTime());
//		logger.debug("getVcFirstByPhoneVc vcSendDatetime -> "+cal.getTime());
//		query.setMaxResults(1);
//		List<VerificationCode> vc_list=query.list();
//		if(vc_list==null || vc_list.isEmpty()){
//			return null;
//		}
//		return vc_list.get(0);
	}

	@Override
	public void addVc(VerificationCode vc) {
		// TODO Auto-generated method stub
		baseDAO.save(vc);
	}

}
