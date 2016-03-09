package com.xc.bl.user.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.Car;
import com.xc.bl.pojo.CarDAO;
import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.UserCarBind;
import com.xc.bl.pojo.UserCarBindDAO;

public class UserCarBindImpl implements IUserCarBind{

	@Override
	public UserCarBind addUserCarBind(UserCarBind ucb) {
		// TODO Auto-generated method stub
		UserCarBindDAO userCarBindDao = new UserCarBindDAO();
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			userCarBindDao.save(ucb);
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();
		}
		return ucb;
	}

	@Override
	public List<UserCarBind> getUserCarBindByUid(long uid) {
		// TODO Auto-generated method stub
		UserCarBindDAO userCarBindDao=new UserCarBindDAO();
		List<UserCarBind> userCarBind_list=userCarBindDao.findByUserId(uid);
		return userCarBind_list;
	}

	@Override
	public UserCarBind UserNewCarBind(long uid, Car car) {
		UserCarBindDAO userCarBindDao=new UserCarBindDAO();
		CarDAO carDao=new CarDAO();
		UserCarBind userCarBind=null;
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.getTransaction();
		try{
			tx.begin();
			carDao.save(car);
			userCarBind=new UserCarBind();
			userCarBind.setCarId(car.getCarId());
			userCarBind.setUserId(uid);
			userCarBindDao.save(userCarBind);
			tx.commit();
		}
		catch(Exception e){
			tx.rollback();
		}
		finally{
			session.close();
		}
		return userCarBind;
	}

	@Override
	public UserCarBind getUserCarBindById(long ubid) {
		UserCarBindDAO userCarBindDao=new UserCarBindDAO();
		return userCarBindDao.findById(ubid);
	}
}
