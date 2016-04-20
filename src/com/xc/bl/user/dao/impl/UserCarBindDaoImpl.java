package com.xc.bl.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.UserCarBind;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.dao.IUserCarBindDao;

@Repository("userCarBindDao")
public class UserCarBindDaoImpl implements IUserCarBindDao{

	@Autowired
	private IBaseDAO<UserCarBind> baseDAO;
	
	
	@Override
	public UserCarBind addUserCarBind(UserCarBind ucb) {
		
		baseDAO.save(ucb);
		return ucb;
		
//		UserCarBindDAO userCarBindDao = new UserCarBindDAO();
//		Session session = HibernateSessionFactory.getSession();
//		Transaction tx = session.getTransaction();
//		try {
//			tx.begin();
//			userCarBindDao.save(ucb);
//			tx.commit();
//		} catch (Exception ex) {
//			tx.rollback();
//		} finally {
//			session.close();
//		}
//		return ucb;
	}

	@Override
	public List<UserCarBind> getUserCarBindByUid(long uid) {
		
		return baseDAO.find("from UserCarBind where userId=?",new Object[]{uid});
		
//		UserCarBindDAO userCarBindDao=new UserCarBindDAO();
//		List<UserCarBind> userCarBind_list=userCarBindDao.findByUserId(uid);
//		return userCarBind_list;
	}


	@Override
	public UserCarBind getUserCarBindById(long ubid) {
		
		return baseDAO.get("from UserCarBind where ucbId=?", new Object[]{ubid});
		
//		UserCarBindDAO userCarBindDao=new UserCarBindDAO();
//		return userCarBindDao.findById(ubid);
	}

}
