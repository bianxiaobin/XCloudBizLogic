package com.xc.bl.user.service.impl;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.User;
import com.xc.bl.user.dao.IUserInfoDao;
import com.xc.bl.user.service.IUserInfoService;
import com.xc.bl.utils.SpringUtils;

@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService{
    public static Logger logger=Logger.getLogger(UserInfoServiceImpl.class);
    
//    @Autowired
//    private IBaseDAO<User> baseDAO;
    
    @Autowired
    private IUserInfoDao userInfoDao;
    
	@Override
	public User addUser(User user) {
		
		return userInfoDao.addUser(user);
//		baseDAO.save(user);
//		return user;
		
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
		
		return userInfoDao.getUserById(uid);
//		return baseDAO.get("from User where userId=?", new Object[]{uid});
		
//		UserDAO userDao=new UserDAO();
//		return userDao.findById(uid);
	}

	@Override
	public User getUserByPhone(long phoneNum) {
		
		return userInfoDao.getUserByPhone(phoneNum);
//		return baseDAO.get("from User where userPhone=?", new Object[]{phoneNum});
		
//		UserDAO userDao=new UserDAO();
//		List<User> user_list=userDao.findByUserPhone(phoneNum);
//		if(user_list==null || user_list.isEmpty()){
//			return null;
//		}
//		return user_list.get(0);
	}

	@Override
	public int UpdLastLoginTime(long uid) {

		return userInfoDao.updLastLoginTime(uid);
//		IUserInfoDao iUserInfoDao=SpringUtils.getBean("userInfoDao");
//		
//		//IUserInfoDao iUserInfoDao=new UserInfoDaoImpl();
//		return iUserInfoDao.updLastLoginTime(uid);
	}

}
