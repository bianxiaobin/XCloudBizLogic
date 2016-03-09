package com.xc.bl.user.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.UserLog;
import com.xc.bl.pojo.UserLogDAO;


public class UserLogInfoImpl implements IUserLogInfo{

	@Override
	public UserLog addUserLog(UserLog user_log) {
		// TODO Auto-generated method stub
		UserLogDAO userLogDao=new UserLogDAO();
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			userLogDao.save(user_log);
			tx.commit();
		}
		catch(Exception e){
			tx.rollback();
		}
		finally{
			session.close();
		}
		return user_log;
	}
}
