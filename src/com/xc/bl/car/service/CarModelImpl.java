package com.xc.bl.car.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.CarModel;
import com.xc.bl.pojo.CarModelDAO;
import com.xc.bl.pojo.HibernateSessionFactory;

public class CarModelImpl implements ICarModel {

	@Override
	public CarModel addCarModel(CarModel carModel) {
		CarModelDAO carModelDao = new CarModelDAO();
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		try {
			carModelDao.save(carModel);
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public CarModel getCarModelById(int cmid) {
		CarModelDAO carModelDao = new CarModelDAO();
		return carModelDao.findById(cmid);
	}

	@Override
	public CarModel getCarModelByName(String CMName) {
		CarModelDAO carModelDao = new CarModelDAO();
		List<CarModel> cm_list = carModelDao.findByCarModelName(CMName);
		if (cm_list == null || cm_list.isEmpty()) {
			return null;
		}
		return cm_list.get(0);
	}

	@Override
	public List<CarModel> getCarModelByCfid(int cfid) {
		CarModelDAO carModelDao=new CarModelDAO();
		return carModelDao.findByCarFactoryId(cfid);
	}

}
