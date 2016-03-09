package com.xc.bl.car.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.Car;
import com.xc.bl.pojo.CarDAO;
import com.xc.bl.pojo.HibernateSessionFactory;

public class CarInfoImpl implements ICarInfo {

	@Override
	public Car addCar(Car car) {
		// TODO Auto-generated method stub
		CarDAO carDao = new CarDAO();
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		try {
			carDao.save(car);
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();
		}
		return car;
	}

	@Override
	public int updCarInfoById(Car car) {
		// TODO Auto-generated method stub
		int updCount=0;
		CarDAO carDao=new CarDAO();
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			carDao.attachDirty(car);
			tx.commit();
			updCount=1;
		}
		catch(Exception ex){
			tx.rollback();
		}
		finally{
			session.close();
		}
		return updCount;
	}

	@Override
	public Car getCarById(long cid) {
		// TODO Auto-generated method stub
		CarDAO carDao=new CarDAO();
		return carDao.findById(cid);
	}

}
