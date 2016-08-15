package com.xc.bl.vc.dao.impl;

import java.util.Calendar;
import java.util.Date;
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
		
	}

	@Override
	public VerificationCode getVcFirstByPhoneVc(long phoneNum, String vc) {
		String hql="from VerificationCode where vcPhone=:vcPhone and "
				+ "vcValue=:vcValue and vcSendDatetime>:vcSendDatetime order by vcId asc";
		
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("vcPhone", phoneNum);
		param.put("vcValue", vc);
		Calendar cal=Calendar.getInstance();
		cal.setTime(CommonUtils.getTimestampNow());
		cal.add(Calendar.HOUR, -2);
		param.put("vcSendDatetime", cal.getTime());
		
		return baseDAO.get(hql, param);
		
	}
	
	@Override
	public long getCountByDate(Calendar begin, Calendar end) {
		//logger.debug("开始时间 -> "+begin.getTime().toString()+"  结束时间 -> "+end.getTime().toString());
		return baseDAO.count("select count(*) from VerificationCode where vcSendDatetime>? and vcSendDatetime<? ",new Object[]{begin.getTime(),end.getTime()});
	}
	
	@Override
	public long getSendCount(long phoneNum, Calendar begin, Calendar end) {
		return baseDAO.count("select count(*) from VerificationCode where vcSendDatetime>? and vcSendDatetime<? and vcPhone=? ",new Object[]{begin.getTime(),end.getTime(),phoneNum});
	}


	@Override
	public void addVc(VerificationCode vc) {
		baseDAO.save(vc);
	}

	@Override
	public void updVc(VerificationCode vc) {
		baseDAO.update(vc);
	}

}
