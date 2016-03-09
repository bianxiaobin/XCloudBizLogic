package com.xc.bl.vc.dao;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.VerificationCode;
import com.xc.bl.utils.CommonUtils;

public class VerifyCodeDaoImpl implements IVerifyCodeDao {
	public static Logger logger=Logger.getLogger(VerifyCodeDaoImpl.class);
	@Override
	public VerificationCode getVcLastByPhone(long phoneNum) {
		String hql = "from VerificationCode where vcPhone=:vcPhone order by vcId desc limit 1";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		query.setLong("vcPhone", phoneNum);
		query.setMaxResults(1);
		List<VerificationCode> vc_list = query.list();
		if (vc_list == null || vc_list.isEmpty()) {
			return null;
		}
		return vc_list.get(0);
	}

	@Override
	public VerificationCode getVcFirstByPhoneVc(long phoneNum, String vc) {
		String hql="from VerificationCode where vcPhone=:vcPhone and "
				+ "vcValue=:vcValue and vcSendDatetime>:vcSendDatetime order by vcId asc limit 1";
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery(hql);
		query.setLong("vcPhone", phoneNum);
		query.setString("vcValue", vc);
		Calendar cal=Calendar.getInstance();
		cal.setTime(CommonUtils.getTimestampNow());
		cal.add(Calendar.HOUR, -2);
		query.setTimestamp("vcSendDatetime", cal.getTime());
		logger.debug("getVcFirstByPhoneVc vcSendDatetime -> "+cal.getTime());
		query.setMaxResults(1);
		List<VerificationCode> vc_list=query.list();
		if(vc_list==null || vc_list.isEmpty()){
			return null;
		}
		return vc_list.get(0);
	}

}
