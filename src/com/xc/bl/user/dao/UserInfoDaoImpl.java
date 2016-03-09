package com.xc.bl.user.dao;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.utils.CommonUtils;

public class UserInfoDaoImpl  implements IUserInfoDao{
	public static Logger logger=Logger.getLogger(UserInfoDaoImpl.class);
	
	@Override
	public int updLastLoginTime(long uid) {
		// TODO Auto-generated method stub
		int updCount = -1;
		String sql = "UPDATE `user` SET user_datetime_access_last=:user_datetime_access_last WHERE user_id=:user_id";
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.getTransaction();
		try {
			Query query = session.createSQLQuery(sql);
			query.setTimestamp("user_datetime_access_last", CommonUtils.getTimestampNow());
			query.setLong("user_id", uid);
			tx.begin();
			updCount = query.executeUpdate();
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();
		}
		return updCount;
	}
	
}
