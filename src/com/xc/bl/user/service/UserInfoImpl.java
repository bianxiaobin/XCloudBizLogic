package com.xc.bl.user.service;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.User;
import com.xc.bl.pojo.UserDAO;
import com.xc.bl.user.dao.IUserInfoDao;
import com.xc.bl.user.dao.UserInfoDaoImpl;

public class UserInfoImpl implements IUserInfo{
    public static Logger logger=Logger.getLogger(UserInfoImpl.class);
    
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		UserDAO userDao = new UserDAO();
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		try {
			userDao.save(user);
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();
		}
		return user;
	}

	@Override
	public User getUserById(long uid) {
		// TODO Auto-generated method stub
		UserDAO userDao=new UserDAO();
		return userDao.findById(uid);
	}

	@Override
	public User getUserByPhone(long phoneNum) {
		// TODO Auto-generated method stub
		UserDAO userDao=new UserDAO();
		List<User> user_list=userDao.findByUserPhone(phoneNum);
		if(user_list==null || user_list.isEmpty()){
			return null;
		}
		return user_list.get(0);
	}

	@Override
	public int UpdLastLoginTime(long uid) {
		// TODO Auto-generated method stub
		IUserInfoDao iUserInfoDao=new UserInfoDaoImpl();
		return iUserInfoDao.updLastLoginTime(uid);
	}

}
