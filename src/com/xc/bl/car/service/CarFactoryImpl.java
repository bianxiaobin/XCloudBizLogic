package com.xc.bl.car.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.CarFactory;
import com.xc.bl.pojo.CarFactoryDAO;
import com.xc.bl.pojo.HibernateSessionFactory;

public class CarFactoryImpl implements ICarFactory{

	@Override
	public CarFactory addCarFactory(CarFactory carFactory) {
		CarFactoryDAO carFactoryDao=new CarFactoryDAO();
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			carFactoryDao.save(carFactory);
			tx.commit();
		}
		catch(Exception ex){
			tx.rollback();
		}
		finally{
			session.close();
		}
		return null;
	}

	@Override
	public CarFactory getCarFactoryById(int cfid) {
		CarFactoryDAO carFactoryDao=new CarFactoryDAO();
		return carFactoryDao.findById(cfid);
	}

	@Override
	public CarFactory getCarFactoryByName(String CFName) {
		CarFactoryDAO carFactoryDao=new CarFactoryDAO();
		List<CarFactory> cf_list=carFactoryDao.findByCarFactoryName(CFName);
		if(cf_list==null || cf_list.isEmpty()){
			return null;
		}
		return cf_list.get(0);
	}

	@Override
	public List<CarFactory> getCarFactoryByCbid(int cbid) {
		// TODO Auto-generated method stub
		CarFactoryDAO carFactoryDao=new CarFactoryDAO();
		List<CarFactory> cf_list=carFactoryDao.findByCarBrandId(cbid);
		if(cf_list==null || cf_list.isEmpty()){
			return null;
		}
		return cf_list;
	}
	
}
