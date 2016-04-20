package com.xc.bl.user.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.UserLog;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.service.IUserLogInfoService;


@Service("userLoginfoService")
public class UserLogInfoServiceImpl implements IUserLogInfoService{

	@Autowired
	private IBaseDAO<UserLog> baseDAO;
	
	@Override
	public UserLog addUserLog(UserLog user_log) {

		baseDAO.save(user_log);
		return user_log;
		
		
//		UserLogDAO userLogDao=new UserLogDAO();
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//			userLogDao.save(user_log);
//			tx.commit();
//		}
//		catch(Exception e){
//			tx.rollback();
//		}
//		finally{
//			session.close();
//		}
//		return user_log;
	}
}
