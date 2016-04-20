package com.xc.bl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarModelDao;
import com.xc.bl.car.service.ICarModelService;
import com.xc.bl.entities.CarModel;
import com.xc.bl.entities.dao.IBaseDAO;

@Service("carModelService")
public class CarModelServiceImpl implements ICarModelService {

//	@Autowired
//	private IBaseDAO<CarModel> baseDAO;
	
	@Autowired
	private ICarModelDao carModelDao;
	
	@Override
	public CarModel addCarModel(CarModel carModel) {
		
		return carModelDao.addCarModel(carModel);
//		baseDAO.save(carModel);
//		return carModel;
		
//		CarModelDAO carModelDao = new CarModelDAO();
//		Session session = HibernateSessionFactory.getSession();
//		Transaction tx = session.beginTransaction();
//		try {
//			carModelDao.save(carModel);
//			tx.commit();
//		} catch (Exception ex) {
//			tx.rollback();
//		} finally {
//			session.close();
//		}
//		return carModel;
	}

	@Override
	public CarModel getCarModelById(int cmid) {
		
		return carModelDao.getCarModelById(cmid);
		
//		return baseDAO.get("from CarModel where carModelId=?", new Object[]{cmid});
		
//		CarModelDAO carModelDao = new CarModelDAO();
//		return carModelDao.findById(cmid);
	}

	@Override
	public CarModel getCarModelByName(String CMName) {
		return carModelDao.getCarModelByName(CMName);
//		return baseDAO.get("from CarModel where carModelName=?", new Object[]{CMName});
		
//		
//		CarModelDAO carModelDao = new CarModelDAO();
//		List<CarModel> cm_list = carModelDao.findByCarModelName(CMName);
//		if (cm_list == null || cm_list.isEmpty()) {
//			return null;
//		}
//		return cm_list.get(0);
	}

	@Override
	public List<CarModel> getCarModelByCfid(int cfid) {
		return carModelDao.getCarModelByCfid(cfid);
//		return baseDAO.find("from CarModel where carFactoryId=?",new Object[]{cfid});
//		
//		CarModelDAO carModelDao=new CarModelDAO();
//		return carModelDao.findByCarFactoryId(cfid);
	}

}
