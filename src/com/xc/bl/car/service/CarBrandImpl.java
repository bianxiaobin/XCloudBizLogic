package com.xc.bl.car.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.car.dao.CarBrandDaoImpl;
import com.xc.bl.car.dao.ICarBrandDao;
import com.xc.bl.pojo.CarBrand;
import com.xc.bl.pojo.CarBrandDAO;
import com.xc.bl.pojo.HibernateSessionFactory;

public class CarBrandImpl implements ICarBrand{

	@Override
	public List<CarBrand> getCarBrandList(int type, int maxCount) {
		//最大返回200
		if(maxCount>200){
			maxCount=200;
		}
		ICarBrandDao iCarBrandDao=new CarBrandDaoImpl();
		return iCarBrandDao.getCarBrandList(type, maxCount);
	}

	@Override
	public CarBrand addCarBrand(CarBrand carBrand) {
		CarBrandDAO carBrandDao=new CarBrandDAO();
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			carBrandDao.save(carBrand);
			tx.commit();
		}
		catch(Exception ex){
			tx.rollback();
		}
		finally{
			session.close();
		}
		return carBrand;
	}

	@Override
	public CarBrand getCarBrandById(int cbid) {
		CarBrandDAO carBrandDao=new CarBrandDAO();
		return carBrandDao.findById(cbid);
	}

	@Override
	public CarBrand getCarBrandByName(String CBName) {
		// TODO Auto-generated method stub
		CarBrandDAO carBrandDao=new CarBrandDAO();
		List<CarBrand> cb_list= carBrandDao.findByCarBrandName(CBName);
		if(cb_list==null || cb_list.isEmpty()){
			return null;
		}
		return cb_list.get(0);
	}
	
}
