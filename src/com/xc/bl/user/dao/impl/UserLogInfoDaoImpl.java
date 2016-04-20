package com.xc.bl.user.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.UserLog;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.dao.IUserLogInfoDao;


@Repository("userLoginfoDao")
public class UserLogInfoDaoImpl implements IUserLogInfoDao{

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
