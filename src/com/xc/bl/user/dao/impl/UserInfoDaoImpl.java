package com.xc.bl.user.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.User;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.dao.IUserInfoDao;
import com.xc.bl.utils.CommonUtils;

@Repository("userInfoDao")
public class UserInfoDaoImpl  implements IUserInfoDao{
	public static Logger logger=Logger.getLogger(UserInfoDaoImpl.class);
	
	@Autowired
	private IBaseDAO<User> baseDAO;
	
	@Override
	public int updLastLoginTime(long uid) {
		int updCount = -1;
		//String sql = "UPDATE `user` SET user_datetime_access_last=:user_datetime_access_last WHERE user_id=:user_id";
		String hql="update User user set user.user_datetime_access_last=:user_datetime_access_last where user.user_id=:user_id";
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("user_datetime_access_last",CommonUtils.getTimestampNow());
		param.put("user_id",uid);
		return baseDAO.executeHql(hql, param);
		
		
		
//		int updCount = -1;
//		String sql = "UPDATE `user` SET user_datetime_access_last=:user_datetime_access_last WHERE user_id=:user_id";
//		Session session = HibernateSessionFactory.getSession();
//		Transaction tx = session.getTransaction();
//		try {
//			Query query = session.createSQLQuery(sql);
//			query.setTimestamp("user_datetime_access_last", CommonUtils.getTimestampNow());
//			query.setLong("user_id", uid);
//			tx.begin();
//			updCount = query.executeUpdate();
//			tx.commit();
//		} catch (Exception ex) {
//			tx.rollback();
//		} finally {
//			session.close();
//		}
//		return updCount;
	}

	@Override
	public User addUser(User user) {
		
		baseDAO.save(user);
		return user;
		
//		UserDAO userDao = new UserDAO();
//		Session session = HibernateSessionFactory.getSession();
//		Transaction tx = session.beginTransaction();
//		try {
//			userDao.save(user);
//			tx.commit();
//		} catch (Exception ex) {
//			tx.rollback();
//		} finally {
//			session.close();
//		}
//		return user;
	}

	@Override
	public User getUserById(long uid) {
		
		return baseDAO.get("from User where userId=?", new Object[]{uid});
		
//		UserDAO userDao=new UserDAO();
//		return userDao.findById(uid);
	}

	@Override
	public User getUserByPhone(long phoneNum) {
		
		return baseDAO.get("from User where userPhone=?", new Object[]{phoneNum});
		
//		UserDAO userDao=new UserDAO();
//		List<User> user_list=userDao.findByUserPhone(phoneNum);
//		if(user_list==null || user_list.isEmpty()){
//			return null;
//		}
//		return user_list.get(0);
	}
	
}
